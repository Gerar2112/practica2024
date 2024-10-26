package gitcalculadora;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import libreriaF.conversion;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class grados extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textcelsius;
    private JTextField textresultado;
    private JButton btnNewButton_1;
    private JTextField textFahrenheit;
    private JTextField textResultadoF;
    private JButton btnNewButton_2;
    private JTextField textKelvin;
    private JTextField textResultadoK;
    private JButton btnNewButton_3;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    grados frame = new grados();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public grados() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Celsius a Fahrenheit");
        btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 11));
        btnNewButton.setBackground(new Color(0, 255, 255));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    conversion objCelsius = new conversion();
                    float celsius = Float.parseFloat(textcelsius.getText());
                    float fahrenheit = objCelsius.celsius_Fahrenheit(celsius);
                    textresultado.setText(String.valueOf(fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
                }
            }
        });
        btnNewButton.setBounds(135, 78, 152, 23);
        contentPane.add(btnNewButton);

        textcelsius = new JTextField();
        textcelsius.setBounds(39, 79, 86, 20);
        contentPane.add(textcelsius);
        textcelsius.setColumns(10);

        textresultado = new JTextField();
        textresultado.setBounds(297, 79, 86, 20);
        contentPane.add(textresultado);
        textresultado.setColumns(10);

        btnNewButton_1 = new JButton("Fahrenheit a Celsius");
        btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 11));
        btnNewButton_1.setBackground(new Color(0, 255, 255));
        btnNewButton_1.setForeground(new Color(0, 0, 0));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    conversion objFahrenheit = new conversion();
                    float Fahrenheit = Float.parseFloat(textFahrenheit.getText());
                    float celsius = objFahrenheit.fahrenheit_Celsius(Fahrenheit);
                    textResultadoF.setText(String.valueOf(celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
                }
            }
        });
        btnNewButton_1.setBounds(135, 112, 152, 23);
        contentPane.add(btnNewButton_1);

        textFahrenheit = new JTextField();
        textFahrenheit.setBounds(39, 113, 86, 20);
        contentPane.add(textFahrenheit);
        textFahrenheit.setColumns(10);

        textResultadoF = new JTextField();
        textResultadoF.setBounds(297, 113, 86, 20);
        contentPane.add(textResultadoF);
        textResultadoF.setColumns(10);

        btnNewButton_2 = new JButton("Celsius a Kelvin");
        btnNewButton_2.setFont(new Font("Times New Roman", Font.ITALIC, 11));
        btnNewButton_2.setBackground(new Color(0, 255, 255));
        btnNewButton_2.setForeground(new Color(0, 0, 0));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    conversion objKelvin = new conversion();
                    float celsius = Float.parseFloat(textKelvin.getText());
                    float kelvin = objKelvin.celsius_Kelvin(celsius);
                    textResultadoK.setText(String.valueOf(kelvin));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
                }
            }
        });
        btnNewButton_2.setBounds(135, 146, 152, 23);
        contentPane.add(btnNewButton_2);

        textKelvin = new JTextField();
        textKelvin.setBounds(39, 147, 86, 20);
        contentPane.add(textKelvin);
        textKelvin.setColumns(10);

        textResultadoK = new JTextField();
        textResultadoK.setBounds(297, 144, 86, 20);
        contentPane.add(textResultadoK);
        textResultadoK.setColumns(10);

        btnNewButton_3 = new JButton("Kelvin a Celsius");
        btnNewButton_3.setFont(new Font("Times New Roman", Font.ITALIC, 11));
        btnNewButton_3.setBackground(new Color(0, 255, 255));
        btnNewButton_3.setForeground(new Color(0, 0, 0));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    conversion objKelvinCelsius = new conversion();
                    float kelvin = Float.parseFloat(textKelvin.getText());
                    float celsius = objKelvinCelsius.kelvin_Celsius(kelvin);
                    textResultadoK.setText(String.valueOf(celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
                }
            }
        });
        btnNewButton_3.setBounds(135, 180, 152, 23);
        contentPane.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("");
        btnNewButton_4.setIcon(new ImageIcon(grados.class.getResource("/imagenes/88833028-icono-de-flecha-hacia-atrás-aislado-en-la-ilustración-abstracta-de-botón-cuadrado-verde-suave (1).jpg")));
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnNewButton_4.setBounds(10, 11, 62, 44);
        contentPane.add(btnNewButton_4);
        
        textField = new JTextField();
        textField.setBounds(39, 181, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(297, 175, 86, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel = new JLabel(".");
        lblNewLabel.setIcon(new ImageIcon(grados.class.getResource("/imagenes/pngtree-the-thermometer-in-sunlight-is-showing-an-average-temperature-picture-image_3165112 (1).jpg")));
        lblNewLabel.setBounds(0, 0, 434, 261);
        contentPane.add(lblNewLabel);
    }
}
