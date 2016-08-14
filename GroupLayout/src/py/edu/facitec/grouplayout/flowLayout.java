package py.edu.facitec.grouplayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class flowLayout extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flowLayout frame = new flowLayout();
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
	public flowLayout() {
		setTitle("                                             CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(32, 11, 359, 75);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(365, 231, -140, -129);
		contentPane.add(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 97, 115, 154);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_8 = new JButton("0");
		panel.add(button_8);
		
		JButton button = new JButton("1");
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		panel.add(button_2);
		
		JButton button_3 = new JButton("4");
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		panel.add(button_4);
		
		JButton button_5 = new JButton("6");
		panel.add(button_5);
		
		JButton button_6 = new JButton("7");
		panel.add(button_6);
		
		JButton button_7 = new JButton("8");
		panel.add(button_7);
		
		JButton button_9 = new JButton("9");
		panel.add(button_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(135, 97, 131, 154);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_3 = new JButton("\u2190");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Suma");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Resta");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplicacion");
		panel_1.add(btnNewButton_2);
		
		JButton btnDivicion = new JButton("Divicion");
		panel_1.add(btnDivicion);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(276, 97, 148, 154);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCe = new JButton("CE");
		panel_2.add(btnCe);
		
		JButton btnC = new JButton("C");
		panel_2.add(btnC);
		
		JButton button_10 = new JButton("%");
		panel_2.add(button_10);
		
		JButton button_11 = new JButton("(");
		panel_2.add(button_11);
		
		JButton button_12 = new JButton(")");
		panel_2.add(button_12);
		
		JButton button_13 = new JButton(".");
		panel_2.add(button_13);
		
		JButton btnMc = new JButton("MC");
		panel_2.add(btnMc);
		
		JButton btnMr = new JButton("MR");
		panel_2.add(btnMr);
		
		JButton btnMs = new JButton("MS");
		panel_2.add(btnMs);
		
		JButton btnM = new JButton("M+");
		panel_2.add(btnM);
		
		JButton btnM_1 = new JButton("M-");
		panel_2.add(btnM_1);
		
		JButton button_14 = new JButton("=");
		panel_2.add(button_14);
	}
}
