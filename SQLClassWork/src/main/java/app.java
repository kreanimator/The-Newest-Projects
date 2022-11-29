

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

            String createTblSql = "CREATE TABLE IF NOT EXISTS employees"
                    + "(emp_id INT PRIMARY KEY AUTO_INCREMENT, name varchar(30),"
                    + "position varchar(30), salary double)";
            stmt.execute(createTblSql);


            String insertSql = String.format("INSERT INTO employees(name, position, salary)"
                    + " VALUES('John', 'Developer', %d)", 2000);


            stmt.executeUpdate(insertSql);

            System.out.println("Employee record added!");
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }

        String selectSql = "SELECT * FROM employees";
        try
        {
            ResultSet resultSet = stmt.executeQuery(selectSql);

            while (resultSet.next())
            {
                System.out.println(resultSet.getInt("emp_id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("position"));
                System.out.println(resultSet.getDouble("salary"));
            }
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}