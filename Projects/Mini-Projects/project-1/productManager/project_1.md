
# Product Management Application

This project is a simple product management application built with Spring Boot and Thymeleaf. The application allows users to add, view, and search for products based on different criteria.

## Project Structure

The project consists of the following components:

1. **Model**: Represents the data structure for the product.
2. **Repository**: Interface for database operations.
3. **Service**: Contains business logic.
4. **Controller**: Handles HTTP requests and responses.
5. **Thymeleaf Templates**: HTML templates for the front-end.

## Dependencies

The following dependencies are added in the Spring Initializr:
- Spring Web
- Spring Data JPA
- H2 Database (for simplicity, can be switched to MySQL or another database later)
- Lombok (optional, for reducing boilerplate code)

## 1. Model

`Product.java` - The product model represents the structure of the product data.

```java
package com.pavan.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String place;
    private int warranty;

    // Getters and Setters
}
```

## 2. Repository

`ProductRepository.java` - The repository interface for database operations.

```java
package com.pavan.springboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pavan.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByPlaceContainingIgnoreCase(String place);
    List<Product> findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(String name, String type, String place);
}
```

## 3. Service

`ProductService.java` - The service layer containing business logic.

```java
package com.pavan.springboot.service;

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
        return productRepository.findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(text, text, text);
    }
}
```

## 4. Controller

`ProductController.java` - The controller for handling HTTP requests.

```java
package com.pavan.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.pavan.springboot.model.Product;
import com.pavan.springboot.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "index";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/showProducts")
    public String showProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
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
}
```

## 5. Thymeleaf Template

`index.html` - The HTML template for the front-end.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Management</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="/static/styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            animation: fadeIn 1s ease-in-out;
        }

        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        .container {
            max-width: 800px;
            width: 100%;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            padding: 20px;
            margin: 20px;
            animation: slideIn 0.5s ease-out;
        }

        @keyframes slideIn {
            from { transform: translateY(-50px); }
            to { transform: translateY(0); }
        }

        h1, h2 {
            text-align: center;
            color: #333;
            animation: bounceIn 1s ease;
        }

        @keyframes bounceIn {
            from { transform: scale(0.8); }
            to { transform: scale(1); }
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 10px;
            animation: fadeInUp 0.5s ease-in-out;
        }

        @keyframes fadeInUp {
            from { transform: translateY(20px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }

        label {
            font-weight: bold;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            transition: border-color 0.3s;
        }

        input[type="text"]:focus,
        input[type="number"]:focus {
            border-color: #007bff;
        }

        button {
            padding: 10px;
            border: none;
            border-radius: 4px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.3s;
        }

        button:hover {
            background-color: #0056b3;
            transform: translateY(-2px);
        }

        .button-group {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
            animation: fadeInUp 0.5s ease-in-out;
        }

        .button-group form {
            display: flex;
            gap: 5px;
        }

        ul {
            list-style-type: none;
            padding: 0;
            animation: fadeInUp 0.5s ease-in-out;
        }

        li {
            background-color: #f9f9f9;
            margin: 5px 0;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            transition: background-color 0.3s, transform 0.3s;
        }

        li:hover {
            background-color: #e9e9e9;
            transform: translateX(5px);
        }

        .search-container {
            margin: 20px 0;
            animation: fadeInUp 0.5s ease-in-out;
        }

        .search-container input {
            padding: 10px;
            width: calc(100% - 40px);
            transition: border-color 0.3s;
        }

        .search-container input:focus {
            border-color: #007bff;
        }

        .search-container button {
            padding: 10px;
            transition: background-color 0.3s, transform 0.3s;
        }

        .search-container button:hover {
            background-color: #0056b3;
            transform: translateY(-2px);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Product Management</h1>

        <!-- Add Product Form -->
        <div>
            <h2>Add a Product</h2>
            <form action="/addProduct" method="post">
                <label for

="name">Product Name:</label>
                <input type="text" id="name" name="name" required>
                
                <label for="type">Product Type:</label>
                <input type="text" id="type" name="type" required>
                
                <label for="place">Product Place:</label>
                <input type="text" id="place" name="place" required>
                
                <label for="warranty">Product Warranty Year:</label>
                <input type="number" id="warranty" name="warranty" required>
                
                <button type="submit">Add Product</button>
            </form>
        </div>

        <!-- Button Group for Showing and Searching Products -->
        <div class="button-group">
            <form action="/showProducts" method="get">
                <button type="submit">Show Products</button>
            </form>
            <form action="/searchByPlace" method="get">
                <input type="text" name="place" placeholder="Search by Place" required>
                <button type="submit">Search</button>
            </form>
            <form action="/searchProducts" method="get">
                <input type="text" name="text" placeholder="Search Products" required>
                <button type="submit">Search</button>
            </form>
        </div>

        <!-- Display Products -->
        <h2>All Products</h2>
        <ul>
            <th:block th:each="product : ${products}">
                <li th:text="'Name: ' + ${product.name} + ', Type: ' + ${product.type} + ', Place: ' + ${product.place} + ', Warranty: ' + ${product.warranty}"></li>
            </th:block>
        </ul>
    </div>
</body>
</html>
```

## Usage

1. **Adding a Product**: Fill in the product details in the form and click "Add Product" to add a new product.
2. **Showing All Products**: Click "Show Products" to view all products.
3. **Searching by Place**: Enter a place in the "Search by Place" input and click "Search" to find products by place.
4. **Searching Products**: Enter a search term in the "Search Products" input and click "Search" to find products by name, type, or place.

This project provides a basic structure for a product management system with enhanced front-end interactivity using CSS animations and transitions.
```

You can copy this Markdown content and paste it into your GitHub repository's README file. This will provide a clear and detailed explanation of your project, including the structure, code, and usage instructions.
