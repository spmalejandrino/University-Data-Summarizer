
/**
 @author (Sy Alejandrino)

 */public class University
{
    // Declaring instance variables 
    private int numberOfStudents;
    private int numberOfFaculty;
    private double tuition;

    /**
     * Constructors for the class University
     */
    public University()
    { 
        numberOfStudents= 2300;
        numberOfFaculty= 1000;
        tuition= 60000 ;
    }
        
    public University(int s, int f, double t)
    {
        numberOfStudents= s;
        numberOfFaculty= f;
        tuition= t;
        
    }
    
    /**
     * Mutator methods
     */
    public void setNumberOfStudents(int newNumberS)
    { 
        numberOfStudents=newNumberS;
    }
    
    public void setNumberOfFaculty(int newNumberF)
    { 
        numberOfFaculty=newNumberF;
    }
    
    public void setTuition( double newTuition)
    { 
        tuition=newTuition;
    }
    
    /**
     * Accessor methods
     */
    public int getNumberOfStudents()
    {
        return numberOfStudents;
    
    }
    public int getNumberofFaculty()
    { 
        return numberOfFaculty;
    }
    public double tuition()
    {
        return tuition;
    }
    
}
