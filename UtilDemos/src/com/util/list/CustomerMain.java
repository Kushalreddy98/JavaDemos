package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        List<Customer> customerByCity = new ArrayList<>();
        Customer customer1 = new Customer("Kushal", 101, "Bangalore");
        customerList.add(customer1);
        Customer customer2 = new Customer("Manju", 102, "Hoskote");
        customerList.add(customer2);
        Customer customer3 = new Customer("Hemanth", 103, "Mandya");
        customerList.add(customer3);
        Customer customer4 = new Customer("Basavaraj", 104, "Gangavathi");
        customerList.add(customer4);
        Customer customer5 = new Customer("Nithin", 105, "Kadapa");
        customerList.add(customer5);
        for (Customer customer : customerList) {
            if (customer.getCity().equals("Bangalore")) {
                customerByCity.add(customer);
            }
        }
        for(Customer customer:customerByCity)
            System.out.println(customer);

    }

}
