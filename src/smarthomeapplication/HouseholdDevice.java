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
public abstract class HouseholdDevice extends Device 
{
    int Timer;
    
    public HouseholdDevice()
    {
        this.Timer = 0;
    }
    
    void SetTimer(int Minutes)
    {
        Timer = Minutes;
    }
}
