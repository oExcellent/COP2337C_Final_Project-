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
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CustomerDriver extends JFrame {
public static Integer trackAdd =0;
private final ButtonGroup buttonGroup = new ButtonGroup();

Customer cust1 = new Customer();

	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField addressTF;
	private JTextField phoneTF;
	
	JLabel confirmLbL = new JLabel("Confirm");
	JLabel displayName = new JLabel("Name: " + cust1.getName());
	JLabel displayAddress = new JLabel("Address: " + cust1.getAddress());
	JLabel displayNumber = new JLabel("Phone Number: " + cust1.getPhoneNumber());
	
	
	JRadioButton rdbtnS40 = new JRadioButton("S40");
	JRadioButton rdbtnS60 = new JRadioButton("S60");
	JRadioButton rdbtnS70 = new JRadioButton("S70");
	JRadioButton rdbtnS80 = new JRadioButton("S80");

	JLabel lblPrice1 = new JLabel("$27,700");
	JLabel lblPrice2 = new JLabel("$32,500");
	JLabel lblPrice3 = new JLabel("$36,000");
	JLabel lblPrice4 = new JLabel("$44,000");
	JLabel lblPrice = new JLabel("Price");
	JLabel lblModel = new JLabel("Model");
	JLabel lblVolvo = new JLabel("       Select Model");
	
	JLabel lblCPrice = new JLabel("No balance");

	JRadioButton rdbtnpckageA = new JRadioButton("A           $2,200");
	JRadioButton rdbtnpckageB = new JRadioButton("B           $3,250");
	JCheckBox chckbxMetalicPaint = new JCheckBox("Metalic Paint $650");
	
	JCheckBox chckbxTradeIn = new JCheckBox("Trade In");
	JTextField valueTF = new JTextField();
	JLabel lblValue = new JLabel("Value:");
	JRadioButton rdbtnPayingInCash = new JRadioButton("Paying In Cash?");
	JRadioButton rdbtnFinancing = new JRadioButton("Financing? (7%)");
	double price = 0;

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
				cust1.setName(name);
				cust1.setAddress(address);
				cust1.setPhoneNumber(number);
				
				if(!nameTF.getText().equals("") && !addressTF.getText().equals("") && !phoneTF.getText().equals("")){
				displayName.setText("Name: " + cust1.getName());
				displayAddress.setText("Address: " + cust1.getAddress());
				displayNumber.setText("Phone Number: " + cust1.getPhoneNumber());
				}
				//remove the text fields and the label
				if (trackAdd == 1){
				contentPane.remove(nameTF);
				contentPane.remove(addressTF);
				contentPane.remove(phoneTF);
				
				contentPane.remove(lblFullName);
				contentPane.remove(lblAddress);
				contentPane.remove(lblPhoneNumber);
				
				confirmLbL.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
				confirmLbL.setBounds(170, 18, 120, 36);
				contentPane.add(confirmLbL);
				
				displayName.setBounds(180, 45, 150, 36);
				contentPane.add(displayName);
				

				displayAddress.setBounds(180, 66, 150, 36);
				contentPane.add(displayAddress);
				

				displayNumber.setBounds(180, 88, 180, 36);
				contentPane.add(displayNumber);
				
				ContinueBTN.setText("Confirm");
				
				
				}
				
			
				
				if (trackAdd == 2){
					contentPane.remove(confirmLbL);
					contentPane.remove(displayName);
					contentPane.remove(displayAddress);
					contentPane.remove(displayNumber);
				
					
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
					
					
					
					lblPrice1.setBounds(330, 94, 61, 16);
					contentPane.add(lblPrice1);
				
					lblPrice2.setBounds(330, 121, 61, 16);
					contentPane.add(lblPrice2);
					
					
					lblPrice3.setBounds(330, 149, 61, 16);
					contentPane.add(lblPrice3);
					
					
					lblPrice4.setBounds(330, 177, 61, 16);
					contentPane.add(lblPrice4);
					
					
					lblPrice.setBounds(330, 66, 61, 16);
					contentPane.add(lblPrice);
					
				
					lblModel.setBounds(6, 66, 61, 16);
					contentPane.add(lblModel);
					
				
					lblVolvo.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
					lblVolvo.setBounds(69, 20, 278, 34);
					contentPane.add(lblVolvo);
				}
				
					//repaint!!!!!
				repaint();
					
					Volvo v1 = new Volvo();
					
					
					if(rdbtnS40.isSelected() && trackAdd == 3){
						price = v1.getS40();
						
			        	removeContentPane1();
						
						lblCPrice.setText("       Price: $" + price);
						setbndsForCPrice();
						contentPane.add(lblCPrice);
						
						addPackageA();
					
						metalic();
										
						repaint();
						}
					
					
			        else if(rdbtnS60.isSelected() && trackAdd == 3){
			        	price = v1.getS60();
						
			        	removeContentPane1();

						lblCPrice.setText("       Price: $" + price);

						contentPane.add(lblCPrice);
						setbndsForCPrice();
						addPackageA();
						
						
						metalic();
						
						repaint();
			        	}
			        else if(rdbtnS70.isSelected() && trackAdd == 3){
			        	price = v1.getS70();
						
			        	removeContentPane1();
					
						lblCPrice.setText("       Price: $" + price);
						setbndsForCPrice();
				
					
						addPackageA();
						addPackageB();
						
					
						metalic();
					
						
						repaint();
				        }
			        else if(rdbtnS80.isSelected() && trackAdd == 3){
			        	price = v1.getS80();
						
			        	removeContentPane1();
						
						
						lblCPrice.setText("       Price: $" + price);
						setbndsForCPrice();
						
						contentPane.add(lblCPrice);
						addPackageA();
						addPackageB();
						
						
					
						metalic();
						
						repaint();
				        }
				
					if (rdbtnpckageA.isSelected()){
						price += 2200;
					}
					if (rdbtnpckageB.isSelected()){
						price += 3250;
					}
					
					if (chckbxMetalicPaint.isSelected()){
						price += 650;
					}
					
					if(trackAdd == 4){
						removedp3();
						addPayment();
						
						if(rdbtnPayingInCash.isSelected()){
							price = price - 650; 
							
						}
						if(rdbtnFinancing.isSelected()){
							price = (price * .07) + price;
						}
						if(chckbxTradeIn.isSelected()){
							double value = Double.parseDouble(valueTF.getText());
							price = price - value;
						}
					}
					//repaint!!!!!
					repaint();
			}
			
			
			//repaint function!!!!!
			public void repaint(){
			contentPane.revalidate();
			contentPane.repaint();
			}
			
			public void setbndsForCPrice(){
				lblCPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
				lblCPrice.setBounds(69, 20, 290, 34);
			}
			public void addPackageA(){
				buttonGroup.add(rdbtnpckageA);
				rdbtnpckageA.setBounds(110, 94, 141, 23);
				contentPane.add(rdbtnpckageA);
			}
			public void addPackageB(){
				buttonGroup.add(rdbtnpckageB);
				rdbtnpckageB.setBounds(110, 134, 141, 23);
				contentPane.add(rdbtnpckageB);
			}
			public void removeContentPane1(){
				contentPane.remove(rdbtnS40);
				contentPane.remove(rdbtnS60);
				contentPane.remove(rdbtnS70);
				contentPane.remove(rdbtnS80);
				contentPane.remove(lblPrice1);
				contentPane.remove(lblPrice2);
				contentPane.remove(lblPrice3);
				contentPane.remove(lblPrice4);
				contentPane.remove(lblPrice);
				contentPane.remove(lblModel);
				contentPane.remove(lblVolvo);
				
			
			}
			public void metalic(){
				chckbxMetalicPaint.setBounds(163, 160, 158, 23);
				contentPane.add(chckbxMetalicPaint);
			}
			public void removedp3(){
				contentPane.remove(rdbtnpckageA);
				contentPane.remove(rdbtnpckageB);
				contentPane.remove(chckbxMetalicPaint);
				contentPane.remove(lblCPrice);
				
			}
			public void addPayment(){
				lblCPrice.setText("       Price: $" + price);
				contentPane.add(lblCPrice);
				
				
				chckbxTradeIn.setBounds(59, 82, 128, 23);
				contentPane.add(chckbxTradeIn);
				
			
				valueTF.setBounds(295, 81, 130, 26);
				contentPane.add(valueTF);
				valueTF.setColumns(10);
				
				
				lblValue.setBounds(247, 86, 47, 16);
				contentPane.add(lblValue);
				
				rdbtnPayingInCash.setBounds(58, 117, 141, 23);
				contentPane.add(rdbtnPayingInCash);
				buttonGroup.add(rdbtnPayingInCash);
				
				rdbtnFinancing.setBounds(58, 152, 141, 23);
				contentPane.add(rdbtnFinancing);
				buttonGroup.add(rdbtnFinancing);
			}
			
		});
		ContinueBTN.setBounds(158, 186, 117, 29);
		contentPane.add(ContinueBTN);
	}
}
