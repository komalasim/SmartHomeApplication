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
public class HomeTheatre extends MediaDevice
{
    int VideoStatus;    //Video Status = 0(play), 1(stop), 2(pause) 
    int TimeElapsed;
    
    public HomeTheatre()
    {
        this.VideoStatus = -1;
        this.TimeElapsed = 0;
    }
    
    public HomeTheatre(int DID, String MName)
    {
        DeviceID = DID;
        ManufacturerName = MName;
    }
    
    @Override
    void DisplayDevice()
    {
        System.out.println(this.ManufacturerName + "'s " + "Home Theatre");
        System.out.print("Status: ");
        
        if (this.DeviceStatus == false)
            System.out.println("Off");
        else 
            System.out.println("On");
        
        if(VideoStatus == 0)
            System.out.println("Video Status: Play");
        else if(VideoStatus == 1)
            System.out.println("Video Status: Stop");
        else if(VideoStatus == 2)
            System.out.println("Video Status: Paused");
        else 
            System.out.println("No Video is Playing");
    }
    
    void Play(String VideoName)
    {
        System.out.println("Video " + VideoName + " is playing.");
        VideoStatus = 0;
        TimeElapsed = 100;
    }
    
    void Stop(String VideoName)
    {
        System.out.println("Video " + VideoName + " is stopped.");
        VideoStatus = 1;
        TimeElapsed = 0;
    }
    
    void Pause(String VideoName)
    {
        System.out.println("Video " + VideoName + " is paused.");
        VideoStatus = 2;
    }
    
    void FastForward(int Duration) //Duration in seconds
    {
        if(VideoStatus == 0 && TimeElapsed + 10 < Duration)
        {
            TimeElapsed = TimeElapsed + 10;
        }
        else
        {
            System.out.println("Cannot fast forward as no video is playing or duration of video has ended.");
        }
    }
    
    void Rewind()
    {
        if(VideoStatus == 0 && TimeElapsed - 10 > 0)
        {
            TimeElapsed = TimeElapsed - 10;
        }
        else
        {
            System.out.println("Cannot rewind as no video is playing or start of video has been reached.");
        }
    }
}