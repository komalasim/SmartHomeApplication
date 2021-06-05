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
public class Request
{
    String RequestedManufacturerName;
    String RequestDescription;
    int UserID;
    
    public Request()
    {
        this.RequestedManufacturerName = "";
        this.RequestDescription = "";
        this.UserID = 0;
    }
    
    void PlaceRequest(int UserID, String ManufacturerName, String Description)
    {
        this.UserID = UserID;
        this.RequestedManufacturerName = ManufacturerName;
        this.RequestDescription = Description;
        System.out.println("Request Placed by UserID: " + this.UserID);
    }
}