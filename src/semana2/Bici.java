package semana2;

abstract class Mountain{
    Mountain(){
        System.out.println("Se ha creado una bici de montaña");
    }

    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("cambiando a color negro");
    }
}

class Magistroni extends Mountain {
    @Override
    void cambiarVelocidad() {
        System.out.println("Se deben de modificar las perillas del manubrio primero");
    }
}

public class Bici {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Magistroni();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
