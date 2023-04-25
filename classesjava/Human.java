package classesjava;

public abstract class Human {
    int eyes;
    int nose;
    int lungCapacity;

    void printInfo(){
        System.out.println("eyes = "+eyes+" nose = "+nose+" lungCapacity = "+lungCapacity);

    }
    abstract void eyesInfo();
}

class Doctor extends Human{
    int powerEye;
    void eyesInfo(){
        System.out.println("eyes power = "+powerEye);
    }
}
