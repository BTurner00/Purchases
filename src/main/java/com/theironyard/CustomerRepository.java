package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben on 6/22/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
