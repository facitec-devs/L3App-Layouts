package py.edu.facitec.tarea3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class FlowLayout extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(10, 10, 401, 65);
		contentPane.add(textField);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 91, 380, 59);
		contentPane.add(panel);
		
		JButton button = new JButton("0");
		panel.add(button);
		
		JButton button_1 = new JButton("1");
		panel.add(button_1);
		
		JButton button_2 = new JButton("2");
		panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		panel.add(button_3);
		
		JButton button_4 = new JButton("4");
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		panel.add(button_5);
		
		JButton button_6 = new JButton("6");
		panel.add(button_6);
		
		JButton button_7 = new JButton("7");
		panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		panel.add(button_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(41, 163, 370, 87);
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JButton btnSuma = new JButton("+");
		panel_1.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		panel_1.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("*");
		panel_1.add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("/");
		panel_1.add(btnDivision);
		
		JButton button_10 = new JButton("=");
		panel_1.add(button_10);
	}
}
