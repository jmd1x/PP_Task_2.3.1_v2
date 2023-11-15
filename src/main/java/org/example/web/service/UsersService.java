package org.example.web.service;

import org.example.web.model.User;
import org.example.web.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UsersService {
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> findAll() {
        return usersRepository.findAll();
    }

    public void save(User user) {
        usersRepository.save(user);
    }

    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        usersRepository.save(updatedUser);
    }

    public void delete(int id) {
        usersRepository.deleteById(id);
    }

    public User show(int id) {
        return usersRepository.findById(id).get();
    }

}
