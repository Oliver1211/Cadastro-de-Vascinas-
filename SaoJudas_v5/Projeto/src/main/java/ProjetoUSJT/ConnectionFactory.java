package ProjetoUSJT;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "cadastro_login";
    private static String usuario = "root";
    private static String senha = "anima123"; /*"andrey12"*/ 
    private static String Database2 = "pacientes";

    public static Connection obtemConexao() throws Exception {
        String url = String.format("jdbc:mysql://%s:%s/%s", host, porta, db);
        return DriverManager.getConnection(
                url, usuario, senha);
    }
    
        public static Connection procuraPaciente() throws Exception {
        String url = String.format("jdbc:mysql://%s:%s/%s", host, porta, Database2);
        return DriverManager.getConnection(
                url, usuario, senha);
    }

}
  