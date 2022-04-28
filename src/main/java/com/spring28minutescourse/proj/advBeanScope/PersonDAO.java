package com.spring28minutescourse.proj.advBeanScope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

//DAO: data access object
//@Component
@Named
public class PersonDAO {

    private Logger LOGGER = LoggerFactory.getLogger(PersonDAO.class);

    //    @Autowired
    @Inject
    JdbcConnection jdbcConnection;     //dummy jdbc, not the actual jdbc database stuff

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("preDestroy");
    }
}
