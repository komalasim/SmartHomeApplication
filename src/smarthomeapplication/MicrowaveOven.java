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
public class MicrowaveOven extends HouseholdDevice
{
    int TemperatureMode; //0 1 2 , 0=low, 1=medium, 2=high
    
    public MicrowaveOven()
    {
        this.TemperatureMode = -1;
    }
    
    public MicrowaveOven(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " +("Microwave Oven"));
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        if(TemperatureMode == 0)
            System.out.println("Temperature Mode: Low");
        else if(TemperatureMode == 1)
            System.out.println("Temperature Mode: Medium");
        else if(TemperatureMode == 2)
            System.out.println("Temperature Mode: High");
        else 
            System.out.println("No Temperature Mode Set");
    }
    
    void SetTemperatureMode(int TempMode)
    {
        if(TempMode == 0)
        {
            TemperatureMode = 0;
            System.out.println("Temperature mode is set to low.");
        }
        else if(TempMode == 1)
        {
            TemperatureMode = 1;
            System.out.println("Temperature mode is set to medium.");
        }
        else if(TempMode == 2)
        {
            TemperatureMode = 2;
            System.out.println("Temperature mode is set to high.");
        }
        else
            System.out.println("Invalid Input");
    }
    
    void DisplayTemperatureMode()
    {
        if(TemperatureMode == 0)
        {
            System.out.println("Temperature mode is low.");
        }
        else if(TemperatureMode == 1)
        {
            System.out.println("Temperature mode is medium.");
        }
        else if(TemperatureMode == 2)
        {
            System.out.println("Temperature mode is high.");
        }
    }
}