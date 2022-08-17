
package util;

import java.sql.*;
public class Conexion {
        private static final String url = "jdbc:mariadb://localhost:3306/proyectosconstruccion";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "ruben2022";
        private Connection con = null;
    public  Connection getConnection() {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.USERNAME, this.PASSWORD);
        }catch(SQLException | ClassNotFoundException e){
            System.err.println(e);
        }
        return con;
        
        
        
    }
}
