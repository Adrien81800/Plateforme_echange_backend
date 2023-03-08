package com.again.service;

import java.util.List;

import com.again.model.Categorie;
import com.again.model.Product;
import com.again.rc.CategorieController;
import com.again.repository.CategorieRepository;
import com.again.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> getAllCategories() {
        return (List<Categorie>) categorieRepository.findAll();
    }
}
