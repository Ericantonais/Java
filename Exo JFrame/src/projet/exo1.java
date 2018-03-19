package projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class exo1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exo1 frame = new exo1();
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
	public exo1() {
		setTitle("Convertisseur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("Type the temperature in Celsius");
		textField.setBounds(29, 29, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Celsius");
		lblNewLabel.setBounds(125, 32, 59, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(125, 64, 149, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnConvert = new JButton("Convert !"); 
		btnConvert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String celsius1 = textField.getText();
				double celsius2 = Double.parseDouble(celsius1);
				double fahr1 = celsius2 * 1.8 + 32;
				String fahr2 = Double.toString(fahr1);
				lblNewLabel_1.setText(fahr2 + " Fahrenheit");
			}
		});
		btnConvert.setToolTipText("Click to convert the temperature !");
		btnConvert.setBounds(26, 60, 89, 23);
		contentPane.add(btnConvert);
		
	}
}
