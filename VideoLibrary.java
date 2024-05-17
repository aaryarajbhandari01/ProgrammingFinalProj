
//managing video records and implementing various
//functionalities like adding, borrowing, modifying,
//and deleting videos

import java.util.ArrayList;
import java.util.Scanner;

public class VideoLibrary {

    // declaring array list for Movie object
    private ArrayList<Movie> movies;
    Scanner scan= new Scanner(System.in);

    // Constructor and methods for managing video records
    public VideoLibrary(){
        movies = new ArrayList<>();
    }
    // Menu
    public void displayMenu()
    {

        // Displaying menu
        System.out.println("-".repeat(60));
        System.out.println("\n\t\t Video Library System \n");
        System.out.println("\t Welcome to Library Management System \n \n");
        System.out.println("Menu: \n");
        System.out.println("Enter 1: To Add a movie.");
        System.out.println("Enter 2: To Borrow a movie.");
        System.out.println("Enter 3: To Update a movie.");
        System.out.println("Enter 4: To Delete a movie.");
        System.out.println("Enter 5: To Search a movie.");
        System.out.println("Enter 6: To Show All Available Movies.");
        System.out.println("Enter 0: To Exit.");
        System.out.println("-".repeat(60));

}

   // compare movies

   // add movies
   public void addMovie(){
     System.out.print("Enter Movie ID:");
     int mId = scan.nextInt();
     scan.nextLine(); // Consume newline character
     System.out.print("Enter Movie Title: ");
     String movieName = scan.nextLine();
     System.out.print("Enter Director Name: ");
     String directorName = scan.nextLine();

     System.out.print("Enter Quantity of Movie: ");
     int qty = scan.nextInt();

     Movie movie = new Movie(mId, movieName, directorName, qty);
     movies.add(movie);
     System.out.print("Movie has been added successfully!");
   }

   



   // update movie
   public void updateMovie(){

   }

   // remove movie
   public void deleteMovie(){

   }

   // display all movie list
   public void viewAllMovie(){

   }

   // display available movie list
   public void viewAllMovie(){

   }

   // search movie
   public void searchMovie(){

   }

   // borrow movie
   public void borrowMovie(){

   }

   // return movie
   public void returnMovie(){

   }







}
