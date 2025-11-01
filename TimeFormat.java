// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// step1: recieving time in 24hr format.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        	// step 2: determining hours12 as the new hour integar + AMPM.
			int hours12;
			String AMPM;
			// special event 1: hours=00.
			if (hours == 0) {
    		hours12 = 0;
			AMPM = "AM";
			// special event 2: hours=12.
			} else if (hours == 12) {
    		hours12 = 12;
			AMPM = "PM";
			// all other events.
			} else if (hours > 12) {
    		// step 3: logic used to convert hours greater than 12.
    		hours12 = hours % 12;
			AMPM = "PM";
			} else { 
    		// step 4: logic used to convert hours smaller than 12.
    		hours12 = hours;
			AMPM = "AM";
			}
				// step 5: determining minutes60 as the new minutes integar.
				String minutes60; 
				// special event 3: minutes60<10.
				if (minutes < 10) {
    			minutes60 = "0" + minutes;
				// all other occasions.
				} else {
    			minutes60 =("" + minutes); 
				}
		System.out.println(hours12 + ":" + minutes60 + " " + AMPM);
	}
}