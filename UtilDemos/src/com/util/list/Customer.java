package com.util.list;

public class Customer {
   private String name;
   private int customerId;
   private String city;

    public Customer() {
    }

    public Customer(String name, int customerId, String city) {
        this.name = name;
        this.customerId = customerId;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerId=" + customerId +
                ", city='" + city + '\'' +
                '}';
    }
}
