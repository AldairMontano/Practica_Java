package Semana1.Viernes;

class Bike2 {
    void run(){
        System.out.println("running...");
    }
}

//redefinir:
public class Polimorfismo extends Bike2 {
    //polimorfismo primitivo.
    @Override
    void run() {
        System.out.println("running safely with 60 miles per hour");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Polimorfismo(); //Ligadura Dinamica. cuando la variable de
        // referencia se refiere al objeto de la clase hija
        bike2.run();
    }
}
