package studentdatabase;

import java.util.Scanner;



public class Student {
    private String firstname;
    private String lastname;
    private int gradeyear;
    private String studentid;
    private String courses;
    private int tutionbalance=0;
    private int cost=30000;
    private static int id=1001;
    
    
    public Student(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstname=in.nextLine();
        
        System.out.println("Enter student lastname name");
        this.lastname=in.nextLine();
        		
        System.out.println("1. Freshman \n 2.Secondyear \n 3.Junior \n4.Senior \n Enter student class level");
        this.gradeyear=in.nextLine();
        System.out.println(firstname+" "+lastname + " gradeYear");
        
            
    }
    private void setstudentid() {
        id++;   
    	this.studentid=gradeyear +" "+id;
    	
    }

    public void enroll(){
        System.out.println("Enter the course to enroll(0 to quit): ");
        Scanner in=new Scanner(System.in);
        String course=in.nextline();
        if (course !="Q"){
            courses = courses +"\n"+course;
            tutionbalance=tutionbalance+cost;
        }
        System.out.println("enrolled in: " +courses);
        System.out.println("Tution Balance: "+tutionbalance);
    }
}