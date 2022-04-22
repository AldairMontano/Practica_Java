package semana2.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test6 {
    //agregamos el catch dentro de la class main con throes IOException.
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/sleepy/Documents/magic.txt");
        BufferedInputStream bin = new BufferedInputStream(fis);

        // funcion para leer los caracteres del archivo.
        int i;
        while ((i=bin.read())!= -1){
            System.out.print((char)i);
        }
        bin.close();
        fis.close();
    }
}
