package ejemploJSON;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;

import org.json.*;


public class Main {

    public static void main(String[] args) {

        try {
            // Creamos el InputStream desde un fichero
            InputStream is = null;

            try {
                is = new FileInputStream("/datos.json");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }


            //Creamos el tokenizador que leera desde nueso IS
            JSONTokener tokener = new JSONTokener(is);

            // Y se lo pasamos a una instancia de la clase JSONObject
            JSONObject obj = new JSONObject(tokener);

            //Sacamos las credenciales
            JSONObject credenciales = obj.getJSONObject("credenciales");

            String usuario = credenciales.getString("usuario");
            String clave = credenciales.getString("clave");

            System.out.println("Usuario " + usuario + " clave "+ clave);

            //Dentro de las credenciales tenemos los videos
            JSONArray videos = credenciales.getJSONArray("videos");
            for (Object video : videos){
                System.out.println(video.toString());
            }

        } catch (Exception e){
            System.out.println("No se pueden leer el fichero" + e.getMessage());
        }
    }


}
