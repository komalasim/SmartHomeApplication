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
public class CoffeeMaker extends HouseholdDevice
{
    int Quantity;
    
    public CoffeeMaker()
    {
        this.Quantity = 0;
    }
    
    public CoffeeMaker(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Coffee Maker");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        System.out.println("Quantity: " + Quantity);
    }
    
    void SetQuantity(int Quantity)
    {
        this.Quantity = Quantity;
        System.out.println("Coffee maker quantity is set to: " + this.Quantity);
    }
    
    void DisplayQuantity()
    {
        System.out.println("The coffee maker's quantity is: "+ this.Quantity);
    }
}