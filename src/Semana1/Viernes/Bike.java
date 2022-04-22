package Semana1.Viernes;

public class Bike {
// Bike bikeMountain = crear nuevo objeto de la clase bike pero con nombre bikeMountain.
// caracteristicas - campos - propiedades del objeto.

//ejemplo de Overload/Sobrecarga:

    //campos:
    private int velocidad;
    private String color, marca;

    //constructor overload:
    public Bike(){ } //Constructor por default.

    public Bike(String color){ this.color = color; }

    public Bike(String color, int velocidad) {
        this.color = color;
        this.velocidad = velocidad;
    }

    public Bike(String color, String marca, int velocidad) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public int getVelocidad(){ return velocidad; }
    public String getColor(){ return color; }
    public String getMarca(){ return marca; }
}

