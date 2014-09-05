package com.example.healthcalcandroid;

/**
 * Created by alange and bnelson on 23-Jul-14.
 */


public class CalculatorMain {
    public static String run(String gender, double weightInPounds, double heightFeet, double heightInches, double age){

                double heightInInches = (heightFeet * 12) + heightInches;

                double heightInMeters = heightInInches / 39.370;
                double weightInKilograms = weightInPounds / 2.2046;

                double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
                
                double basalMetabolicRate = 0;
                
                System.out.println(gender);
                
                //male 
                if (gender.equals("male")) {
                    
                basalMetabolicRate = 66 + (6.23 * weightInPounds) + (12.7 * heightInInches) - (6.8 * age);
                    System.out.println("male selected");//TODO Remove later-BLN
                //female
                } else {
                    
                    basalMetabolicRate = 655 + (4.35 * weightInPounds) + (4.7 * heightInInches) - (4.7 * age);
                    System.out.println("female selected");//TODO Remove later-BLN
                
                }
                
                double toLoseWeight = .75 * basalMetabolicRate;
                
                double howManyDays = 3500 / (basalMetabolicRate - toLoseWeight);
                
                return "BMI = " + Math.round(bodyMassIndex) + "%." + "  BMR = " + Math.round(basalMetabolicRate) + "." + "\n"
                        + "75% of your BMR is: " + Math.round(toLoseWeight) + "." + "\n"
                        + "If you intake " + Math.round(toLoseWeight) + " calories each day, it will take you " + Math.round(howManyDays) + " days to lose a pound.";

    }
}
