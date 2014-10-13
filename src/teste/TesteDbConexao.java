package teste;

import java.sql.Connection;
import java.sql.SQLException;
import persistencia.ConnectionFactory;

public class TesteDbConexao {
    
    public static void main(String args[]) throws SQLException{
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conectado");
        connection.close();
    }
    
}
