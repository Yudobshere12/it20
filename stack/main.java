package topic_3_stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(5);

        // Loop to allow user to push elements onto the stack
        while (true) {
            System.out.print("Enter a number to push onto the stack (or 'exit' to stop): ");
            String input = scanner.nextLine();

            // Check for exit condition
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                stack.push(number);
                System.out.println("Pushed: " + number);
                System.out.println("Stack size is: " + stack.size());
                System.out.println("Top element is: " + stack.peek());
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            } catch (StackOverflowError e) {
                System.out.println("Stack is full. Cannot push more elements.");
            }
        }

        // Popping elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
            if (!stack.isEmpty()) {
                System.out.println("Top element after pop: " + stack.peek());
            } else {
                System.out.println("Stack is now empty.");
            }
            System.out.println("Stack size after pop: " + stack.size());
            System.out.println();
        }

        scanner.close();
    }
}
