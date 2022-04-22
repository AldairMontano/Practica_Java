package Semana1.Viernes;

//clase padre o super clase o clase maestra
class   Persona {
    int id;
    String nombre;

   Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}

//Clase hija.
//extends => herencia

public class Empleado extends Persona {

    //agregamos otro atributo a la clase hija a demas de los atributos de la clase padre
    double salario;

    //Creamos el cosntructor, con la palabra super asignamos los atributos de la clase padre,
    // es decir mandamos a llamar al constructor anterior.
    Empleado(int id, String nombre, double salario) {
        super(id, nombre);
        this.salario = salario;
    }

    //establecer metodo informativo
    void display() {
        System.out.println(id + " " + nombre + " " + salario);
    }
}

class TestPersEmp{
    public static void main(String[] args) {
        Empleado e = new Empleado(1, "Aldair", 6000);
        e.display();
    }
}
