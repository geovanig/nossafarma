package com.nossafarma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nossafarma.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
