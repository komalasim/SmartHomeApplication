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
public class SmokeSensor extends Sensor
{
    Boolean SprinklerStatus;
    
    public SmokeSensor(Boolean _Fire)
    {
        this.Fire = _Fire;
        this.SprinklerStatus = false;
    }
    
    public SmokeSensor(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    void DetectSmoke()
    {
        if (Fire == true)
        {
            System.out.print("Smoke Detected!\n");
        
            TriggerAlarm();
            SendAlert();
        }
        else
            System.out.print("Smoke NOT Detected\n");
    }
    
    void DispenseSprinklers()
    {
        this.SprinklerStatus = true;
        System.out.print("Sprinklers have been turned on.\n");
    }

    @Override
    void SendAlert()
    {
        Alert a2 = new Alert();
        a2.Alert_ID = ++Alert.AlertCount;
        a2.Alert_Type = "HighPriorityAlert";
        this.ListOfAlerts.add(a2);
    }

    @Override
    void TriggerAlarm() 
    {
        this.SoundAlarm = true;
        System.out.print("Alarm is ringing.\n");
        DispenseSprinklers();
    }
    
    @Override
    void ResetAlarm()
    {
        if (Fire == true)
        {
            this.SensorStatus = false;
            this.SprinklerStatus = false;
            System.out.print("The smoke sensor has been reset and sprinklers have been turned off.\n");
            this.SoundAlarm = false;
            System.out.print("Alarm has been reset.\n");
        }
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Smoke Sensor");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
    }
}