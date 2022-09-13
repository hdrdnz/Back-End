package controller;

import model.User;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
         return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(User user){
        return userService.createUser(user);
    }

    @GetMapping("/{letter}")
    public List<User> getUserByLetter(@PathVariable String letter){
        return userService.getUserByLetter(letter);
    }

    @GetMapping("/{username}")
    public User getUserByUsername( @PathVariable String username){
        return userService.getUserByUsername(username);
    }

    @PutMapping("/{id}")
    public String updateUser( @PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("{id}")
    public String deleteUser( @PathVariable Long id){
      return   userService.deleteUser(id);
    }








}
