class Mobile{

    int ram;
    int memory;
    int battery;


    Mobile(int ram , int memory, int battery){
        ram=ram;
        memory=memory;
        battery=battery;
    }

}
class aBC extends Mobile{
   int extra;
   aBC(int extra, int ram , int memory, int battery){
       super(ram, memory, battery);
       extra=extra;
   }
}

class SmartPhones extends aBC{
   
    int camera;
    int connectivity;
    SmartPhones(int extra, int ram , int memory, int battery, int connectivity, int camera){
        super(extra, ram, memory, battery);
        camera=camera;
        connectivity=connectivity;
    }
}


class Nokia extends aBC{
   
    int keyboard;

    Nokia( int keyboard, int extra, int ram, int memory, int battery ){
        super(extra,ram,memory,battery);
        keyboard=keyboard;
    }

}




