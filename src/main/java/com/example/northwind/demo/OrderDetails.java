package com.example.northwind.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class OrderDetails {

    @Autowired
    private ArrayList<Integer> orderID;
    @Autowired
    private ArrayList<Integer> productID;
    private ArrayList<Double> unitPrice;
    private int quantity;
    private ArrayList<Double> discount;

}
