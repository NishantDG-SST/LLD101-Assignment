public class StudentProfile {

    private final String rollNumber;
    private final String name;
    private final double cgr;
    private final int attendance;
    private final int credits;
    private final String flag;

    public StudentProfile(String rollNumber, String name,
                          double cgr, int attendance,
                          int credits, String flag) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgr = cgr;
        this.attendance = attendance;
        this.credits = credits;
        this.flag = flag;
    }

    public String getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public double getCgr() { return cgr; }
    public int getAttendance() { return attendance; }
    public int getCredits() { return credits; }
    public String getFlag() { return flag; }
}