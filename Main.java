import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        nextPrevious(num);
    }

    public static void nextPrevious(int a){
        int b = a + 1;
        int c = a -1;
        System.out.println("The next number for the number " + a + " is " + b + ".");
        System.out.println("The previous number for the number " + a + " is " + c + ".");
    }
}