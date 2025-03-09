import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of even numbers to print: ");
        int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
            System.out.println(2 * i);
        }
        scanner.close();
    }
}
