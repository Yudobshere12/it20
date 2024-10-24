import java.util.Scanner;

public class SimpleQueueProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           Queue q = new Queue();
        
        System.out.println("Welcome to Simple Queue Program!");
        System.out.println();
        
        while (true) {
            System.out.println("Choose an Option to Perform"
                    + "\n1. Add Customer"
                    + "\n2. Serve Customer"
                    + "\n3. Display Queue"
                    + "\n4. Exit");
            System.out.println();
            try {
                System.out.print("Choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Customer name: ");
                        String name = sc.next();
                        q.enqueue(new Customer(name));
                        break;
                    case 2:
                        q.dequeue();
                        break;
                    case 3:
                        q.displayQueue();
                        break;
                    case 4:
                        System.out.println("Thank You for running this simple program!");
                        sc.close();
                }
            }
        }
    }
}

