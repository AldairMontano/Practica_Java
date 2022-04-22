package PracticasSemana1;

public class PruebaJuguete {

    public static void main(String[] args) {
        show();
    }

    public static void show() {
        Animal duquesa = new Animal();
        duquesa.setEspecie("Animal");
        duquesa.setPiezas(4);
        duquesa.setAnimal("poni");
        duquesa.setNombrePersonaje("Duquesa");
        duquesa.setColor("naranja");
        duquesa.setMelena("corta");
        duquesa.setAccesorios("Alas");

        String msg = "En el huevito kinder salio: ";
        msg += "\n Piezas: " + duquesa.getPiezas();
        msg += "\n Juguete: " + duquesa.getEspecie();
        msg += "\n Animal: " + duquesa.getAnimal();
        msg += "\n Nombre del Personaje: " + duquesa.getNombrePersonaje();
        msg += "\n Color: " + duquesa.getColor();
        msg += "\n Melena: " + duquesa.getMelena();
        msg += "\n Accesorios: " + duquesa.getAccesorios();

        System.out.println(msg);
    }
}
