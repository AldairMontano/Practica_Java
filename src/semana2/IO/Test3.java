package semana2.IO;

import java.io.FileInputStream;
import java.io.IOException;

//leer archivos
public class Test3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/sleepy/Documents/perro.txt");
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
        } catch (IOException ioe){
           ioe.printStackTrace();
        }
    }
}
