package com.company;

import java.util.ArrayList;

public class ListOfCustomer {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        public ListOfCustomer(){

        }

    public void addCustomer(Customer c){
        customers.add(c);
    }

}
