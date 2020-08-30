/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    public Book[] nameOfBooksIssue;
    private String studentName;
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int noOfBooksIssueIssue;

    public String getStudentName() {
        return studentName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public int getNoOfBooksIssue() {
        return noOfBooksIssue;
    }

    public Book[] getNameOfBooksIssue() {
        return nameOfBooksIssue;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public void setNoOfBooksIssue(int noOfBooksIssue) {
        this.noOfBooksIssue = noOfBooksIssue;
    }

    public void setNameOfBooksIssue(Book[] nameOfBooksIssue) { this.nameOfBooksIssue = nameOfBooksIssue; }

}
