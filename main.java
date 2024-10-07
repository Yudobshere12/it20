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