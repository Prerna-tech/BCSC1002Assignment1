/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import  java.util.Arrays;

public class Library {
    private Book[] currentlyAvailable;

    public Library() {
        this.currentlyAvailable = new Book[10];
        for (int i = 0; i < currentlyAvailable.length; i++) {
            currentlyAvailable[i] = new Book("Book" + (i + 1));
        }
    }
    public Book[] getCurrentlyAvailable() { return currentlyAvailable; }

    public void setCurrentlyAvailable(Book[] currentlyAvailable) { this.currentlyAvailable = currentlyAvailable; }


}
