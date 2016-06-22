package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben on 6/22/16.
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
    public Iterable<Purchase> findByCategory (String category);
    //public Iterable<Purchase> findByName (String customer);
    //public Iterable<Purchase> findByEmail (String email);
    public Iterable<Purchase> findByCredit (String credit);
    public Iterable<Purchase> findByDate (String date);
    public Iterable<Purchase> findByCvv (String cvv);
}
