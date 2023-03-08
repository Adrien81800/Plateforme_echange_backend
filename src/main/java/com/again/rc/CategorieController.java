package com.again.rc;

import com.again.model.Categorie;
import com.again.model.Product;
import com.again.service.CategorieService;
import com.again.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/categories")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("")
    public List<Categorie> getAllCategories() { return categorieService.getAllCategories();}
}
