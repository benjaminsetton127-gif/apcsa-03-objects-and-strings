import java.util.Scanner;

/**
 * Exercise 6 — PersonalGreeter
 *
 * Ask the user for their name, age, and favorite subject.
 * Respond with a paragraph that uses all three, plus the year
 * they will turn 100.
 *
 * ⚠️ Remember the trap: if you read an int and THEN a line,
 *    you need a bare input.nextLine() in between.
 */
public class PersonalGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("your name: ");
        String name = input.nextLine();
        System.out.print("your age: ");
        int age = input.nextInt();
        System.out.print("Favorite subjects: ");
        String subject = input.next();
        input.close();
        System.out.println("My name is " + name + ". I am " + age + " years old. My favorite class is " + subject +". I will be 100 in " + (2026 - age + 100));
    }
}
