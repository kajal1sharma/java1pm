

class Student{
    private static String schoolName="DPS";
    private int totalmarks;
   


    public static void setTotalmarks(int marks){
        schoolName="dbs";
    }

    
    // public int getTotalmarks() {
    //     return totalmarks;
    // }
    // public void setTotalmarks(int totalmarks) {
    //     this.totalmarks = totalmarks;
    // }




    // public static void setSchoolName(String name){
    //     schoolName=name;
    // }
    // public static String getSchool(){
    //     return schoolName;
    // }
    
    // public void setSchoolName1(String name){
    //     schoolName=name;
    // }
    // public String getSchool1(){
    //     return schoolName;
    // }
}

public class StaticKeyword {
    
    public static void main(String[] args) {

        Student.setTotalmarks();

        Student s1= new Student();
        s1.setTotalmarks(23);
        s1.getTotalmarks();

        // Student.setSchoolName("DBPS");
        // String name= Student.getSchool();


        // Student s1=new Student();
        // s1.setSchoolName("DPS");
        // System.out.println(Student.schoolName);
        // Student s1=new Student();
        // s1.schoolName="BPS";
        // Student s2=new Student();
        // System.out.println(Student.schoolName+" "+s1.schoolName);
        // Student s3=new Student();
    }
}
