import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;

public class XemCacLoaiXe extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String [] columnName = {"Ten Xe", "Hang San Xuat", "Loai Xe", "Tinh Trang", "Bien so xe", "Gia thue xe"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XemCacLoaiXe frame = new XemCacLoaiXe();
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
	public XemCacLoaiXe() {
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
		
		JLabel lblCacLoaiXe = new JLabel("Các loại xe");
		lblCacLoaiXe.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblCacLoaiXe.setBounds(316, 22, 249, 36);
		panelTitle.add(lblCacLoaiXe);
		
		table = new JTable(10,6);
		table.setBounds(20, 94, 754, 356);
		contentPane.add(table);
	}

}
