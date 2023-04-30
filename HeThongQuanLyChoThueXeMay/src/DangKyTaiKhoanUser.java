import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DangKyTaiKhoanUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangKyTaiKhoanUser frame = new DangKyTaiKhoanUser();
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
	public DangKyTaiKhoanUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblngKTi = new JLabel("Đăng ký tài khoản");
		lblngKTi.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblngKTi.setBounds(316, 22, 249, 36);
		panelTitle.add(lblngKTi);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 94, 764, 356);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTenKhachHang = new JLabel("Tên khách hàng");
		lblTenKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTenKhachHang.setBounds(82, 44, 116, 36);
		panel.add(lblTenKhachHang);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDiaChi.setBounds(82, 101, 116, 36);
		panel.add(lblDiaChi);
		
		JLabel lbSoDienThoai = new JLabel("Số điện thoại");
		lbSoDienThoai.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbSoDienThoai.setBounds(82, 160, 116, 36);
		panel.add(lbSoDienThoai);
		
		JLabel lblCCCD = new JLabel("CCCD");
		lblCCCD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCCCD.setBounds(82, 212, 116, 36);
		panel.add(lblCCCD);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEmail.setBounds(82, 269, 116, 36);
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(224, 269, 276, 29);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(224, 216, 276, 29);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(224, 160, 276, 29);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(224, 101, 276, 29);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(224, 44, 276, 29);
		panel.add(textField_4);
		
		JButton btnLuuThongTin = new JButton("Lưu thông tin");
		btnLuuThongTin.setForeground(Color.BLUE);
		btnLuuThongTin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLuuThongTin.setBounds(570, 105, 153, 32);
		panel.add(btnLuuThongTin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.RED);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBounds(570, 168, 153, 32);
		panel.add(btnReset);
	}

}
