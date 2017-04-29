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
import javax.swing.JCheckBox;

public class CarDriver extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField valueTF;

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
		rdbtnS40.setBounds(6, 231, 141, 23);
		contentPane.add(rdbtnS40);
		
		JRadioButton rdbtnS60 = new JRadioButton("S60");
		buttonGroup.add(rdbtnS60);
		rdbtnS60.setBounds(233, 249, 141, 23);
		contentPane.add(rdbtnS60);
		
		JRadioButton rdbtnS70 = new JRadioButton("A           $2200");
		buttonGroup.add(rdbtnS70);
		rdbtnS70.setBounds(58, 221, 141, 23);
		contentPane.add(rdbtnS70);
		
		JRadioButton rdbtnS80 = new JRadioButton("S80");
		buttonGroup.add(rdbtnS80);
		rdbtnS80.setBounds(58, 249, 141, 23);
		contentPane.add(rdbtnS80);
		
		JLabel lblPrice1 = new JLabel("$27,700");
		lblPrice1.setBounds(159, 235, 61, 16);
		contentPane.add(lblPrice1);
		
		JLabel lblPrice4 = new JLabel("$44,000");
		lblPrice4.setBounds(364, 253, 61, 16);
		contentPane.add(lblPrice4);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(233, 235, 61, 16);
		contentPane.add(lblPrice);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(110, 235, 61, 16);
		contentPane.add(lblModel);
		
		JLabel lblVolvo = new JLabel("       Select Model");
		lblVolvo.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblVolvo.setBounds(69, 20, 278, 34);
		contentPane.add(lblVolvo);
		
		JCheckBox chckbxTradeIn = new JCheckBox("Trade In");
		chckbxTradeIn.setBounds(268, 255, 128, 23);
		contentPane.add(chckbxTradeIn);
		
		valueTF = new JTextField();
		valueTF.setBounds(295, 248, 130, 26);
		contentPane.add(valueTF);
		valueTF.setColumns(10);
		
		JLabel lblValue = new JLabel("Value:");
		lblValue.setBounds(197, 253, 47, 16);
		contentPane.add(lblValue);
		
		JRadioButton rdbtnPayingInCash = new JRadioButton("Paying In Cash?");
		rdbtnPayingInCash.setBounds(80, 249, 141, 23);
		contentPane.add(rdbtnPayingInCash);
		
		JRadioButton rdbtnFinancing = new JRadioButton("Financing? (7%)");
		rdbtnFinancing.setBounds(0, 249, 141, 23);
		contentPane.add(rdbtnFinancing);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(26, 66, 121, 16);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(183, 66, 140, 16);
		contentPane.add(lblAddress);
		
		JLabel lblNewLabel = new JLabel("PhoneNumber");
		lblNewLabel.setBounds(335, 66, 109, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setBounds(183, 6, 164, 16);
		contentPane.add(lblAccountNumber);
		
		JLabel lblModel_1 = new JLabel("Model");
		lblModel_1.setBounds(18, 94, 61, 16);
		contentPane.add(lblModel_1);
		
		JLabel lblBase = new JLabel("Base $");
		lblBase.setBounds(131, 94, 61, 16);
		contentPane.add(lblBase);
		
		JLabel lblPackage = new JLabel("Package");
		lblPackage.setBounds(255, 94, 61, 16);
		contentPane.add(lblPackage);
		
		JLabel lblTot = new JLabel("Total Cost: $");
		lblTot.setBounds(183, 193, 81, 16);
		contentPane.add(lblTot);
		
		JLabel lblt = new JLabel("Tax:            $");
		lblt.setBounds(183, 173, 92, 16);
		contentPane.add(lblt);
		
		JLabel lblTT = new JLabel("Tag & title : $");
		lblTT.setBounds(255, 134, 92, 16);
		contentPane.add(lblTT);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(275, 173, 61, 16);
		contentPane.add(lblTax);
		
		JLabel lblTotalCost = new JLabel("total");
		lblTotalCost.setBounds(275, 193, 61, 16);
		contentPane.add(lblTotalCost);
		
		JLabel lblNewLabel_1 = new JLabel("TilteCost");
		lblNewLabel_1.setBounds(346, 134, 61, 16);
		contentPane.add(lblNewLabel_1);
	}
}
