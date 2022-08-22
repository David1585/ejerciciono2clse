import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre;
        String clave;

        nombre = JOptionPane.showInputDialog("Digite su nombre de usuario");
        clave =  JOptionPane.showInputDialog("Ingrese su contraseña");

        Usuario cliente = new Usuario(nombre,clave);

        JOptionPane.showMessageDialog(null,cliente.confirmarusuario());


    }
}