package com.rest.repositories;

import java.util.ArrayList;
import java.util.List;

import com.rest.interfaces.IUserRepository;
import com.rest.models.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {

    private static List<User> users = new ArrayList<User>();

    private static int userid = 0;

    @Override
    public void Insert(User model) {
        model.setUserId(++userid);
        users.add(model);
    }

    @Override
    public void Update(User model) {
        Delete(model.getUserId());
        users.add(model);
    }

    @Override
    public void Delete(int id) {
        var user = FindById(id);
        users.remove(user);
    }

    @Override
    public User FindById(int id) {
        for (User user : users) {
            if (user.getUserId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> GetAll() {
        return users;
    }

}
