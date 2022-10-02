
public class City
{
    private University university1;
    private University university2;
    private String name;
    
    public City() {
        university1 = new University();
        university2 = new University(50, 100, 24999.99);
        name = "Greencastle";
    }
    
    public void prinStats() {
        System.out.println("University 1 Summary");
        System.out.println("Number Of Students: " + university1.getNumberOfStudents());
        System.out.println("Number Of Faculty: " + university1.getNumberofFaculty());
        System.out.println("Tuition: $" + university1.tuition());
        
        System.out.println("\nUniversity 2 Summary");
        System.out.println("Number Of Students: " + university2.getNumberOfStudents());
        System.out.println("Number Of Faculty: " + university2.getNumberofFaculty());
        System.out.println("Tuition: $" + university2.tuition());
    }
    
    public void increaseTuition() {
        university1.setTuition(1000 + university1.tuition());
        university2.setTuition(1000 + university2.tuition());
    }
    
    public void setFaculty(int f1, int f2) {
        university1.setNumberOfFaculty(f1);
        university2.setNumberOfFaculty(f2);
    }
}
