/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomeapplication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M Ayub
 */
public class HomeSecuritySystem 
{
    Boolean SystemStatus;
    List<HomeSecurityDevice> ListOfHomeSecurityDevices;
    
    public HomeSecuritySystem()
    {
        this.SystemStatus = false;
        this.ListOfHomeSecurityDevices = new ArrayList<>();
    }
    
    void AddDevice(HomeSecurityDevice h1)
    {
        this.ListOfHomeSecurityDevices.add(h1);
    }
    
    void RemoveDevice(HomeSecurityDevice h1)
    {
        this.ListOfHomeSecurityDevices.remove(h1);
    }
    
    void TurnOnSecuritySystem()
    {
        if (this.SystemStatus == false)
        {
            this.SystemStatus = true;
            System.out.print("Home Security System has been turned on.\n");
        }
    }
    
    public void AlertPolice()
    {
        System.out.print("Alert sent to police department. Waiting for reply.\n");
    }
    
    public void AlertFireBrigade()
    {
        System.out.print("Alert sent to fire department. Waiting for reply.\n");
    }
    
    public void AlertUser()
    {
        System.out.print("Alert sent to user. Waiting for reply.\n");
    }
    
    public void AlertAgency()
    {
        System.out.print("Alert sent to agency. Waiting for reply.\n");
    }
    
    Boolean CheckStatus()
    {
        return this.SystemStatus;
    }
    
    public void View_Records()
    {
        for (HomeSecurityDevice hsd: this.ListOfHomeSecurityDevices)
        {   
            hsd.DisplayDevice();
            
            for (Alert a: hsd.ListOfAlerts)
            {
                a.PrintAlert();
            }
        }
    }
}