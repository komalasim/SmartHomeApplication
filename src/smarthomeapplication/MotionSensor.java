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
public class MotionSensor extends Sensor 
{   
    public MotionSensor(Boolean _Motion)
    {
        this.Motion = _Motion;
    }
    
    public MotionSensor(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Motion Sensor");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
    }
    
    void DetectMovement()
    {
        if (Motion == true)
        {
            System.out.print("Motion Detected!\n");
        
            TriggerAlarm();
            SendAlert();
        }
        else
            System.out.print("Motion NOT Detected\n");
    }
    
    @Override
    void SendAlert()
    {
        Alert a3 = new Alert();
        a3.Alert_ID = ++Alert.AlertCount;
        a3.Alert_Type = "LowPriorityAlert";
        this.ListOfAlerts.add(a3);
    }
    
    @Override
    void TriggerAlarm() 
    {
        this.SoundAlarm = true;
        System.out.print("Alarm is ringing.\n");
    }
    
    @Override
    void ResetAlarm()
    {
        if (Motion == true)
        {
            this.SensorStatus = false;
            System.out.print("The motion sensor has been reset.\n");
            this.SoundAlarm = false;
            System.out.print("Alarm has been reset.\n");
        }   
    }
}