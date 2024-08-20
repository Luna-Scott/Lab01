import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGrafica extends JFrame implements ActionListener {
    private final JTextField display;
    private double num1, num2, result;
    private char operator;

public CalculadoraGrafica() {
        setTitle("Calculadora Avanzada");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear pantalla
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Times New Roman", Font.BOLD, 50));
        display.setBackground(Color.PINK);
        display.setForeground(Color.BLACK);
        add(display, BorderLayout.NORTH);

        // Crear panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(6, 4));

        String[] botones = {
                "sin", "cos", "tan", " ",
                "^", "√", "%", " ",
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+",

        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Times New Roman", Font.BOLD, 20));
            boton.setBackground(Color.LIGHT_GRAY);
            boton.setForeground(Color.BLACK);
            boton.setBorder(new LineBorder(Color.PINK, 2, true));
            boton.setMargin(new Insets(10, 10, 10, 10));

            boton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    boton.setBackground(Color.DARK_GRAY);
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    boton.setBackground(Color.LIGHT_GRAY);
                }
            });

            boton.addActionListener(this);
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);
    }
}
