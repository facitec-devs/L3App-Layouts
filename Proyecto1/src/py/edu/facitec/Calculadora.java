package py.edu.facitec;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class Calculadora extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora dialog = new Calculadora();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Calculadora() {
		setResizable(false);
		setTitle("Calculadora");
		setBounds(100, 100, 294, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		getContentPane().setLayout(gridBagLayout);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setText("0");
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 5;
		gbc_textArea.gridheight = 2;
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		getContentPane().add(textArea, gbc_textArea);
		
		JButton btnMc = new JButton("MC");
		GridBagConstraints gbc_btnMc = new GridBagConstraints();
		gbc_btnMc.insets = new Insets(0, 0, 5, 5);
		gbc_btnMc.gridx = 0;
		gbc_btnMc.gridy = 2;
		getContentPane().add(btnMc, gbc_btnMc);
		
		JButton btnMr = new JButton("MR");
		GridBagConstraints gbc_btnMr = new GridBagConstraints();
		gbc_btnMr.insets = new Insets(0, 0, 5, 5);
		gbc_btnMr.gridx = 1;
		gbc_btnMr.gridy = 2;
		getContentPane().add(btnMr, gbc_btnMr);
		
		JButton btnMs = new JButton("MS");
		GridBagConstraints gbc_btnMs = new GridBagConstraints();
		gbc_btnMs.insets = new Insets(0, 0, 5, 5);
		gbc_btnMs.gridx = 2;
		gbc_btnMs.gridy = 2;
		getContentPane().add(btnMs, gbc_btnMs);
		
		JButton btnM = new JButton("M+");
		GridBagConstraints gbc_btnM = new GridBagConstraints();
		gbc_btnM.insets = new Insets(0, 0, 5, 5);
		gbc_btnM.gridx = 3;
		gbc_btnM.gridy = 2;
		getContentPane().add(btnM, gbc_btnM);
		
		JButton btnM_1 = new JButton("M-");
		GridBagConstraints gbc_btnM_1 = new GridBagConstraints();
		gbc_btnM_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnM_1.gridx = 4;
		gbc_btnM_1.gridy = 2;
		getContentPane().add(btnM_1, gbc_btnM_1);
		
		JButton button = new JButton("\u2190");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 3;
		getContentPane().add(button, gbc_button);
		
		JButton btnCe = new JButton("CE");
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.insets = new Insets(0, 0, 5, 5);
		gbc_btnCe.gridx = 1;
		gbc_btnCe.gridy = 3;
		getContentPane().add(btnCe, gbc_btnCe);
		
		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 2;
		gbc_btnC.gridy = 3;
		getContentPane().add(btnC, gbc_btnC);
		
		JButton button_2 = new JButton("\u00B1");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 3;
		gbc_button_2.gridy = 3;
		getContentPane().add(button_2, gbc_button_2);
		
		JButton button_1 = new JButton("\u255D");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 4;
		gbc_button_1.gridy = 3;
		getContentPane().add(button_1, gbc_button_1);
		
		JButton button_3 = new JButton("7");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 4;
		getContentPane().add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("8");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 1;
		gbc_button_4.gridy = 4;
		getContentPane().add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("9");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 2;
		gbc_button_5.gridy = 4;
		getContentPane().add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("/");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 3;
		gbc_button_6.gridy = 4;
		getContentPane().add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("%");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 0);
		gbc_button_7.gridx = 4;
		gbc_button_7.gridy = 4;
		getContentPane().add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("4");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 0;
		gbc_button_8.gridy = 5;
		getContentPane().add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("5");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 1;
		gbc_button_9.gridy = 5;
		getContentPane().add(button_9, gbc_button_9);
		
		JButton button_10 = new JButton("6");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 2;
		gbc_button_10.gridy = 5;
		getContentPane().add(button_10, gbc_button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 3;
		gbc_button_11.gridy = 5;
		getContentPane().add(button_11, gbc_button_11);
		
		JButton btnx = new JButton("1/x");
		GridBagConstraints gbc_btnx = new GridBagConstraints();
		gbc_btnx.insets = new Insets(0, 0, 5, 0);
		gbc_btnx.gridx = 4;
		gbc_btnx.gridy = 5;
		getContentPane().add(btnx, gbc_btnx);
		
		JButton button_12 = new JButton("1");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 0;
		gbc_button_12.gridy = 6;
		getContentPane().add(button_12, gbc_button_12);
		
		JButton button_13 = new JButton("2");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 1;
		gbc_button_13.gridy = 6;
		getContentPane().add(button_13, gbc_button_13);
		
		JButton button_14 = new JButton("3");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 2;
		gbc_button_14.gridy = 6;
		getContentPane().add(button_14, gbc_button_14);
		
		JButton button_15 = new JButton("-");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 3;
		gbc_button_15.gridy = 6;
		getContentPane().add(button_15, gbc_button_15);
		
		JButton button_19 = new JButton("+");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton button_16 = new JButton("=");
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.insets = new Insets(0, 0, 5, 0);
		gbc_button_16.gridheight = 2;
		gbc_button_16.gridx = 4;
		gbc_button_16.gridy = 6;
		getContentPane().add(button_16, gbc_button_16);
		
		JButton button_17 = new JButton("0");
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 0;
		gbc_button_17.gridy = 7;
		getContentPane().add(button_17, gbc_button_17);
		
		JButton button_20 = new JButton(".");
		GridBagConstraints gbc_button_20 = new GridBagConstraints();
		gbc_button_20.insets = new Insets(0, 0, 5, 5);
		gbc_button_20.gridx = 1;
		gbc_button_20.gridy = 7;
		getContentPane().add(button_20, gbc_button_20);
		
		JButton button_18 = new JButton(",");
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.insets = new Insets(0, 0, 5, 5);
		gbc_button_18.gridx = 2;
		gbc_button_18.gridy = 7;
		getContentPane().add(button_18, gbc_button_18);
		GridBagConstraints gbc_button_19 = new GridBagConstraints();
		gbc_button_19.insets = new Insets(0, 0, 5, 5);
		gbc_button_19.gridx = 3;
		gbc_button_19.gridy = 7;
		getContentPane().add(button_19, gbc_button_19);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnVer = new JMenu("Ver");
		menuBar.add(mnVer);
		
		JMenuItem mntmEsta = new JMenuItem("Est\u00E1ndar");
		mnVer.add(mntmEsta);
		
		JMenuItem mntmCientfica = new JMenuItem("Cient\u00EDfica");
		mnVer.add(mntmCientfica);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenu mnEdicin = new JMenu("Edici\u00F3n");
		menuBar.add(mnEdicin);
		
		JMenuItem mntmCopiarctrlc = new JMenuItem("Copiar (ctrl+C)");
		mnEdicin.add(mntmCopiarctrlc);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmVerAyuda = new JMenuItem("Ver ayuda");
		mnAyuda.add(mntmVerAyuda);


	}

}
