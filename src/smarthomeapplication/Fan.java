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
public class Fan extends RoomDevice
{    
    private int FanSpeed;  //5 levels
    
    public Fan()
    {
        this.FanSpeed = 0;
    }
    
    public Fan(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Fan");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        System.out.println("Fan Speed: " + FanSpeed);
    }
    
    public void IncreaseFanSpeed()
    {
       if (FanSpeed < 5)
       {
           FanSpeed++;
           System.out.println("Fan " + DeviceID + " speed has been set to " + FanSpeed + " .");
       }
       else
           System.out.println("The fan " + DeviceID + " speed is already maximum.");
    }
    
    public void DecreaseFanSpeed()
    {
       if (FanSpeed > 1)
       {
           FanSpeed--;
           System.out.println("Fan " + DeviceID + " speed has been set to " + FanSpeed + " .");
       }
       else
           System.out.println("The Fan " + DeviceID + " speed is already minimum.");
    }
}