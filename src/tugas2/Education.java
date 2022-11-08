package tugas2;

public class Education {
    private String schoolName;
    private int startYear;
    private int endYear;

    // empty constructor
    public Education() {

    }

    // constructor with parameter
    public Education(String schoolName, int startYear, int endYear) {
        this.schoolName = schoolName;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getDuration() {
        return this.endYear - this.startYear;
    }

    public void getEducation() {
        System.out.println(this.schoolName);
        System.out.println("Year: " + this.startYear + "-" + this.endYear);
        System.out.println("Length of Time: " + this.getDuration() + " year \n");
    }
}
