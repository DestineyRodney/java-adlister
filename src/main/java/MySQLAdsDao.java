import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao() throws SQLException {
        try{
        Config config = new Config();
       this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );} catch(SQLException throwables) {
        throwables.printStackTrace();
        }

    };

    @Override
    public List<Ad> all() {

        String selectQuery = "SELECT * FROM ads";

        ResultSet rs = null;

        Statement stmt = connection.createStatement();
        rs = stmt.executeQuery(selectQuery);

        List<Ad> ads = new ArrayList<>();

        while (rs.next()) {
            System.out.println("Here's an album:");
            System.out.println("  id: " + rs.getLong("id"));
            System.out.println("  artist: " + rs.getString("author_first_name"));
            System.out.println("  name: " + rs.getString("author_last_name"));
            System.out.println("  name: " + rs.getString("content"));

        }
        return null;

    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }


}
