package com.again.repository;

import com.again.model.Categorie;
import com.again.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long>{
}
