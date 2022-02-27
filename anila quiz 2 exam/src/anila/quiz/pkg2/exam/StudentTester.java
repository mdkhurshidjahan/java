
public class Student {
 
   private String name;
   private String address;
   private int numCourses=0;
   private String[] courses=new String[30];
   private int[] grades=new int[30];
  
   Student(String name,String address) {
       this.name=name;
       this.address=address;
   }
  
   public String getName() {
       return name;
   }
   public String getAddress() {
       return address;
   }
   
   public void setAddress(String address) {
       this.address = address;
   }
   @Override
   public String toString() {
       return name + "("+address+")";
   }
   //Add a new couse
   public void addCourse(String course,int grade) {
       if(numCourses<courses.length) {
           courses[numCourses]=course;
           grades[numCourses]=grade;
           numCourses++;
       }
       else {
           System.out.println("Already filled!!!");
       }
   }

   public void printGrades() {
       if(numCourses>0) {
           System.out.print(name+" "+courses[0]+":"+grades[0]);
           for(int i=1;i<numCourses;i++) {
               System.out.print(", "+courses[i]+":"+grades[i]);
           }
           System.out.println();
       }
       else {
           System.out.println("No courses added!!!");
       }
   }
  
   public double getAverage() {
       double avg=0;
       for(int i=0;i<numCourses;i++) {
           avg+=grades[i];
       }
       return avg/numCourses;
   }
}

StudentTester.java


public class StudentTester {

   public static void main(String[] args) {
  
       Student s1=new Student("S1","A1");
       Student s2=new Student("S2","A2");
       Student s3=new Student("S3","A3");
 
       System.out.println("toString method check: "+s1);
      
       s2.setAddress("102,y city");
       System.out.println("Set and Get address check: "+s2.getAddress());
       
       System.out.println("Name check: "+s3.getName());
       
       s3.addCourse("C1", 78);
       s3.addCourse("C2", 92);
     
       System.out.println("Print grades:");
       s3.printGrades();
     
       System.out.println("Average: "+String.format("%.2f", s3.getAverage()));
   }
}