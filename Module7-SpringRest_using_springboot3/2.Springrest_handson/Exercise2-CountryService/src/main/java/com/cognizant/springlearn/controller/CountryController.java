package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {

        System.out.println("***** getCountryIndia() Started *****");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = (Country) context.getBean("in");

        System.out.println("***** getCountryIndia() Ended *****");

        context.close();

        return country;
    }
}