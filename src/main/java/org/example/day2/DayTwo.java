package org.example.day2;
import org.example.day2.library.Book;
public class DayTwo {

    public static void main(String[] args) {
        String hello = new String("bolu");
        System.out.println("This  is the first: "+ hello +  "this is the constructor " +new String("I am the second hello"));

Book libraryBook = new Book();
libraryBook.setName("Bat");
        System.out.println(libraryBook.getName());
    }
}
