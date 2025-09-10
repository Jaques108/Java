
package questions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double g = 9.81;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time: ");
        int time = scanner.nextInt();
        double distance = 9.81 * Math.pow((double)time, (double)2.0F) / (double)2.0F;
        System.out.println("Distance is: " + distance + " Meters");
    }
}