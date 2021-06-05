/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomeapplication;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author M Ayub
 */
public class IdentificationCamera extends HomeSecurityDevice
{
    int CameraID;
    String CameraLocation;
    List<Video> Videos;
    List<Image> Images;
    
    public IdentificationCamera(int DID, String Manufacturer)
    {
        this.DeviceID = DID;
        this.ManufacturerName = Manufacturer;
        this.CameraID = 0;
        this.CameraLocation = "";
        this.Videos = new ArrayList<>();
        this.Images = new ArrayList<>();
    }
    
    @Override
    public void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Identification Camera");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
    }
    
    void CaptureVideo()
    {
        Video v1 = new Video();
        this.Videos.add(v1);
        System.out.print("Video Recorded.\n");
    }
    
    void DeleteVideo(int VideoID)
    {
        if (!this.Videos.isEmpty())
        {
            this.Videos.remove(VideoID);
            System.out.print("Video Deleted.\n");
        }
    }
    
    void CaptureImage()
    {
        Image i1 = new Image();
        this.Images.add(i1);
        System.out.print("Image Taken.\n");
    }
    
    void DeleteImage(int ImageID)
    {
        if (!this.Images.isEmpty())
        {
            this.Images.remove(ImageID);
            System.out.print("Image Deleted.\n");
        }
    }
    
    void IdentifyPerson()
    {
        System.out.print("There is a visitor at the front door. Allow entry to visitor?");
        Scanner UserInput = new Scanner(System.in);
        
        if (UserInput.nextLine().equalsIgnoreCase("Yes"))
            System.out.print("Visitor has entered the house.\n");
        else if (UserInput.nextLine().equalsIgnoreCase("No"))
        {
            System.out.print("Front door locked. Sound alarm?");
            UserInput.nextLine();
            
            if (UserInput.nextLine().equalsIgnoreCase("Yes"))
            {
                System.out.print("Alarm has been triggered.\n");
                TriggerAlarm();
                System.out.print("Alert has been sent.\n");
                SendAlert();
            }
        }
    }
    
    void MoveRight()
    {
        System.out.print("Camera moved right.\n");
    }
    
    void MoveLeft()
    {
        System.out.print("Camera moved left.\n");
    }
    
    void MoveUp()
    {
        System.out.print("Camera moved up.\n");
    }
    
    void MoveDown()
    {
        System.out.print("Camera moved down.\n");
    }
    
    void RotateHorizontally()
    {
        System.out.print("Camera rotated horizontally.\n");
    }
    
    void SetCameraLocation(String Location)
    {
        this.CameraLocation = Location;
        System.out.println("Camera set at " + Location);
    }
    
    String GetCameraLocation()
    {
        return this.CameraLocation;
    }

    @Override
    void SendAlert() 
    {
        Alert a1 = new Alert();
        a1.Alert_ID = ++Alert.AlertCount;
        a1.Alert_Type = "HighPriorityAlert";
        this.ListOfAlerts.add(a1);
        this.ListOfAlerts.get(0).PrintAlert();
    }

    @Override
    void TriggerAlarm()
    {
        if (this.SoundAlarm == false)
        {
            this.SoundAlarm = true;
            System.out.print("Alarm is ringing.\n");
        }
    }
    
    @Override
    void ResetAlarm()
    {
        if (this.SoundAlarm == true)
        {
            this.SoundAlarm = false;
            System.out.print("Alarm has been reset.\n");
        }
    }
}