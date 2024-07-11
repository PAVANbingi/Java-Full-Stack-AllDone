package com.pavan.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pavan.springboot.model.Product;
import com.pavan.springboot.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "index";
	}

	@PostMapping("/addProduct")
	public String addProduct(@RequestParam String name, @RequestParam String type, @RequestParam String place,
			@RequestParam int warranty, Model model) {
		Product product = new Product();
		product.setName(name);
		product.setType(type);
		product.setPlace(place);
		product.setWarranty(warranty);
		productService.addProduct(product);
		model.addAttribute("products", productService.getAllProducts());
		return "redirect:/";
	}

	@GetMapping("/showProducts")
	public String showProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "index";
	}

	@GetMapping("/searchByPlace")
	public String searchByPlace(@RequestParam String place, Model model) {
		List<Product> products = productService.getProductsByPlace(place);
		model.addAttribute("products", products);
		return "index";
	}

	@GetMapping("/searchProducts")
	public String searchProducts(@RequestParam String text, Model model) {
		List<Product> products = productService.searchProducts(text);
		model.addAttribute("products", products);
		return "index";
	}

	@PostMapping("/deleteProduct")
	public String deleteProduct(@RequestParam Long id, Model model) {
		productService.deleteProduct(id);
		model.addAttribute("products", productService.getAllProducts());
		return "redirect:/";
	}
}
