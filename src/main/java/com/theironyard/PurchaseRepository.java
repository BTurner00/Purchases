package com.theironyard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Ben on 6/22/16.
 */
public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Integer> {
    Page<Purchase> findByCategory (Pageable pageable, String category);
    Page<Purchase> findByCredit (Pageable pageable, String credit);
    Page<Purchase> findByDate (Pageable pageable, String date);
    Page<Purchase> findByCvv (Pageable pageable, String cvv);
}
