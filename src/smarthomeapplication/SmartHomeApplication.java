/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package smarthomeapplication;
import java.util.Scanner;
import static smarthomeapplication.User.DeviceID;
/**
 *
 * @author M Ayub
 */
public class SmartHomeApplication 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Registration SmartHome = Registration.GetInstance();
        UserAccount MyUser = new UserAccount();
        System.out.println("WELCOME TO SMART HOME APPLICATION!");
        System.out.println("");
        System.out.println("Press A to Sign Up");
        System.out.println("Press B to Login");
        System.out.print("Press O to Exit");
        Scanner input = new Scanner(System.in);
        char in = input.next().charAt(0);
        
        if (in == 'A' || in == 'a')     //Sign Up
        {
            SmartHome.GetInstance().SignUp();
            System.out.println("Sign Up Successful"); 
            input.nextLine();
            in = input.next().charAt(0);
        }
        
        MyUser.Account_ID = "ABC";
        MyUser.Password = "12345678";
        SmartHome.User_Account_List.add(MyUser);
        
        if (in == 'B' || in == 'b' && SmartHome.GetInstance().Login() != null)
        {
            while (MyUser.LoggedIn == true)
            {
                if (MyUser != null)
                {
                    System.out.println("MENU");
                    System.out.println("");
                    System.out.println("Press A to Add Devices");
                    System.out.println("Press B to Remove Devices");
                    System.out.println("Press C to Display Devices");
                    System.out.println("Press D to Setup Home Security System");
                    System.out.println("Press E to Logout");
                    input.nextLine();
                    char in1 = input.next().charAt(0);

                    if (in1 == 'A' || in == 'a')//Add device
                    {
                        MyUser.AccountUser.AddDevice();
                        System.out.println("Device Added Successfully");
                        MyUser.AccountUser.DisplayDevices();
                    }
                    else if (in1 == 'B' || in1 == 'b' )
                    {
                        MyUser.AccountUser.RemoveDevice();
                    }
                    else if (in1 == 'C' || in1 == 'c' )
                    {
                        MyUser.AccountUser.DisplayDevices();
                        
                        System.out.println("Select Device Category by a, b, c, d or e:");
                        System.out.println("a. Household");     //Dishwasher
                        System.out.println("b. Media");         //Home Theatre
                        System.out.println("c. Security");      //Camera
                        System.out.println("d. Environmental Control");     //Air Conditioner
                        System.out.println("e. Room");      //Light
                        input.nextLine();
                        char in2 = input.next().charAt(0);
                       
                        if (in2 == 'a' || in2 == 'A')
                        {
                            MyUser.AccountUser.ListOfHouseholdDevices.add(new Dishwasher(456, "LG"));
                            System.out.println("a. Turn On Dishwasher");
                            System.out.println("b. Turn Off Dishwasher");
                            System.out.println("c. Check Dishwasher Information");
                            input.nextLine();
                            char in3 = input.next().charAt(0);
                            
                            if (in3 == 'a' || in3 == 'A')
                            {
                                MyUser.AccountUser.ListOfHouseholdDevices.get(0).TurnOn();
                                Dishwasher d1 = (Dishwasher) MyUser.AccountUser.ListOfHouseholdDevices.get(0);
                                System.out.println("Enter Timer Value:");
                                MyUser.AccountUser.ListOfHouseholdDevices.get(0).SetTimer(input.nextInt());
                                System.out.println("Enter Dishwasher Capacity:");
                                d1.SetDeviceCapacity(input.nextInt());
                            }
                            else if (in3 == 'b' || in3 == 'B')
                                MyUser.AccountUser.ListOfHouseholdDevices.get(0).TurnOff();
                            else if (in3 == 'c' || in3 == 'C')
                                MyUser.AccountUser.ListOfHouseholdDevices.get(0).CheckDeviceInfo();
                            else 
                                System.out.println("INVALID OPTION!");
                        }
                        else if (in2 == 'b' || in2 == 'B')
                        {
                            MyUser.AccountUser.ListOfMediaDevices.add(new HomeTheatre(158, "Sony"));
                            System.out.println("a. Turn On Home Theatre");
                            System.out.println("b. Turn Off Home Theatre");
                            System.out.println("c. Check Home Theatre Information");
                            input.nextLine();
                            char in3 = input.next().charAt(0);
                            
                            if (in3 == 'a' || in3 == 'A')
                            {
                                MyUser.AccountUser.ListOfMediaDevices.get(0).TurnOn();
                                HomeTheatre ht1 = (HomeTheatre)MyUser.AccountUser.ListOfMediaDevices.get(0);
                                System.out.println("Enter Video Name:");
                                input.nextLine();
                                String Video = input.nextLine();
                                System.out.println("Enter Duration of Video:");
                                int Duration = input.nextInt();
                                System.out.println("a. Play");
                                System.out.println("b. Stop");
                                System.out.println("c. Pause");
                                System.out.println("d. Fast Forward");
                                System.out.println("e. Rewind");
                                System.out.println("f. Increase Volume");
                                System.out.println("g. Decrease Volume");
                                input.nextLine();
                                char in4 = input.next().charAt(0);
                                
                                if (in4 == 'a' || in4 == 'A')
                                    ht1.Play(Video);
                                else if (in4 == 'b' || in4 == 'B')
                                    ht1.Stop(Video);
                                else if (in4 == 'c' || in4 == 'C')
                                    ht1.Pause(Video);
                                else if (in4 == 'd' || in4 == 'D')
                                    ht1.FastForward(Duration);
                                else if (in4 == 'e' || in4 == 'E')
                                    ht1.Rewind();
                                else if (in4 == 'f' || in4 == 'F')
                                    MyUser.AccountUser.ListOfMediaDevices.get(0).VolumeUp();
                                else if (in4 == 'g' || in4 == 'G')
                                    MyUser.AccountUser.ListOfMediaDevices.get(0).VolumeDown();
                                else 
                                    System.out.println("INVALID OPTION!");
                            }
                            else if (in3 == 'b' || in3 == 'b')
                                MyUser.AccountUser.ListOfMediaDevices.get(0).TurnOff();
                            else if (in3 == 'c' || in3 == 'C')
                                MyUser.AccountUser.ListOfMediaDevices.get(0).CheckDeviceInfo();
                            else 
                                System.out.println("INVALID OPTION!");
                        }
                        else if (in2 == 'c' || in2 == 'C')
                        {
                            MyUser.AccountUser.ListOfSecurityDevices.add(new IdentificationCamera(729, "Swann"));
                            System.out.println("a. Turn On Camera");
                            System.out.println("b. Turn Off Camera");
                            System.out.println("c. Set Camera Location");
                            System.out.println("d. Get Camera Location");
                            System.out.println("e. Check Camera Information");
                            input.nextLine();
                            char in3 = input.next().charAt(0);
                            
                            if (in3 == 'a' || in3 == 'A')
                            {
                                MyUser.AccountUser.ListOfSecurityDevices.get(0).TurnOn();
                                IdentificationCamera ic1 = (IdentificationCamera)MyUser.AccountUser.ListOfSecurityDevices.get(0);
                                System.out.println("a. Capture Video");
                                System.out.println("b. Delete Video");
                                System.out.println("c. Capture Image");
                                System.out.println("d. Delete Image");
                                System.out.println("e. Identify Person");
                                System.out.println("f. Move Camera");
                                System.out.println("g. Reset Alarm");
                                input.nextLine();
                                char in4 = input.next().charAt(0);
                                
                                if (in4 == 'a' || in4 == 'A')
                                        ic1.CaptureVideo();
                                else if (in4 == 'b' || in4 == 'B')
                                        ic1.DeleteVideo(1);
                                else if (in4 == 'c' || in4 == 'C')
                                        ic1.CaptureImage();
                                else if (in4 == 'd' || in4 == 'D')
                                        ic1.DeleteImage(1);
                                else if (in4 == 'e' || in4 == 'E')
                                        ic1.IdentifyPerson();
                                else if (in4 == 'f' || in4 == 'F')
                                {
                                    System.out.println("a. Move Right");
                                    System.out.println("b. Move Left");
                                    System.out.println("c. Move Up");
                                    System.out.println("d. Move Down");
                                    System.out.println("e. Rotate Horizontally");
                                    input.nextLine();
                                    char in5 = input.next().charAt(0);
                                    
                                    if (in5 == 'a' || in5 == 'A')
                                        ic1.MoveRight();
                                    else if (in5 == 'b' || in5 == 'B')
                                        ic1.MoveLeft();
                                    else if (in5 == 'c' || in5 == 'C')
                                        ic1.MoveUp();
                                    else if (in5 == 'd' || in5 == 'D')
                                        ic1.MoveDown();
                                    else if (in5 == 'e' || in5 == 'E')
                                        ic1.RotateHorizontally();
                                    else 
                                        System.out.println("INVALID OPTION!");
                                }
                                else if (in4 == 'g' || in4 == 'G')
                                        ic1.ResetAlarm();
                                else 
                                    System.out.println("INVALID OPTION!");
                               
                            }
                            else if (in3 == 'b' || in3 == 'B')
                                MyUser.AccountUser.ListOfSecurityDevices.get(0).TurnOff();
                            else if (in3 == 'c' || in3 == 'C')
                            {
                                IdentificationCamera ic1 = (IdentificationCamera)MyUser.AccountUser.ListOfSecurityDevices.get(0);
                                System.out.println("Enter Camera Location:");
                                input.nextLine();
                                String Location = input.nextLine();
                                ic1.SetCameraLocation(Location);
                            }
                            else if (in3 == 'd' || in3 == 'D')
                            {
                                IdentificationCamera ic1 = (IdentificationCamera)MyUser.AccountUser.ListOfSecurityDevices.get(0);
                                System.out.println(ic1.GetCameraLocation());
                            }
                            else if (in3 == 'e' || in3 == 'E')
                                MyUser.AccountUser.ListOfSecurityDevices.get(0).CheckDeviceInfo();
                            else 
                                System.out.println("INVALID OPTION!");
                        }
                        else if (in2 == 'd' || in2 == 'D')
                        {
                            MyUser.AccountUser.ListOfEnvironmentControlDevices.add(new AirConditioner(741, "Carrier Air Conditioners"));
                            System.out.println("a. Turn On Air Conditioner");
                            System.out.println("b. Turn Off Air Conditioner");
                            System.out.println("c. Check Air Conditioner Information");
                            input.nextLine();
                            char in3 = input.next().charAt(0);
                            
                            if (in3 == 'a' || in3 == 'A')
                            {
                                MyUser.AccountUser.ListOfEnvironmentControlDevices.get(0).TurnOn();
                                AirConditioner ac1 = (AirConditioner)MyUser.AccountUser.ListOfEnvironmentControlDevices.get(0);
                                System.out.println("a. Increase Temperature");
                                System.out.println("b. Decrease Temperature");
                                System.out.println("c. Set AC Timer");
                                System.out.println("d. Change Mode");
                                System.out.println("e. Turn On Swing");
                                System.out.println("f. Turn Off Swing");
                                input.nextLine();
                                char in4 = input.next().charAt(0);
                                
                                if (in4 == 'a' || in4 == 'A')
                                    MyUser.AccountUser.ListOfEnvironmentControlDevices.get(0).TemperatureUp();
                                else if (in4 == 'b' || in4 == 'B')
                                    MyUser.AccountUser.ListOfEnvironmentControlDevices.get(0).TemperatureDown();
                                else if (in4 == 'c' || in4 == 'C')
                                {
                                    System.out.println("Enter Timer Value:");
                                    MyUser.AccountUser.ListOfEnvironmentControlDevices.get(0).SetTimer(input.nextInt());
                                }
                                else if (in4 == 'd' || in4 == 'D')
                                {
                                    System.out.println("Select Mode:");
                                    System.out.println("p. Plasma");
                                    System.out.println("t. Turbo");
                                    System.out.println("f. Fan");
                                    input.nextLine();
                                    char in5 = input.next().charAt(0);
                                    
                                    if (in5 == 'p' || in5 == 'P')
                                        ac1.ChangeMode("Plasma");
                                    else if (in5 == 't' || in5 == 'T')
                                        ac1.ChangeMode("Turbo");
                                    else if (in5 == 'f' || in5 == 'F')
                                    {
                                        ac1.ChangeMode("Fan");
                                        System.out.println("a. Increase Fan Speed");
                                        System.out.println("b. Decrease Fan Speed");
                                        input.nextLine();
                                        char in6 = input.next().charAt(0);
                                        
                                        if (in6 == 'a' || in6 == 'A')
                                            ac1.FanSpeedUp();
                                        else if (in6 == 'b' || in6 == 'B')
                                            ac1.FanSpeedDown();
                                        else
                                            System.out.println("INVALID OPTION");
                                    }
                                    else
                                        System.out.println("INVALID OPTION");
                                }
                                else if (in4 == 'e' || in4 == 'H')
                                    ac1.TurnOnSwing();
                                else if (in4 == 'f' || in4 == 'F')
                                    ac1.TurnOffSwing();
                                else
                                    System.out.println("INVALID OPTION!");
                            }
                            else if (in3 == 'b' || in3 == 'B')
                                MyUser.AccountUser.ListOfEnvironmentControlDevices.get(0).TurnOff();
                            else if (in3 == 'c' || in3 == 'C')
                                MyUser.AccountUser.ListOfEnvironmentControlDevices.get(0).CheckDeviceInfo();
                            else 
                                System.out.println("INVALID OPTION!");
                        }
                        else if (in2 == 'e' || in2 == 'E')
                        {
                            MyUser.AccountUser.ListOfRoomDevices.add(new Light(951, "Philips Lighting"));
                            System.out.println("a. Turn On Light");
                            System.out.println("b. Turn Off Light");
                            System.out.println("c. Check Light Information");
                            input.nextLine();
                            char in3 = input.next().charAt(0);
                            
                            if (in3 == 'a' || in3 == 'A')
                            {
                                MyUser.AccountUser.ListOfRoomDevices.get(0).TurnOn();
                                Light l1 = (Light)MyUser.AccountUser.ListOfRoomDevices.get(0);
                                System.out.println("a. Increase Light Intensity");
                                System.out.println("b. Decrease Light Intensity");
                                input.nextLine();
                                char in4 = input.next().charAt(0);
                                
                                if (in4 == 'a' || in4 == 'A')
                                    l1.IncreaseIntensity();
                                if (in4 == 'b' || in4 == 'B')
                                    l1.DecreaseIntensity();
                                else
                                    System.out.println("INVALID OPTION");
                            }
                            else if (in3 == 'b' || in3 == 'B')
                                MyUser.AccountUser.ListOfRoomDevices.get(0).TurnOff();
                            else if (in3 == 'c' || in3 == 'C')
                                MyUser.AccountUser.ListOfRoomDevices.get(0).CheckDeviceInfo();   
                            else 
                                System.out.println("INVALID OPTION");
                        }
                        else
                            System.out.println("INVALID OPTION");
                    }
                    else if (in1 == 'D' || in1 == 'd')
                    {
                        HomeSecuritySystem h1 = new HomeSecuritySystem();
                        System.out.println("a. Turn On Home Security System");
                        System.out.println("b. Check System Status");
                        System.out.println("c. View Records");
                        input.nextLine();
                        char in2 = input.next().charAt(0);
                        
                        if (in2 == 'A' || in2 == 'a')
                        {
                            h1.TurnOnSecuritySystem();
                            System.out.println("a. Add Smoke Sensor");
                            System.out.println("b. Add Motion Sensor");
                            input.nextLine();
                            char in3 = input.next().charAt(0);
                            
                            if (in3 == 'a' || in3 == 'A')
                            {
                                h1.AddDevice(new SmokeSensor(true));
                                SmokeSensor s1 = (SmokeSensor)h1.ListOfHomeSecurityDevices.get(0);
                                System.out.println("Smoke Sensor Added");
                                s1.DetectSmoke();
                                s1.ResetAlarm();
                            }
                            else if (in3 == 'b' || in3 == 'B')
                            {
                                h1.AddDevice(new MotionSensor(false));
                                MotionSensor m1 = (MotionSensor)h1.ListOfHomeSecurityDevices.get(0);
                                System.out.println("Motion Sensor Added");
                                m1.DetectMovement();
                                m1.ResetAlarm();
                            }   
                            else
                                System.out.println("INVALID OPTION!");
                        }
                        else if (in2 == 'B' || in2 == 'b')
                            h1.CheckStatus();
                        else if (in2 == 'C' || in2 == 'c')
                            h1.View_Records();
                        else
                            System.out.println("INVALID OPTION!");
                    }
                    else if (in1 == 'E' || in1 == 'e')
                    {
                        MyUser.LoggedIn = false;
                        System.out.println("Logged Out!");
                    }
                    else 
                        System.out.println("INVALID OPTION");
                }
            }
        }
        else if (in == 'O' || in == 'o')
            System.out.print("GoodBye!");
        else
            System.out.println("INVALID OPTION");
    }   
}