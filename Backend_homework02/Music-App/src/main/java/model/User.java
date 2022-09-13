package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String fullName;
    private String userName;
    private Integer age;
    private String password;
    List<Song> mySongs=new ArrayList<>();

    public User(Long id, String fullName, String userName, Integer age, String password) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.age = age;
        this.password = password;
    }
}
