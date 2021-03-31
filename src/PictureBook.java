/* Unit 9 - (a)  The PictureBook class is a subclass of the Book class that has one additional attribute:
 a String variable named illustrator that is used to represent the name of the illustrator of a picture book.
 The PictureBook class also contains a printBookInfo method to print the title, writer, and illustrator of a
 picture book.
 */

public class PictureBook extends Book {

    private String illustrator;

    // Constructor
    public PictureBook(String t, String a, String i ) {
        super(t,a);
        illustrator = i;
    }

    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println(" illustrated by " + illustrator);
    }
}
