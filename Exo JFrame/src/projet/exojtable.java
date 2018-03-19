package projet;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class exojtable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable textField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exojtable frame = new exojtable();
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
	public exojtable() {
		setTitle("Formulaire Etudiants");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* Prénom */
		
		JLabel lblNewLabel = new JLabel("First name :");
		lblNewLabel.setBounds(23, 11, 67, 14);
		contentPane.add(lblNewLabel);
		
		textField_0 = new JTextField();
		textField_0.setBounds(95, 8, 86, 20);
		contentPane.add(textField_0);
		textField_0.setColumns(10);
		
		/* Nom */
		
		JLabel lblFirstName = new JLabel("Name :");
		lblFirstName.setBounds(23, 36, 67, 14);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 33, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		/* Age */
		
		JLabel label = new JLabel("Age :");
		label.setBounds(23, 61, 46, 14);
		contentPane.add(label);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 58, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		/* Ville */
		
		JLabel lblPhone = new JLabel("City :");
		lblPhone.setBounds(23, 85, 46, 14);
		contentPane.add(lblPhone);
			
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setColumns(10);
		textField_3.setBounds(95, 82, 86, 20);
		contentPane.add(textField_3);
		
		/* Tableau */
		
		textField = new JTable();
		textField.setModel(new DefaultTableModel(
			new Object[][] {
				{"First name", "Name", "Age", "City"},
			},
			new String[] {
				"", "", "", "New column"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Object.class, String.class, Object.class, Object.class
			};
			public Class<?> getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		textField.setBounds(29, 131, 364, 108);
		contentPane.add(textField);
		
		/* Bouton Ajouter */
		
		JButton btnAdd = new JButton("Add !");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String firstname = textField_0.getText();
				String name = textField_1.getText();
				String age = textField_2.getText();
				String city = textField_3.getText();
				DefaultTableModel model = (DefaultTableModel)textField.getModel();
				model.addRow(new Object[]{firstname, name, age, city});
				textField_0.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnAdd.setBounds(273, 11, 89, 23);
		contentPane.add(btnAdd);

		/* Bouton Supprimer */
		
		JButton btnRemove = new JButton("Remove !");
		btnRemove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			   int selectedRow =  textField.getSelectedRow();
		        DefaultTableModel model = (DefaultTableModel)textField.getModel();
		        if(selectedRow != -1) {
		        	model.removeRow(selectedRow);
		        } else {
		        	JOptionPane.showMessageDialog(null,"Sélectionne une ligne avant !");
		        }
			}
		});
		
		btnRemove.setBounds(273, 45, 89, 23);
		contentPane.add(btnRemove);
		
		/* Bouton Modifier */
		
		JButton btnModify = new JButton("Modify !");
		btnModify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnModify.setBounds(273, 81, 89, 23);
		contentPane.add(btnModify);
	}
}
