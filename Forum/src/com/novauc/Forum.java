package com.novauc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JacobP on 2/16/17.
 */
public class Forum {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Post> posts = new ArrayList<>();

        //read all posts into our data structure
        File f = new File("posts.txt"); // used to import file
        Scanner fileScanner = new Scanner(f); // used to read the file


        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            String[] columns = line.split("\\|");

            Post post = new Post(Integer.valueOf(columns[0]), columns[1], columns[2]);

            posts.add(post);

        }

        Scanner consoleScanner = new Scanner(System.in);

        int replyId = -1;
        while (true) {
            //loop over posts and print posts with the right replyId
            int id = 0;

            for (Post post : posts) {
                if (post.replyId == replyId) {

                    System.out.printf("(%d) %s by %s\n", id, post.text, post.author);

                }
                id++;
            }


            //as the user to type in a reply id
            System.out.println("Type the id you want to see replies to: ");
            replyId = Integer.valueOf(consoleScanner.nextLine());


        }

    }




}
