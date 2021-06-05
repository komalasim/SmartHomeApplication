/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomeapplication;
import java.util.Date;

/**
 *
 * @author M Ayub
 */
public class UserAccount 
{
    String Account_ID, Password, Profile_Picture;
    Date Creation_Date;
    User AccountUser;
    Boolean LoggedIn;

    public UserAccount() 
    {
        this.Account_ID = this.Password = this.Profile_Picture = "";
        this.AccountUser = new User();
        this.LoggedIn = false;
    }
    
    public UserAccount(String Account_ID, String Password, String Profile_Picture, Date Creation_Date) 
    {
        this.Account_ID = Account_ID;
        this.Password = Password;
        this.Profile_Picture = Profile_Picture;
        this.Creation_Date = Creation_Date;
        this.LoggedIn = false;
        this.AccountUser = new User();
    }

    public void Edit_Account(){};
}