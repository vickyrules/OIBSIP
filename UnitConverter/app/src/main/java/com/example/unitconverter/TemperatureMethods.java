package com.example.unitconverter;

public class TemperatureMethods {
    //---------------------------------Temperatue Conversion--------------------------------
    //celsius to celsius method
    public static double celsius_to_Celsius(double value) {
        return value;
    }

    //fahrenheit to Fahrenheit method
    public static double fah_to_Fah(double value) {
        return value;
    }

    //Kelvin to Kelvin method
    public static double kelvin_to_Kelvin(double value) {
        return value;
    }

    //reaumur to reaumur method
    public static double reaumur_to_Reaumur(double value) {
        return value;
    }

    //celsius to fahrenheit method
    public static double celsius_to_Fah(double value) {
        //(0°C × 9/5) + 32 = 32°F
        return (value * 9/5)+ 32;
    }

    //celsius to kelvin method
    public static double celsius_to_Kelvin(double value) {
        //0°C + 273.15 = 273.15K
        return value + 273.15;
    }

    //celsius to Reaumur method
    public static double celsius_to_Reaumur(double value) {
       // °Ré = ºC x 0.8
        return value * 0.8;
    }


    //fahrenheit to celsius method
    public static double fah_to_Celsius(double value) {
       // (32°F − 32) × 5/9 = 0°C
        return (value - 32) * (5.0/9);
    }

    //fahrenheit to REaumur method
    public static double fah_to_Reaumur(double value) {
        //ºRé =(°F - 32)* 0.44444
        return (value - 32) * 0.4444;
    }

    //fahrenheit to Kelvin method
    public static double fah_to_Kelvin(double value) {
       // (32°F − 32) × 5/9 + 273.15 = 273.15K

        return (value - 32) * (5.0/9)+273.15;
    }


    //Kelvin to celsius method
    public static double kelivn_to_Celsius(double value) {
        //32K − 273.15 = -241.1°C

        return (value - 273.15);
    }

    //Kelvin to Fah method
    public static double kelivn_to_Fah(double value) {
        //(32K − 273.15) × 9/5 + 32 = -402.1°F
        return (value - 273) * (9.0/5) + 32;
    }

    //Kelvin to reaumur method
    public static double kelivn_to_Reaumur(double value) {
        //[°Ré] = ([K] − 273.15) × 4⁄5
        return (value - 273.15) * (4.0/5);
    }


    //reaumur to celsius method
    public static double reaumur_to_Celsius(double value) {
        	//[°C] = [°Ré] × 5⁄4
        return value * 5/4;
    }

    //reaumur to Fah method
    public static double reaumur_to_Fah(double value) {
       // [°F] = [°Ré] × 9⁄4 + 32
        return (value * 9/4) +32;
    }

    //reaumur to Kelvin method
    public static double reaumur_to_Kelvin(double value) {
        //[K] = [°Ré] × 5⁄4 + 273.15
        return (value * 5/4) + 273.15;
    }


}
