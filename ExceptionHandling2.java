
class Student {
    int rollNo;
    String name;
    int standard;

}
class StudentException extends Exception{

    StudentException(String msg)
    {
        super(msg);
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage()+"this message is overriden";
    } 

}


public class ExceptionHandling2 {
    public static void main(String[] args) {
        int connection =5;
        try{
            
            connection++;
            if(connection>5){
                Exception e= new StudentException("student exception");
                throw(e);
            }
            else{

            }

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            connection=0;
        }
    }
}
