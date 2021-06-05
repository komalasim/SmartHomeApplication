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
public class Curtain extends RoomDevice
{
    private boolean OpenStatus; 
    
    public Curtain()
    {
        this.OpenStatus = false;
    }
    
    public Curtain(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Curtain");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        if(OpenStatus == true)
            System.out.println("Curtains: Open");
        else
            System.out.println("Curtains: Closed");
    }
    
    public void OpenCurtain()
    {
        OpenStatus = true;
        System.out.println("The curtain " + DeviceID + " has been opened");
    }
    
    public void CloseCurtain()
    {
        OpenStatus = false;
        System.out.println("The curtain " + DeviceID + " has been closed");
    }
    
}