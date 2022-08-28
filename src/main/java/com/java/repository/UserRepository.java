/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.repository;

import com.java.pojo.User;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface UserRepository {
    boolean addUser(User user);
    List<User> getUsers(String username);
}
