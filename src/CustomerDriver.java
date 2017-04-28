import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CustomerDriver extends JFrame {
public static Integer trackAdd =0;

	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField addressTF;
	private JTextField phoneTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDriver frame = new CustomerDriver();
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
	public CustomerDriver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFullName = new JLabel("Full Name:");
		lblFullName.setBounds(6, 21, 91, 16);
		contentPane.add(lblFullName);
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(6, 49, 61, 16);
		contentPane.add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(6, 77, 107, 16);
		contentPane.add(lblPhoneNumber);
		
		nameTF = new JTextField();
		nameTF.setToolTipText("");
		nameTF.setBounds(145, 16, 130, 26);
		contentPane.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(145, 44, 130, 26);
		contentPane.add(addressTF);
		addressTF.setColumns(10);
		
		phoneTF = new JTextField();
		phoneTF.setBounds(145, 72, 130, 26);
		contentPane.add(phoneTF);
		phoneTF.setColumns(10);
		//create variable to track button clicks
		trackAdd = 1;
		//create button event
		JButton ContinueBTN = new JButton("Continue");
		ContinueBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set variables based on text input
				String name = nameTF.getText();
				String address = addressTF.getText();
				String number = phoneTF.getText();
				
				//create customer instance
				Customer cust1 = new Customer();
				cust1.setName(name);
				cust1.setAddress(address);
				cust1.setPhoneNumber(number);
				
				//remove the text fields and the label
				if (trackAdd > 0){
				contentPane.remove(nameTF);
				contentPane.remove(addressTF);
				contentPane.remove(phoneTF);
				
				contentPane.remove(lblFullName);
				contentPane.remove(lblAddress);
				contentPane.remove(lblPhoneNumber);
				}
				
				
				JLabel displayName = new JLabel(cust1.getName());
				displayName.setBounds(180, 21, 120, 36);
				contentPane.add(displayName);
				
				JLabel displayAddress = new JLabel(cust1.getAddress());
				displayAddress.setBounds(180, 49, 120, 36);
				contentPane.add(displayAddress);
				
				JLabel DisplayNumber = new JLabel(cust1.getPhoneNumber());
				DisplayNumber.setBounds(180, 77, 120, 36);
				contentPane.add(DisplayNumber);
				
				//repaint!!!!!
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		ContinueBTN.setBounds(158, 186, 117, 29);
		contentPane.add(ContinueBTN);
	}
}
