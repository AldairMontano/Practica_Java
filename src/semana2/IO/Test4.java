package semana2.IO;

import java.io.FileInputStream;
import java.io.IOException;

//leer una cadaena de caracteres de un archivo
public class Test4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/sleepy/Documents/perros.txt");
            int i = 0;
            while ((i=fis.read()) != -1){
                System.out.print((char)i);
            }
            fis.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
