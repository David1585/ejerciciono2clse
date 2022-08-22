import javax.swing.*;

public class Usuario {
    private String nombre;
    private String password;

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String confirmarusuario(){
        if(nombre.equals("David")&& password.equals("1234")){
            return "Bienvenido al sistema";
        }
        else{
            return "Usuario y/o contraseña incorrecta";
        }

    }


}
