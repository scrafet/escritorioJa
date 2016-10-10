package Clases;

/**
 * Created by scrafet on 30/07/2016.
 */
public class Datos {
    public  boolean validarUsuario(String usuario, String clave){
        if (usuario.equalsIgnoreCase("scrafet") && clave.equalsIgnoreCase("1223456"))
            return true;
        else
            return false;
        }
}
