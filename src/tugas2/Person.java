package tugas2;

import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private String domicile;
    private int birthYear;

    // empty constructor
    public Person() {

    }

    // constructor with parameter
    public Person(String firstName, String lastName, String domicile, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.domicile = domicile;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {
        int year = Year.now().getValue();
        return year - this.birthYear;
    }

    public void getPerson() {
        System.out.println("Full Name: " + this.getFullName());
        System.out.println("Domicile: " + this.domicile);
        System.out.println("Birth Year: " + this.birthYear);
        System.out.println("Age: " + this.getAge() + " years old");
    }

}
