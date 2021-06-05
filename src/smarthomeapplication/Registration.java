/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomeapplication;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author M Ayub
 */
public class Registration 
{
    private static final Registration Instance = new Registration();
    List <UserAccount> User_Account_List = new <UserAccount> ArrayList() ;
    
    private Registration()
    {
        
    }
    
    public static Registration GetInstance()
    {
        return Instance;
    };
    
    public void SignUp() 
    {
        Scanner input = new Scanner(System.in);
        String in = "";
        UserAccount NewUser = new UserAccount();
        exit:
        {
            while (in != "e") 
            {
                System.out.println("To exit enter e.");
                while (in != "e") 
                {
                    in = this.Input_Account_ID();

                    if ("e".equals(in))
                        break exit;

                    if (this.Verify_Unique_Account_ID(in) == true) 
                    {
                        NewUser.Account_ID = in;
                        while (in != "e")
                        {
                            in = this.Input_Password();

                            if ("e".equals(in))
                                break exit;

                            if (this.Verify_Password_Length(in) == true) 
                            {
                                NewUser.Password = in;
                                System.out.println("Enter First Name");
                                NewUser.AccountUser.FirstName = input.nextLine();

                                if ("e".equals(NewUser.AccountUser.FirstName))
                                    break exit;

                                System.out.println("Enter Middle Name");
                                NewUser.AccountUser.MiddleName = input.nextLine();

                                if ("e".equals(NewUser.AccountUser.MiddleName))
                                    break exit;

                                System.out.println("Enter Last Name");
                                NewUser.AccountUser.LastName = input.nextLine();

                                if ("e".equals(NewUser.AccountUser.LastName))
                                    break exit;

                                System.out.println("Enter Address");
                                NewUser.AccountUser.Address = input.nextLine();

                                if ("e".equals(NewUser.AccountUser.Address))
                                    break exit;

                                System.out.println("Enter Email ID");
                                NewUser.AccountUser.Email = input.nextLine();

                                if ("e".equals(NewUser.AccountUser.Email))
                                    break exit;

                                System.out.println("Enter Date of Birth");
                                NewUser.AccountUser.Date_Of_Birth = input.nextLine();

                                if ("e".equals(NewUser.AccountUser.Date_Of_Birth))
                                    break exit;

                                System.out.println("Enter Gender");
                                NewUser.AccountUser.Gender = input.next().charAt(0);

                                if (NewUser.AccountUser.Gender == 'e')
                                    break exit;

                                System.out.println("Enter Phone No");
                                NewUser.AccountUser.PhoneNo = input.nextInt();

                                if (NewUser.AccountUser.PhoneNo == 'e')
                                    break exit;

                                NewUser.Creation_Date = new Date();
                                break;
                            }
                        }

                        if (NewUser.Password != null) 
                        {
                            this.User_Account_List.add(NewUser);
                            System.out.println("Sign Up Successful"); 
                            in = "e";
                            break;
                        }
                    }
                }
            }
        }
    };
    
    public UserAccount Login()
    {
        int LoginCount = 0;
        
        while(LoginCount < 5) 
        {
            String ID = this.Input_Account_ID();
            String Password = this.Input_Password();
            
            if (this.Verify_Login(ID, Password) == true)
            {
                
                for (int i =0; i < User_Account_List.size(); i++)
                {
                    if (User_Account_List.get(i).Account_ID.equals(ID) && User_Account_List.get(i).Password.equals(Password))
                        User_Account_List.get(i).AccountUser.DisplayDevices(); User_Account_List.get(i).LoggedIn = true; return User_Account_List.get(i);
                }
                
                break;
            }
            
            LoginCount++;
        }
        
        if (LoginCount >= 5)
            this.Email_Incorrect_Password_Attempts();
        
        return null;
    };
    
    public void Delete_Account(String AccountID)
    {
        if (!this.User_Account_List.isEmpty())
        {
            for (int i = 0; i < this.User_Account_List.size(); i++)
            {
                if (this.User_Account_List.get(i).Account_ID == AccountID)
                    this.User_Account_List.remove(i);
            }
        }
        
        if (this.User_Account_List.isEmpty())
            System.out.println("Account " + AccountID + " Delected!");
    };
    
    public String Input_Account_ID()
    {
        System.out.println("Enter Account ID");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    };
    
    public String Input_Password()
    {
        System.out.println("Enter Password");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    };
    
    public Boolean Verify_Unique_Account_ID(String ID)//For Signup
    {
        for (int i = 0; i < User_Account_List.size(); i++)
        {
            if (User_Account_List.get(i).Account_ID.equals(ID))
            {
                System.out.println("Account ID already in use.");
                return false;
            }
        }
        
        return true;
    };
    
    public Boolean Verify_Password_Length(String Password) //For Signup
    {
        if (Password.length() < 8)
        {
            System.out.println("Weak Password. Password should be more than 8 characters.");
            return false;
        }
        
        return true;
    };
    
    public void Email_Reset_Password()
    {
        System.out.println("User requested to reset password. The link to reset password email has been sent to the User's email ID.");
    };
    
    public void Email_New_Device_Login()
    {
        System.out.println("New Device Logged in. An email has been sent to the User's email ID.");
    };
    
    public void Email_Incorrect_Password_Attempts()
    {
        System.out.println("5 Incorrect Password Attempts have been made. An email has been sent to the User's email ID.");
    };
    
    public Boolean Verify_Login(String ID, String Password)//For login
    {
        for (int i = 0; i < User_Account_List.size(); i++)
        {
            if (User_Account_List.get(i).Account_ID.equals(ID) && User_Account_List.get(i).Password.equals(Password))
                return true;
        }
        
        System.out.println("Incorrect Account ID or Password.");
        return false;
    };
}