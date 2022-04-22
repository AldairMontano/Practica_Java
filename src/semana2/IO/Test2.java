package semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

//escribir archivo
public class Test2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/sleepy/Documents/perro.txt");
            String s = "putos";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
