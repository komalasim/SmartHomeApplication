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
public class Door extends RoomDevice
{
    private boolean LockStatus; 
    
    public Door()
    {
        this.LockStatus = false;
    }
    
    public Door(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Door");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        if(LockStatus == true)
            System.out.println("Doors: Open");
        else
            System.out.println("Doors: Closed");
    }
    
    public void LockDoor()
    {
        this.LockStatus = true;
        System.out.println("The door " + DeviceID + " has been locked.");
    }
    
    public void UnlockDoor()
    {
        LockStatus = false;
        System.out.println("The door " + DeviceID + " has been unlocked.");
    }
}