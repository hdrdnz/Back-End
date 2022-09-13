package service;

import model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
   static List<User> users=new ArrayList<>();

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        UserService.users = users;
    }

    public List<User> getAllUsers() {
        return users;
    }
    public  User createUser(User user) {
        users.add(user);
        return user;
    }

    public List<User> getUserByLetter(String letter) {
        return  users.stream().filter(user ->user.getFullName().contains(letter)).toList();
    }

    public User getUserByUsername(String username) {
        return users.stream().filter(user -> user.getUserName().equals(username)).findFirst().orElseThrow();
    }


    public String updateUser(Long id, User user) {
     User foundUser= users.stream().filter(user1 -> user1.getId()==id).findFirst().orElseThrow();
        if(foundUser.getFullName() !=null) foundUser.setFullName(user.getFullName());
        if(foundUser.getUserName() !=null) foundUser.setUserName(user.getUserName());
        if(foundUser.getAge() !=null) foundUser.setAge(user.getAge());
        if(foundUser.getPassword() !=null) foundUser.setPassword(user.getPassword());
        if(foundUser.getMySongs() !=null) foundUser.setMySongs(user.getMySongs());

        return foundUser.getId()+"id'li kullanıcı güncellenmiştir";
    }


    public String  deleteUser(Long id) {
        User foundUser= users.stream().filter(user1 -> user1.getId()==id).findFirst().orElseThrow();
        users.remove(foundUser);
        return foundUser.getId()+"id'li kullanıcı silindi";
    }
    }

