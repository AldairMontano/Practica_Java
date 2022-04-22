package semana2.Hilos;

public class HilosT extends Thread{

    @Override // entra a Runnable.
    //Que va hacer?.
    public void run() {
        System.out.println("El hilo se esta ejecutando");
    }

    /*
    @Override
    public synchronized void start() {
        //Iniciar la ejecucion de un hilo
        //la jvm llama al metodo run() del hilo
    }

    CALLBACKS
    sleep - Detiene de manera temporal el numero especificado
    join() - Esperar a que el hilo se muera
    getPriority - Regresa la prioridad del hilo.
    setPriority - Establecer la prioridad del hilo
    getName - Nombre del hilo
    currentThread - Referencia al hilo que se esta ejecutando
    getId - Regresa el id del hilo
    Thread.State getState - Regresar el estado actual del hilo
    isAlive - Si esta vivo.
    */

    public static void main(String[] args) {
        HilosT hilo = new HilosT(); //entra al state new.(aqui empieza el ciclo de vida del hilo)
        hilo.start();
    }
}

class HilosR implements Runnable {
    @Override
    public void run() {
        System.out.println("el hilo de runnable esta "+ "corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}

