public class nestedIfElse {
    public static void main(String[] args) {
        System.out.println("hello world");

        boolean raining=false;
        boolean umbrella =false;
        boolean raincoat =false;
        boolean breakfast =false;
        boolean lunchbox = true;



        if(raining==true){
            if(umbrella==true){
                if(breakfast==true){
                    System.out.println("go to school");
                }
                else{
                    if(lunchbox==true){
                        System.out.println("go to school");
                    }
                    else{
                        System.out.println("dont go to school");
                    }
                }
            }
            else{
                if(raincoat==true){
                    if(breakfast==true){
                        System.out.println("go to school");
                    }
                    else{
                        if(lunchbox==true){
                            System.out.println("go to school");
                        }
                        else{
                            System.out.println("dont go to school");
                        }
                    }
                }
                else{
                    System.out.println("dont go to school");
                }
            }

        }
        else{
            if(breakfast==true){
                System.out.println("go to school");
            }
            else{
                if(lunchbox==true){
                    System.out.println("go to school");
                }
                else{
                    System.out.println("dont go to school");
                }
            }
        }


       

        int a=90;//initialization
        int b,c;//multiple declaratiomn
        int d=90, e=89;//multi initial
        b=78;
        c=67;

        // if( a <b){
        //     if(b<c){

        //     }
        //     else if(b<d){
        //         if(){

        //         }
        //         else{

        //         }
        //     }
        //     else{

        //     }
        // }
        // else if(d<b){

        // }


    }
    // public static void main2(String []args){
    //     System.out.println("hello world");
    // }
}
