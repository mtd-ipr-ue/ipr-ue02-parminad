import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        
        Out.print("Enter the x-coordinate of the point: ");
        double x = In.readDouble();
 
        Out.print("Enter the y-coordinate of the point: ");
        double y = In.readDouble();
 
    
        if (x >= 0 && y >= 0) { 
            double distanceToOrigin = Math.sqrt(x * x + y * y);
            if (distanceToOrigin > 4) { 
                Out.println("The point lies within the green area.");
            } else {
                Out.println("The point lies outside the green area.");
            }
        } else {
            Out.println("The point lies outside the green area.");
        }

    }
}
