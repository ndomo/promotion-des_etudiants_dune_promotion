
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GGS
 */
public class Connecter {
    Connection con;
    public Connecter(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
    System.err.println(e);
//pour fficher l'erreur
    }
    try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/etude","root","");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){return con;}

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
