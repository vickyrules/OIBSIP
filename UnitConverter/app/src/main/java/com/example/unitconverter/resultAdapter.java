package com.example.unitconverter;

public class resultAdapter {

    public static double getResult(String title, double unitIdxUpper, double unitIdxLower, String input) {

        double result = 0;


        try {
            //Length
            if (title.equals("Length conversion")) {
                //Inch
                if (unitIdxUpper == 4 && unitIdxLower == 4) {
                    result = LengthMethods.inch_to_Inch(Double.parseDouble(input));

                }

                if (unitIdxUpper == 5 && unitIdxLower == 4) {
                    result = LengthMethods.inch_to_Mile(Double.parseDouble(input));

                }
                if (unitIdxUpper == 6 && unitIdxLower == 4) {
                    result = LengthMethods.inch_to_Foot(Double.parseDouble(input));

                }

                if (unitIdxUpper == 7 && unitIdxLower == 4) {
                    result = LengthMethods.inch_to_Yard(Double.parseDouble(input));

                }

                if (unitIdxUpper == 0 && unitIdxLower == 4) {
                    result = LengthMethods.inch_to_Kilometer(Double.parseDouble(input));

                }

                if (unitIdxUpper == 1 && unitIdxLower == 4) {
                    result = LengthMethods.inch_to_Meter(Double.parseDouble(input));
                }

                if (unitIdxUpper == 2 && unitIdxLower == 4) {
                    result = LengthMethods.inch_to_Centimeter(Double.parseDouble(input));

                }


                if (unitIdxUpper == 3 && unitIdxLower == 4) {
                    result = LengthMethods.inch_to_Millimeter(Double.parseDouble(input));

                }

                //mile
                if (unitIdxUpper == 5 && unitIdxLower == 5) {
                    result = LengthMethods.mile_to_Meter(Double.parseDouble(input));

                }
                if (unitIdxUpper == 4 && unitIdxLower == 5) {
                    result = LengthMethods.mile_to_Inch(Double.parseDouble(input));
                }

                if (unitIdxUpper == 6 && unitIdxLower == 5) {
                    result = LengthMethods.mile_to_Foot(Double.parseDouble(input));
                }

                if (unitIdxUpper == 7 && unitIdxLower == 5) {
                    result = LengthMethods.mile_to_Yard(Double.parseDouble(input));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 5) {
                    result = LengthMethods.mile_to_Kilometer(Double.parseDouble(input));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 5) {
                    result = LengthMethods.mile_to_Meter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 5) {
                    result = LengthMethods.mile_to_Centimeter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 5) {
                    result = LengthMethods.mile_to_Millimeter(Double.parseDouble(input));
                }

                //foot
                if (unitIdxUpper == 6 && unitIdxLower == 6) {
                    result = LengthMethods.foot_to_Foot(Double.parseDouble(input));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 6) {
                    result = LengthMethods.foot_to_Inch(Double.parseDouble(input));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 6) {
                    result = LengthMethods.foot_to_Mile(Double.parseDouble(input));
                }
                if (unitIdxUpper == 7 && unitIdxLower == 6) {
                    result = LengthMethods.foot_to_Yard(Double.parseDouble(input));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 6) {
                    result = LengthMethods.foot_to_Kilometer(Double.parseDouble(input));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 6) {
                    result = LengthMethods.foot_to_Meter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 6) {
                    result = LengthMethods.foot_to_Centimeter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 6) {
                    result = LengthMethods.foot_to_Millimeter(Double.parseDouble(input));
                }

                //yard
                if (unitIdxUpper == 7 && unitIdxLower == 7) {
                    result = LengthMethods.yard_to_Yard(Double.parseDouble(input));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 7) {
                    result = LengthMethods.yard_to_Inch(Double.parseDouble(input));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 7) {
                    result = LengthMethods.yard_to_Mile(Double.parseDouble(input));
                }
                if (unitIdxUpper == 6 && unitIdxLower == 7) {
                    result = LengthMethods.yard_to_Foot(Double.parseDouble(input));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 7) {
                    result = LengthMethods.yard_to_Kilometer(Double.parseDouble(input));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 7) {
                    result = LengthMethods.yard_to_Meter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 7) {
                    result = LengthMethods.yard_to_Centimeter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 7) {
                    result = LengthMethods.yard_to_Millimeter(Double.parseDouble(input));
                }


                //Kilometer
                if (unitIdxUpper == 0 && unitIdxLower == 0) {
                    result = LengthMethods.kilometer_to_Kilometer(Double.parseDouble(input));

                }

                if (unitIdxUpper == 0 && unitIdxLower == 1) {
                    result = LengthMethods.kilometer_to_Meter(Double.parseDouble(input));

                }

                if (unitIdxUpper == 0 && unitIdxLower == 2) {
                    result = LengthMethods.kilometer_to_Centimeter(Double.parseDouble(input));

                }

                if (unitIdxUpper == 0 && unitIdxLower == 3) {
                    result = LengthMethods.kilometer_to_Millimeter(Double.parseDouble(input));

                }

                if (unitIdxUpper == 0 && unitIdxLower == 4) {
                    result = LengthMethods.kilometer_to_Inch(Double.parseDouble(input));

                }

                if (unitIdxUpper == 0 && unitIdxLower == 5) {
                    result = LengthMethods.kilometer_to_Mile(Double.parseDouble(input));

                }

                if (unitIdxUpper == 0 && unitIdxLower == 6) {
                    result = LengthMethods.kilometer_to_Foot(Double.parseDouble(input));

                }


                if (unitIdxUpper == 0 && unitIdxLower == 7) {
                    result = LengthMethods.kilometer_to_Yard(Double.parseDouble(input));

                }

                //meter
                if (unitIdxUpper == 1 && unitIdxLower == 1) {
                    result = LengthMethods.meter_to_Meter(Double.parseDouble(input));

                }
                if (unitIdxUpper == 1 && unitIdxLower == 0) {
                    result = LengthMethods.meter_to_Kilometer(Double.parseDouble(input));

                }

                if (unitIdxUpper == 1 && unitIdxLower == 2) {
                    result = LengthMethods.meter_to_Centimeter(Double.parseDouble(input));
                }

                if (unitIdxUpper == 1 && unitIdxLower == 3) {
                    result = LengthMethods.meter_to_Centimeter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 4) {
                    result = LengthMethods.meter_to_Inch(Double.parseDouble(input));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 5) {
                    result = LengthMethods.meter_to_Mile(Double.parseDouble(input));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 6) {
                    result = LengthMethods.meter_to_Foot(Double.parseDouble(input));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 7) {
                    result = LengthMethods.meter_to_Yard(Double.parseDouble(input));
                }

                //centimeter
                if (unitIdxUpper == 2 && unitIdxLower == 2) {
                    result = LengthMethods.centimeter_to_Centimeter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 0) {
                    result = LengthMethods.centimeter_to_Kilometer(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 1) {
                    result = LengthMethods.centimeter_to_Meter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 3) {
                    result = LengthMethods.centimeter_to_Millimeter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 4) {
                    result = LengthMethods.centimeter_to_Inch(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 5) {
                    result = LengthMethods.centimeter_to_Mile(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 6) {
                    result = LengthMethods.centimeter_to_Foot(Double.parseDouble(input));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 7) {
                    result = LengthMethods.centimeter_to_Yard(Double.parseDouble(input));
                }

                //millimeter
                if (unitIdxUpper == 3 && unitIdxLower == 3) {
                    result = LengthMethods.millimeter_to_Millimeter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 0) {
                    result = LengthMethods.millimeter_to_Kilometer(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 1) {
                    result = LengthMethods.millimeter_to_Meter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 2) {
                    result = LengthMethods.millimeter_to_Centimeter(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 4) {
                    result = LengthMethods.millimeter_to_Inch(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 5) {
                    result = LengthMethods.millimeter_to_Mile(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 6) {
                    result = LengthMethods.millimeter_to_Foot(Double.parseDouble(input));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 7) {
                    result = LengthMethods.millimeter_to_Yard(Double.parseDouble(input));
                }
            }
            else if (title.equals("Temperature conversion")) {
                //celsius
                if (unitIdxUpper == 0 && unitIdxLower == 0) {
                    return (TemperatureMethods.celsius_to_Celsius(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 1) {
                    return (TemperatureMethods.celsius_to_Fah(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 2) {
                    return (TemperatureMethods.celsius_to_Reaumur(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 0 && unitIdxLower == 3) {
                    return (TemperatureMethods.celsius_to_Kelvin(Double.parseDouble(input)));
                }
                //Kelvin
                if (unitIdxUpper == 3 && unitIdxLower == 3) {
                    return (TemperatureMethods.kelvin_to_Kelvin(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 0) {
                    return (TemperatureMethods.kelivn_to_Celsius(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 1) {
                    return (TemperatureMethods.kelivn_to_Fah(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 3 && unitIdxLower == 2) {
                    return (TemperatureMethods.kelivn_to_Reaumur(Double.parseDouble(input)));
                }
                //REaumur
                if (unitIdxUpper == 2 && unitIdxLower == 2) {
                    return (TemperatureMethods.reaumur_to_Reaumur(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 0) {
                    return (TemperatureMethods.reaumur_to_Celsius(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 1) {
                    return (TemperatureMethods.reaumur_to_Fah(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 2 && unitIdxLower == 3) {
                    return (TemperatureMethods.reaumur_to_Kelvin(Double.parseDouble(input)));
                }
                //Fahrenheit
                if (unitIdxUpper == 1 && unitIdxLower == 1) {
                    return (TemperatureMethods.fah_to_Fah(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 0) {
                    return (TemperatureMethods.fah_to_Celsius(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 2) {
                    return (TemperatureMethods.fah_to_Reaumur(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 1 && unitIdxLower == 3) {
                    return (TemperatureMethods.fah_to_Kelvin(Double.parseDouble(input)));
                }

            }
            else if (title.equals("Area conversion")) {

            }
            else if (title.equals("Volume conversion")) {}
            else if (title.equals("Weight conversion")) {
                // kg
                if (unitIdxUpper == 0 && unitIdxLower == 0) {
                    return (WeightMethods.kg_to_Kg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 1) {
                    return (WeightMethods.kg_to_G(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 2) {
                    return (WeightMethods.kg_to_Mg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 3) {
                    return (WeightMethods.kg_to_T(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 4) {
                    return (WeightMethods.kg_to_Lb(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 5) {
                    return (WeightMethods.kg_to_Oz(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 6) {
                    return (WeightMethods.kg_to_Gr(Double.parseDouble(input)));
                }
                // g
                if (unitIdxUpper == 1 && unitIdxLower == 0) {
                    return (WeightMethods.g_to_Kg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 1) {
                    return (WeightMethods.g_to_G(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 2) {
                    return (WeightMethods.g_to_Mg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 3) {
                    return (WeightMethods.g_to_T(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 4) {
                    return (WeightMethods.g_to_Lb(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 5) {
                    return (WeightMethods.g_to_Oz(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 6) {
                    return (WeightMethods.g_to_Gr(Double.parseDouble(input)));
                }

                // mg
                if (unitIdxUpper == 2 && unitIdxLower == 0) {
                    return (WeightMethods.mg_to_Kg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 1) {
                    return (WeightMethods.mg_to_G(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 2) {
                    return (WeightMethods.mg_to_Mg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 3) {
                    return (WeightMethods.mg_to_T(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 4) {
                    return (WeightMethods.mg_to_Lb(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 5) {
                    return (WeightMethods.mg_to_Oz(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 6) {
                    return (WeightMethods.mg_to_Gr(Double.parseDouble(input)));
                }

                // t
                if (unitIdxUpper == 3 && unitIdxLower == 0) {
                    return (WeightMethods.t_to_Kg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 1) {
                    return (WeightMethods.t_to_G(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 2) {
                    return (WeightMethods.t_to_Mg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 3) {
                    return (WeightMethods.t_to_T(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 4) {
                    return (WeightMethods.t_to_Lb(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 5) {
                    return (WeightMethods.t_to_Oz(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 6) {
                    return (WeightMethods.t_to_Gr(Double.parseDouble(input)));
                }

                // lb
                if (unitIdxUpper == 4 && unitIdxLower == 0) {
                    return (WeightMethods.lb_to_Kg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 1) {
                    return (WeightMethods.lb_to_G(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 2) {
                    return (WeightMethods.lb_to_Mg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 3) {
                    return (WeightMethods.lb_to_T(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 4) {
                    return (WeightMethods.lb_to_Lb(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 5) {
                    return (WeightMethods.lb_to_Oz(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 6) {
                    return (WeightMethods.lb_to_Gr(Double.parseDouble(input)));
                }

                // oz
                if (unitIdxUpper == 5 && unitIdxLower == 0) {
                    return (WeightMethods.oz_to_Kg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 1) {
                    return (WeightMethods.oz_to_G(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 2) {
                    return (WeightMethods.oz_to_Mg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 3) {
                    return (WeightMethods.oz_to_T(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 4) {
                    return (WeightMethods.oz_to_Lb(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 5) {
                    return (WeightMethods.oz_to_Oz(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 6) {
                    return (WeightMethods.oz_to_Gr(Double.parseDouble(input)));
                }

                // gr
                if (unitIdxUpper == 5 && unitIdxLower == 0) {
                    return (WeightMethods.gr_to_Kg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 1) {
                    return (WeightMethods.gr_to_G(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 2) {
                    return (WeightMethods.gr_to_Mg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 3) {
                    return (WeightMethods.gr_to_T(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 4) {
                    return (WeightMethods.gr_to_Lb(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 5) {
                    return (WeightMethods.gr_to_Oz(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 6) {
                    return (WeightMethods.gr_to_Gr(Double.parseDouble(input)));
                }






            }
            else if (title.equals("Speed conversion")) {
                // kms
                if (unitIdxUpper == 0 && unitIdxLower == 0) {
                    return (SpeedMethods.kms_to_Kms(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 1) {
                    return (SpeedMethods.kms_to_Ms(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 2) {
                    return (SpeedMethods.kms_to_Kmh(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 3) {
                    return (SpeedMethods.kms_to_C(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 4) {
                    return (SpeedMethods.kms_to_Mph(Double.parseDouble(input)));
                }
                // m/s
                if (unitIdxUpper == 1 && unitIdxLower == 0) {
                    return (SpeedMethods.ms_to_Kms(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 1) {
                    return (SpeedMethods.ms_to_Ms(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 1 && unitIdxLower == 2) {
                    return (SpeedMethods.ms_to_Kmh(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 1 && unitIdxLower == 3) {
                    return (SpeedMethods.ms_to_C(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 1 && unitIdxLower == 4) {
                    return (SpeedMethods.ms_to_Mph(Double.parseDouble(input)));
                }

                // km/h
                if (unitIdxUpper == 2 && unitIdxLower == 0) {
                    return (SpeedMethods.kmh_to_Kms(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 1) {
                    return (SpeedMethods.kmh_to_Ms(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 2) {
                    return (SpeedMethods.kmh_to_Kmh(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 3) {
                    return (SpeedMethods.kmh_to_C(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 4) {
                    return (SpeedMethods.kmh_to_Mph(Double.parseDouble(input)));
                }

                //speed of light (C)

                if (unitIdxUpper == 3 && unitIdxLower == 0) {
                    return (SpeedMethods.c_to_Kms(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 1) {
                    return (SpeedMethods.c_to_Ms(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 2) {
                    return (SpeedMethods.c_to_Kmh(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 3) {
                    return (SpeedMethods.c_to_C(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 4) {
                    return (SpeedMethods.c_to_Mph(Double.parseDouble(input)));
                }

                //mph

                if (unitIdxUpper == 4 && unitIdxLower == 0) {
                    return (SpeedMethods.mph_to_Kms(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 1) {
                    return (SpeedMethods.mph_to_Ms(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 4 && unitIdxLower == 2) {
                    return (SpeedMethods.mph_to_Kmh(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 3) {
                    return (SpeedMethods.mph_to_C(Double.parseDouble(input)));
                }

                if (unitIdxUpper == 4 && unitIdxLower == 4) {
                    return (SpeedMethods.mph_to_Mph(Double.parseDouble(input)));
                }


            }
            else if (title.equals("Power conversion")) {
                //kw
                if (unitIdxUpper == 0 && unitIdxLower == 0) {
                    return (PowerMethods.kw_to_Kw(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 1) {
                    return (PowerMethods.kw_to_W(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 2) {
                    return (PowerMethods.kw_to_Js(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 3) {
                    return (PowerMethods.kw_to_Hp(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 4) {
                    return (PowerMethods.kw_to_Kcals(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 5) {
                    return (PowerMethods.kw_to_Nms(Double.parseDouble(input)));
                }

                //w
                if (unitIdxUpper == 1 && unitIdxLower == 0) {
                    return (PowerMethods.w_to_Kw(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 1) {
                    return (PowerMethods.w_to_W(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 2) {
                    return (PowerMethods.w_to_Js(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 3) {
                    return (PowerMethods.w_to_Hp(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 4) {
                    return (PowerMethods.w_to_Kcals(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 5) {
                    return (PowerMethods.w_to_Nms(Double.parseDouble(input)));
                }

                //j/s
                if (unitIdxUpper == 2 && unitIdxLower == 0) {
                    return (PowerMethods.js_to_Kw(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 1) {
                    return (PowerMethods.js_to_W(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 2) {
                    return (PowerMethods.js_to_Js(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 3) {
                    return (PowerMethods.js_to_Hp(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 4) {
                    return (PowerMethods.js_to_Kcals(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 5) {
                    return (PowerMethods.js_to_Nms(Double.parseDouble(input)));
                }

                //hp
                if (unitIdxUpper == 3 && unitIdxLower == 0) {
                    return (PowerMethods.hp_to_Kw(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 1) {
                    return (PowerMethods.hp_to_W(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 2) {
                    return (PowerMethods.hp_to_Js(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 3) {
                    return (PowerMethods.hp_to_Hp(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 4) {
                    return (PowerMethods.hp_to_Kcals(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 5) {
                    return (PowerMethods.hp_to_Nms(Double.parseDouble(input)));
                }

                //kcal/s
                if (unitIdxUpper == 4 && unitIdxLower == 0) {
                    return (PowerMethods.kcal_to_Kw(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 1) {
                    return (PowerMethods.kcal_to_W(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 2) {
                    return (PowerMethods.kcal_to_Js(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 3) {
                    return (PowerMethods.kcal_to_Hp(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 4) {
                    return (PowerMethods.kcal_to_Kcals(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 5) {
                    return (PowerMethods.kcal_to_Nms(Double.parseDouble(input)));
                }

                //nm/s
                if (unitIdxUpper == 0 && unitIdxLower == 0) {
                    return (PowerMethods.nms_to_Kw(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 1) {
                    return (PowerMethods.nms_to_W(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 2) {
                    return (PowerMethods.nms_to_Js(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 3) {
                    return (PowerMethods.nms_to_Hp(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 4) {
                    return (PowerMethods.nms_to_Kcals(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 5) {
                    return (PowerMethods.nms_to_Nms(Double.parseDouble(input)));
                }
            }
            else if (title.equals("Pressure conversion")) {
                //atm
                if (unitIdxUpper == 0 && unitIdxLower == 0) {
                    return (PressureMethods.atm_to_Atm(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 1) {
                    return (PressureMethods.atm_to_Hpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 2) {
                    return (PressureMethods.atm_to_Mpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 3) {
                    return (PressureMethods.atm_to_Psf(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 4) {
                    return (PressureMethods.atm_to_Psi(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 5) {
                    return (PressureMethods.atm_to_MMhg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 0 && unitIdxLower == 6) {
                    return (PressureMethods.atm_to_Inhg(Double.parseDouble(input)));
                }

                //hpa

                if (unitIdxUpper == 1 && unitIdxLower == 0) {
                    return (PressureMethods.hpa_to_Atm(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 1) {
                    return (PressureMethods.hpa_to_Hpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 2) {
                    return (PressureMethods.hpa_to_Mpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 3) {
                    return (PressureMethods.hpa_to_Psf(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 4) {
                    return (PressureMethods.hpa_to_Psi(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 5) {
                    return (PressureMethods.hpa_to_MMhg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 1 && unitIdxLower == 6) {
                    return (PressureMethods.hpa_to_Inhg(Double.parseDouble(input)));
                }

                //Mpa
                if (unitIdxUpper == 2 && unitIdxLower == 0) {
                    return (PressureMethods.mpa_to_Atm(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 1) {
                    return (PressureMethods.mpa_to_Hpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 2) {
                    return (PressureMethods.mpa_to_Mpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 3) {
                    return (PressureMethods.mpa_to_Psf(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 4) {
                    return (PressureMethods.mpa_to_Psi(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 5) {
                    return (PressureMethods.mpa_to_MMhg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 2 && unitIdxLower == 6) {
                    return (PressureMethods.mpa_to_Inhg(Double.parseDouble(input)));
                }

                //psf
                if (unitIdxUpper == 3 && unitIdxLower == 0) {
                    return (PressureMethods.psf_to_Atm(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 1) {
                    return (PressureMethods.psf_to_Hpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 2) {
                    return (PressureMethods.psf_to_Mpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 3) {
                    return (PressureMethods.psf_to_Psf(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 4) {
                    return (PressureMethods.psf_to_Psi(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 5) {
                    return (PressureMethods.psf_to_MMhg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 3 && unitIdxLower == 6) {
                    return (PressureMethods.psf_to_Inhg(Double.parseDouble(input)));
                }

                //psi
                if (unitIdxUpper == 4 && unitIdxLower == 0) {
                    return (PressureMethods.psi_to_Atm(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 1) {
                    return (PressureMethods.psi_to_Hpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 2) {
                    return (PressureMethods.psi_to_Mpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 3) {
                    return (PressureMethods.psi_to_Psf(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 4) {
                    return (PressureMethods.psi_to_Psi(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 5) {
                    return (PressureMethods.psi_to_MMhg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 4 && unitIdxLower == 6) {
                    return (PressureMethods.psi_to_Inhg(Double.parseDouble(input)));
                }

                //mmhg
                if (unitIdxUpper == 5 && unitIdxLower == 0) {
                    return (PressureMethods.mmhg_to_Atm(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 1) {
                    return (PressureMethods.mmhg_to_Hpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 2) {
                    return (PressureMethods.mmhg_to_Mpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 3) {
                    return (PressureMethods.mmhg_to_Psf(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 4) {
                    return (PressureMethods.mmhg_to_Psi(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 5) {
                    return (PressureMethods.mmhg_to_MMhg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 5 && unitIdxLower == 6) {
                    return (PressureMethods.mmhg_to_Inhg(Double.parseDouble(input)));
                }

                //inhg
                if (unitIdxUpper == 6 && unitIdxLower == 0) {
                    return (PressureMethods.inhg_to_Atm(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 6 && unitIdxLower == 1) {
                    return (PressureMethods.inhg_to_Hpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 6 && unitIdxLower == 2) {
                    return (PressureMethods.inhg_to_Mpa(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 6 && unitIdxLower == 3) {
                    return (PressureMethods.inhg_to_Psf(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 6 && unitIdxLower == 4) {
                    return (PressureMethods.inhg_to_Psi(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 6 && unitIdxLower == 5) {
                    return (PressureMethods.inhg_to_MMhg(Double.parseDouble(input)));
                }
                if (unitIdxUpper == 6 && unitIdxLower == 6) {
                    return (PressureMethods.inhg_to_Inhg(Double.parseDouble(input)));
                }



            }


        } catch (Exception e) {

        }


        return result;
    }
}



                        
                        
