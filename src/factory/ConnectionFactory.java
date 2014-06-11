/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marcio.morando
 */
public class ConnectionFactory {

    public java.sql.Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://192.168.0.48:1433/TrimboxTeste", "sopasta_ti", "ti_sopasta");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
