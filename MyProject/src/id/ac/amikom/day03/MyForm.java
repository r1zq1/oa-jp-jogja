package id.ac.amikom.day03;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class MyForm extends JFrame {
	private JTextField textField;
	public MyForm() {
		setTitle("My Form");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alamat");
		lblNewLabel.setBounds(38, 37, 46, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(117, 34, 210, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		
//		btnSubmit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("Welcome " + textField.getText());
//				textField.setText("");
//			}
//		});

		btnSubmit.addActionListener((e)->{
				System.out.println("Welcome " + textField.getText());
				textField.setText("");
		});

		btnSubmit.setBounds(142, 79, 89, 23);
		getContentPane().add(btnSubmit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 11, 97, 21);
		getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(0, 0, 67, 19);
		getContentPane().add(mnNewMenu);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
	}
	
	public static void main(String[] args) {
		new MyForm().setVisible(true);
	}
}
