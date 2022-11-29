
import java.sql.*;

public class app
{
    public static void main(String[] args)
    {
        Connection con;
        Statement stmt = null;

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root",
                    "Megaxxl687puperpro!");

            System.out.println("SQL DB connected!");

            stmt = con.createStatement();

            String createTblSql = "CREATE TABLE IF NOT EXISTS phones"
                    + "(id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "user_name varchar (10), user_id int(5), phone_number varchar (10))";
            stmt.execute(createTblSql);

            String insertSql = String.format("INSERT INTO phones (user_name, user_id, phone_number) " +
                     " VALUES('Rabi', %d, %d),('Levi', %d, %d),('Yosi', %d, %d),('David', %d, %d)" ,1052, 552876930,1053,552876920,1054,552876910,1055,552876900);

            stmt.executeUpdate(insertSql);

            System.out.println("Phones record added!");

            String createTblSql1 = "CREATE TABLE IF NOT EXISTS rooms"
                    + "(id INT PRIMARY KEY AUTO_INCREMENT, phone_id int(5), room_number int(4))";
            String foreignKey = "ALTO ALTER TABLE rooms" +
                    "ADD FOREIGN KEY (phone_id) REFERENCES Persons(phone_id) phones,";
            System.out.println("Foreign Key added!");
            System.out.println(foreignKey);
            stmt.execute(createTblSql1);
            String insertSql1 = String.format("INSERT INTO rooms (phone_id, room_number) " +
                    " VALUES(%d, %d),(%d, %d),(%d, %d),(%d, %d)" , 552876930,1052,552876920,1053,552876910,1054,552876900,1055);
            System.out.println(insertSql1);
            stmt.executeUpdate(insertSql1);
            System.out.println("Rooms record added!");
        }
        catch (Exception e)
        {
            e.getStackTrace();
            System.out.println(e);
        }
        String selectSql = "SELECT %d0 * FROM phones";
        try
        {
            ResultSet resultSet = stmt.executeQuery(selectSql);

            while (resultSet.next())
            {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getInt("user_id"));
                System.out.println(resultSet.getInt("phone_number"));
            }
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
