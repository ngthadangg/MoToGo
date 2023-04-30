import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class MainUser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUser frame = new MainUser();
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
	public MainUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(10, 11, 764, 72);
		panelTitle.setLayout(null);
		panelTitle.setForeground(Color.GRAY);
		contentPane.add(panelTitle);
		
		JButton btnMotoGo = new JButton("MOTO GO");
		btnMotoGo.setForeground(Color.BLUE);
		btnMotoGo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnMotoGo.setBackground(Color.WHITE);
		btnMotoGo.setBounds(10, 11, 270, 50);
		panelTitle.add(btnMotoGo);
		
		JLabel lblXinCho = new JLabel("Xin chào...");
		lblXinCho.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblXinCho.setBounds(316, 22, 249, 36);
		panelTitle.add(lblXinCho);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 94, 764, 356);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnXemCacLoaiXe = new JButton("Xem các loại xe");
		btnXemCacLoaiXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnXemCacLoaiXe.setBounds(293, 60, 190, 41);
		panel.add(btnXemCacLoaiXe);
		
		JButton btnDatXe = new JButton("Đặt xe");
		btnDatXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDatXe.setBounds(293, 134, 190, 41);
		panel.add(btnDatXe);
		
		JButton btnTraXe = new JButton("Trả Xe");
		btnTraXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnTraXe.setBounds(293, 214, 190, 41);
		panel.add(btnTraXe);
	}

}
