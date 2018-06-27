package br.edu.utfpr.pb.oficinaweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/produto/**").hasAnyRole("ADMIN")
                .antMatchers("/usuario/**").hasAnyRole("ADMIN,USUARIO_CRIAR,USUARIO_EDITAR,USUARIO_REMOVER")
                .antMatchers("/funcionario/**").hasAnyRole("ADMIN,FUNCIONARIO_CRIAR,FUNCIONARIO_EDITAR,FUNCIONARIO_REMOVER")
                .antMatchers("/setor/**").hasAnyRole("ADMIN,SETOR_CRIAR,SETOR_EDITAR,SETOR_REMOVER")
                .antMatchers("/cargo/**").hasAnyRole("ADMIN,CARGO_CRIAR,CARGO_EDITAR,CARGO_REMOVER")
                .antMatchers("/cliente/**").hasAnyRole("ADMIN,CLIENTE_CRIAR,CLIENTE_EDITAR,CLIENTE_REMOVER")
                .antMatchers("/fornecedor/**").hasAnyRole("ADMIN,FORNECEDOR_CRIAR,FORNECEDOR_EDITAR,FORNECEDOR_REMOVER")
                .antMatchers("/nota/**").hasAnyRole("ADMIN,NOTA_CRIAR,NOTA_EDITAR,NOTA_REMOVER")
                .antMatchers("/obra/**").hasAnyRole("ADMIN,OBRA_CRIAR,OBRA_EDITAR,OBRA_REMOVER")
                .antMatchers("/produto/**").hasAnyRole("ADMIN,PRODUTO_CRIAR,PRODUTO_EDITAR,PRODUTO_REMOVER")
                .antMatchers("/cponto/**").hasAnyRole("ADMIN,PONTO_CRIAR,PONTO_EDITAR,PONTO_REMOVER")
                .antMatchers("/atividade/**").hasAnyRole("ADMIN,ATIVIDADE_CRIAR,ATIVIDADE_EDITAR,ATIVIDADE_REMOVER")
                .antMatchers("/atributo/**").hasAnyRole("ADMIN,ATRIBUTO_CRIAR,ATRIBUTO_EDITAR,ATRIBUTO_REMOVER")
                .antMatchers("/atributof/**").hasAnyRole("ADMIN,ATRIBUTOF_CRIAR,ATRIBUTOF_EDITAR,ATRIBUTOF_REMOVER")
                .antMatchers("/requisitos/**").hasAnyRole("ADMIN,REQUISITOS_CRIAR,REQUISITOS_EDITAR,REQUISITOS_REMOVER")
                .antMatchers("/ccusto/**").hasAnyRole("ADMIN,CENTROCUSTO_CRIAR,CENTROCUSTO_EDITAR,CENTROCUSTO_REMOVER")
                .antMatchers("/bancohoras/**").hasAnyRole("ADMIN,RELATORIOBANCOHORAS")
                .anyRequest().authenticated();
    }
}
