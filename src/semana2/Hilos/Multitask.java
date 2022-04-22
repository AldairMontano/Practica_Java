package semana2.Hilos;

/*
public class Multitask extends Thread {
    @Override
    public void run() {
        System.out.println("tarea uno");
    }

    public static void main(String[] args) {
        Multitask t1 = new Multitask(),
                t2 = new Multitask(),
                t3 = new Multitask();

        t1.start();
        t2.start();
        t3.start();
    }
}
*/


import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

class Multitasking implements Runnable {
    @Override
    public void run() {
        System.out.println("Tarea uno runnable");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Multitasking());
        Thread t2 = new Thread(new Multitasking());

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        task1.start();
        task2.start();

        t1.start();
        t2.start();
    }
}

class Task1 extends Thread {

    @Override
    public void run() {
        System.out.println("Tarea A");
    }
}

class Task2 extends Thread {

    @Override
    public void run() {
        System.out.println("Tarea B");
    }
}