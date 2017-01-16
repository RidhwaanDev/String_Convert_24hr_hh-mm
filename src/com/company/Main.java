package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    static ArrayList<String[]> sListWithTimeFormatted = new ArrayList<>();




    public static void main(String[] args) {


        String fajr = "5:40";
        String duhr = "12:54";
        String asr = "15:60";
        String maghrib = "17:40";
        String isha = "23:00";

        String[] prayerTimes = new String[5];

        prayerTimes[0] = fajr;
        prayerTimes[1] = duhr;
        prayerTimes[2] = asr;
        prayerTimes[3] = maghrib;
        prayerTimes[4] = isha;

        ArrayList<String[]> a = convertToHourMin(prayerTimes);
        for (int i = 0; i < a.size(); i++) {
            //System.out.println(Arrays.toString(a.get(i)));
            System.out.println(convertToTimeString(a,i));

        }



    }




//To-do Pass in ArrayList of String arrays. Then set each String array to have the two time elements. Then print outl.




    public static ArrayList<String[]> convertToHourMin(String[] s){


        for(int i= 0; i<s.length; i++) {
            sListWithTimeFormatted.add(s[i].split(":"));
        }
        return sListWithTimeFormatted;

    }



    public static String convertToTimeString(ArrayList<String[]> aList, int index){
        String[] convertArray = aList.get(index);
        int time = Integer.parseInt(convertArray[0] + convertArray[1]);
        //StringBuilder sb = new StringBuilder();
       // sb.append(convertArray[0] + ":" +convertArray[1]);
        //  System.out.println( " TIME WAS AS INT " + "\n" + time);
     //   System.out.println(sb);
        int timeUnParsed1 = Integer.parseInt(convertArray[0]);
        int timeUnParsed2 = Integer.parseInt(convertArray[1]);

        if(timeUnParsed1 > 12){
            timeUnParsed1 = timeUnParsed1 - 12;

        }if(timeUnParsed2 == 60){
            timeUnParsed1++;
            timeUnParsed2 = Integer.parseInt("00");
        }

        StringBuilder sb = new StringBuilder();


        if(timeUnParsed2 == 0){
            sb.append(timeUnParsed1 + ":" + timeUnParsed2 + "0");
        } else{
            sb.append(timeUnParsed1 + ":" + timeUnParsed2);
        }

        return sb.toString();

    }


}




