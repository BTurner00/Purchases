package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ben on 6/22/16.
 */

@Controller
public class PurchasesController {

    @PostConstruct
    public void init () throws FileNotFoundException {
        if (customers.count() == 0) {
            File f = new File("customers.csv");
            Scanner filescanner = new Scanner(f);
            filescanner.nextLine();
            while (filescanner.hasNext()) {
                String line = filescanner.nextLine();
                String[] columns = line.split("\\,");
                String name = columns[0];
                String email = columns[1];
                Customer customer = new Customer(name, email);
                customers.save(customer);
            }
        }

        if (purchases.count() == 0) {
            File f = new File("purchases.csv");
            Scanner filescanner = new Scanner(f);
            filescanner.nextLine();
            while (filescanner.hasNext()) {
                String line = filescanner.nextLine();
                String[] columns = line.split("\\,");
                String date = columns[1];
                String credit = columns[2];
                String cvv = columns[3];
                String category = columns[4];
                Customer temp = customers.findOne(Integer.valueOf(columns[0]));
                Purchase purchase = new Purchase(date, credit, cvv, category, temp);
                purchases.save(purchase);
            }
        }
    }
    @Autowired
    CustomerRepository customers;

    @Autowired
    PurchaseRepository purchases;
    @RequestMapping(path= "/", method = RequestMethod.GET)
    public String home () {
        return "home";
    }






}
