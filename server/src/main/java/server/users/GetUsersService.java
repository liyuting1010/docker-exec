package server.users;

import server.common.User;
import java.util.List;

@FunctionalInterface
public interface GetUsersService {
    List<User> getAll();
}
