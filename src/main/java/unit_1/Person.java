package unit_1;

import java.util.Date;

/**
 * @author alex
 * @professor
 * In a class named Person, it is desired to maintain the name, gender, date of birth,
 * and marital status of a certain person. The name, gender, and date of birth should
 * be assigned in the constructor of the class, and the marital status should be set
 * to "single" by default. Gender should be defined as a character ('F' or 'M') and
 * marital status should be defined as a string. Based on this, describe the Java
 * code of the Person class. Complete the types of attributes and parameters.
 **/

public class Person {
    /**
     * TODO PROGRAM IMPLEMENTS.
     * @param x TODO
     * @param y TODO
     * @return z TODO.
     */
    private String name = "";
    private String maritalStatus = "Single";
    private char genre;
    private Date dateOfBirth;
    public void Person(String name, char genre, Date birth) {
        this.name = name;
        this.genre = genre;
        this.dateOfBirth = birth;
    }

    public String getName() {
        return name;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public char getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
