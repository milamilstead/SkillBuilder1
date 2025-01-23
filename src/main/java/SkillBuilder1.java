import java.util.Scanner;
import java.lang.Math;
/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();
        System.out.println();

        System.out.println("Enter a floating-point number:");
        float spice = input.nextFloat();
        double spiceCalc = (4.0/3.0) * Math.pow(2.0,Math.sqrt(5.0)/Math.pow(spice,3.0));
        System.out.println("\nWell Jean Claude, the spice value resulted in " + spiceCalc);
        double lastCalc = (Math.round(spiceCalc * 100.0)/100.0);
        System.out.print("And the converted value is "+ String.format("%.2f", lastCalc));
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double wallArea = (wallWidth * wallHeight);
        double paintNeeded = (((wallArea/squareFeetPerGallons)*100.0)/100.0);
        int cansNeeded = (int) Math.ceil(paintNeeded/gallonsPerCan);

        System.out.println("Wall area: " + wallArea + " square feet" +
                           "\nPaint needed: " + String.format("%.2f", paintNeeded) + " gallons" +
                           "\nCans needed: "+ cansNeeded + " can(s)");


    }
}
