package com.spring28minutescourse.proj.advBeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//DAO: data access object
@Component
public class PersonDAO {

    @Autowired
    JdbcConnection jdbcConnection;     //dummy jdbc, not the actual jdbc database stuff

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

}
