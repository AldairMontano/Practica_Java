package Semana1;

public class PruebaBicicleta {
    //psvm.
    public static void main(String[] args) {
        show();

    }

    public static void show(){
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Carmesi");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);
        String msg = "Bici de montaña con estas caracteristicas: ";
        msg += "\nColor: " + biciMountain.getColor();
        msg += "\nPins: " + biciMountain.getPins();
        msg += "\nRodada: " + biciMountain.getRodada();
        msg += "\nVelocidad: " + biciMountain.getVelocidad();

        System.out.print(msg);
    }
}
