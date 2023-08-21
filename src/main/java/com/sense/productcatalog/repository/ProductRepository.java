package com.sense.productcatalog.repository;

import com.sense.productcatalog.entity.Product;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface ProductRepository extends CouchbaseRepository<Product, String> {

}
