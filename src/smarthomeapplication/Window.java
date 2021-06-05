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
public class Window extends RoomDevice
{
    private boolean OpenStatus; 
    
    public Window()
    {
        this.OpenStatus = false;
    }
    
    public Window(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Window");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
       
        if(OpenStatus == true)
            System.out.println("Windows: Open");
        else
            System.out.println("Windows: Closed");
        
        System.out.println("Open Status: " + OpenStatus);
    }
    
    public void OpenWindow()
    {
        OpenStatus = true;
        System.out.println("The window " + DeviceID + " has been opened.");
    }
    
    public void CloseWindow()
    {
        OpenStatus = false;
        System.out.println("The window " + DeviceID + " has been closed.");
    }
}