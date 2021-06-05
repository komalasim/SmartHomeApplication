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
public abstract class Device
{
    int DeviceID;
    boolean DeviceStatus;
    String ManufacturerName;

    public Device() 
    {
        this.DeviceID = 0;
        this.DeviceStatus = false;
        this.ManufacturerName = "";
    }
    
    void TurnOn()
    {
        if (this.DeviceStatus == false)
        {
            this.DeviceStatus = true;
            System.out.println("Device with DeviceID: " + DeviceID + " is turned on.\n");
        }
        else
            System.out.println("Device already turned on.");
    }
    
    void TurnOff()
    {
        if (this.DeviceStatus == true)
        {
            this.DeviceStatus = false;
            System.out.println("Device with DeviceID: " + DeviceID + " is turned off.\n");
        }
        else
            System.out.println("Device already turned off.");
    }
    
    void CheckDeviceInfo()
    {
        System.out.println("Device ID: " + DeviceID);
        System.out.println("ManufacturerName: " + ManufacturerName);
        System.out.println("Status: " + DeviceStatus);
    }
    
    abstract void DisplayDevice();
}