package server.common;

import java.sql.Connection;

@FunctionalInterface
public interface DBConnector {
    Connection getConnection();
}

