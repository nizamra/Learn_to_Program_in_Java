import java.util.Scanner;

public class InteractiveHelloName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.println("Hello " + name);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        System.out.print("What is your weight? ");
        double weight = input.nextDouble();
        System.out.println(name + " is " + age + " years old and weighs " + weight + "kg" );
    }
}
