package py.edu.facitec.grouplayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GroupLayout extends JFrame {

	private JPanel contentPane;
	private JTextField ing1;
	private JTextField ing2;
	private JLabel lblElResultadoEs;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupLayout frame = new GroupLayout();
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
	public GroupLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ing1 = new JTextField();
		ing1.setColumns(10);
		
		ing2 = new JTextField();
		ing2.setColumns(10);
		
		JLabel lblCalculadoraDeSuma = new JLabel("Calculadora de Suma y Resta");
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1, v2, r; //inicializaciion de variables 
				try {
					v1 = Integer.parseInt(ing1.getText());//toma el valor de texto del 
					//primer boton de ingreso y lo convierte en int lo cual se asigna a la variable
					v2 = Integer.parseInt(ing2.getText());
					r = v1 + v2;
					resultado.setText(Integer.toString(r));//convierte el entero a text y asigna a resultado
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Debes ingresar numeros enteros en los casilleros");
				}
			}
		});
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1, v2, r; //inicializaciion de variables 
				try {
					v1 = Integer.parseInt(ing1.getText());//toma el valor de texto del 
					//primer boton de ingreso y lo convierte en int lo cual se asigna a la variable
					v2 = Integer.parseInt(ing2.getText());
					r = v1 - v2;
					resultado.setText(Integer.toString(r));//convierte el entero a text y asigna a resultado
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Debes ingresar numeros enteros en los casilleros");
				}
				
			}
		});
		
		lblElResultadoEs = new JLabel("El resultado es:");
		
		resultado = new JTextField();
		resultado.setColumns(10);
		javax.swing.GroupLayout gl_contentPane = new javax.swing.GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(116)
					.addComponent(lblCalculadoraDeSuma)
					.addContainerGap(118, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(44)
							.addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblElResultadoEs)
								.addComponent(ing1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(ing2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGap(63))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGap(85))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblCalculadoraDeSuma)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(ing1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(ing2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSuma)
						.addComponent(btnResta))
					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblElResultadoEs)
						.addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(45))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
