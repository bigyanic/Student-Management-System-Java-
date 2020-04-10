package studentdatabase;
import java.util.Scanner;
public class Student {
    private String firstname;
    private String lastname;
    private int gradeyear;
    private String StudentId;
    private String courses=  null;
    private int tutionbalance=0;
    private static int cost=300;
    private static int id=100;
    public Student(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstname=in.nextLine();
        
        System.out.println("Enter student lastname name");
        this.lastname=in.nextLine();
        		
        System.out.println("1. Freshman \n 2.Secondyear \n 3.Junior \n4.Senior \n Enter student class level");
        this.gradeyear=in.nextInt();
     }
    private void setStudentId() {
        id++;   
    	this.StudentId=gradeyear +""+id;
    }
    public void enroll(){
    	do {
	        System.out.print("Enter the course to enroll(Q to quit): ");
	        Scanner in=new Scanner(System.in);
	        String course=in.nextLine();
	        if (!course.equals("Q")){
	            courses = courses +"\n"+course;
	            tutionbalance=tutionbalance+cost;
	        }
	        else {
	        	
	        	break;}
	        }while(1!=0);
       // System.out.println("enrolled in: " +courses);
        //System.out.println("Tution Balance: "+tutionbalance);
    }
    
    //view balance
    public void viewBalance() {
    	System.out.println("Your Balance is: Rs "+tutionbalance );
    
    }
    
    //pay tution fee
    public void payTution() {
    	System.out.println("Enter your payment");
    	Scanner in=new Scanner(System.in);
    	int payment=in.nextInt();
    	tutionbalance=tutionbalance-payment;
    	System.out.println("Thankyou for yout payment of rs"+payment);
    	viewBalance();
    }
    
    //show status
    public String toString() {
    	return "Name: "+firstname+" "+lastname+"\nGrade Level: "+gradeyear+
    			"\nStudent ID: "+StudentId+"\nCourses Enrolled: "+courses+
    			"\n Balance: Rs "+tutionbalance;
    }
}
