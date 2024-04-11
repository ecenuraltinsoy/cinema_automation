import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ticketpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketpage frame = new ticketpage();
					frame.setVisible(true);
				    frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ticketpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setMinimumSize(new Dimension(200, 200));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(10, 10, 502, 451);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("S C R E E N");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(55, 382, 413, 44);
		panel.add(lblNewLabel);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("1");
		tglbtnNewToggleButton.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton.setBounds(55, 49, 58, 37);
		panel.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("1");
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_1.setBackground(Color.WHITE);
		tglbtnNewToggleButton_1.setBounds(55, 108, 58, 37);
		panel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("1");
		tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_2.setBackground(Color.WHITE);
		tglbtnNewToggleButton_2.setBounds(55, 170, 58, 37);
		panel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("1");
		tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_3.setBackground(Color.WHITE);
		tglbtnNewToggleButton_3.setBounds(55, 232, 58, 37);
		panel.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("1");
		tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_4.setBackground(Color.WHITE);
		tglbtnNewToggleButton_4.setBounds(55, 295, 58, 37);
		panel.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("2");
		tglbtnNewToggleButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5.setBounds(142, 49, 58, 37);
		panel.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_5_1 = new JToggleButton("2");
		tglbtnNewToggleButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_1.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_1.setBounds(142, 108, 58, 37);
		panel.add(tglbtnNewToggleButton_5_1);
		
		JToggleButton tglbtnNewToggleButton_5_2 = new JToggleButton("2");
		tglbtnNewToggleButton_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_2.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_2.setBounds(142, 170, 58, 37);
		panel.add(tglbtnNewToggleButton_5_2);
		
		JToggleButton tglbtnNewToggleButton_5_3 = new JToggleButton("2");
		tglbtnNewToggleButton_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_3.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_3.setBounds(142, 232, 58, 37);
		panel.add(tglbtnNewToggleButton_5_3);
		
		JToggleButton tglbtnNewToggleButton_5_4 = new JToggleButton("2");
		tglbtnNewToggleButton_5_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_4.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_4.setBounds(142, 295, 58, 37);
		panel.add(tglbtnNewToggleButton_5_4);
		
		JToggleButton tglbtnNewToggleButton_5_5 = new JToggleButton("3");
		tglbtnNewToggleButton_5_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5.setBounds(230, 49, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5);
		
		JToggleButton tglbtnNewToggleButton_5_5_1 = new JToggleButton("3");
		tglbtnNewToggleButton_5_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_1.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_1.setBounds(230, 108, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_1);
		
		JToggleButton tglbtnNewToggleButton_5_5_2 = new JToggleButton("3");
		tglbtnNewToggleButton_5_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_2.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_2.setBounds(230, 170, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_2);
		
		JToggleButton tglbtnNewToggleButton_5_5_3 = new JToggleButton("3");
		tglbtnNewToggleButton_5_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_3.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_3.setBounds(230, 232, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_3);
		
		JToggleButton tglbtnNewToggleButton_5_5_4 = new JToggleButton("3");
		tglbtnNewToggleButton_5_5_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_4.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_4.setBounds(230, 295, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_4);
		
		JToggleButton tglbtnNewToggleButton_5_5_5 = new JToggleButton("4");
		tglbtnNewToggleButton_5_5_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5.setBounds(321, 49, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_1 = new JToggleButton("4");
		tglbtnNewToggleButton_5_5_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_1.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_1.setBounds(321, 108, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_1);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_2 = new JToggleButton("4");
		tglbtnNewToggleButton_5_5_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_2.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_2.setBounds(321, 170, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_2);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_3 = new JToggleButton("4");
		tglbtnNewToggleButton_5_5_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_3.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_3.setBounds(321, 232, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_3);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_4 = new JToggleButton("4");
		tglbtnNewToggleButton_5_5_5_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_4.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_4.setBounds(321, 295, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_4);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_5 = new JToggleButton("5");
		tglbtnNewToggleButton_5_5_5_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_5.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_5.setBounds(410, 49, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_5);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_5_1 = new JToggleButton("5");
		tglbtnNewToggleButton_5_5_5_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_5_1.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_5_1.setBounds(410, 108, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_5_1);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_5_2 = new JToggleButton("5");
		tglbtnNewToggleButton_5_5_5_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_5_2.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_5_2.setBounds(410, 170, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_5_2);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_5_3 = new JToggleButton("5");
		tglbtnNewToggleButton_5_5_5_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_5_3.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_5_3.setBounds(410, 232, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_5_3);
		
		JToggleButton tglbtnNewToggleButton_5_5_5_5_4 = new JToggleButton("5");
		tglbtnNewToggleButton_5_5_5_5_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		tglbtnNewToggleButton_5_5_5_5_4.setBackground(Color.WHITE);
		tglbtnNewToggleButton_5_5_5_5_4.setBounds(410, 295, 58, 37);
		panel.add(tglbtnNewToggleButton_5_5_5_5_4);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(14, 60, 31, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("B");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(14, 118, 31, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("C");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(14, 171, 31, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("D");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(14, 232, 31, 27);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("E");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_4.setBounds(14, 295, 31, 27);
		panel.add(lblNewLabel_1_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.setBackground(new Color(252, 249, 180));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(533, 10, 288, 451);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(141, 53, 122, 27);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Movie Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 52, 109, 24);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Hall ");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(10, 110, 109, 24);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Movie Time");
		lblNewLabel_2_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(10, 169, 109, 24);
		panel_1.add(lblNewLabel_2_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(141, 110, 122, 27);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(141, 173, 122, 27);
		panel_1.add(comboBox_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(23, 232, 240, 82);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Ticket Price");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(118, 10, 107, 19);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(ticketpage.class.getResource("/images/pngwing.com (28).png")));
		lblNewLabel_4.setBounds(0, 10, 125, 62);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("10 $");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(145, 39, 45, 33);
		panel_2.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("BUY TICKET");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(92, 362, 117, 43);
		panel_1.add(btnNewButton);
		
	}
}
