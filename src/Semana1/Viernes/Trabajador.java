package Semana1.Viernes;

public class Trabajador {
    double salario = 50000;
}

class Programador extends Trabajador {
    int bono = 1000;

    public void main(){
        Programador Aldair = new Programador();
        System.out.println("El salario del programador es: "+ Aldair.salario);
        System.out.println("El bono del programador es: "+ Aldair.bono);
    }

    void mensaje(){
        System.out.println("Soy programador");
        main();
    }
}

class Web extends Programador {
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}

/*
Herencia simple:
Trabajador(Clase padre) => (es un) Programador(clase hijo).

Herencia multinivel:
Trabajador => Programador => Web.

Herencia jerarquica:
Trabajador => Programador.
Trabajador => Web.
 */
