package com.spring28minutescourse.proj.advBeanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//in all the cases where this target class is used, Spring will make sure a new instance is created)
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("instantiated JdbcConnection");
    }
}
