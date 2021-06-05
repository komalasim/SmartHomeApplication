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
public abstract class EnvironmentControlDevice extends Device
{
    int Temperature;
    int Timer;      //In hours

    public EnvironmentControlDevice() 
    {
        this.Temperature = 26;
        this.Timer = 0;
    }

    void TemperatureUp()
    {
        //HighLimit = 32;
        //LowLimit = 16;
        
        if(Temperature < 32)
        {
            Temperature = Temperature + 1;
        }
        else if(Temperature == 32)
        {
            System.out.println("Highest limit of temperature reached!");
        }
    }
    
    void TemperatureDown()
    {
        //HighLimit = 32;
        //LowLimit = 16;
        
        if(Temperature > 16)
        {
            Temperature = Temperature - 1;
        }
        else if(Temperature == 16)
        {
            System.out.println("Lowest limit of temperature reached!");
        }
    }
    
    void SetTimer(int Hours)
    {
        Timer = Hours;
        System.out.print("Device will automatically turn off after " + Timer + " hours.");
    }
}