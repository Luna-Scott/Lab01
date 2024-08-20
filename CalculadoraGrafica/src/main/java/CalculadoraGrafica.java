import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGrafica extends JFrame implements ActionListener {
    private final JTextField display;
    private double num1, num2, result;
    private char operator;
}