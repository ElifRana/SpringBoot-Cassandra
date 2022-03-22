package com.example.springbootcassandra.repository;

import com.example.springbootcassandra.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product, Integer> {
}
