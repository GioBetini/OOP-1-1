package View;

import javax.swing.JOptionPane;

import Model.Circulo;

public class Principal {
    public static void main(String[] args) throws Exception {
        double r = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do círculo: "));
        Circulo circ = new Circulo(r);
        JOptionPane.showMessageDialog(null, circ.getPerimetro(r) );
        JOptionPane.showMessageDialog(null, circ.getArea(r) );
    }
}
