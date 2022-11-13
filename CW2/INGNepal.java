/**
 * Creating GUI for staff hire..
 *
 * @author (Bisesh Shrestha)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.*;

public class INGNepal implements ActionListener{ 
    private JFrame frame;   
    private JButton fButton, pButton,f2Button, p2Button, bTerminate, bClear, bDisplay;
    private JLabel fullTime, partTime, lVacancyNumber, lDesignation, lJobType, lSalary, lWorkingHour,
            lpVacancyNumber, lpDesignation, lpJobType, lpWorkingHour, lpWagesPerHour,lpShift,
            l2VacancyNumber,lJoiningDate,lStaffName, lQualification, lAppointedBy,
            lp2VacancyNumber, lpJoiningDate, lpStaffName, lpQualification, lpAppointedBy,
            lTerminate;
    private JTextField tVacancyNumber, tDesignation, tSalary, tWorkingHour,
            tpVacancyNumber, tpDesignation, tpWorkingHour, tpWagesPerHour,tpShift,
            t2VacancyNumber,tJoiningDate,tStaffName, tQualification, tAppointedBy,
            tp2VacancyNumber, tpJoiningDate, tpStaffName, tpQualification, tpAppointedBy,
            tTerminate;       
    private JComboBox cmbJobType,cmbJobType2;
    
    ArrayList<StaffHire> list=new ArrayList<StaffHire>();
    public static void main(String []args){
       new INGNepal().StaffHireForm();
    }
    
    public void StaffHireForm(){        
        frame = new JFrame("Staff Hire");
        frame.setSize(680,480);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fullTime= new JLabel("Full time staff hire");
        fullTime.setBounds(90,5,500,50);
        Font font= new Font("Arial",Font.BOLD,20);
        fullTime.setFont (font);
        frame.add(fullTime);         
        
        lVacancyNumber= new JLabel("Vacancy Number");
        lVacancyNumber.setBounds(20,50,100,50);
        tVacancyNumber= new JTextField();
        tVacancyNumber.setBounds(125,70,50,20);        
        frame.add(lVacancyNumber);
        frame.add(tVacancyNumber);  
        
        
        lJobType= new JLabel("Job types");
        lJobType.setBounds(20,80,100,50);        
        String jobType[]={"FullTime", "PartTime"};
        cmbJobType=new JComboBox(jobType);
        cmbJobType.setBounds(80,100,70,20);
        frame.add(lJobType);
        frame.add(cmbJobType);
        
        lWorkingHour= new JLabel("Working hour");
        lWorkingHour.setBounds(160,80,100,50);
        tWorkingHour= new JTextField();
        tWorkingHour.setBounds(250,100,70,20);
        frame.add(lWorkingHour);
        frame.add(tWorkingHour);
        
        lSalary= new JLabel("Salary");
        lSalary.setBounds(200,50,100,50);
        tSalary=new JTextField();
        tSalary.setBounds(250,70,70,20);
        frame.add(lSalary);
        frame.add(tSalary);
        
        lDesignation= new JLabel("Designation");
        lDesignation.setBounds(70,110,100,50);
        tDesignation= new JTextField();
        tDesignation.setBounds (150,130,100,20);
        frame.add(lDesignation);
        frame.add(tDesignation);
        
        fButton= new JButton ("Add Full Time Staff");
        fButton.setEnabled(true);
        fButton.setBounds(100,160,150,30);
        fButton.addActionListener(this);
        frame.add(fButton);
        
        partTime= new JLabel("Part time staff hire");
        partTime.setBounds(410,5,500,50);
        font= new Font("Arial",Font.BOLD,20);
        partTime.setFont (font);
        frame.add(partTime);
        
        lpVacancyNumber= new JLabel("Vacancy Number");        
        lpVacancyNumber.setBounds(350,50,100,50);
        tpVacancyNumber= new JTextField();
        tpVacancyNumber.setBounds(450,70,50,20);        
        frame.add(lpVacancyNumber);
        frame.add(tpVacancyNumber);
        
        lpJobType= new JLabel("Job types");
        lpJobType.setBounds(350,80,100,50);        
        String jobType2[]={"PartTime", "FullTime"};
        cmbJobType2=new JComboBox(jobType2);
        cmbJobType2.setBounds(420,100,70,20);        
        frame.add(lpJobType);
        frame.add(cmbJobType2);
        
        lpDesignation= new JLabel("Designation");
        lpDesignation.setBounds(350,110,100,50);
        tpDesignation= new JTextField();
        tpDesignation.setBounds (420,130,80,20);
        frame.add(lpDesignation);
        frame.add(tpDesignation);
        
        lpWagesPerHour= new JLabel("Wage per hr");
        lpWagesPerHour.setBounds(520,50,100,50);
        tpWagesPerHour=new JTextField();
        tpWagesPerHour.setBounds(600,70,50,20);
        frame.add(lpWagesPerHour);
        frame.add(tpWagesPerHour);
        
        lpWorkingHour= new JLabel("Working hour");
        lpWorkingHour.setBounds(500,80,100,50);
        tpWorkingHour= new JTextField();
        tpWorkingHour.setBounds(580,100,70,20);
        frame.add(lpWorkingHour);
        frame.add(tpWorkingHour);
        
        lpShift= new JLabel("Shift");
        lpShift.setBounds(520,110,100,50);
        tpShift= new JTextField();
        tpShift.setBounds(560,130,90,20);
        frame.add(lpShift);
        frame.add(tpShift);
        
        pButton= new JButton ("Add Part Time Staff");
        pButton.setEnabled(true);
        pButton.setBounds(430,160,150,30);
        pButton.addActionListener(this);
        frame.add(pButton);
        
        l2VacancyNumber= new JLabel("Vacancy Number");     
        l2VacancyNumber.setBounds(20,200,100,50);
        t2VacancyNumber= new JTextField();
        t2VacancyNumber.setBounds(125,220,30,20);
        frame.add(l2VacancyNumber);
        frame.add(t2VacancyNumber);
        
        lJoiningDate= new JLabel("Joining Date");
        lJoiningDate.setBounds(160,200,100,50);
        tJoiningDate= new JTextField();
        tJoiningDate.setBounds(240,220,80,20);
        frame.add(lJoiningDate);
        frame.add(tJoiningDate);
        
        lStaffName= new JLabel("Staff Name");
        lStaffName.setBounds(20,230,100,50);
        tStaffName= new JTextField();
        tStaffName.setBounds(100,250,220,20);
        frame.add(lStaffName);
        frame.add(tStaffName);
        
        lQualification= new JLabel("Qualification");
        lQualification.setBounds(20,260,100,50);
        tQualification= new JTextField("");
        tQualification.setBounds(100,280,50,20);
        frame.add(lQualification);
        frame.add(tQualification);
        
        lAppointedBy= new JLabel("Appointed By");
        lAppointedBy.setBounds(160,260,100,50);
        tAppointedBy= new JTextField();
        tAppointedBy.setBounds(240,280,80,20);
        frame.add(lAppointedBy);
        frame.add(tAppointedBy);
        
        f2Button= new JButton ("Appoint Full Time Staff");
        f2Button.setEnabled(true);
        f2Button.setBounds(70,340,200,30);
        f2Button.addActionListener(this);
        frame.add(f2Button);
        
        lp2VacancyNumber= new JLabel("Vacancy Number");       
        lp2VacancyNumber.setBounds(350,200,100,50);
        tp2VacancyNumber= new JTextField();
        tp2VacancyNumber.setBounds(450,220,30,20);        
        frame.add(lp2VacancyNumber);
        frame.add(tp2VacancyNumber);
       
        lpStaffName= new JLabel("Staff Name");
        lpStaffName.setBounds(350,230,100,50);
        tpStaffName= new JTextField();
        tpStaffName.setBounds(420,250,220,20);
        frame.add(lpStaffName);
        frame.add(tpStaffName);
        
        lpQualification= new JLabel("Qualification");
        lpQualification.setBounds(350,260,100,50);
        tpQualification= new JTextField();
        tpQualification.setBounds(430,280,50,20);
        frame.add(lpQualification);
        frame.add(tpQualification);
        
        lpJoiningDate= new JLabel("Joining Date");
        lpJoiningDate.setBounds(490,200,100,50);
        tpJoiningDate= new JTextField();
        tpJoiningDate.setBounds(570,220,80,20);
        frame.add(lpJoiningDate);
        frame.add(tpJoiningDate);
        
        lpAppointedBy= new JLabel("Appointed By");
        lpAppointedBy.setBounds(490,260,100,50);
        tpAppointedBy= new JTextField();
        tpAppointedBy.setBounds(570,280,80,20);
        frame.add(lpAppointedBy);
        frame.add(tpAppointedBy);
        
        lTerminate=new JLabel("Terminate Number");
        lTerminate.setBounds(350,290,120,50);
        tTerminate= new JTextField();
        tTerminate.setBounds(460,310,80,20);
        frame.add(lTerminate);
        frame.add(tTerminate);
        
        bTerminate= new JButton ("Terminate");
        bTerminate.setEnabled(true);
        bTerminate.setBounds(550,310,100,20);
        bTerminate.addActionListener(this);
        frame.add(bTerminate);
        
        p2Button= new JButton ("Appoint Part Time Staff");          
        p2Button.setEnabled(true);
        p2Button.setBounds(410,340,200,30);
        p2Button.addActionListener(this);
        frame.add(p2Button);
        
        bClear= new JButton ("Clear");
        bClear.setEnabled(true);
        bClear.setBounds(20,380,300,35);
        bClear.addActionListener(this);
        frame.add(bClear);
        
        bDisplay= new JButton ("Display");
        bDisplay.setEnabled(true);
        bDisplay.setBounds(350,380,300,35);
        bDisplay.addActionListener(this);
        frame.add(bDisplay);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==fButton ) {          
            int vno=0, salary=0, workingHour=0;            
            String jobType="", designation="";
            try{
                vno=Integer.parseInt(tVacancyNumber.getText());
                designation=tDesignation.getText();
                salary=Integer.parseInt(tSalary.getText());
                workingHour=Integer.parseInt(tWorkingHour.getText());
                jobType=(cmbJobType.getSelectedItem()).toString();                
                boolean dupliVno=false;
                for (StaffHire var: list ){
                    if(var.getvacancynumber()==vno){
                        dupliVno=true;
                        break;
                    }
                }
                if(dupliVno==false){    
                    FullTimeStaffHire obj=new FullTimeStaffHire(vno, designation,jobType,salary,workingHour);
                    list.add(obj);
                    JOptionPane.showMessageDialog(frame,list.size() + " Vacancy added to Full time staff ");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Inputted vacancy number is already in Full time staff list "+list.size()); 
                }                
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(frame,"The given input in Full time staff hire is invalid. ");                
            }
        }   
        if (e.getSource()==pButton) {            
            int vno=0, wagesPerHour=0, workingHours=0;
            String jobType="", designation="", shift="";
            try{
                vno=Integer.parseInt(tpVacancyNumber.getText()); 
                jobType=(cmbJobType2.getSelectedItem()).toString();
                designation=tpDesignation.getText();
                wagesPerHour=Integer.parseInt(tpWagesPerHour.getText());
                workingHours=Integer.parseInt(tpWorkingHour.getText());                
                shift=tpShift.getText();
                boolean dupliVno=false;

                for(StaffHire var:list){
                   if(var.getvacancynumber()==vno){
                        dupliVno=true;
                        break; 
                   }            
                }
                if(dupliVno==false){
                    PartTimeStaffHire obj=new PartTimeStaffHire(vno,designation,jobType,workingHours,wagesPerHour,shift);
                    list.add(obj);
                    JOptionPane.showMessageDialog(frame,list.size()+" Vacancy added to Part Time Staff ");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Inputted vacancy number is already in Part Time staff hire list. "+list.size()); 
                }      
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(frame,"The given input in part time staff hire is invalid. ");                
            }
        }   
        if(e.getSource()==bTerminate){
            int vno=Integer.parseInt(tTerminate.getText());
            boolean findVno=false;
            for(StaffHire obj:list){
                if(obj.getvacancynumber()==vno){
                    findVno=true;
                    if(obj instanceof PartTimeStaffHire){
                        ((PartTimeStaffHire)obj).terminatestaff();
                        JOptionPane.showMessageDialog(frame,"The staff has been terminated");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Vacancy number should be of Part time staff");
                    }
                    break;
                }
            }
            if(findVno==false){
                JOptionPane.showMessageDialog(frame,"Vacancy Number is not valid");            
            }
        }
        if(e.getSource()==bClear){
            tVacancyNumber.setText("");
            tSalary.setText("");
            cmbJobType.setSelectedIndex(0);
            tWorkingHour.setText("");
            tDesignation.setText("");
            tpVacancyNumber.setText("");
            tpDesignation.setText("");
            tpWorkingHour.setText("");
            tpWagesPerHour.setText("");
            tpShift.setText("");              
            cmbJobType2.setSelectedIndex(0);
            t2VacancyNumber.setText("");
            tJoiningDate.setText("");
            tStaffName.setText("");
            tQualification.setText("");
            tAppointedBy.setText("");
            tp2VacancyNumber.setText("");
            tpJoiningDate.setText("");
            tpStaffName.setText("");
            tpQualification.setText("");
            tpAppointedBy.setText("");
            tTerminate.setText("");
        }
        if(e.getSource()==bDisplay){            
            for(StaffHire obj:list){
                if(obj instanceof FullTimeStaffHire){
                    ((FullTimeStaffHire)obj).display();                
                }
                if(obj instanceof PartTimeStaffHire){
                    ((PartTimeStaffHire)obj).display();
                }            
            }
        } 
        if(e.getSource()==f2Button){
            try{
                int vno=Integer.parseInt(t2VacancyNumber.getText());
                String staffName=tStaffName.getText();
                String joiningDate=tJoiningDate.getText();
                String qualification=tQualification.getText();
                String appointedBy=tAppointedBy.getText();
                boolean vnoFound=false;
                for(StaffHire obj:list){
                    if(obj.getvacancynumber()==vno){
                        vnoFound=true;
                        if(obj instanceof FullTimeStaffHire){
                            FullTimeStaffHire h=(FullTimeStaffHire)obj;
                            if(h.getjoined()==true){
                                JOptionPane.showMessageDialog(frame,"This Full thime staff has already been hired");
                            }else{
                               h.HireFullTimeStaff(staffName,joiningDate,qualification,appointedBy);
                               JOptionPane.showMessageDialog(frame,"Full time staff has been hired");
                               break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame,"Cannot appoint Part time staff from here");
                            break;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Invalid vacancy");                        
                    }
                }
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(frame,"Invalid input"); 
            }            
        }
                           
        if(e.getSource()==p2Button){
            try{
                int vno=Integer.parseInt(tp2VacancyNumber.getText());
                String staffName=tpStaffName.getText();
                String joiningDate=tpJoiningDate.getText();
                String qualification=tpQualification.getText();
                String appointedBy=tpAppointedBy.getText();
                boolean vnoFound=false;
                for(StaffHire obj:list){
                    if(obj.getvacancynumber()==vno){
                        vnoFound=true;
                        if(obj instanceof PartTimeStaffHire){
                            PartTimeStaffHire p=(PartTimeStaffHire)obj;
                            if(p.getjoined()==true){                                
                                JOptionPane.showMessageDialog(frame,"This Part time staff has already been hired");
                            }else{
                                p.HirePartTimeStaff(staffName,joiningDate,qualification,appointedBy);
                                JOptionPane.showMessageDialog(frame,"Part time staff has been hired");
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame,"Cannot appoint Full time staff from here");
                            break;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Invalid vacancy");                       
                    }
                }
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(frame,"Invalid input");                
            }
        }
    }
}

