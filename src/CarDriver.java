import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class CarDriver extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarDriver frame = new CarDriver();
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
	public CarDriver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnS40 = new JRadioButton("S40");
		buttonGroup.add(rdbtnS40);
		rdbtnS40.setBounds(6, 90, 141, 23);
		contentPane.add(rdbtnS40);
		
		JRadioButton rdbtnS60 = new JRadioButton("S60");
		buttonGroup.add(rdbtnS60);
		rdbtnS60.setBounds(6, 117, 141, 23);
		contentPane.add(rdbtnS60);
		
		JRadioButton rdbtnS70 = new JRadioButton("S70");
		buttonGroup.add(rdbtnS70);
		rdbtnS70.setBounds(6, 145, 141, 23);
		contentPane.add(rdbtnS70);
		
		JRadioButton rdbtnS80 = new JRadioButton("S80");
		buttonGroup.add(rdbtnS80);
		rdbtnS80.setBounds(6, 170, 141, 23);
		contentPane.add(rdbtnS80);
		
		JLabel lblPrice1 = new JLabel("$27,700");
		lblPrice1.setBounds(330, 94, 61, 16);
		contentPane.add(lblPrice1);
		
		JLabel lblPrice2 = new JLabel("$32,500");
		lblPrice2.setBounds(330, 121, 61, 16);
		contentPane.add(lblPrice2);
		
		JLabel lblPrice3 = new JLabel("$36,000");
		lblPrice3.setBounds(330, 149, 61, 16);
		contentPane.add(lblPrice3);
		
		JLabel lblPrice4 = new JLabel("$44,000");
		lblPrice4.setBounds(330, 177, 61, 16);
		contentPane.add(lblPrice4);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(330, 66, 61, 16);
		contentPane.add(lblPrice);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(6, 66, 61, 16);
		contentPane.add(lblModel);
		
		JLabel lblVolvo = new JLabel("       Select Model");
		lblVolvo.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblVolvo.setBounds(69, 20, 278, 34);
		contentPane.add(lblVolvo);
	}
}
