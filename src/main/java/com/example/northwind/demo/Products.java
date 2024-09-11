package com.example.northwind.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
@Controller
public class Products {
    @Autowired
    private ArrayList<Integer> productID;
    private ArrayList<String> productName;
    private ArrayList<Integer> supplierID;
    private ArrayList<String> categoryID;
    private ArrayList<Integer> quantityPerUnit;
    private ArrayList<Double> unitPrice;
    private ArrayList<Byte> unitsInStock;
    private ArrayList<Byte> unitsOnOrder;
}
