import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtTaiKhoan;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
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
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatKhau = new JLabel("Mật Khẩu");
		lblMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMatKhau.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatKhau.setLabelFor(this);
		lblMatKhau.setBounds(187, 190, 93, 36);
		contentPane.add(lblMatKhau);
		
		JLabel lblTaiKhoan = new JLabel("Tài khoản");
		lblTaiKhoan.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTaiKhoan.setBounds(187, 132, 93, 36);
		contentPane.add(lblTaiKhoan);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setBounds(320, 138, 211, 27);
		contentPane.add(txtTaiKhoan);
		txtTaiKhoan.setColumns(10);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setForeground(new Color(0, 0, 255));
		btnDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDangNhap.setBounds(277, 251, 148, 36);
		contentPane.add(btnDangNhap);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnExit.setBounds(453, 251, 148, 36);
		contentPane.add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(320, 195, 211, 29);
		contentPane.add(passwordField);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setLayout(null);
		panelTitle.setForeground(Color.GRAY);
		panelTitle.setBounds(10, 11, 764, 72);
		contentPane.add(panelTitle);
		
		JButton btnMotoGo = new JButton("MOTO GO");
		btnMotoGo.setForeground(Color.BLUE);
		btnMotoGo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnMotoGo.setBackground(Color.WHITE);
		btnMotoGo.setBounds(10, 11, 270, 50);
		panelTitle.add(btnMotoGo);
		
		JLabel lblTitle = new JLabel("Dịch vụ cho thuê xe máy");
		lblTitle.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblTitle.setBounds(316, 22, 249, 36);
		panelTitle.add(lblTitle);
		
		JLabel lblNewLabel = new JLabel("Chưa có tài khoản ?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(284, 322, 113, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnDangKy = new JButton("Đăng ký tài khoản");
		btnDangKy.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnDangKy.setBounds(407, 318, 171, 36);
		contentPane.add(btnDangKy);
	}
}
