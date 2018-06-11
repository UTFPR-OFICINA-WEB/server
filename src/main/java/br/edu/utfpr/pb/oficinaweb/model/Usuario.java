package br.edu.utfpr.pb.oficinaweb.model;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.edu.utfpr.pb.oficinaweb.util.BooleanConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario implements UserDetails {
	private static final BCryptPasswordEncoder bCrypt = 
			new BCryptPasswordEncoder();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String username;

	private String password;

	private String nome;

	private String email;

	@Convert(converter = BooleanConverter.class)
	@Column(columnDefinition = "char(1) default '1'")
	private Boolean ativo;

	@ManyToOne
	private Perfil perfil;
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if (perfil != null) {
			return perfil.getPermissoes().stream().map(e -> new SimpleGrantedAuthority("ROLE_" + e.name()))
					.collect(Collectors.toList());
		}

		return AuthorityUtils.NO_AUTHORITIES;
	}
	public String getEncodedPassword(String pass) {
		if (! pass.isEmpty()) {
			return bCrypt.encode(pass);
		}
		return pass;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return ativo;
	}
}
