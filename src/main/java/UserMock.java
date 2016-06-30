import java.util.Arrays;
import java.util.List;

/**
 * Created by ui2016 on 6/30/2016.
 */
public class UserMock implements UserDao {
    private static final List<User> users = Arrays.asList(
            new User("hello@google.com", "pass1"),
            new User("guy@epam.com", "12345"),
            new User("szabolcs@google.com", "qwert"));

    @Override
    public User getUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findAny()
                .orElse(null);
    }
}
