# String_Convert_24hr_hh-mm

Converts prayer timings (String format) from "https://aladhan.com/prayer-times-api" to int format for easying displaying.

How does it work?
Given a String array of unparsed timings ( "4:50" ,  "14:50" ) we can format the array's timings in 12 hour format. I accomplish this using 
StringBuilder and Integer.ParseInt(); and more importantly String.splt(); to seperate the ":" from the timing. 

The code most likely breaks every respectable convention of Java programming but the task is accomplished.

NOT RECOMMENDED FOR COMMERICIAL USE ATM // 1/15/17
 
