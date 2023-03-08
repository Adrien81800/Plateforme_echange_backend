package com.again.service;

import java.util.List;
import com.again.model.Product;
import com.again.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {

        return (List<Product>) productRepository.findAll();
    }

    public List<Product> getAllProductsByCategorie(Long id) {
        return productRepository.findByCategorieId(id);
    }

    public Product addOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public void deleteById(Long id) { productRepository.deleteById(id);}


}
