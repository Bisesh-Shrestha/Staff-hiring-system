/**
 * A class StaffHire is created and parameters vacancynumber, designation and jobtype are used.
 * Accessor and Mutators methods i.e. getters asnd setters are used to retrive and update values.
 * @author (Bisesh Shrestha)
 * @version (2020/1/4)
 */
public class StaffHire{
    private int vacancynumber;
    private String designation;
    private String jobtype;
    //creating constructor StaffHire
    public StaffHire(int vacancynumber, String designation, String jobtype){
        this.vacancynumber=vacancynumber;
        this.designation=designation;
        this.jobtype=jobtype;
    }   
    public int getvacancynumber(){
        return vacancynumber;
    }
    public String getdesignation(){
        return designation;
    }
    public String getjobtype(){
        return jobtype;
    }
    public void setvacancynumber(int vacancynumber){
        this.vacancynumber=vacancynumber;
    }
    public void setdesignation(String designation){
        this.designation=designation;
    }
    public void setjobtype(String jobtype){
        this.jobtype=jobtype;
    }
    /** 
    A method display is used to display the Vacancynumber, Designation and Jobtype
    **/
    public void display(){
        System.out.println("Vacancy number = "+this.getvacancynumber());
        System.out.println("Designation = "+this.getdesignation());
        System.out.println("Job type = "+this.getjobtype());
    }
}