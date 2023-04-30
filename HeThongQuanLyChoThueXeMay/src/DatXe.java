import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DatXe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatXe frame = new DatXe();
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
	public DatXe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.GRAY);
		panel.setBounds(22, 94, 539, 356);
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
		
		JLabel lblTienThueXe = new JLabel("Tiền Thuê Xe");
		lblTienThueXe.setForeground(Color.WHITE);
		lblTienThueXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTienThueXe.setBounds(10, 256, 179, 33);
		panel.add(lblTienThueXe);
		
		JLabel lblTrngThit = new JLabel("Trạng thái đặt xe");
		lblTrngThit.setForeground(Color.WHITE);
		lblTrngThit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTrngThit.setBounds(10, 300, 179, 33);
		panel.add(lblTrngThit);
		
		JLabel lblLoaiXe = new JLabel("Loại xe");
		lblLoaiXe.setForeground(Color.WHITE);
		lblLoaiXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLoaiXe.setBounds(10, 71, 179, 33);
		panel.add(lblLoaiXe);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(237, 27, 253, 27);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(237, 78, 253, 27);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(237, 127, 253, 27);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(237, 171, 253, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(237, 216, 253, 27);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(237, 263, 253, 27);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(237, 307, 253, 27);
		panel.add(textField_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(571, 94, 191, 356);
		contentPane.add(panel_1);
		
		JButton btnDatXe = new JButton("Đặt xe");
		btnDatXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDatXe.setBounds(37, 102, 126, 29);
		panel_1.add(btnDatXe);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnReset.setBounds(37, 170, 126, 29);
		panel_1.add(btnReset);
		
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
		
		JLabel lblDatXe = new JLabel("Đặt xe");
		lblDatXe.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblDatXe.setBounds(316, 22, 249, 36);
		panelTitle.add(lblDatXe);
	}

}
