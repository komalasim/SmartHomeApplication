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
public class Speaker extends MediaDevice
{
    public Speaker(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Speaker");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On"); 
    }
}