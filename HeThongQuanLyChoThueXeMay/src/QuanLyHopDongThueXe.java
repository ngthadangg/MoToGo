import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class QuanLyHopDongThueXe extends JFrame {

	private JPanel contentPane;
	private JTextField txtSoDienThoai;
	private JTextField txtLoaiXe;
	private JTextField txtBienSoXe;
	private JTextField txtThoiGianThueXe;
	private JTextField txtThoiGianTraXe;
	private JTextField txtTienThueXe;
	private JTextField txtTrangThai;
	private JTextField txtSoDienThoaiTimKiem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyHopDongThueXe frame = new QuanLyHopDongThueXe();
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
	public QuanLyHopDongThueXe() {
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
		
		JLabel lblHopDongThueXe = new JLabel("Hợp đồng thuê xe");
		lblHopDongThueXe.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblHopDongThueXe.setBounds(316, 22, 249, 36);
		panelTitle.add(lblHopDongThueXe);
		
		JPanel panel = new JPanel();
		panel.setBounds(235, 94, 539, 356);
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		
		JLabel lblSoDienThoai = new JLabel("Số điện thoại khách hàng");
		lblSoDienThoai.setForeground(Color.WHITE);
		lblSoDienThoai.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSoDienThoai.setBounds(10, 27, 179, 33);
		panel.add(lblSoDienThoai);
		
		JLabel lblBienSoXe = new JLabel("Biển số xe");
		lblBienSoXe.setForeground(Color.WHITE);
		lblBienSoXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBienSoXe.setBounds(10, 120, 179, 33);
		panel.add(lblBienSoXe);
		
		JLabel lblThoiGianThueXe = new JLabel("Thời gian  thuê xe");
		lblThoiGianThueXe.setForeground(Color.WHITE);
		lblThoiGianThueXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblThoiGianThueXe.setBounds(10, 164, 179, 33);
		panel.add(lblThoiGianThueXe);
		
		JLabel lblThoiGianTraXe = new JLabel("Thời gian trả xe");
		lblThoiGianTraXe.setForeground(Color.WHITE);
		lblThoiGianTraXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblThoiGianTraXe.setBounds(10, 209, 179, 33);
		panel.add(lblThoiGianTraXe);
		
		JLabel lblTienThuXe = new JLabel("Tiền Thuê Xe ");
		lblTienThuXe.setForeground(Color.WHITE);
		lblTienThuXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTienThuXe.setBounds(10, 256, 179, 33);
		panel.add(lblTienThuXe);
		
		JLabel lblTrangThai = new JLabel("Trạng thái đặt xe");
		lblTrangThai.setForeground(Color.WHITE);
		lblTrangThai.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTrangThai.setBounds(10, 300, 179, 33);
		panel.add(lblTrangThai);
		
		JLabel lblLoaiXe = new JLabel("Loại xe");
		lblLoaiXe.setForeground(Color.WHITE);
		lblLoaiXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLoaiXe.setBounds(10, 71, 179, 33);
		panel.add(lblLoaiXe);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(237, 27, 253, 27);
		panel.add(txtSoDienThoai);
		
		txtLoaiXe = new JTextField();
		txtLoaiXe.setColumns(10);
		txtLoaiXe.setBounds(237, 78, 253, 27);
		panel.add(txtLoaiXe);
		
		txtBienSoXe = new JTextField();
		txtBienSoXe.setColumns(10);
		txtBienSoXe.setBounds(237, 127, 253, 27);
		panel.add(txtBienSoXe);
		
		txtThoiGianThueXe = new JTextField();
		txtThoiGianThueXe.setColumns(10);
		txtThoiGianThueXe.setBounds(237, 171, 253, 27);
		panel.add(txtThoiGianThueXe);
		
		txtThoiGianTraXe = new JTextField();
		txtThoiGianTraXe.setColumns(10);
		txtThoiGianTraXe.setBounds(237, 216, 253, 27);
		panel.add(txtThoiGianTraXe);
		
		txtTienThueXe = new JTextField();
		txtTienThueXe.setColumns(10);
		txtTienThueXe.setBounds(237, 263, 253, 27);
		panel.add(txtTienThueXe);
		
		txtTrangThai = new JTextField();
		txtTrangThai.setColumns(10);
		txtTrangThai.setBounds(237, 307, 253, 27);
		panel.add(txtTrangThai);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 94, 216, 356);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNhapSoDienThoai = new JLabel("Nhập số điện thoại khách hàng");
		lblNhapSoDienThoai.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNhapSoDienThoai.setBounds(10, 48, 196, 32);
		panel_1.add(lblNhapSoDienThoai);
		
		txtSoDienThoaiTimKiem = new JTextField();
		txtSoDienThoaiTimKiem.setBounds(20, 91, 186, 32);
		panel_1.add(txtSoDienThoaiTimKiem);
		txtSoDienThoaiTimKiem.setColumns(10);
		
		JButton btnTimKiem = new JButton("Tìm kiếm hợp đồng");
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnTimKiem.setBounds(25, 150, 169, 32);
		panel_1.add(btnTimKiem);
	}
}
