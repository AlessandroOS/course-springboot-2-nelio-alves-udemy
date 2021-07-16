package com.alessandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
