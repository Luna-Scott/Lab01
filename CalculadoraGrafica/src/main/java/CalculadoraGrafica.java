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

 @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
            display.setText(display.getText() + comando);
        } else if (comando.equals("C")) {
            display.setText("");
        } else if (comando.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
                case '^' -> result = Math.pow(num1, num2);
            }
            display.setText(String.valueOf(result));
        } else if (comando.equals("√")) {
            double valor = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.sqrt(valor)));
        } else if (comando.equals("%")) {
            num1 = Double.parseDouble(display.getText()) / 100;
            
            display.setText(String.valueOf(num1));
            
        } else if (comando.equals("sin") || comando.equals("cos") || comando.equals("tan")) {
            double valor = Double.parseDouble(display.getText());
            switch (comando) {
                case "sin" -> 
                    display.setText(String.valueOf(Math.sin(Math.toRadians(valor))));
                case "cos" -> 
                    display.setText(String.valueOf(Math.cos(Math.toRadians(valor))));
                case "tan" -> 
                    display.setText(String.valueOf(Math.tan(Math.toRadians(valor))));
            }
        } else {
            num1 = Double.parseDouble(display.getText());
            operator = comando.charAt(0);
            display.setText("");
        }
    }

}