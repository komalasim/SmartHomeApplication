/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomeapplication;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author M Ayub
 */
abstract public class HomeSecurityDevice extends Device
{
    List<Alert> ListOfAlerts;
    Boolean SoundAlarm;
    
    public HomeSecurityDevice()
    {
        this.ListOfAlerts = new ArrayList<>();
        this.SoundAlarm = false;
    }
    
    abstract void SendAlert();
    
    abstract void TriggerAlarm();
    
    abstract void ResetAlarm();
}