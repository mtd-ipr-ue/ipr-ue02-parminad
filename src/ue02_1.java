import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {

        Out.print("Enter first number: ");
        int firstNumber = In.readInt();

        Out.print("Enter second number: ");
        int secondNumber = In.readInt();

        Out.print("Enter third number: ");
        int thirdNumber = In.readInt();


        int max = firstNumber;
        if (secondNumber > max) {
            max = secondNumber;
        }
        if (thirdNumber > max) {
            max = thirdNumber;
        }

        Out.print("The maximum of your three numbers is: " + max);

    }
}
