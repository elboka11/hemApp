package services.users;

import entities.User;

import java.util.List;

public interface UserService {
    List<User> readUsers();
    void createUser(User user);


}
