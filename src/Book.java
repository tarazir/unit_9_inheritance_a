/* Unit 9 - (a)  The PictureBook class is a subclass of the Book class that has one additional attribute:
        a String variable named illustrator that is used to represent the name of the illustrator of a picture book.
        The PictureBook class also contains a printBookInfo method to print the title, writer, and illustrator of a
        picture book
*/

public class Book {

    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public void printBookInfo() {
        System.out.print(title + ", written by " + author);
    }
}
