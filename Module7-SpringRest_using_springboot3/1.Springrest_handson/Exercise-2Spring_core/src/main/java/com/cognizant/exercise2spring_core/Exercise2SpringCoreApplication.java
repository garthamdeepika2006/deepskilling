package com.cognizant.exercise2spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class Exercise2SpringCoreApplication {

    public static void main(String[] args) {

        System.out.println("***** Application Started *****");

        SpringApplication.run(Exercise2SpringCoreApplication.class, args);

        displayCountries();

        System.out.println("***** Application Ended *****");
    }

    public static void displayCountries() {

        System.out.println("***** Display Countries Started *****");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        ArrayList<Country> countryList =
                (ArrayList<Country>) context.getBean("countryList");

        for (Country country : countryList) {
            System.out.println(country);
        }

        context.close();

        System.out.println("***** Display Countries Ended *****");
    }
}