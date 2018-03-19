package projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class exo3 extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static int count = 0 ;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exo3 frame = new exo3();
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
	public exo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Eric\\Pictures\\slide3.png"));
		lblNewLabel.setBounds(28, 29, 349, 155);
		contentPane.add(lblNewLabel);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count == 0) {
					lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Eric\\Pictures\\slide1.png"));
				}
				if (count == 1) {
					lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Eric\\Pictures\\slide2.png"));
				}
				if (count == 2) {
					lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Eric\\Pictures\\slide3.png"));
					count = -1;
				}
				count++;
			}
		});
		btnPrevious.setBounds(10, 215, 89, 23);
		contentPane.add(btnPrevious);
		
		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count == 0) {
					lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Eric\\Pictures\\slide3.png"));
				}
				if (count == 1) {
					lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Eric\\Pictures\\slide1.png"));
				}
				if (count == 2) {
					lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Eric\\Pictures\\slide2.png"));
					count = -1;
				}
				count++;
			}
		});
		btnNext.setBounds(317, 215, 89, 23);
		contentPane.add(btnNext);
		

	}
}
