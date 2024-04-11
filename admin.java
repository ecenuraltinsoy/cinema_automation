import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 10, 296, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD MOVIE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addmoviepage addmovie = new addmoviepage();
				addmovie.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(67, 102, 164, 38);
		panel.add(btnNewButton);
		
		JButton btnDeleteMove = new JButton("DELETE MOVIE");
		btnDeleteMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletescreenpage deletemovie = new deletescreenpage();
				deletemovie.setVisible(true);
				setVisible(false);
			}
		});
		btnDeleteMove.setBackground(new Color(255, 255, 255));
		btnDeleteMove.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeleteMove.setBounds(67, 166, 164, 38);
		panel.add(btnDeleteMove);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(94, 10, 128, 82);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(admin.class.getResource("/images/pngwing.com (30).png")));
	}
}
