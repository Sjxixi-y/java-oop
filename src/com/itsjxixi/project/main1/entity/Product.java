package com.itsjxixi.project.main1.entity;

import java.util.Objects;

public class Product {
    // 商品编号
    private int ID;
    // 商品姓名
    private String name;
    // 商品价格
    private double cost;
    // 商品数量
    private int number;

    public Product() {
    }

    public Product(int ID, String name, double cost, int number) {
        this.ID = ID;
        this.name = name;
        this.cost = cost;
        this.number = number;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ID == product.ID || (name.equals(product.name) && cost == product.cost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", number=" + number +
                '}';
    }
}
