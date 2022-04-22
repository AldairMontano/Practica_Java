package semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/*
public class IOTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/sleepy/Documents/hola.txt");
            fos.write(65);
            fos.close();
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
*/

//escribir archivo

public class IOTest {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("/Users/sleepy/Documents/hola2.txt");
                    fos.write(65);
                    fos.close();
                }catch (IOException ioe){
                    System.out.println(ioe);
                }
            }
        };

        Thread writeFile = new Thread(t1);
        writeFile.start();
    }
}