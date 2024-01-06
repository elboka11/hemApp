package repositories.users;

import entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<List<User>> readUsers();

    Optional<User> createUser(User user);


    void deleteUser(User user);
}
