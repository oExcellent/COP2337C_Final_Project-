import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CustomerDriver extends JFrame {
public static Integer trackAdd =0;
private final ButtonGroup buttonGroup = new ButtonGroup();


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
		
		trackAdd = 0;
		//create button event
		JButton ContinueBTN = new JButton("Continue");
		ContinueBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trackAdd++;
				//create variable to track button clicks
				
				//set variables based on text input
				String name = nameTF.getText();
				String address = addressTF.getText();
				String number = phoneTF.getText();
				
				//create customer instance
				Customer cust1 = new Customer();
				cust1.setName(name);
				cust1.setAddress(address);
				cust1.setPhoneNumber(number);
				
				
				JLabel confirmLbL = new JLabel("Confirm");
				JLabel displayName = new JLabel(cust1.getName());
				JLabel displayAddress = new JLabel(cust1.getAddress());
				JLabel displayNumber = new JLabel(cust1.getPhoneNumber());
				//remove the text fields and the label
				if (trackAdd == 1){
				contentPane.remove(nameTF);
				contentPane.remove(addressTF);
				contentPane.remove(phoneTF);
				
				contentPane.remove(lblFullName);
				contentPane.remove(lblAddress);
				contentPane.remove(lblPhoneNumber);
				
				
				confirmLbL.setBounds(180, 21, 120, 36);
				contentPane.add(confirmLbL);
				
				displayName.setBounds(180, 45, 120, 36);
				contentPane.add(displayName);
				

				displayAddress.setBounds(180, 66, 120, 36);
				contentPane.add(displayAddress);
				

				displayNumber.setBounds(180, 88, 120, 36);
				contentPane.add(displayNumber);
				
				ContinueBTN.setText("Confirm");
				//repaint!!!!!
				
				contentPane.revalidate();
				contentPane.repaint();
				}
				
				JRadioButton rdbtnS40 = new JRadioButton("S40");
				JRadioButton rdbtnS60 = new JRadioButton("S60");
				JRadioButton rdbtnS70 = new JRadioButton("S70");
				JRadioButton rdbtnS80 = new JRadioButton("S80");
				
				if (trackAdd == 2){
					contentPane.remove(confirmLbL);
					contentPane.remove(displayName);
					contentPane.remove(displayAddress);
					contentPane.remove(displayNumber);
					//repaint!!!!!
					contentPane.revalidate();
					contentPane.repaint();
					
					
					buttonGroup.add(rdbtnS40);
					rdbtnS40.setBounds(6, 90, 141, 23);
					contentPane.add(rdbtnS40);
					

					buttonGroup.add(rdbtnS60);
					rdbtnS60.setBounds(6, 117, 141, 23);
					contentPane.add(rdbtnS60);
					

					buttonGroup.add(rdbtnS70);
					rdbtnS70.setBounds(6, 145, 141, 23);
					contentPane.add(rdbtnS70);
					

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
				
					//repaint!!!!!
					contentPane.revalidate();
					contentPane.repaint();
					
					Volvo v1 = new Volvo();
					double price;
					
					if(rdbtnS40.isSelected() && trackAdd == 3){
						price = v1.getS40();
						
						contentPane.remove(rdbtnS40);
						contentPane.remove(rdbtnS60);
						contentPane.remove(rdbtnS70);
						contentPane.remove(rdbtnS80);
						
						JLabel lblCPrice = new JLabel("       Price: $" + price);
						lblCPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
						lblCPrice.setBounds(69, 20, 278, 34);
						contentPane.add(lblCPrice);
						
						//repaint!!!!!
						contentPane.revalidate();
						contentPane.repaint();
						
						}
			        else if(rdbtnS60.isSelected() && trackAdd == 4){
			        	price = v1.getS60();
						
						contentPane.remove(rdbtnS40);
						contentPane.remove(rdbtnS60);
						contentPane.remove(rdbtnS70);
						contentPane.remove(rdbtnS80);
						
						JLabel lblCPrice = new JLabel("       Price: $" + price);
						lblCPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
						lblCPrice.setBounds(69, 20, 278, 34);
						contentPane.add(lblCPrice);
						
						//repaint!!!!!
						contentPane.revalidate();
						contentPane.repaint();
			        	}
			        else if(rdbtnS70.isSelected() && trackAdd == 3){
			        	price = v1.getS70();
						
						contentPane.remove(rdbtnS40);
						contentPane.remove(rdbtnS60);
						contentPane.remove(rdbtnS70);
						contentPane.remove(rdbtnS80);
						
						JLabel lblCPrice = new JLabel("       Price: $" + price);
						lblCPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
						lblCPrice.setBounds(69, 20, 278, 34);
						contentPane.add(lblCPrice);
						
						//repaint!!!!!
						contentPane.revalidate();
						contentPane.repaint();
				        }
			        else if(rdbtnS70.isSelected() && trackAdd == 3){
			        	price = v1.getS80();
						
						contentPane.remove(rdbtnS40);
						contentPane.remove(rdbtnS60);
						contentPane.remove(rdbtnS70);
						contentPane.remove(rdbtnS80);
						
						JLabel lblCPrice = new JLabel("       Price: $" + price);
						lblCPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
						lblCPrice.setBounds(69, 20, 278, 34);
						contentPane.add(lblCPrice);
						
						//repaint!!!!!
						contentPane.revalidate();
						contentPane.repaint();
				        }
				}
				
			}
		});
		ContinueBTN.setBounds(158, 186, 117, 29);
		contentPane.add(ContinueBTN);
	}
}
