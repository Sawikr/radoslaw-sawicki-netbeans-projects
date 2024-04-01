/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radosław Sawicki
 */
package com.baeldung.mainappmodule;

import com.baeldung.daomodule.Dao;
import com.baeldung.entitymodule.User;
import com.baeldung.userdaomodule.UserDao;
import java.util.HashMap;
import java.util.Map;

public class Application {
    
    public static void main(String args[]) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        Dao userDao = new UserDao(users);
        userDao.findAll().forEach(System.out::println);
    }
}