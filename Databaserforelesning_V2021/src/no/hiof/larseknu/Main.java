package no.hiof.larseknu;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dyreparken";

        String bruker = "root";
        String passord = "root";

        try (Connection connection = DriverManager.getConnection(url, bruker, passord)) {
            String sporring = "SELECT * FROM dyr;";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sporring);

            while (resultSet.next()) {
                int dyrid = resultSet.getInt(1);
                String navn = resultSet.getString(2);
                String art = resultSet.getString("art");
                Date fodselsdato = resultSet.getDate(4);

                Dyr etDyr = new Dyr(dyrid, navn, art, fodselsdato.toLocalDate());

                System.out.println(etDyr);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
