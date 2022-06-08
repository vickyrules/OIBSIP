package com.example.unitconverter;

public class SpeedMethods {
    //---------------------------------Speed Conversion--------------------------------
    //km/s to km/s method
    public static double kms_to_Kms(double value) {
        return value;
    }

    //m/s to m/s method
    public static double ms_to_Ms(double value) {
        return value;
    }

    //Kmh to Kmh method
    public static double kmh_to_Kmh(double value) {
        return value;
    }

    //c to C method
    public static double c_to_C(double value) {
        return value;
    }

    //mph to mph method
    public static double mph_to_Mph(double value) {
        return value;
    }

    //kms to ms method
    public static double kms_to_Ms(double value) {
        return (value * 1000);
    }

    //kms to kmh method
    public static double kms_to_Kmh(double value) {

        return value * 3600;
    }

    //kms to c method
    public static double kms_to_C(double value) {

        return value * 0.0000033356;
    }

    //kms to mph method
    public static double kms_to_Mph(double value) {
        return (value * 2236.0936);
    }

    //ms to kms method
    public static double ms_to_Kms(double value) {
        return (value * 0.001);
    }

    //ms to kmh method
    public static double ms_to_Kmh(double value) {
        return (value * 3.6);
    }

    //ms to c method
    public static double ms_to_C(double value) {

        return (value / 299796138.625734500539633);
    }

    //ms to mph method
    public static double ms_to_Mph(double value) {
        return (value * 2.236936);
    }

    //Kmh to kms method
    public static double kmh_to_Kms(double value) {
        return (value * 0.0002777777777778);
    }

    //kmh to ms method
    public static double kmh_to_Ms(double value) {
        return value * 0.2777777777778;
    }

    //kmh to c method
    public static double kmh_to_C(double value) {
        return (value / 1079266099.0526442019426788) ;
    }

    //kmh to mph method
    public static double kmh_to_Mph(double value) {
        return (value * 0.621371111111111) ;
    }

    //C to kms method
    public static double c_to_Kms(double value) {
        return (value/0.0000033356 ) ;
    }

    //c to ms method
    public static double c_to_Ms(double value) {
        return (value * 299796138.625734500539633) ;
    }
    //c to kmh method
    public static double c_to_Kmh(double value) {
        return (value * 1079266099.0526442019426788);
    }

    //c to mph method
    public static double c_to_Mph(double value) {
        return (value * 670624775.152896030699124484488) ;
    }


    //mph to kms method
    public static double mph_to_Kms(double value) {
        return (value * 0.00044704005836555);
    }
    //mph to ms method
    public static double mph_to_Ms(double value) {
        return (value * 0.44704005836555) ;
    }

    //mph to kmh method
    public static double mph_to_Kmh(double value) {
        return (value * 1.60934421011598) ;
    }

    //mph to C method
    public static double mph_to_c(double value) {
        return (value  / 670624775.152896030699124484488);
    }
}
