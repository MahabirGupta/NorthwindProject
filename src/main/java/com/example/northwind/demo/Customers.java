package com.example.northwind.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class Customers {

    @Autowired
private ArrayList<String> customerId;
    @Autowired
private ArrayList<String> companyName;
    @Autowired
private ArrayList<String> contactName;
    private ArrayList<String> contactTitle;
    private ArrayList<String> address;
    private String city,country;
    private String region;
    private ArrayList<Integer> postalCode;
    private ArrayList<Integer> phone;
    private ArrayList<Integer> fax;

}
