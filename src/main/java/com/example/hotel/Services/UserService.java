package com.example.hotel.Services;


import com.example.hotel.Models.User;
import com.example.hotel.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User ajouter(User user) { return this.userRepository.save(user); }
    public void update(User user) { this.userRepository.saveAndFlush(user); }
    public void delete(User user) { this.userRepository.delete(user); }
    public List<User> afficherTous() { return this.userRepository.findAll(); }
    public User afficherParId(long id) {return this.userRepository.findById(id).get(); }

}
