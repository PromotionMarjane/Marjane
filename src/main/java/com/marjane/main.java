package com.marjane;

import com.marjane.config.ApplicationConfig;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class main {
    public static void main(String[] args) {
        // Create an instance of the ApplicationConfig class.
        ApplicationConfig config = new ApplicationConfig();

        // Get the EntityManagerFactory bean.
        EntityManagerFactory entityManagerFactory = config.entityManagerFactory();

        // Create an EntityManager.
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Create your entities here.
        // For example:
        // Customer customer = new Customer("John Doe");
        // entityManager.persist(customer);

        // Commit the changes to the database.
        entityManager.getTransaction().commit();

        // Close the EntityManager.
        entityManager.close();
    }
}
