package com.dumisani.spring.part1;

import com.dumisani.spring.part1.wsdl.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner lookup() throws MalformedURLException {
        URL url = new URL("http://localhost:9090/ws/countries.wsdl");
        CountriesPortService employeeService_Service = new CountriesPortService(url);
        CountriesPort employeeServiceProxy = employeeService_Service.getCountriesPortSoap11();
        GetCountryRequest request = new GetCountryRequest();
        request.setName("United Kingdom");

        GetCountryResponse response = employeeServiceProxy.getCountry(request);

        Currency currency = response.getCountry().getCurrency();
        String capital = response.getCountry().getCapital();
        int population = response.getCountry().getPopulation();

        System.out.println("Currency: " + currency);
        System.out.println("Capital: " + capital);
        System.out.println("Population " + population);
        return null;
    }




