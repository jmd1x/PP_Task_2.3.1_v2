package org.example.web.dao;

import org.example.web.model.User;

import java.util.List;

public interface UsersDao {
    public List<User> findAll();

    public User show(int id);

    public void save(User user);

    public void update(int id, User updatedUser);

    public void delete(int id);
}
