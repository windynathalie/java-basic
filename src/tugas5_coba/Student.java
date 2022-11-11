package tugas5_coba;

import java.util.List;

import tugas5_coba.interfaceclass.StudentInterface;

public class Student extends Person implements StudentInterface {
    private List<Integer> credits;
    private List<String> courseName;
    private List<String> room;
    private int totalCredits;

    public Student() {

    }

    public Student(String fullName, String domicile, String identityCard) {
        super(fullName, domicile, identityCard);
    }

    public List<Integer> getCredits() {
        return credits;
    }

    public void setCredits(List<Integer> credits) {
        this.credits = credits;
    }

    public List<String> getCourseName() {
        return courseName;
    }

    public void setCourseName(List<String> courseName) {
        this.courseName = courseName;
    }

    public List<String> getRoom() {
        return room;
    }

    public void setRoom(List<String> room) {
        this.room = room;
    }

    public int getTotalCredits() {
        totalCredits = 0;
        for (Integer credit : credits) {
            totalCredits += credit;
        }
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    @Override
    public void getSummary() {
        System.out.println("Student Name: " + super.getFullName());
        System.out.println("\nList of Courses Selected:");
        for (int i = 0; i < credits.size(); i++) {
            System.out.println("\n" + courseName.get(i));
            System.out.println("Credits: " + credits.get(i));
            System.out.println("Room: " + room.get(i));
        }
        if (totalCredits >= 144) {
            System.out.println("\n" + super.getFullName()
                    + " have completed the course with a total credit = " + getTotalCredits());
        } else {
            System.out.println("\n" + super.getFullName()
                    + " need " + (144 - getTotalCredits())
                    + " more credits complete this course!");
        }
    }

    @Override
    public void studentRegistration(String fullName, String identityCard) {
        System.out.println("Registration Success!");
        System.out.println("Student Name: " + fullName);
        System.out.println("Student Identity Number: " + identityCard);
    }

    @Override
    public void learningPlan(List<String> courseName, List<Integer> credits, List<String> room) {
        setCredits(credits);
        setCourseName(courseName);
        setRoom(room);
        System.out.println("\nTotal Credits = " + getTotalCredits());
        if (totalCredits >= 144) {
            setFullName(getFullName() + " S.T.");
        }
    }

    @Override
    public void print() {
        System.out.println("Your Personal Information");
        System.out.println("Student Name: " + super.getFullName());
        System.out.println("Student Identity Number: " + super.getIdentityCard());
        System.out.println("Domicile: " + super.getDomicile());
    }
}
