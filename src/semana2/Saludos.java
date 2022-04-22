package semana2;

abstract class Hola {
    void saludar(){
        //Como lo hace
        System.out.println("Que onda, como estas");
    }
    abstract void saludo();
}

interface Mostrar {
    //que hace
    void show();
    abstract void despide();
}

public class Saludos implements Mostrar{
    public void show(){
        System.out.println("Hola, como estan");
    }

    public static void main(String[] args) {
        Saludos saludo1 = new Saludos();
        saludo1.show();
    }

    public void despide(){
        System.out.println("Gracias, no");
    }

}
