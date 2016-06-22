package com.theironyard;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Ben on 6/22/16.
 */
public class Purchase {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable=false)
    String date;
    @Column(nullable=false)
    int credit;
    @Column(nullable=false)
    int cvv;
    @Column(nullable=false)
    String category;
    @Column(nullable=false)
    Customer customer;

    public Purchase(int id, String date, int credit, int cvv, String category, Customer customer) {
        this.id = id;
        this.date = date;
        this.credit = credit;
        this.cvv = cvv;
        this.category = category;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Purchase() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
