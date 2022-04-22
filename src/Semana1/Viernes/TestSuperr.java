package Semana1.Viernes;

class Animal<String> {
    java.lang.String color = "Blanco";

    void eat(){
        System.out.println("Esta comiendo");
    }

    Animal(){
        System.out.println("se crea un animal");
    }

}

class Gato extends Animal {
    String color = "Naranjo";
    //redefinir
    void printColor (){
        System.out.println(color);
        System.out.println(super.color);
    }

    void eat(){
        System.out.println("come atún");
    }

    void sleep(){
        System.out.println("se durmio el gato");
    }

    void call(){
        super.eat();
        sleep();
    }

    Gato(){
        super();
        System.out.println("se ha creado un Gato.");
    }

}

public class TestSuperr {
    public static void main(String[] args) {

        //objeto anonimo.
        new Gato().printColor();

        new Gato().call();

        new Gato();
}

//nos quedamos en 2:53:00


}