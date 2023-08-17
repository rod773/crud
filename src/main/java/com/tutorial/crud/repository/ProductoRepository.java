package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {


}
