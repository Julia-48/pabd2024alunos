/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package julia;

import java.sql.*;

/**
 *
 * @author 20221074010020
 */
public class Julia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Customer c = new Customer(1, "Julia", "Soares", "s.julia@escolar.ifrn.edu.br", 1, 1);
        
        CustomerDAO dao = new CustomerDAO();
        
        dao.insertCustomer(c);
        dao.updateCustomer(c);
        dao.deleteCustomer(666);
        dao.showCustomers();
        
    }
    
}
