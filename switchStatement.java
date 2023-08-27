public class switchStatement {
    public static void main(String[] args) {
        // Switch statements are used to perform different actions based on different conditions.

        int day = 3;
        String dayName = "NA";

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;

            case 2:
                dayName = "Monday";
                break;
            
            case 3:
                dayName = "Tuesday";
                break;

            case 4:
                dayName = "Wednesdat";
                break;

            case 5:
                dayName = "Thurday";
                break;

            case 6:
                dayName = "Friday";
                break;

            case 7:
                dayName = "Saturday";
                break;
        }

        System.out.println("Today is " + dayName);

        // In this example, the code checks the value of day and assigns a corresponding dayName based on the case.
    }
}
