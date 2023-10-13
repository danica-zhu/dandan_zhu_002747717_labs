/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author danica
 */
public class AccountDirectory {

    private ArrayList<Account> accountList;

//    public AccountDirectory(ArrayList<Account> accountList) {
//    }

    public AccountDirectory() {
        this.accountList = new ArrayList<Account>();

    }


    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount(){
        Account account = new Account();
        accountList.add(account);
        return account;
    }
    
    public void deleteAccount(Account account) {
        accountList.remove(account);
    }
    
    public Account searchAccount(String accountNumber) {
        for (Account user:accountList) {
            if (user.getAccountNumber().equals(accountNumber)) {
                return user;
            }
        }
        
        return null;
    }
    
    
    
}
