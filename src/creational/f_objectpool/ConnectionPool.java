package creational.f_objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    public List<Connection> connectionPool = new ArrayList<>();

    public boolean generateConnectionPool(int size) {
        for (int i = 0; i < size; i++) {
            connectionPool.add(new Connection(i, false));
        }
        return true;
    }

    public Connection getConnection() {

        for (Connection connection : connectionPool) {

            if (!connection.isInUse()) {
                connection.setInUse(true);
                return connection;
            }

        }

        return null;

    }


}
