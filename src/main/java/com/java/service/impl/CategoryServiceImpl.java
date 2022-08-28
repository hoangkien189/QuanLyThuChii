/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.service.impl;

import com.java.repository.CategoryRepository;
import com.java.service.CategoryService;
import java.util.List;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ASUS
 */
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository CategoryRepository;
    
    @Override
    public List<Category> getCategorys() {
        return this.CategoryRepository.getCategorys();
    }
    
}
