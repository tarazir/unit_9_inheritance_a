/* Unit 9 - (a)  The PictureBook class is a subclass of the Book class that has one additional attribute:
        a String variable named illustrator that is used to represent the name of the illustrator of a picture book.
        The PictureBook class also contains a printBookInfo method to print the title, writer, and illustrator of a
        picture book.
*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Unit 9 - Inheritance - Part (a)
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();

        // Unit 9 - Inheritance - Part (b)
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);

        // Unit 9 - Inheriatnce - Part (c)
        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();
        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();


    }


}
