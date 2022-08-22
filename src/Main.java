import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre;
        String clave;

        nombre = JOptionPane.showInputDialog("Digite su nombre de usuario");
        clave =  JOptionPane.showInputDialog("Ingrese su contraseña");

        Usuario cliente = new Usuario(nombre,clave);

        if(cliente.getNombre().equals("David")&& cliente.getPassword().equals("1234")){
            JOptionPane.showMessageDialog(null,"Bienvenido al sistema");
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta");
        }



    }
}