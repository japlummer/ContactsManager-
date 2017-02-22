package com.novauc;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JacobP on 2/13/17.
 */
public class ToDo {

    public static void main(String [] args) {

        ArrayList<ToDoItem> items = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("1. Create a to-do item");
            System.out.println("2. Toggle to-do item");
            System.out.println("3. List to-do items");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter your to-do item: ");
                String text = scanner.nextLine();

                ToDoItem item = new ToDoItem(text, false);
//              we call the ToDoItem class so we can add new item to ArrayList
                items.add(item);

            }

            else if(option.equals("2")) {
                System.out.println("Enter the number of the item you want to toggle: ");
                int itemNum = Integer.valueOf(scanner.nextLine());

                ToDoItem item = items.get(itemNum - 1);
                //         We use -1 because ArrayList starts at 0

                item.isDone = !item.isDone;

            }

            else if (option.equals("3")) {
                int i = 1;
                for (ToDoItem item : items) {
                    //           item is the particular item being worked on. items is the variable for the entire list of items.

                    String checkbox = "[] ";
                    if (item.isDone) {
                        checkbox = "[x] ";
                    }
                    System.out.printf("%S %S. %S\n", checkbox, i, item.text);
                    i++;
                }
            }
            else{
                System.out.println("Invalid Option");

            }
        }



    }

}
