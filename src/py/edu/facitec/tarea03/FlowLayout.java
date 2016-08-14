package py.edu.facitec.tarea03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FlowLayout extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayout frame = new FlowLayout();
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
	public FlowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 49, 277, 70);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 130, 155, 125);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("0");
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("1");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("2");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("3");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("6");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("8");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("9");
		panel.add(btnNewButton_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(185, 130, 103, 138);
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JButton btnNewButton_10 = new JButton("Suma");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Resta");
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Multiplicacion");
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Division");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Es igual a");
		panel_1.add(btnNewButton_14);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(75, 11, 103, 27);
		contentPane.add(lblNewLabel);
	}
}
