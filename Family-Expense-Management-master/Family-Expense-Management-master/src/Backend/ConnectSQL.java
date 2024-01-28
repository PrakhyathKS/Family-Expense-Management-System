    package Backend;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class ConnectSQL {

        static Connection con;

        public static Connection createC()
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/familyexpensemanagement", "root", "prakhyath");
                System.out.println("connected ");
            } catch (ClassNotFoundException | SQLException e) {
            }
            return con;

        }

    }
