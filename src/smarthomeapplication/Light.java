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
public class Light extends RoomDevice{
    
    private int Intensity;  //5 levels
    
    public Light()
    {
        this.Intensity = 0;
    }
    
    public Light(int DID, String MName)
    {
        this.DeviceID = DID;
        this.ManufacturerName = MName;
    } 
    
    public void IncreaseIntensity()
    {
       if (Intensity < 5)
       {
           Intensity++;
           System.out.println("Light " + DeviceID + " intensity has been set to " + Intensity + " .");
       }
       else
           System.out.println("The light " + DeviceID + " intensity is already maximum.");
    }
    
    public void DecreaseIntensity()
    {
       if (Intensity > 1)
       {
           Intensity--;
           System.out.println("Light " + DeviceID + " intensity has been set to " + Intensity + " .");
       }
       else
           System.out.println("The light " + DeviceID + " intensity is already minimum.");
    }
   
    @Override
    public void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Light");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        System.out.println("Intensity: " + Intensity);
    }
}