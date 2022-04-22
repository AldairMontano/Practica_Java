package PracticasSemana1;

public class Animal extends Juguete {
    String animal, nombrePersonaje, color, melena, accesorios;


    public String getAnimal() {
        return animal;
    }

    public String getColor() {
        return color;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public String getMelena() {
        return melena;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public boolean setAnimal(String animal) {
        if (!animal.isEmpty()) {
            this.animal = animal;
            return true;
        } else return false;
    }

    public boolean setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        } else return false;
    }

    public boolean setNombrePersonaje(String nombrePersonaje){
        if(!nombrePersonaje.isEmpty()){
            this.nombrePersonaje = nombrePersonaje;
            return true;
        } else return false;
    }

    public boolean setMelena(String melena){
        if(!melena.isEmpty()){
            this.melena = melena;
            return true;
        } else return false;
    }

    public boolean setAccesorios(String accesorios){
        if(!accesorios.isEmpty()){
            this.accesorios = accesorios;
            return true;
        } else return false;
    }
}
