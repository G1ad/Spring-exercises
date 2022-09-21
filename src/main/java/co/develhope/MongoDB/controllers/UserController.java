package co.develhope.MongoDB.controllers;

import co.develhope.MongoDB.entities.User;
import co.develhope.MongoDB.repositories.UserRepository;
import co.develhope.MongoDB.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("")
    public User postUser(@RequestBody User user) {
        return userService.postUser(user);
    }

    @GetMapping
    public List<User> getUser() {
        return userService.getUser();
    }

    @GetMapping("/count")
    public String getCount() {
        return userService.getCount();
    }

    @GetMapping("/id")
    public User getUser(@RequestParam String id) throws Exception {
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody User userEntity) throws Exception {
        return userService.editUser(id, userEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) throws Exception {
        userService.deleteUser(id);
    }
}
