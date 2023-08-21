package com.sense.productcatalog.repository;

import com.sense.productcatalog.entity.Product;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends CouchbaseRepository<Product, String> {

    List<Product> findByName(String name);

    List<Product> findByPriceGreaterThan(BigDecimal price);

}
