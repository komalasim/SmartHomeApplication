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

public abstract class MediaDevice extends Device 
{
    int Volume;
    
    public MediaDevice()
    {
        this.Volume = 0;
    }
    
    void VolumeUp()
    {
        Volume = Volume + 5;
    }
    
    void VolumeDown()
    {
        Volume = Volume - 5;
    }
}
