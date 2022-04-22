package semana2.IO;

//bufer

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.StandardCharsets;

public class Test5 {
    public static void main(String[] args) {
        try {
            //cramos el archivo en la ruta seleccionada
            FileOutputStream fos = new FileOutputStream("/Users/sleepy/Documents/magic.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);

            //cadena de arreglos que llevara el archivo
            String s = "hola prros de \n innovacción Virtual";
            byte[]b = s.getBytes(StandardCharsets.UTF_8);

            bout.write(b); // pasamos la cadena de arreglos que tendra el buffer.
            bout.flush();

            //cerramos los streams.
            bout.close();
            fos.close();
            System.out.println("Ready");

        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}

