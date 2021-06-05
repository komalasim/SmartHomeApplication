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
public class Video 
{
    int VideoID;
    static int VideoCount = 0;
    
    public Video()
    {
        this.VideoID = ++Video.VideoCount;
    }
    
    void PlayVideo()
    {
        System.out.print("Video is playing.\n");
    }
    
    void StopVideo()
    {
        System.out.print("Video has been stopped.\n");
    }
    
    void PauseVideo()
    {
        System.out.print("Video is paused.\n");
    }
    
    void RewindVideo()
    {
        System.out.print("Video is rewinded.\n");
    }
    
    void FastForwardVideo()
    {
        System.out.print("Video has been fast forward.\n");
    }
}