package com.pavan.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByPlaceContainingIgnoreCase(String place);

	List<Product> findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(String name,
			String type, String place);

}

//package com.pavan.springboot.repository;
//
//import com.pavan.springboot.model.Product;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface ProductRepository extends JpaRepository<Product, Long> {
//    List<Product> findByPlaceContainingIgnoreCase(String place);
//    List<Product> findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(String name, String type, String place);
//}
//
