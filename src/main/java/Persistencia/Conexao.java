/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author georg
 */
public class Conexao {
    
    public static Connection conectabd(){
        Connection conn = null;
        String servidor = "localhost";
	String porta = "3306";
	String database = "projetoa3";

    
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://"+servidor+":"+porta+"/"+database+"?useTimezone=true&serverTimezone=UTC", "root", "7Anao10@");
            
            
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro na conexao com a base de dados");
            error.printStackTrace();
            
        }


    return conn;
 }
}