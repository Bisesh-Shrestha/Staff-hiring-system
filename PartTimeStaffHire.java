/**
 * A class PartTimeStaffHire is created extending StaffHire.
 * Getters and setters are used to retrive and update values.
 * @author (Bisesh Shrestha)
 * @version (2020/1/4)
 */

public class PartTimeStaffHire extends StaffHire{
    private int workinghour;
    private int wage_perhour;
    private String staffname;
    private String joiningdate;
    private String qualification;
    private String appointedby;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    
    // The constructor PartTimeStaffHire has 6 parameters i.e. vacancynumber, degnation, jobtype, workinghour,wage_perhour and shifts. 
    public PartTimeStaffHire(int vacancynumber, String designation, String jobtype, int workinghour, int wage_perhour, String shifts){
        super(vacancynumber, designation, jobtype);
        this.workinghour=workinghour;
        this.wage_perhour=wage_perhour;
        this.shifts=shifts;
        this.staffname="";
        this.joiningdate="";
        this.appointedby="";
        this.joined=false;
        this.terminated=false;
    }
    //The get method and set method are created to retrive and update values
    public int getworkinghour(){
        return this.workinghour;
    }
    
    public int getwage_perhour(){
        return this.wage_perhour;
    }
    
    public String getshifts(){
        return this.shifts;
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
    
    public boolean getterminated(){
        return this.terminated;
    }
    
    public void setshifts(String shifts){       
        if (this.joined== true){
            System.out.println ("You cannot set new shift as the staff is already hired");
        }
        else{
             this.shifts = shifts;            
        }            
    }
    
    public void HirePartTimeStaff(String staffname, String joiningdate, String qualification, String appointedby){
        if (this.joined==true){
            System.out.println("The staff is already hired");
            System.out.println("Name of the staff = " +getstaffname());
            System.out.println("Staff's joined date = " +getjoiningdate());
        }
        else{
            this.staffname=staffname;
            this.joiningdate=joiningdate;
            this.qualification=qualification;
            this.appointedby=appointedby;
            this.joined=true;
            this.terminated=false;
        }
    }
    
    public void terminatestaff(){
        if(this.terminated ==true){
            System.out.println("This Staff is already fired");
        }
        else{
            this.staffname="";
            this.joiningdate="";
            this.qualification="";
            this.appointedby="";
            this.joined=false;
            this.terminated=true;
        }
    }
    
    // A method is used to display staffname, wage_perhour, workinghour, joiningdate, qualification, appointedby and income earned per day
    public void display(){
        super.display();
        if(this.joined==true){
            System.out.println("Name of the staff = "+getstaffname());
            System.out.println("Wages per hour = "+getwage_perhour());
            System.out.println("Hour Worked by Staff = "+getworkinghour());
            System.out.println("Staff join date = "+getjoiningdate());
            System.out.println("Qualification = "+getqualification());
            System.out.println("Staff appointed by = "+getappointedby());
            System.out.println("Income earned per day = "+(this.getwage_perhour()*this.getworkinghour()));
        }
    }
}