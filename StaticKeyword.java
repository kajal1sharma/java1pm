

class Student{
    private static String schoolName="DPS";
    int totalmarks;
   
    public static void setSchoolName(String name){
        schoolName=name;
    }
    public static String getSchool(){
        return schoolName;
    }
    
    public void setSchoolName1(String name){
        schoolName=name;
    }
    public String getSchool1(){
        return schoolName;
    }
}

public class StaticKeyword {
    
    public static void main(String[] args) {
        Student.setSchoolName("DBPS");
        String name= Student.getSchool();


        Student s1=new Student();
        s1.setSchoolName("DPS");
        // System.out.println(Student.schoolName);
        // Student s1=new Student();
        // s1.schoolName="BPS";
        // Student s2=new Student();
        // System.out.println(Student.schoolName+" "+s1.schoolName);
        // Student s3=new Student();
    }
}
