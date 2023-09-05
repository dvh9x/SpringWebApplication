package com.hido.springwebapplication.services;

import com.hido.springwebapplication.models.Category;
import com.hido.springwebapplication.dao.categoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryService {
    @Autowired
    private categoryDao categoryDao;

    public Category addCategory(String name) {
        return this.categoryDao.addCategory(name);
    }

    public List<Category> getCategories(){
        return this.categoryDao.getCategories();
    }

    public Boolean deleteCategory(int id) {
        return this.categoryDao.deletCategory(id);
    }

    public Category updateCategory(int id,String name) {
        return this.categoryDao.updateCategory(id, name);
    }

    public Category getCategory(int id) {
        return this.categoryDao.getCategory(id);
    }
}
