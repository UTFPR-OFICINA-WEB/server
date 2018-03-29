package br.edu.utfpr.pb.oficinaweb.configuration;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;
import java.util.logging.Logger;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories()
@PropertySource("classpath:application.properties")
public class PersistenceConfig {
    private static final Logger LOGGER = Logger.getLogger(PersistenceConfig.class.getSimpleName());

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dmDs = new DriverManagerDataSource();
        dmDs.setDriverClassName("org.postgresql.Driver");
        dmDs.setUrl("jdbc:postgresql://localhost:5432/OficinaWeb");
        dmDs.setUsername("postgres");
        dmDs.setPassword("postgres");
        return dmDs;
    }

    @Bean("entityManagerFactory")
    /**
     * AO FINALIZAR A CONFIGURAÇÃO DA PERSISTÊNCIA, PODE OCORRER UM java.sql.SQLFeatureNotSupportedException
     * ESSA EXCEPTION É ESPERADA!
     * https://github.com/pgjdbc/pgjdbc/issues/1102
     * http://vkuzel.blogspot.com.br/2016/03/spring-boot-jpa-hibernate-atomikos.html
     */
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource());
        emf.setPackagesToScan("br.edu.utfpr.pb.oficinaweb");
        emf.setJpaProperties(hibernateProperties());
        emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        LOGGER.info( "AO FINALIZAR A CONFIGURAÇÃO DA PERSISTÊNCIA, PODE OCORRER UM java.sql.SQLFeatureNotSupportedException\n" +
            "ESSA EXCEPTION É ESPERADA!");
        return emf;
    }

    private Properties hibernateProperties() {
        Properties props = new Properties();
        props.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        props.put(Environment.HBM2DDL_AUTO, "update");
        props.put(Environment.SHOW_SQL, "true");
        return props;
    }

    @Bean(name = "transactionManager")
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManager) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManager);
        return transactionManager;
    }

}
