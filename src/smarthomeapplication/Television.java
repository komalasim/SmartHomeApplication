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
public class Television extends MediaDevice
{
    int Program;
    
    public Television()
    {
        this.Program = 0;
    }
    
    public Television(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
   
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Television");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        System.out.println("Television");
        System.out.println("Program:"+Program);
    }
    
    void ProgramUp()
    {
        Program = Program + 1;
    }
    
    void ProgramDown()
    {
        if(Program > 0)
        {
            Program = Program - 1;
        }
    }
    
    void GoToChannel(int Value)
    {
        Program = Value;
        System.out.println("Channel number: "+ Program + " reached.");
    }
}