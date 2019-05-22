/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.controller;

import atm.db.DBConnection;
import atm.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author viniciusbeletella
 */
public class AccountController {
    
    DBConnection dbConn = new DBConnection();

   
    
    public Account login(String accountNumber, String pinNumber) {

        String SQL = "SELECT * from account where account_number = ? and pin = ?";
        Account account = new Account();

        Connection conn = dbConn.connection();

            try {

                PreparedStatement statement = conn.prepareStatement(SQL);
                statement.setInt(1, Integer.parseInt(accountNumber));
                statement.setInt(2, Integer.parseInt(pinNumber));

                ResultSet rs = statement.executeQuery();

                if (rs.next()) {
                    account.setPin(rs.getInt("pin"));
                    account.setAccountNumber(rs.getInt("account_number"));
                    account.setBalance(rs.getDouble("balance"));
                    account.setClientName(rs.getString("client_name"));
                    account.setId(rs.getByte("id"));
                }

                conn.close();
            
            } catch (Exception e) {
                e.printStackTrace();
            }

        return account;
        
    }
    
    public Account updateBalance (Account account){
        String SQL = "UPDATE account set balance = ? where id = ?";
        
        try{
            
            Connection conn = dbConn.connection();
            
            PreparedStatement statement = conn.prepareStatement(SQL);
            statement.setDouble(1, account.getBalance());
            statement.setInt(2, account.getId());
            
            statement.executeUpdate();    
            
            conn.close();
            
        } catch (SQLException e){
            e.printStackTrace();
        }
        return account;
    }
    
}
