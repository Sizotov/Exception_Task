import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String input = scanner.nextLine();

        try{
            if (input.isEmpty()){
                throw new Exception("Empty strings can not be entered");
            } else {
                System.out.println("You have entered: " + input);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
