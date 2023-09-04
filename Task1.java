import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float number = getFloatingPointNumber();
        System.out.println("You have entered a number: " + number);
    }
    public static float getFloatingPointNumber(){
        Scanner scanner = new Scanner(System.in);
        float number = 0f;
        boolean validInput = false;

        while (!validInput){
            System.out.println("Input a fractional number: ");
            if (scanner.hasNextFloat()){
                number = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Error! Please, input a fractional number.");
                scanner.next();
            }
        }
        return number;
    }
}
