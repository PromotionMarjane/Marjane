package com.marjane.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class JakartaEntityManagerFactoryAdapter implements EntityManagerFactory {

    private LocalContainerEntityManagerFactoryBean entityManagerFactory;

    public JakartaEntityManagerFactoryAdapter(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public EntityManager createEntityManager() {
        return entityManagerFactory.getObject().createEntityManager();
    }

    @Override
    public boolean isOpen() {
        return entityManagerFactory.getObject().isOpen();
    }

    @Override
    public void close() {
        entityManagerFactory.getObject().close();
    }
}
