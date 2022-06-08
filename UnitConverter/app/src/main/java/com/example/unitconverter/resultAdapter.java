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

                else if(title.equals("")){

                }
            }
            catch (Exception e) {

            }


    return  result;
    }
}



                        
                        
