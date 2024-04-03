package com.ecommerce.magikbazar.web.app.dao;

import com.ecommerce.magikbazar.web.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{

}
