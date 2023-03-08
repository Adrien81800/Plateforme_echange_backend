package com.again.rc;

import com.again.model.Product;
import com.again.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("")
    public Product addProduct(@RequestBody Product product) {
        return productService.addOrUpdateProduct(product);
    }

    @GetMapping("categorie/{id}")
    public List<Product> getAllProductsByCategorie(@PathVariable Long id) {
        return productService.getAllProductsByCategorie(id);
    }



}
