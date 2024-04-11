import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class deletescreenpage extends JFrame {
	
	private JComboBox<String> comboBoxHall;
	private JComboBox<String> comboBoxMovieName;
	private JComboBox<String> comboBoxMovieTime;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deletescreenpage frame = new deletescreenpage();
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
	public deletescreenpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(178, 10, 322, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Movie Name");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(27, 23, 109, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Hall ");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(27, 77, 109, 24);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Movie Time");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(27, 131, 109, 24);
		panel.add(lblNewLabel_2_2);
		
		JComboBox comboBox_hall = new JComboBox();
		comboBox_hall.setBackground(Color.WHITE);
		comboBox_hall.setBounds(166, 78, 122, 27);
		panel.add(comboBox_hall);
		
		JComboBox comboBox_moviename = new JComboBox();
		comboBox_moviename.setBackground(Color.WHITE);
		comboBox_moviename.setBounds(166, 24, 122, 27);
		panel.add(comboBox_moviename);
		
		JComboBox comboBox_movietime = new JComboBox();
		comboBox_movietime.setBackground(Color.WHITE);
		comboBox_movietime.setBounds(166, 132, 122, 27);
		panel.add(comboBox_movietime);
		
		JButton btnNewButton = new JButton("Delete Movie");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(97, 198, 145, 24);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(deletescreenpage.class.getResource("/images/pngwing.com (32).png")));
		lblNewLabel.setBounds(-21, 22, 189, 212);
		contentPane.add(lblNewLabel);
	}
	
	
	private void loadComboBoxData() {
		dbconnection cnn = new dbconnection();

		try (Connection connection = DriverManager.getConnection(cnn.db_url, cnn.user, cnn.password);
				Statement statement = connection.createStatement()) {

			// Hallarý ComboBox'a yükleme
			String hallQuery = "SELECT hall_id FROM hall";
			ResultSet hallResultSet = statement.executeQuery(hallQuery);
			
			DefaultComboBoxModel<String> hallComboBoxModel = new DefaultComboBoxModel<>();
			while (hallResultSet.next()) {
				String hallName = hallResultSet.getString("hall_name");
				hallComboBoxModel.addElement(hallName);
			}
			hallResultSet.close();
			
			comboBoxHall.setModel(hallComboBoxModel);

			// Film adlarýný ComboBox'a yükle
			String movieQuery = "SELECT movie_name FROM movies";
			ResultSet movieResultSet = statement.executeQuery(movieQuery);
			DefaultComboBoxModel<String> movieComboBoxModel = new DefaultComboBoxModel<>();
			while (movieResultSet.next()) {
				String movieName = movieResultSet.getString("movie_name");
				movieComboBoxModel.addElement(movieName);
			}
			movieResultSet.close();
			comboBoxMovieName.setModel(movieComboBoxModel);

			// Film saatlerini ComboBox'a yükle
			String timeQuery = "SELECT movie_time FROM session";
			ResultSet timeResultSet = statement.executeQuery(timeQuery);
			DefaultComboBoxModel<String> timeComboBoxModel = new DefaultComboBoxModel<>();
			while (timeResultSet.next()) {
				String movieTime = timeResultSet.getString("movie_time");
				timeComboBoxModel.addElement(movieTime);
			}
			timeResultSet.close();
			comboBoxMovieTime.setModel(timeComboBoxModel);

			connection.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void deleteMovie(String movie_name, String director, String genre, String language, int duration, int rating) {

		dbconnection cnn = new dbconnection();

		try (Connection connection = DriverManager.getConnection(cnn.db_url, cnn.user, cnn.password);
				Statement statement = connection.createStatement();) {

			// Database Connection String

			String sql = "INSERT INTO movies(movie_name,director,genre,language,duration,rating) VALUES ('" + movie_name
					+ "', '" + director + "', '" + genre + "', '" + language + "','" + duration + "','" + rating + "')";

			int result = statement.executeUpdate(sql);

			if (result > 0) {
				JOptionPane.showMessageDialog(null, "Movie added succesfully");

			} else {
				JOptionPane.showMessageDialog(null, "Something went wrong!");
			}

			connection.close();

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
