package gitcalculadora;



import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import medidas.medidas;
import libreriaF.conversion;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class medida extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textCentimetros;
    private JTextField textResultadoCm;
    private JTextField textMetros;
    private JTextField textResultadoM;
    private JTextField textKilometros;
    private JTextField textResultadoKm;
    private JTextField textMillas;
    private JTextField textResultadoMi;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    medida frame = new medida();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public medida() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

      
        JButton btnCmToM = new JButton("Centímetros a Metros");
        btnCmToM.setBackground(new Color(0, 255, 255));
        btnCmToM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                	medidas conversion = new medidas();

                    float centimetros = Float.parseFloat(textCentimetros.getText());
                    float metros = conversion.centimetrosAMetros(centimetros);
                    textResultadoCm.setText(String.valueOf(metros));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
                }
            }
        });
        btnCmToM.setBounds(150, 75, 200, 23);
        contentPane.add(btnCmToM);

        textCentimetros = new JTextField();
        textCentimetros.setBounds(20, 76, 100, 20);
        contentPane.add(textCentimetros);
        textCentimetros.setColumns(10);

        textResultadoCm = new JTextField();
        textResultadoCm.setBounds(380, 76, 100, 20);
        contentPane.add(textResultadoCm);
        textResultadoCm.setColumns(10);

        // Metros a Kilómetros
        JButton btnMToKm = new JButton("Metros a Kilómetros");
        btnMToKm.setFont(new Font("Times New Roman", Font.ITALIC, 11));
        btnMToKm.setBackground(new Color(0, 255, 255));
        btnMToKm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    medidas conversion = new medidas();
                    float metros = Float.parseFloat(textMetros.getText());
                    float kilometros = conversion.metrosAKilometros(metros);
                    textResultadoM.setText(String.valueOf(kilometros));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
                }
            }
        });
        btnMToKm.setBounds(150, 131, 200, 23);
        contentPane.add(btnMToKm);

        textMetros = new JTextField();
        textMetros.setBounds(20, 132, 100, 20);
        contentPane.add(textMetros);
        textMetros.setColumns(10);

        textResultadoM = new JTextField();
        textResultadoM.setBounds(380, 132, 100, 20);
        contentPane.add(textResultadoM);
        textResultadoM.setColumns(10);

        // Kilómetros a Millas
        JButton btnKmToMi = new JButton("Kilómetros a Millas");
        btnKmToMi.setFont(new Font("Times New Roman", Font.ITALIC, 11));
        btnKmToMi.setBackground(new Color(0, 255, 255));
        btnKmToMi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                	medidas conversion = new medidas();

                    float kilometros = Float.parseFloat(textKilometros.getText());
                    float millas = conversion.kilometrosAMillas(kilometros);
                    textResultadoKm.setText(String.valueOf(millas));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
                }
            }
        });
        btnKmToMi.setBounds(150, 200, 200, 23);
        contentPane.add(btnKmToMi);

        textKilometros = new JTextField();
        textKilometros.setBounds(20, 201, 100, 20);
        contentPane.add(textKilometros);
        textKilometros.setColumns(10);

        textResultadoKm = new JTextField();
        textResultadoKm.setBounds(380, 201, 100, 20);
        contentPane.add(textResultadoKm);
        textResultadoKm.setColumns(10);

        // Millas a Metros
        JButton btnMiToM = new JButton("Millas a Metros");
        btnMiToM.setFont(new Font("Times New Roman", Font.ITALIC, 11));
        btnMiToM.setBackground(new Color(0, 255, 255));
        btnMiToM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    medidas conversion = new medidas();
                    float millas = Float.parseFloat(textMillas.getText());
                    float metros = conversion.millasAMetros(millas);
                    textResultadoMi.setText(String.valueOf(metros));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
                }
            }
        });
        btnMiToM.setBounds(150, 267, 200, 23);
        contentPane.add(btnMiToM);

        textMillas = new JTextField();
        textMillas.setBounds(20, 268, 100, 20);
        contentPane.add(textMillas);
        textMillas.setColumns(10);

        textResultadoMi = new JTextField();
        textResultadoMi.setBounds(380, 268, 100, 20);
        contentPane.add(textResultadoMi);
        textResultadoMi.setColumns(10);

        // Botón de regreso
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(medida.class.getResource("/imagenes/88833028-icono-de-flecha-hacia-atrás-aislado-en-la-ilustración-abstracta-de-botón-cuadrado-verde-suave (1).jpg")));
        
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnBack.setBounds(10, 11, 60, 40);
        contentPane.add(btnBack);

        JLabel fondoLabel = new JLabel("");
        fondoLabel.setIcon(new ImageIcon(medida.class.getResource("/imagenes/87926118-white-drawing-on-a-gray-background-engineering-concept-with-protractor-and-measurements (1).jpg")));
        
        fondoLabel.setBounds(0, 0, 484, 361);
        contentPane.add(fondoLabel);
    }
}

