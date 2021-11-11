package com.rest.controllers;

import java.util.List;
import java.util.logging.Logger;

import com.rest.interfaces.IUserRepository;
import com.rest.models.User;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    @Autowired
    private IUserRepository _repository;

    

    @RequestMapping(method = RequestMethod.GET)
    public List<User> GetAll() {
        return _repository.GetAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void Post(@RequestBody User model) {
        _repository.Insert(model);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void Put(@RequestBody User model) {
        _repository.Update(model);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void Delete(@PathVariable int id) {
        _repository.Delete(id);
        ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User Get(@PathVariable int id) {
        return _repository.FindById(id);
    }

}
