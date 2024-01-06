package repositories.users;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static entities.UserRole.ADMIN;
import static entities.UserRole.USER;

public class UserRepositoryImpl implements UserRepository {
    private final List<User> users = new ArrayList<>();
    private static UserRepository userRepository;

    private UserRepositoryImpl() {
        users.add(new User(1L, "Ahmad", "Alex", "Ministry of Health",
                "admin_hem", "admin", ADMIN));
        users.add(new User(2L, "Khaled", "Sasha", "Hospital No. 1",
                "user1_hem", "user1", USER));
        users.add(new User(3L, "Ali", "Vlad", "Hospital No. 2",
                "user2_hem", "user2", USER));
        users.add(new User(4L, "Yassin", "Vitally", "Hospital No. 3",
                "user3_hem", "user3", USER));
        users.add(new User(5L, "Yossef", "Vadim", "Hospital No. 4",
                "user4_hem", "user4", USER));
    }

    public static UserRepository getInstance() {
        if (userRepository == null) {
            userRepository = new UserRepositoryImpl();
        }
        return userRepository;
    }

    @Override
    public Optional<List<User>> readUsers() {
        return Optional.of(users);
    }

    @Override
    public Optional<User> createUser(User user) {
        user.setUserId((long) (users.size() + 1));
        users.add(user);
        return Optional.of(user);
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }
}
