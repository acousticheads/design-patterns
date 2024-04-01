package creational.f_objectpool;

public class Client {

    public static void main(String[] args) throws Exception {

        ConnectionPool connectionPool = new ConnectionPool();
        connectionPool.generateConnectionPool(3);

        try (Connection connection = connectionPool.getConnection()) {
            System.out.println(connection.getConnectionId());
        }


        try (Connection connection = connectionPool.getConnection()) {
            System.out.println(connection.getConnectionId());
        }

        try (Connection connection = connectionPool.getConnection()) {
            System.out.println(connection.getConnectionId());
        }

        try (Connection connection = connectionPool.getConnection()) {
            System.out.println(connection.getConnectionId());
        }

        try (Connection connection = connectionPool.getConnection()) {
            System.out.println(connection.getConnectionId());
        }

        try (Connection connection = connectionPool.getConnection()) {
            System.out.println(connection.getConnectionId());
        }


    }
}
