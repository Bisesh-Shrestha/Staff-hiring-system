/**
 * A class FullTimeStaffHire is created excending class StaffHire.
 * Getters and setters are used to retrive and update values.
 * @author (Bisesh Shrestha)
 * @version (2020/1/4)
 */
//creating FullTimeStaffHire, which is a subclass of StaffHire
public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workinghour;
    public String staffname;
    public String joiningdate;
    private String qualification;
    private String appointedby;
    private boolean joined;
    //creating constructors
    public FullTimeStaffHire(int vacancynumber, String designation, String jobtype, int salary, int workinghour){
        //inheriting vacancynumber, destination and job type from parentclass: StaffHire
        super(vacancynumber, designation, jobtype);
        this.salary=salary;
        this.workinghour=workinghour;
        this.staffname="";
        this.joiningdate="";
        this.qualification="";
        this.appointedby="";
        this.joined=false;    
    }
    
    public int getsalary(){
        return this.salary;
    }
    
    public int getworkinghour(){
        return this.workinghour;
    }
    
    public String getstaffname(){
        return this.staffname;
    }
    
    public String getjoiningdate(){
        return this.joiningdate;
    }
    
    public String getqualification(){
        return this.qualification;
    }
    
    public String getappointedby(){
        return this.appointedby;
    }
    
    public boolean getjoined(){
        return this.joined;
    }
    
    public void setsalary(int newsalary){
        if (this.joined==true){
           System.out.println("The staff has already joined. You cannot set the salary.");
        }
        else{
            this.salary=newsalary;
        }
    }
   
    public void setworkinghour(int newworkinghour){
        this.workinghour=newworkinghour;
    }
    
    public void HireFullTimeStaff(String staffname, String joiningdate, String qualification, String appointedby){
        if(this.joined== true){
            System.out.println("The Staff is already hired");
            System.out.println("Name of the staff = " +getstaffname());
            System.out.println("Joined date = " +getjoiningdate());
        }
        else{
            this.staffname=staffname;
            this.joiningdate=joiningdate;
            this.qualification=qualification;
            this.appointedby=appointedby;
            this.joined=true;
        }
    }
    //A method is used to display staffname, salary, workinghour, joiningdate, qualification and appointedby.
    
    public void display(){
        super.display();
        if(this.joined==true){
            System.out.println("Name of the staff = " +getstaffname());
            System.out.println("Salary of the staff = " +getsalary());
            System.out.println("Number of hours worked = " +getworkinghour());
            System.out.println("Joined dated = " +getjoiningdate());
            System.out.println("Qualification = " +getqualification());
            System.out.println("Appointed by = " +getappointedby());
        }
    }
}