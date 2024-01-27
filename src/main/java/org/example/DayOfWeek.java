package org.example;

public class DayOfWeek {
       public static String DayOfWeekToString (Day day) {
           switch (day) {
               case MONDAY:
                   return "Monday";
               case TUESDAY:
                   return "Tuesday";
               case WEDNESDAY:
                   return "Wednesday";
               case THURSDAY:
                   return "Thursday";
               case FRIDAY:
                   return "Friday";
               case SATURDAY:
                   return "Saturday";
               case SUNDAY:
                   return "Sunday";
               default:
                   return "Invalid day";
           }
    }
}
