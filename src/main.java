import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<String>();
        String input;
        int number = 1;
        while (true){
            System.out.println("Enter Name #" + number + "(type 'done' if finished)= " );
            input = scanner.nextLine();
            try {
                nameCheck(input);
                if (input.equals("done")) {
                    break;
                }
                name.add(input);
                number++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Name that have been inputted:");
        for (String n : name) {
            System.out.println("-" + n);
        }
    }
    public static void nameCheck(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name has to be filled");
        }
    }
}
