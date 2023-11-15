package org.example.web.service;

import org.example.web.dao.UsersDao;
import org.example.web.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UsersServiceImpl implements UsersService {
    private final UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public List<User> findAll() {
        return usersDao.findAll();
    }

    @Transactional
    public void save(User user) {
        usersDao.save(user);
    }

    @Transactional
    public void update(int id, User updatedUser) {
        usersDao.update(id, updatedUser);
    }

    @Transactional
    public void delete(int id) {
        usersDao.delete(id);
    }

    public User show(int id) {
        return usersDao.show(id);
    }

}
