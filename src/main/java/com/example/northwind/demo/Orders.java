package com.example.northwind.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class Orders {

    @Autowired
    private ArrayList<Integer> orderID;
    @Autowired
    private ArrayList<String> customerId;
    private ArrayList<String> employeeId;
    private ArrayList<Date> orderDate;
    private ArrayList<Date> requiredDate;
    private ArrayList<Date> shipDate;
    private ArrayList<String> shipVia;
    private ArrayList<String> shipName;
    private ArrayList<String> shipAddress;
    private String shipCity,shipCountry;
    private String shipRegion;
    private ArrayList<Integer> shipPostalCode;




}
