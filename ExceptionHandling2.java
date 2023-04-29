
class Student {
    private  int rollNo;
    String name;
    int standard;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int RollNo) throws StudentException{
    
            if(RollNo>30 || RollNo<1){
                throw new StudentException("roll no is not valid"); 
            }
        this.rollNo=RollNo;

    }
}
class StudentException extends Exception{

    StudentException(String msg)
    {
        super(msg);
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    } 

}


public class ExceptionHandling2 {
    public static void main(String[] args) throws StudentException {
        int connection =5;
        Student st =new Student();

        st.setRollNo(31);
    }
}
