package projet;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class exo2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exo2 frame = new exo2();
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
	public exo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Candidate 1 : Red");
		rdbtnNewRadioButton.setBounds(25, 30, 138, 23);
		rdbtnNewRadioButton.setForeground(
				new Color(255, 0, 0));
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Candidate 2 : Green");
		rdbtnNewRadioButton_1.setBounds(25, 56, 138, 23);
		rdbtnNewRadioButton_1.setForeground(
				new Color(0, 255, 0));
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Candidate 3 : Blue");
		rdbtnNewRadioButton_2.setBounds(25, 83, 138, 23);
		rdbtnNewRadioButton_2.setForeground(
				new Color(0, 0, 255));
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JButton btnVote = new JButton("Vote !");
		btnVote.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()) {
					JOptionPane.showMessageDialog(null,"Your favourite color is Red !");
				} else if(rdbtnNewRadioButton_1.isSelected()) {
					JOptionPane.showMessageDialog(null,"Your favourite color is Green !");					
				} else if(rdbtnNewRadioButton_2.isSelected()) {
					JOptionPane.showMessageDialog(null,"Your favourite color is Blue !");					
				} else {
					JOptionPane.showMessageDialog(null,"Sélectionne une case !");										
				}
			}
		});
		btnVote.setBounds(235, 56, 89, 23);
		contentPane.add(btnVote);
		
		
	}
}
