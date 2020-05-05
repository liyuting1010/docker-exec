package server.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.common.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GetUsersServiceImpl implements GetUsersService {

    private final Connection dbConnection;

    @Autowired
    public GetUsersServiceImpl(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();

        try {
            ResultSet resultSet = dbConnection.createStatement().executeQuery("SELECT username, age FROM users");
            while (resultSet.next()) {
                userList.add(new User(
                        resultSet.getString("username"),
                        resultSet.getInt("age")
                ));
            }
            return userList;
        } catch (SQLException e) {
            throw new IllegalStateException("could not get users", e);
        }
    }
}
