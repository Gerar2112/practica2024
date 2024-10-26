package gitcalculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import java.awt.Font;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
import java.awt.Color;

	public class guicalculadora extends JFrame  implements ActionListener {

		/**
		 * 
		 */
		private static final long serialVersionUID = 7932876915009079418L;
		private JPanel contentPane;
		private JTextField textPantalla;
		private String num1, num2;
		double resultado;
		private String operacion;

		

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						guicalculadora frame = new guicalculadora();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public guicalculadora() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 455, 640);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(45, 45, 45));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			textPantalla = new JTextField();
			textPantalla.setBounds(80, 63, 289, 53);
			textPantalla.setBackground(new Color(192, 192, 192));
			textPantalla.setFont(new Font("Tahoma", Font.PLAIN, 16));
			contentPane.add(textPantalla);
			textPantalla.setColumns(10);
			
			JButton btnNum1 = new JButton("1");
			btnNum1.setBounds(43, 444, 49, 53);
			btnNum1.setForeground(new Color(0, 0, 0));
			btnNum1.setBackground(new Color(192, 192, 192));
			btnNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"1");
						
				}
			});
			btnNum1.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum1);
			
			JButton btnNum2 = new JButton("2");
			btnNum2.setBounds(155, 444, 49, 53);
			btnNum2.setForeground(new Color(0, 0, 0));
			btnNum2.setBackground(new Color(192, 192, 192));
			btnNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"2");
				
				}
			});
			btnNum2.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum2);
			
			JButton btnNum3 = new JButton("3");
			btnNum3.setBounds(266, 444, 49, 53);
			btnNum3.setForeground(new Color(0, 0, 0));
			btnNum3.setBackground(new Color(192, 192, 192));
			btnNum3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"3");
			
				}
			});
			btnNum3.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum3);
			
			JButton btnSuma = new JButton("+");
			btnSuma.setBounds(368, 444, 49, 53);
			btnSuma.setForeground(new Color(0, 0, 0));
			btnSuma.setBackground(new Color(192, 192, 192));
			btnSuma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!textPantalla.getText().equals("")) {
						num1=textPantalla.getText();
					
						operacion = "+";
						textPantalla.setText("");
					}
				}
			});
			btnSuma.setFont(new Font("Poor Richard", Font.BOLD, 27));
			contentPane.add(btnSuma);
			
			JButton btnIgual = new JButton("=");
			btnIgual.setBounds(270, 522, 49, 53);
			btnIgual.setForeground(new Color(0, 0, 0));
			btnIgual.setBackground(new Color(192, 192, 192));
			btnIgual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double resultado = 0;
					String respuesta;
					num2=textPantalla.getText();
					if(num2.equals("")==false) 
					if(operacion.equals("+")) {
						resultado=Double.parseDouble(num1)+Double.parseDouble(num2);	
					}else {
						if(operacion.equals("-")) {
							resultado=Double.parseDouble(num1)-Double.parseDouble(num2);
							
						}else {
							if(operacion.equals("*")) {
								resultado=Double.parseDouble(num1)*Double.parseDouble(num2);
							}else {
								if(operacion.equals("/")) {
									resultado=Double.parseDouble(num1)/Double.parseDouble(num2);
								}
							}
						}
					}
					respuesta = String.valueOf(resultado);
					textPantalla.setText(respuesta);
			}
				
				});
			btnIgual.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnIgual);
			
			JButton btnReset = new JButton("C");
			btnReset.setBounds(364, 524, 56, 45);
			btnReset.setForeground(new Color(255, 0, 0));
			btnReset.setBackground(new Color(192, 192, 192));
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText("");
				}
			});
			btnReset.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnReset);
			
			JButton btnNewButton = new JButton("Masa");
			btnNewButton.setBounds(126, 174, 67, 45);
			btnNewButton.setFont(new Font("Poor Richard", Font.BOLD, 16));
			btnNewButton.setBackground(new Color(0, 170, 0));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			contentPane.add(btnNewButton);
			
			JButton btnNum4 = new JButton("4");
			btnNum4.setBounds(43, 366, 49, 53);
			btnNum4.setForeground(new Color(0, 0, 0));
			btnNum4.setBackground(new Color(192, 192, 192));
			btnNum4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"4");
				}
			});
			btnNum4.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum4);
			
			JButton btnNum5 = new JButton("5");
			btnNum5.setBounds(155, 366, 49, 53);
			btnNum5.setForeground(new Color(0, 0, 0));
			btnNum5.setBackground(new Color(192, 192, 192));
			btnNum5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"5");
				}
			});
			btnNum5.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum5);
			
			JButton btnNum6 = new JButton("6");
			btnNum6.setBounds(266, 366, 49, 53);
			btnNum6.setForeground(new Color(0, 0, 0));
			btnNum6.setBackground(new Color(192, 192, 192));
			btnNum6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"6");
				}
			});
			btnNum6.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum6);
			
			JButton btnNum7 = new JButton("7");
			btnNum7.setBounds(43, 286, 49, 49);
			btnNum7.setForeground(new Color(0, 0, 0));
			btnNum7.setBackground(new Color(192, 192, 192));
			btnNum7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"7");
				}
			});
			btnNum7.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum7);
			
			JButton btnNum8 = new JButton("8");
			btnNum8.setBounds(155, 286, 49, 53);
			btnNum8.setForeground(new Color(0, 0, 0));
			btnNum8.setBackground(new Color(192, 192, 192));
			btnNum8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"8");
				}
			});
			btnNum8.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum8);
			
			JButton btnNum9 = new JButton("9");
			btnNum9.setBounds(266, 286, 49, 53);
			btnNum9.setForeground(new Color(0, 0, 0));
			btnNum9.setBackground(new Color(192, 192, 192));
			btnNum9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"9");
				}
			});
			btnNum9.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum9);
			
			JButton btnNum0 = new JButton("0");
			btnNum0.setBounds(155, 522, 49, 53);
			btnNum0.setForeground(new Color(0, 0, 0));
			btnNum0.setBackground(new Color(192, 192, 192));
			btnNum0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"0");
				}
			});
			btnNum0.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnNum0);
			
			JButton btnMulti = new JButton("X");
			btnMulti.setBounds(368, 286, 49, 53);
			btnMulti.setForeground(new Color(0, 0, 0));
			btnMulti.setBackground(new Color(192, 192, 192));
			btnMulti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!textPantalla.getText().equals("")) {
						num1=textPantalla.getText();
						operacion = "*";
						textPantalla.setText("");
				}
					
				}
			});
			btnMulti.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnMulti);
			
			JButton btnDivi = new JButton("/");
			btnDivi.setBounds(368, 171, 49, 47);
			btnDivi.setBackground(new Color(192, 192, 192));
			btnDivi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!textPantalla.getText().equals("")) {
						num1=textPantalla.getText();
						operacion = "/";
						textPantalla.setText("");
				}
				}
			});
			btnDivi.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnDivi);
			
			JButton btnResta = new JButton("-");
			btnResta.setBounds(368, 366, 49, 53);
			btnResta.setForeground(new Color(0, 0, 0));
			btnResta.setBackground(new Color(192, 192, 192));
			btnResta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!textPantalla.getText().equals("")) {
						num1=textPantalla.getText();
						operacion = "-";
						textPantalla.setText("");
				}
				}
			});
			btnResta.setFont(new Font("Poor Richard", Font.BOLD, 22));
			contentPane.add(btnResta);
			
			JButton btnTemperatura = new JButton("Temperatura");
			btnTemperatura.setBounds(224, 174, 115, 47);
			btnTemperatura.setFont(new Font("Poor Richard", Font.BOLD, 16));
			btnTemperatura.setBackground(new Color(255, 0, 0));
			btnTemperatura.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				grados ge = new grados ();
				ge.setVisible(true);
				}
			});
			contentPane.add(btnTemperatura);
			
			JButton btnNewButton_1 = new JButton("New button");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				medida me = new medida();
				me.setVisible(true);
					
				}
			});
			btnNewButton_1.setBounds(16, 184, 89, 23);
			contentPane.add(btnNewButton_1);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}