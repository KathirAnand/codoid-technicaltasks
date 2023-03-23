package codoid.technicaltask.java;

public class SwitchStatementWithMultipleLabels {

	public static void main(String[] args) {
		 int day = 3;

	        // Example of multi-label case statements using switch expressions
	        String dayName = switch (day) {
	            case 1, 2, 3, 4, 5 -> "Weekday";
	            case 6, 7 -> "Weekend";
	            default -> "Invalid day";
	        };

	        System.out.println("Day " + day + " is a " + dayName);
		// TODO Auto-generated method stub

	}

}
