package com.theironyard;

import javax.persistence.*;

/**
 * Created by Ben on 6/22/16.
 */
@Entity
@Table (name="purchases")
public class Purchase {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable=false)
    String date;
    @Column(nullable=false)
    String credit;
    @Column(nullable=false)
    String cvv;
    @Column(nullable=false)
    String category;
    @ManyToOne
    Customer customer;

    public Purchase(String date, String credit, String cvv, String category, Customer customer) {
        this.date = date;
        this.credit = credit;
        this.cvv = cvv;
        this.category = category;
        this.customer = customer;
    }

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

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
