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
public class WashingMachine extends HouseholdDevice
{
    int DeviceCapacity;
    int MaximumCapacity;
    
    public WashingMachine()
    {
        this.DeviceCapacity = 0;
        this.MaximumCapacity = 50;
    }
    
    public WashingMachine(int DID,String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
   
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Washing Machine");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        System.out.println("Device Capacity:"+DeviceCapacity);
    }
    
    void SetDeviceCapacity(int Value)
    {
        DeviceCapacity = Value;
        System.out.println(this.DeviceCapacity + " clothes added.");
    }
    
    void CheckCapacity()
    {
        if(DeviceCapacity == MaximumCapacity)
            System.out.println("Maximum Capacity of Dishwasher Reached");
        else 
            System.out.println((this.MaximumCapacity - this.DeviceCapacity) + " more clothes can be added.");
    }
}