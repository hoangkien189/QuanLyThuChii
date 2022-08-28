/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.repository.impl;

import com.java.repository.CategoryRepository;
import java.util.List;
import jdk.jfr.Category;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
public class CategoryRepositoryImpl implements CategoryRepository{
    @Autowired
    private LocalSessionFactoryBean SessionFactory;
    
    @Override
    @Transactional
    public List<Category> getCategorys() {
        Session session = this.SessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("FROM Category");
        return q.getResultList();
    }
}
