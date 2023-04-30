import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class QuanLyCacXe extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String [] columnName = {"Ten Xe", "Hang San Xuat", "Loai Xe", "Tinh Trang", "Bien so xe", "Gia thue xe"};
	private JTextField txtTenXe;
	private JTextField txtHangSanXuat;
	private JTextField txtLoaiXe;
	private JTextField txtBienSoXe;
	private JTextField txtTinhTrangXe;
	private JTextField txtGiaThueXe;
	private JTextField txtTimKiemBienSoXe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyCacXe frame = new QuanLyCacXe();
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
	public QuanLyCacXe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable(10,6);
		table.setBounds(292, 94, 484, 456);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(table);
		
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
		
		JLabel lblNhpBinS = new JLabel("Biển số xe ");
		lblNhpBinS.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNhpBinS.setBounds(306, 29, 94, 25);
		panelTitle.add(lblNhpBinS);
		
		txtTimKiemBienSoXe = new JTextField();
		txtTimKiemBienSoXe.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTimKiemBienSoXe.setColumns(10);
		txtTimKiemBienSoXe.setBounds(389, 25, 214, 33);
		panelTitle.add(txtTimKiemBienSoXe);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnTimKiem.setBounds(632, 31, 95, 25);
		panelTitle.add(btnTimKiem);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 97, 262, 453);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTenXe = new JLabel("Tên Xe");
		lblTenXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTenXe.setBounds(10, 11, 68, 25);
		panel.add(lblTenXe);
		
		JLabel lblHangSanXuat = new JLabel("Hãng sản xuất");
		lblHangSanXuat.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblHangSanXuat.setBounds(10, 73, 117, 25);
		panel.add(lblHangSanXuat);
		
		JLabel lblLoaiXe = new JLabel("Loại xe");
		lblLoaiXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLoaiXe.setBounds(10, 141, 68, 25);
		panel.add(lblLoaiXe);
		
		JLabel lblBienSoXe = new JLabel("Biển số xe");
		lblBienSoXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBienSoXe.setBounds(10, 208, 95, 25);
		panel.add(lblBienSoXe);
		
		JLabel lblTinhTrangXe = new JLabel("Tình trạng xe");
		lblTinhTrangXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTinhTrangXe.setBounds(10, 270, 95, 25);
		panel.add(lblTinhTrangXe);
		
		JLabel lblGiaThueXe = new JLabel("Giá thuê xe");
		lblGiaThueXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGiaThueXe.setBounds(10, 328, 95, 25);
		panel.add(lblGiaThueXe);
		
		txtTenXe = new JTextField();
		txtTenXe.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTenXe.setBounds(20, 36, 214, 33);
		panel.add(txtTenXe);
		txtTenXe.setColumns(10);
		
		txtHangSanXuat = new JTextField();
		txtHangSanXuat.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtHangSanXuat.setColumns(10);
		txtHangSanXuat.setBounds(20, 97, 214, 33);
		panel.add(txtHangSanXuat);
		
		txtLoaiXe = new JTextField();
		txtLoaiXe.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtLoaiXe.setColumns(10);
		txtLoaiXe.setBounds(20, 164, 214, 33);
		panel.add(txtLoaiXe);
		
		txtBienSoXe = new JTextField();
		txtBienSoXe.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtBienSoXe.setColumns(10);
		txtBienSoXe.setBounds(20, 231, 214, 33);
		panel.add(txtBienSoXe);
		
		txtTinhTrangXe = new JTextField();
		txtTinhTrangXe.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTinhTrangXe.setColumns(10);
		txtTinhTrangXe.setBounds(20, 296, 214, 33);
		panel.add(txtTinhTrangXe);
		
		txtGiaThueXe = new JTextField();
		txtGiaThueXe.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtGiaThueXe.setColumns(10);
		txtGiaThueXe.setBounds(20, 352, 214, 33);
		panel.add(txtGiaThueXe);
		
		JButton btnThem = new JButton("Thêm Xe");
		btnThem.setForeground(new Color(0, 0, 255));
		btnThem.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnThem.setBounds(10, 398, 95, 25);
		panel.add(btnThem);
		
		JButton btnCapNhat = new JButton("Cập nhật xe");
		btnCapNhat.setForeground(new Color(255, 0, 255));
		btnCapNhat.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCapNhat.setBounds(115, 398, 119, 25);
		panel.add(btnCapNhat);
		
		JButton btnXoa = new JButton("Xóa Xe");
		btnXoa.setForeground(new Color(255, 0, 0));
		btnXoa.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnXoa.setBounds(58, 428, 95, 25);
		panel.add(btnXoa);
	}
}
