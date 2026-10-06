import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Palm laura = new Palm("Laura", 5.0);

        System.out.println("Which plant would you want to water?");
        String response = scanner.nextLine();


        if (response.equalsIgnoreCase("laura")) {
            System.out.println("Plant: " + laura.getName());
            System.out.println("Liquid Amount: " + laura.calculateLiquidAmount() + "liters");
            System.out.println("Liquid type: " + LiquidType.TAP_WATER);
        } else if (response.equalsIgnoreCase("test")) {
            System.out.println("Plant: " + "plant1");
        } else if (response.equalsIgnoreCase("test1")) {
            System.out.println("Plant: " + "plant2");
        } else {
            System.out.println("Plant not found");
        }
        scanner.close();











        /*

         */





    }
}