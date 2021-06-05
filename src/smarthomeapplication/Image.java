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
public class Image 
{
    int ImageID;
    static int ImageCount;
    
    public Image()
    {
        this.ImageID = ++Image.ImageCount;
    }
    
    void ViewImage()
    {
        System.out.print("Image has been displayed.\n");
    }
}
