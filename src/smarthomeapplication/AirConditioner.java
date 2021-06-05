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
public class AirConditioner extends EnvironmentControlDevice
{
    int FanSpeed; //0 1 2 3
    boolean Swing;
    Boolean TurboMode;
    Boolean PlasmaMode;
    Boolean FanMode;
    
    public AirConditioner(int FanSpeed, Boolean Swing)
    {
        this.FanSpeed = FanSpeed;
        this.Swing = Swing;
        this.TurboMode = false;
        this.PlasmaMode = false;
        this.FanMode = false;
    }
    
    public AirConditioner(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    void ShowTemperature()
    {
        System.out.println("The temperature of air conditioner is " + Temperature);
    }
    
    void FanSpeedUp()
    {
        if(FanSpeed <= 3)
        {
            System.out.println("Fan Speed Up");
            FanSpeed = FanSpeed + 1;
        }
        else
        {
            System.out.println("Fan Speed is highest.");
        }
    }
    
    void FanSpeedDown()
    {
        if(FanSpeed >= 0)
        {
            System.out.println("Fan Speed Down");
            FanSpeed = FanSpeed - 1;
        }
        else
        {
            System.out.println("Fan Speed is lowest.");
        }
    }
    
    void ChangeMode(String Mode)
    {
        if (Mode.equalsIgnoreCase("Turbo"))
        {
            this.TurboMode = true;
            System.out.print("Turbo model is set.");
        }
        else if (Mode.equalsIgnoreCase("Plasma"))
        {
            this.PlasmaMode = true;
            System.out.print("Plasma model is set.");
        }
        else if (Mode.equalsIgnoreCase("Fan"))
        {
            this.FanMode = true;
            System.out.print("Fan model is set.");
        }        
    } 
    
    void TurnOnSwing()
    {
        if (Swing == false)
        {
            Swing = true;
            System.out.println("Swing Turned On");
        }
    }
    
    void TurnOffSwing()
    {
        if (Swing == true)
        {
            Swing = false;
            System.out.println("Swing Turned Off");
        }
    }  
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Air Conditioner");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        System.out.println("Fan Speed: " + FanSpeed);
        System.out.println("Mode: ");
        
        if (this.TurboMode == true)
            System.out.print("Turbo");
        else if (this.PlasmaMode == true)
            System.out.print("Plasma");
        else if (this.FanMode == true)
            System.out.print("Fan");
    
        if(Swing == true)
            System.out.println("Swing: On");
        else
            System.out.println("Swing: Off");
    }
}