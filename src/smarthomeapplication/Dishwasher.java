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
public class Dishwasher extends HouseholdDevice
{
    int DeviceCapacity;
    int MaximumCapacity;
    
    public Dishwasher()
    {
        this.DeviceCapacity = 0;
        this.MaximumCapacity = 30;
    }
    
    public Dishwasher(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Dishwasher");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        System.out.println("Device Capacity: " + DeviceCapacity);
    }
    
    void SetDeviceCapacity(int Value)
    {
        DeviceCapacity = Value;
        CheckCapacity();
        System.out.println(this.DeviceCapacity + " dishes added. Dishwasher running.");
    }
    
    void CheckCapacity()
    {
        if(DeviceCapacity == MaximumCapacity)
            System.out.println("Maximum Capacity of Dishwasher Reached");
//        else 
//        {
//            int x = this.MaximumCapacity - this.DeviceCapacity;
//            System.out.println(x + " more dishes can be added.");
//        }
    }
}