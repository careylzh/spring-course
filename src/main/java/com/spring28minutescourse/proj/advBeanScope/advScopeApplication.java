package com.spring28minutescourse.proj.advBeanScope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class advScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(advScopeApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(advScopeApplication.class, args);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("personDAO: {}", personDAO);
        LOGGER.info("first's jdbc dependency instance: {}", personDAO.getJdbcConnection());

        LOGGER.info("personDAO2: {}", personDAO2);
        LOGGER.info("second's jdbc dependency instance:{}", personDAO2.getJdbcConnection());


    }

}
