package ru.netology.model;

public class Order {
    private int id;
    private String date;
    private int customerId;
    private String productName;
    private double amount;

    public Order(int id, String date, int customerId, String productName, double amount) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.productName = productName;
        this.amount = amount;
    }
    public Order(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", customerId=" + customerId +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
