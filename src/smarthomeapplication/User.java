/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomeapplication;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author M Ayub
 */
public class User 
{
    String FirstName, MiddleName, LastName, Email, Address, Date_Of_Birth;
    int PhoneNo;
    char Gender;
    static int DeviceID = 0;
    
    List <HomeSecurityDevice> ListOfSecurityDevices;
    List <MediaDevice> ListOfMediaDevices;
    List <HouseholdDevice> ListOfHouseholdDevices;
    List <EnvironmentControlDevice> ListOfEnvironmentControlDevices;
    List <RoomDevice> ListOfRoomDevices;

    public User() 
    {
        ListOfSecurityDevices = new <HomeSecurityDevice> ArrayList();
        ListOfMediaDevices = new <MediaDevice> ArrayList();
        ListOfHouseholdDevices = new <HouseholdDevice> ArrayList();
        ListOfEnvironmentControlDevices = new <EnvironmentControlDevice> ArrayList();
        ListOfRoomDevices = new <RoomDevice> ArrayList();
    }
    
    public User(String FirstName, String MiddleName, String LastName, String Email, String Address, int PhoneNo, String Date_Of_Birth, char Gender) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.Email = Email;
        this.Address = Address;
        this.PhoneNo = PhoneNo;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Gender = Gender;
        ListOfSecurityDevices = new <HomeSecurityDevice> ArrayList();
        ListOfMediaDevices = new <MediaDevice> ArrayList();
        ListOfHouseholdDevices = new <HouseholdDevice> ArrayList();
        ListOfEnvironmentControlDevices = new <EnvironmentControlDevice> ArrayList();
        ListOfRoomDevices = new <RoomDevice> ArrayList();
    }
    
    public void DisplayDevices()
    {
        System.out.println("");
        System.out.println("List Of Security Devices: "); 
        
        for (int i = 0; i < ListOfSecurityDevices.size(); i++)
            ListOfSecurityDevices.get(i).DisplayDevice();
        
        System.out.println("");
        System.out.println("List Of Media Devices: ");
         
        for (int i = 0; i < ListOfMediaDevices.size(); i++)
            ListOfMediaDevices.get(i).DisplayDevice();
        
        System.out.println("");
        System.out.println("List Of Household Devices: ");
        
        for (int i = 0; i < ListOfHouseholdDevices.size(); i++)
            ListOfHouseholdDevices.get(i).DisplayDevice();
        
        System.out.println("");
        System.out.println("List Of Environment Control Devices: ");
        
        for (int i = 0; i < ListOfEnvironmentControlDevices.size(); i++)
            ListOfEnvironmentControlDevices.get(i).DisplayDevice();
        
        System.out.println("");
        System.out.println("List Of Room Devices: ");
        
        for (int i = 0; i < ListOfRoomDevices.size(); i++)
            ListOfRoomDevices.get(i).DisplayDevice();
        
        System.out.println("");
    };
    
    public void TurnOffRoomDevices()
    {
        System.out.println("Turning Off All Room Devices");
        
        for (int i = 0; i < ListOfRoomDevices.size(); i++)
        {
            ListOfRoomDevices.get(i).TurnOff();
            ListOfRoomDevices.get(i).DisplayDevice();
        }
        
        System.out.println("All Room Devices Turned Off");
    };
    
    public void TurnOffMediaDevices()
    {
        System.out.println("Turning Off All Media Devices");
        
        for (int i = 0; i < ListOfMediaDevices.size(); i++)
        {
            ListOfMediaDevices.get(i).TurnOff();
            ListOfMediaDevices.get(i).DisplayDevice();
        }
        
        System.out.println("All Media Devices Turned Off");
    };
    
    public void TurnOffEnvironmentControlDevices()
    {
        System.out.println("Turning Off All Environment Control Devices");
        
        for (int i = 0; i < ListOfEnvironmentControlDevices.size(); i++)
        {
            ListOfEnvironmentControlDevices.get(i).TurnOff();
            ListOfEnvironmentControlDevices.get(i).DisplayDevice();
        }
        
        System.out.println("All Environment Control Devices Turned Off");
    };
    
    public void TurnOffHouseholdDevices()
    {
        System.out.println("Turning Off All Household Devices");
        
        for (int i = 0; i < ListOfHouseholdDevices.size(); i++)
        {
            ListOfHouseholdDevices.get(i).TurnOff();
            ListOfHouseholdDevices.get(i).DisplayDevice();
        }
        
        System.out.println("All Household Devices Turned Off");
    };
    
    public void AddDevice()
    {
        DeviceID++;
        System.out.println("Select Device Category by a, b, c, d or e:");
        System.out.println("a. Household");
        System.out.println("b. Media");
        System.out.println("c. Security");
        System.out.println("d. Environmental Control");
        System.out.println("e. Room");
       
        Scanner input = new Scanner(System.in);
        char in = input.next().charAt(0);
        
        if (in == 'a' || in == 'A')
        {
            System.out.println("Select Household Device by a, b, c or d:");
            System.out.println("a. Washing Machine");
            System.out.println("b. Coffee Maker");
            System.out.println("c. Microwave Oven");
            System.out.println("d. Dishwasher");
            
            in = input.next().charAt(0);
            if (in == 'a' || in == 'A')
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Whirlpool");
                System.out.println("b. LG");
                System.out.println("c. Samsung");
                System.out.println("d. GE");
                System.out.println("e. Electrolux");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfHouseholdDevices.add(new WashingMachine(DeviceID, "Whirlpool"));
                else if (in == 'b' || in == 'B')
                    ListOfHouseholdDevices.add(new WashingMachine(DeviceID, "LG"));
                else if (in == 'c' || in == 'C')
                    ListOfHouseholdDevices.add(new WashingMachine(DeviceID, "Samsung"));
                else if (in == 'd' || in == 'D')
                    ListOfHouseholdDevices.add(new WashingMachine(DeviceID, "GE"));
                else if (in == 'e' || in == 'E')
                    ListOfHouseholdDevices.add(new WashingMachine(DeviceID, "Electrolux"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'b' || in == 'B')
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Keurig Coffee Maker");
                System.out.println("b. Cuisinart Coffee Maker System");
                System.out.println("c. Black & Decker Coffee Makers");
                System.out.println("d. Mr. Coffee Coffee Maker");
                System.out.println("e. Bonavita Coffee Maker Systems");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfHouseholdDevices.add(new CoffeeMaker(DeviceID, "Keurig Coffee Maker"));
                else if (in == 'b' || in == 'B')
                    ListOfHouseholdDevices.add(new CoffeeMaker(DeviceID, "Cuisinart Coffee Maker System"));
                else if (in == 'c' || in == 'C')
                    ListOfHouseholdDevices.add(new CoffeeMaker(DeviceID, "Black & Decker Coffee Makers"));
                else if (in == 'd' || in == 'D')
                    ListOfHouseholdDevices.add(new CoffeeMaker(DeviceID, "Mr. Coffee Coffee Maker"));
                else if (in == 'e' || in == 'E')
                    ListOfHouseholdDevices.add(new CoffeeMaker(DeviceID, "Bonavita Coffee Maker Systems"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'c' || in == 'C')
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Frigidaire");
                System.out.println("b. LG");
                System.out.println("c. Panasonic");
                System.out.println("d. GE");
                System.out.println("e. Samsung");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfHouseholdDevices.add(new MicrowaveOven(DeviceID, "Frigidaire"));
                else if (in == 'b' || in == 'B')
                    ListOfHouseholdDevices.add(new MicrowaveOven(DeviceID, "LG"));
                else if (in == 'c' || in == 'C')
                    ListOfHouseholdDevices.add(new MicrowaveOven(DeviceID, "Panasonic"));
                else if (in == 'd' || in == 'D')
                    ListOfHouseholdDevices.add(new MicrowaveOven(DeviceID, "GE"));
                else if (in == 'e' || in == 'E')
                    ListOfHouseholdDevices.add(new MicrowaveOven(DeviceID, "Samsung"));
                else System.out.println("Invalid Input");
    
            }
            else if (in == 'd' || in == 'D')//Dishwasher
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Miele");
                System.out.println("b. LG");
                System.out.println("c. Bosch");
                System.out.println("d. Dishlex");
                System.out.println("e. Westinghouse");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfHouseholdDevices.add(new Dishwasher(DeviceID, "Miele"));
                else if (in == 'b' || in == 'B')
                    ListOfHouseholdDevices.add(new Dishwasher(DeviceID, "LG"));
                else if (in == 'c' || in == 'C')
                    ListOfHouseholdDevices.add(new Dishwasher(DeviceID, "Bosch"));
                else if (in == 'd' || in == 'D')
                    ListOfHouseholdDevices.add(new Dishwasher(DeviceID, "Dishlex"));
                else if (in == 'e' || in == 'E')
                    ListOfHouseholdDevices.add(new Dishwasher(DeviceID, "Westinghouse"));
                else System.out.println("Invalid Input");
            }
        }
        else if (in == 'b' || in == 'B')
        {
            System.out.println("Select Media Device by a, b or c:");
            System.out.println("a. Television");
            System.out.println("b. Speaker");
            System.out.println("c. Home Theatre");
            
            in = input.next().charAt(0);
            if (in == 'a' || in == 'A')//Television
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Sony");
                System.out.println("b. LG");
                System.out.println("c. Samsung");
                System.out.println("d. Panasonic");
                System.out.println("e. Insignia");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfMediaDevices.add(new Television(DeviceID, "Sony"));
                else if (in == 'b' || in == 'B')
                    ListOfMediaDevices.add(new Television(DeviceID, "LG"));
                else if (in == 'c' || in == 'C')
                    ListOfMediaDevices.add(new Television(DeviceID, "Samsung"));
                else if (in == 'd' || in == 'D')
                    ListOfMediaDevices.add(new Television(DeviceID, "Panasonic"));
                else if (in == 'e' || in == 'E')
                    ListOfMediaDevices.add(new Television(DeviceID, "Insignia"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'b' || in == 'B')//Speaker
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Sony");
                System.out.println("b. Bowers & Wilkins");
                System.out.println("c. Samsung");
                System.out.println("d. Phillips");
                System.out.println("e. Harman International");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfMediaDevices.add(new Speaker(DeviceID, "Sony"));
                else if (in == 'b' || in == 'B')
                    ListOfMediaDevices.add(new Speaker(DeviceID, "Bowers & Wilkins"));
                else if (in == 'c' || in == 'C')
                    ListOfMediaDevices.add(new Speaker(DeviceID, "Samsung"));
                else if (in == 'd' || in == 'D')
                    ListOfMediaDevices.add(new Speaker(DeviceID, "Phillips"));
                else if (in == 'e' || in == 'E')
                    ListOfMediaDevices.add(new Speaker(DeviceID, "Harman International"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'c' || in == 'C')//HomeTheatre
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Yamaha");
                System.out.println("b. Pioneer");
                System.out.println("c. Panasonic");
                System.out.println("d. Sony");
                System.out.println("e. Samsung");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfMediaDevices.add(new HomeTheatre(DeviceID, "Yamaha"));
                else if (in == 'b' || in == 'B')
                    ListOfMediaDevices.add(new HomeTheatre(DeviceID, "Pioneer"));
                else if (in == 'c' || in == 'C')
                    ListOfMediaDevices.add(new HomeTheatre(DeviceID, "Panasonic"));
                else if (in == 'd' || in == 'D')
                    ListOfMediaDevices.add(new HomeTheatre(DeviceID, "Sony"));
                else if (in == 'e' || in == 'E')
                    ListOfMediaDevices.add(new HomeTheatre(DeviceID, "Samsung"));
                else System.out.println("Invalid Input");
            }
            else System.out.println("Invalid Input");
        }
        else if (in == 'd' || in == 'D')
        {
            System.out.println("Select Environmental Control Device by a, b or c:");
            System.out.println("a. Heater");
            System.out.println("b. Air Conditioner");
            System.out.println("c. Humidifier");
            
            in = input.next().charAt(0);
            
            if (in == 'a' || in == 'A')//Heater
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Duraflame");
                System.out.println("b. LifeSmart");
                System.out.println("c. Dyson");
                System.out.println("d. Lasko");
                System.out.println("e. DeLonghi");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfEnvironmentControlDevices.add(new Heater(DeviceID, "Duraflame"));
                else if (in == 'b' || in == 'B')
                    ListOfEnvironmentControlDevices.add(new Heater(DeviceID, "LifeSmart"));
                else if (in == 'c' || in == 'C')
                    ListOfEnvironmentControlDevices.add(new Heater(DeviceID, "Dyson"));
                else if (in == 'd' || in == 'D')
                    ListOfEnvironmentControlDevices.add(new Heater(DeviceID, "Lasko"));
                else if (in == 'e' || in == 'E')
                    ListOfEnvironmentControlDevices.add(new Heater(DeviceID, "DeLonghi"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'b' || in == 'B')//AirConditioner
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. American Standard Air Conditioners");
                System.out.println("b. Carrier Air Conditioners");
                System.out.println("c. Goodman Central Air Conditioners");
                System.out.println("d. Trane Central AC Units");
                System.out.println("e. Rheem Air Conditioners");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfEnvironmentControlDevices.add(new AirConditioner(DeviceID, "American Standard Air Conditioners"));
                else if (in == 'b' || in == 'B')
                    ListOfEnvironmentControlDevices.add(new AirConditioner(DeviceID, "Carrier Air Conditioners"));
                else if (in == 'c' || in == 'C')
                    ListOfEnvironmentControlDevices.add(new AirConditioner(DeviceID, "Goodman Central Air Conditioners"));
                else if (in == 'd' || in == 'D')
                    ListOfEnvironmentControlDevices.add(new AirConditioner(DeviceID, "Trane Central AC Units"));
                else if (in == 'e' || in == 'E')
                    ListOfEnvironmentControlDevices.add(new AirConditioner(DeviceID, "Rheem Air Conditioners"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'c' || in == 'C')//Humidifier
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. CRANE COOL MIST");
                System.out.println("b. Levoit");
                System.out.println("c. Honeywell");
                System.out.println("d. Vicks");
                System.out.println("e. TaoTronics");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfEnvironmentControlDevices.add(new Humidifier(DeviceID, "CRANE COOL MIST"));
                else if (in == 'b' || in == 'B')
                    ListOfEnvironmentControlDevices.add(new Humidifier(DeviceID, "Levoit"));
                else if (in == 'c' || in == 'C')
                    ListOfEnvironmentControlDevices.add(new Humidifier(DeviceID, "Honeywell"));
                else if (in == 'd' || in == 'D')
                    ListOfEnvironmentControlDevices.add(new Humidifier(DeviceID, "Vicks"));
                else if (in == 'e' || in == 'E')
                    ListOfEnvironmentControlDevices.add(new Humidifier(DeviceID, "TaoTronics"));
                else System.out.println("Invalid Input");
            }
            else System.out.println("Invalid Input");
        }
        else if (in == 'e' || in == 'E')
        {
            System.out.println("Select Room Device by a, b, c, d or e:");
            System.out.println("a. Light");
            System.out.println("b. Fan");
            System.out.println("c. Door");
            System.out.println("d. Window");
            System.out.println("e. Curtain");
            
            in = input.next().charAt(0);
            
            if (in == 'a' || in == 'A')//Light
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. GE Lighting");
                System.out.println("b. Philips Lighting");
                System.out.println("c. Everlight Electronics");
                System.out.println("d. Osram");
                System.out.println("e. Eaton");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfRoomDevices.add(new Light(DeviceID, "GE Lighting"));
                else if (in == 'b' || in == 'B')
                    ListOfRoomDevices.add(new Light(DeviceID, "Philips Lighting"));
                else if (in == 'c' || in == 'C')
                    ListOfRoomDevices.add(new Light(DeviceID, "Everlight Electronics"));
                else if (in == 'd' || in == 'D')
                    ListOfRoomDevices.add(new Light(DeviceID, "Osram"));
                else if (in == 'e' || in == 'E')
                    ListOfRoomDevices.add(new Light(DeviceID, "Eaton"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'b' || in == 'B')//Fan
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Minka-Aire");
                System.out.println("b. Casablanca");
                System.out.println("c. Hunter Fan Company");
                System.out.println("d. Emerson");
                System.out.println("e. Monte Carlo");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfRoomDevices.add(new Fan(DeviceID, "Minka-Aire"));
                else if (in == 'b' || in == 'B')
                    ListOfRoomDevices.add(new Fan(DeviceID, "Casablanca"));
                else if (in == 'c' || in == 'C')
                    ListOfRoomDevices.add(new Fan(DeviceID, "Hunter Fan Company"));
                else if (in == 'd' || in == 'D')
                    ListOfRoomDevices.add(new Fan(DeviceID, "Emerson"));
                else if (in == 'e' || in == 'E')
                    ListOfRoomDevices.add(new Fan(DeviceID, "Monte Carlo"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'c' || in == 'C')//Door
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Andersen");
                System.out.println("b. Larson");
                System.out.println("c. Waudena");
                System.out.println("d. Therma-Tru");
                System.out.println("e. Acclimated Entry");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfRoomDevices.add(new Door(DeviceID, "Andersen"));
                else if (in == 'b' || in == 'B')
                    ListOfRoomDevices.add(new Door(DeviceID, "Larson"));
                else if (in == 'c' || in == 'C')
                    ListOfRoomDevices.add(new Door(DeviceID, "Waudena"));
                else if (in == 'd' || in == 'D')
                    ListOfRoomDevices.add(new Door(DeviceID, "Therma-Tru"));
                else if (in == 'e' || in == 'E')
                    ListOfRoomDevices.add(new Door(DeviceID, "Acclimated Entry"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'c' || in == 'C')
            {
                System.out.println("Select Security Device by a, b or c:");
                System.out.println("a. Motion Sensor");
                System.out.println("b. Smoke Sensor");
                System.out.println("c. Identification Camera");

                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')//MotionSensor
                {
                    System.out.println("Select Manufacturer by a, b, c, d or e:");
                    System.out.println("a. Dome Home Automation");
                    System.out.println("b. Interlogix Indoor Wireless");
                    System.out.println("c. Blink Home Security System");
                    System.out.println("d. Guardline Driveway Alarm");
                    System.out.println("e. Doberman Security");

                    in = input.next().charAt(0);
                    if (in == 'a' || in == 'A')
                        ListOfSecurityDevices.add(new MotionSensor(DeviceID, "Dome Home Automation"));
                    else if (in == 'b' || in == 'B')
                        ListOfSecurityDevices.add(new MotionSensor(DeviceID, "Interlogix Indoor Wireless"));
                    else if (in == 'c' || in == 'C')
                        ListOfSecurityDevices.add(new MotionSensor(DeviceID, "Blink Home Security System"));
                    else if (in == 'd' || in == 'D')
                        ListOfSecurityDevices.add(new MotionSensor(DeviceID, "Guardline Driveway Alarm"));
                    else if (in == 'e' || in == 'E')
                        ListOfSecurityDevices.add(new MotionSensor(DeviceID, "Doberman Security"));
                    else System.out.println("Invalid Input");
            }
            else if (in == 'b' || in == 'B')//SmokeSensor
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. OneLink");
                System.out.println("b. Ardwolf");
                System.out.println("c. Kidde");
                System.out.println("d. Nest Protect");
                System.out.println("e. ADT");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfSecurityDevices.add(new SmokeSensor(DeviceID, "OneLink"));
                else if (in == 'b' || in == 'B')
                    ListOfSecurityDevices.add(new SmokeSensor(DeviceID, "Ardwolf"));
                else if (in == 'c' || in == 'C')
                    ListOfSecurityDevices.add(new SmokeSensor(DeviceID, "Kidde"));
                else if (in == 'd' || in == 'D')
                    ListOfSecurityDevices.add(new SmokeSensor(DeviceID, "Nest Protect"));
                else if (in == 'e' || in == 'E')
                    ListOfSecurityDevices.add(new SmokeSensor(DeviceID, "ADT"));
                else System.out.println("Invalid Input");
            }
            else if (in == 'c' || in == 'C')//IdentificationCamera
            {
                System.out.println("Select Manufacturer by a, b, c, d or e:");
                System.out.println("a. Hikvision");
                System.out.println("b. Swann");
                System.out.println("c. Logitech");
                System.out.println("d. Netgear");
                System.out.println("e. Axis Communications");
                
                in = input.next().charAt(0);
                if (in == 'a' || in == 'A')
                    ListOfSecurityDevices.add(new IdentificationCamera(DeviceID, "Hikvision"));
                else if (in == 'b' || in == 'B')
                    ListOfSecurityDevices.add(new IdentificationCamera(DeviceID, "Swann"));
                else if (in == 'c' || in == 'C')
                    ListOfSecurityDevices.add(new IdentificationCamera(DeviceID, "Logitech"));
                else if (in == 'd' || in == 'D')
                    ListOfSecurityDevices.add(new IdentificationCamera(DeviceID, "Netgear"));
                else if (in == 'e' || in == 'E')
                    ListOfSecurityDevices.add(new IdentificationCamera(DeviceID, "Axis Communications"));
                else System.out.println("Invalid Input");
            }
            else System.out.println("Invalid Input");
        }
        else if (in == 'd' || in == 'D')//Window
        {
            System.out.println("Select Manufacturer by a, b, c, d or e:");
            System.out.println("a. Andersen");
            System.out.println("b. Pella");
            System.out.println("c. Milgard");
            System.out.println("d. Simonton");
            System.out.println("e. Harvey");

            in = input.next().charAt(0);
            if (in == 'a' || in == 'A')
                ListOfRoomDevices.add(new Window(DeviceID, "Andersen"));
            else if (in == 'b' || in == 'B')
                ListOfRoomDevices.add(new Window(DeviceID, "Pella"));
            else if (in == 'c' || in == 'C')
                ListOfRoomDevices.add(new Window(DeviceID, "Milgard"));
            else if (in == 'd' || in == 'D')
                ListOfRoomDevices.add(new Window(DeviceID, "Simonton"));
            else if (in == 'e' || in == 'E')
                ListOfRoomDevices.add(new Window(DeviceID, "Harvey"));
            else System.out.println("Invalid Input");
        }
        else if (in == 'e' || in == 'E')//Curtain
        {
            System.out.println("Select Manufacturer by a, b, c, d or e:");
            System.out.println("a. WESTLEY LIMITED");
            System.out.println("b. GLOBAL ARCHITECTURAL");
            System.out.println("c. NINGBO BETTER DESIGN INTERNATIONAL");
            System.out.println("d. UNITED LINENS LIMITED");
            System.out.println("e. HERITAGE HOME TEXTILES");

            in = input.next().charAt(0);
            if (in == 'a' || in == 'A')
                ListOfRoomDevices.add(new Curtain(DeviceID, "WESTLEY LIMITED"));
            else if (in == 'b' || in == 'B')
                ListOfRoomDevices.add(new Curtain(DeviceID, "GLOBAL ARCHITECTURAL"));
            else if (in == 'c' || in == 'C')
                ListOfRoomDevices.add(new Curtain(DeviceID, "NINGBO BETTER DESIGN INTERNATIONAL"));
            else if (in == 'd' || in == 'D')
                ListOfRoomDevices.add(new Curtain(DeviceID, "UNITED LINENS LIMITED"));
            else if (in == 'e' || in == 'E')
                ListOfRoomDevices.add(new Curtain(DeviceID, "HERITAGE HOME TEXTILES"));
            else System.out.println("Invalid Input");
        }
        else 
            System.out.println("Invalid Input");
        }
        else System.out.println("Invalid Input!");
    }
    
    public void RemoveDevice()
    {
        System.out.println("Select Device Category by a, b, c, d or e:");
        System.out.println("a. Household");
        System.out.println("b. Media");
        System.out.println("c. Security");
        System.out.println("d. Environmental Control");
        System.out.println("e. Room");
       
        Scanner input = new Scanner(System.in);
        char in = input.next().charAt(0);
        System.out.println("Select Device Number: ");
        if (in == 'a' || in == 'A')
        {
            for (int i =0; i < ListOfHouseholdDevices.size(); i++)
            {
                System.out.println(i+1 + ":");
                ListOfHouseholdDevices.get(i).DisplayDevice();
            }
            in = input.next().charAt(0);
            int num = Character.getNumericValue(in);  
            num--;
            ListOfHouseholdDevices.remove(num);
        }
        else if (in == 'b' || in == 'B')
        {
            for (int i =0; i < ListOfMediaDevices.size(); i++)
            {
                System.out.println(i+1 + ":");
                ListOfMediaDevices.get(i).DisplayDevice();
            }
            in = input.next().charAt(0);
            int num = Character.getNumericValue(in);  
            num--;
            ListOfMediaDevices.remove(num);
        }
        else if (in == 'c' || in == 'C')
        {
            for (int i =0; i < ListOfSecurityDevices.size(); i++)
            {
                System.out.println(i+1 + ":");
                ListOfSecurityDevices.get(i).DisplayDevice();
            }
            in = input.next().charAt(0);
            int num = Character.getNumericValue(in);  
            num--;
            ListOfSecurityDevices.remove(num);
        }
        else if (in == 'd' || in == 'D')
        {
            for (int i =0; i < ListOfEnvironmentControlDevices.size(); i++)
            {
                System.out.println(i+1 + ":");
                ListOfEnvironmentControlDevices.get(i).DisplayDevice();
            }
            in = input.next().charAt(0);
            int num = Character.getNumericValue(in);  
            num--;
            ListOfEnvironmentControlDevices.remove(num);
        }
        else if (in == 'e' || in == 'E')
        {
            for (int i =0; i < ListOfRoomDevices.size(); i++)
            {
                System.out.println(i+1 + ":");
                ListOfRoomDevices.get(i).DisplayDevice();
            }
            in = input.next().charAt(0);
            int num = Character.getNumericValue(in);  
            num--;
            ListOfRoomDevices.remove(num);
        }
        else 
        {
            System.out.println("Invalid Input!");
             return;
        }
        System.out.println("Device Removed!");
        
    };  
}