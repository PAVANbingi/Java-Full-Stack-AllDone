package com.pavan.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.springboot.model.Product;
import com.pavan.springboot.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Optional<Product> getProductById(Long id) {
		return productRepository.findById(id);
	}

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	public List<Product> getProductsByPlace(String place) {
		return productRepository.findByPlaceContainingIgnoreCase(place);
	}

	public List<Product> searchProducts(String text) {
		return productRepository
				.findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(text, text, text);
	}

}

//package com.pavan.springboot.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.pavan.springboot.model.Product;
//import com.pavan.springboot.repository.ProductRepository;
//
//@Service
//public class ProductService {
//
//	@Autowired
//	private ProductRepository productRepository;
//

//}
