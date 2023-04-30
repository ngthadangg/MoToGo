import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;

public class QuanLyKhachHang extends JFrame {

	private JPanel contentPane;
	private JTextField txtSoDienThoaiTimKiem;
	private JTextField txtTenKhachHang;
	private JTextField txtSoDienThoai;
	private JTextField txtDiaChi;
	private JTextField txtCCCD;
	private JTextField txtEmail;
	private JTable tableKhachHang;
	private String[] columnName = {"Tên khách hàng", "Số điện thoại", "CCCD", "Địa chỉ", "Email"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyKhachHang frame = new QuanLyKhachHang();
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
	public QuanLyKhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 764, 540);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 5, 744, 54);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtSoDienThoaiTimKiem = new JTextField();
		txtSoDienThoaiTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtSoDienThoaiTimKiem.setBounds(200, 11, 195, 31);
		panel_1.add(txtSoDienThoaiTimKiem);
		txtSoDienThoaiTimKiem.setColumns(10);
		
		JLabel lblNhapSODienThoai = new JLabel("Nhập số điện thoại Khách hàng:");
		lblNhapSODienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNhapSODienThoai.setBounds(10, 8, 180, 35);
		panel_1.add(lblNhapSODienThoai);
		
		JButton btnHienThiTatCaKhachHang = new JButton("Hiển thị tất cả khách hàng");
		btnHienThiTatCaKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnHienThiTatCaKhachHang.setBounds(526, 13, 208, 26);
		panel_1.add(btnHienThiTatCaKhachHang);
		
		JButton btnTimKiem_1 = new JButton("Tìm kiếm");
		btnTimKiem_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnTimKiem_1.setBounds(405, 13, 111, 26);
		panel_1.add(btnTimKiem_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 70, 744, 459);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 244, 437);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTenKhachHang = new JLabel("Tên khách hàng");
		lblTenKhachHang.setBounds(10, 11, 106, 20);
		lblTenKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_3.add(lblTenKhachHang);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setBounds(10, 127, 47, 20);
		lblDiaChi.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_3.add(lblDiaChi);
		
		JLabel lbSoDienThoai = new JLabel("Số điện thoại");
		lbSoDienThoai.setBounds(10, 69, 86, 20);
		lbSoDienThoai.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_3.add(lbSoDienThoai);
		
		JLabel lblCCCD = new JLabel("CCCD");
		lblCCCD.setBounds(10, 186, 45, 20);
		lblCCCD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_3.add(lblCCCD);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 244, 38, 20);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_3.add(lblEmail);
		
		txtTenKhachHang = new JTextField();
		txtTenKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTenKhachHang.setBounds(10, 31, 224, 27);
		panel_3.add(txtTenKhachHang);
		txtTenKhachHang.setColumns(10);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(10, 89, 224, 27);
		panel_3.add(txtSoDienThoai);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(10, 148, 224, 27);
		panel_3.add(txtDiaChi);
		
		txtCCCD = new JTextField();
		txtCCCD.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtCCCD.setColumns(10);
		txtCCCD.setBounds(10, 206, 224, 27);
		panel_3.add(txtCCCD);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 265, 224, 27);
		panel_3.add(txtEmail);
		
		JButton btnThem = new JButton("Thêm Khách hàng");
		btnThem.setForeground(Color.BLUE);
		btnThem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnThem.setBounds(10, 318, 224, 23);
		panel_3.add(btnThem);
		
		JButton btnSua = new JButton("Cập nhật thông tin khách hàng");
		btnSua.setForeground(new Color(255, 128, 0));
		btnSua.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSua.setBounds(10, 369, 224, 23);
		panel_3.add(btnSua);
		
		JButton btnXoa = new JButton("Xóa Khách hàng");
		btnXoa.setForeground(Color.RED);
		btnXoa.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnXoa.setBounds(12, 414, 222, 23);
		panel_3.add(btnXoa);
		
		tableKhachHang = new JTable(10,5);
		tableKhachHang.setBounds(264, 11, 470, 437);
		panel_2.add(tableKhachHang);
	}
}
