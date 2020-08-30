/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {

    private Book[] nameOfBooksIssue;
    private String studentName;
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int noOfBooksIssue;


    public Student(String studentName, String firstName, String middleName, String lastName, long universityRollNumber, int noOfBooksIssue) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.noOfBooksIssue = noOfBooksIssue;
        this.nameOfBooksIssue = new Book[noOfBooksIssue];
        for (int i = 0; i < nameOfBooksIssue.length; i++) {
            nameOfBooksIssue[i] = new Book("book" + (i + 1));
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNoOfBooksIssue() {
        return noOfBooksIssue;
    }

    public void setNoOfBooksIssue(int noOfBooksIssue) {
        this.noOfBooksIssue = noOfBooksIssue;
    }

    public Book[] getNameOfBooksIssue() {
        return nameOfBooksIssue;
    }

    public void setNameOfBooksIssue(Book[] nameOfBooksIssue) {
        this.nameOfBooksIssue = nameOfBooksIssue;
    }

}
