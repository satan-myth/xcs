package myproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class metroboo {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroboo window = new metroboo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public metroboo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 64));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setBackground(new Color(128, 255, 128));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(135, 11, 140, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(35, 53, 42, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSpinner T4 = new JSpinner();
		T4.setModel(new SpinnerDateModel(new Date(1713810600000L), new Date(1713810600000L), new Date(1716402600000L), Calendar.DAY_OF_MONTH));
		T4.setBounds(226, 54, 159, 20);
		frame.getContentPane().add(T4);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(35, 91, 56, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(35, 170, 73, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox T2 = new JComboBox();
		T2.setFont(new Font("Arial", Font.BOLD, 12));
		T2.setModel(new DefaultComboBoxModel(new String[] {"ATHMAPUR", "PATHALAPUR", "SPIRITPUR"}));
		T2.setBounds(121, 87, 113, 22);
		frame.getContentPane().add(T2);
		
		JComboBox T3 = new JComboBox();
		T3.setFont(new Font("Arial", Font.BOLD, 12));
		T3.setModel(new DefaultComboBoxModel(new String[] {"ATHMAPUR", "PATHALAPUR", "SPIRITPUR"}));
		T3.setBounds(118, 166, 116, 22);
		frame.getContentPane().add(T3);
		
		JLabel lblNewLabel_4 = new JLabel("DATE");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4.setBounds(170, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(128, 128, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=T1.getText();
				String s=(String)T2.getSelectedItem();
				String d=(String)T3.getSelectedItem();
				int nt=(int)T4.getValue();
				int bill=0;
				if(s.equals(d))
				{
					JOptionPane.showMessageDialog(btnNewButton,"please check stations ");
				}
				else
				{
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "Name:"+name+"\nSource:"+s+"\nDestination"+d+"\nnumber of tickets:"+nt+"\nAmount:"+bill+"\n!....HAPPY JOURNER...!");
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(145, 216, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		T1 = new JTextField();
		T1.setBounds(82, 54, 63, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
