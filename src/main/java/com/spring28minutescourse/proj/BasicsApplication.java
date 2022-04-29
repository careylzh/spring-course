package com.spring28minutescourse.proj;

import com.spring28minutescourse.proj.basics.BinarySearchImpl;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BasicsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicsApplication.class);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch);
        System.out.println(binarySearch2);
        //Singleton: by default, one bean instance per context. Both instances of BinarySearchImpl point to the same instance.

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        System.out.println(result);

        applicationContext.close();

    }

}
