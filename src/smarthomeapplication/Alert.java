/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomeapplication;

/**
 *
 * @author M Ayub
 */
public class Alert 
{
    int Alert_ID;
    String Alert_Type;
    static int AlertCount = 0;

    public Alert()
    {
        this.Alert_ID = 0;
        this.Alert_Type = "";
    }
    
    public void Alert_Police()
    {
        System.out.print("Alert sent to police department. Waiting for reply.\n");
    }
    
    public void Alert_Fire_Brigade()
    {
        System.out.print("Alert sent to fire department. Waiting for reply.\n");
    }
    
    public void Alert_User()
    {
        System.out.print("Alert sent to user. Waiting for reply.\n");
    }
    
    public void Alert_Agency()
    {
        System.out.print("Alert sent to agency. Waiting for reply.\n");
    }
    
    void PrintAlert()
    {
        System.out.print("AlertID: " + this.Alert_ID + "\nAlert Type: " + this.Alert_Type + "\n");
    }
}