package codoid.technicaltask.java;

public class EnumerationExample {
	public class EnumExample {
		enum Weekday {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
		}

		public static void main(String[] args) {
			Weekday today = Weekday.WEDNESDAY;

			switch (today) {
			case MONDAY:
				System.out.println("Today is Monday");
				break;
			case TUESDAY:
				System.out.println("Today is Tuesday");
				break;
			case WEDNESDAY:
				System.out.println("Today is Wednesday");
				break;
			case THURSDAY:
				System.out.println("Today is Thursday");
				break;
			case FRIDAY:
				System.out.println("Today is Friday");
				break;
			case SATURDAY:
				System.out.println("Today is Saturday");
				break;
			case SUNDAY:
				System.out.println("Today is Sunday");
				break;
			default:
				System.out.println("Invalid day of the week");
				break;
			}
		}
	}

}
