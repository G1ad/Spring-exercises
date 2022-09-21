package co.develhope.MongoDB.services;

import co.develhope.MongoDB.entities.User;
import co.develhope.MongoDB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService() {
    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User postUser(User user) {
        user.setId(null);
        return userRepository.save(user);
    }


    public List<User> getUser() {
        return userRepository.findAll();
    }


    public String getCount() {
        return "In MongoDB there are: " + userRepository.count() + " users";
    }

    public User getUser(@RequestParam String id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) return user.get();
        else throw new Exception("User not found");
    }

    public User editUser(@PathVariable String id, @RequestBody User user) throws Exception {
        if (!userRepository.existsById(id)) throw new Exception("User not found");
        else {
            user.setId(id);
            return userRepository.save(user);
        }

    }

    public void deleteUser(@PathVariable String id) throws Exception {
        if (!userRepository.existsById(id)) throw new Exception("User not found");
        else userRepository.deleteById(id);


    }
}
