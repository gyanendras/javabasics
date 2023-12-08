package com.hexaware.entities;

import java.util.*;
import java.util.Date;

public class CourierCompany {

    private String companyName;
   

    public CourierCompany() {
        // Default constructor
    }

    public CourierCompany(String companyName) {
        this.companyName = companyName;
       
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    @Override
    public String toString() {
        return "CourierCompanyClass" + "companyName='" + companyName;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //inserting values
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Company Name : ");
        String companyName=sc.nextLine();
        

        // Create an instance of the CourierCompany class
        CourierCompany cc = new CourierCompany(companyName);

        // Print details using toString()
        System.out.println(cc.toString());
    }


}