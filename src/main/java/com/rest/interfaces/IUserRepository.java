package com.rest.interfaces;

import java.util.List;

import com.rest.models.User;


public interface IUserRepository {
    void Insert(User model);

    void Update(User model);

    void Delete(int id);

    User FindById(int id);

    List<User> GetAll();
}
