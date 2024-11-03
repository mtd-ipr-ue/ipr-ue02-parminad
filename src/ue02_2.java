import libraries.Out;
import libraries.In;

public class ue02_2 {
    public static void main(String[] args) {
        
        Out.print("Year? ");
        int year = In.readInt();
        
        Out.print("Month in number? ");
        int month = In.readInt();

        if (month < 1 || month > 12) {
            Out.print("Error: Month must be a number between 1 and 12!"); 
            return; 
        }

        int days = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; 
                } else {
                    days = 28;
                }
                break;

                

    }

    Out.println("The month " + month + " in the year " + year + " has " + days + " days.");
    
}

}
