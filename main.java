package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        
        // Adding initial dog name
        list.add("waki");
        list.add("kilua");
        list.add("blacky");
        list.add("browny");
        list.add("doggy");
        boolean running = true;
        while (running) {
            System.out.println("\nCurrent dog name:");
            System.out.println("----------------------------");
            list.Showlist();

            System.out.println("----------------------------");
            System.out.println("Choose an option:");
            System.out.println("1. Add a dog name");
            System.out.println("2. Delete a dog name");
            System.out.println("3. Move or Swap a dog name");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

             switch (choice) {
                case 1:
                    System.out.print("Enter the song title to add: ");
                    String songToAdd = sc.nextLine();
                    list.add(songToAdd);
                    System.out.println("Song added.");
                    break;
                    
                     case 2:
                    System.out.print("Enter the song title to delete: ");
                    String songToDelete = sc.nextLine();
                    System.out.print("Are you sure you want to delete \"" + songToDelete + "\"? (yes/no): ");
                    String confirmation = sc.nextLine();
                    if (confirmation.equalsIgnoreCase("yes")) {
                        list.deleteByValue(songToDelete);
                        System.out.println("Song deleted.");
                    } else {
                        System.out.println("Deletion canceled.");
                    }
                    break;
                    
                case 3: // Move or Swap
                    System.out.print("Enter the first index: ");
                    int index1 = sc.nextInt();
                    System.out.print("Enter the second index: ");
                    int index2 = sc.nextInt();
                    System.out.print("Do you want to swap? (yes/no): ");
                    String confirm = sc.next();
                    boolean swap = confirm.equalsIgnoreCase("yes");
                    list.moveOrSwapNodes(index1, index2, swap);
                    System.out.println(swap ? "Songs swapped." : "dog name moved.");
                    break;

                    case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
        System.out.println("ogim!");
        
        }
}
    