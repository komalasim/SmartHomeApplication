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
abstract public class Sensor extends HomeSecurityDevice
{
    int SensorID;
    Boolean SensorStatus;
    Boolean Fire;
    Boolean Motion;
    
    public Sensor()
    {
        this.SensorID = 0;
        this.SensorStatus = false;
    }
}
