/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author marcio.morando
 */
public class FabricaDeConexao {
     public static Connection conn;
     public static Statement stmt;
     public static ResultSet rs;
    
    //String url = "jdbc:sqlserver://servidorsimula:1433/TrimboxTeste";
     String url = "jdbc:sqlserver://servidorsimula:1433;TrimboxTeste=TrimboxTeste";
    //String driver = "com.sqlserver.jdbc.Driver";
     String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String user = "sopasta_ti";
    String password = "ti_sopasta";
    
    public void abrirConexao(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            stmt = (Statement) conn.createStatement();
        }catch(Exception e){
            System.out.println(e.getMessage() + "\n" + e.getCause());
        }
    }
    /*public static void main(String[]args){
        FabricaDeConexao fab = new FabricaDeConexao();
        fab.abrirConexao();*/
    
    

}
