package com.spring28minutescourse.proj;

import com.spring28minutescourse.proj.advBeanScope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class advScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(advScopeApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(advScopeApplication.class);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("personDAO: {}", personDAO);
        LOGGER.info("first's jdbc dependency instance: {}", personDAO.getJdbcConnection());

        LOGGER.info("personDAO2: {}", personDAO2);
        LOGGER.info("second's jdbc dependency instance:{}", personDAO2.getJdbcConnection());

        applicationContext.close();
    }

}
