/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String nameOfBookAuthor;
    private String ISBNNumber;

    public Book() {
        this.bookName = "";
        this.nameOfBookAuthor = "";
        this.ISBNNumber = "";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getNameOfBookAuthor() {
        return nameOfBookAuthor;
    }

    public void setNameOfBookAuthor(String nameOfBookAuthor) {
        this.nameOfBookAuthor = nameOfBookAuthor;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) { this.ISBNNumber = ISBNNumber; }
}