package semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

//escribir archivo
public class TestRun {
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("/Users/sleepy/Documents/perros.txt");
                    String s = "hora puto.";
                    byte b[] = s.getBytes();
                    fos.write(b);
                    fos.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };

        Thread magic = new Thread(rm);
        magic.start();
    }
}
