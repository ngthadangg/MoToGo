import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainAdmin frame = new MainAdmin();
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
	public MainAdmin() {
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
		
		JLabel lblXinChoAdmin = new JLabel("Xin chào Admin");
		lblXinChoAdmin.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblXinChoAdmin.setBounds(316, 22, 249, 36);
		panelTitle.add(lblXinChoAdmin);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 94, 764, 356);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnQuanLyKhachHang = new JButton("Quản lý khách hàng");
		btnQuanLyKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnQuanLyKhachHang.setBounds(249, 32, 233, 44);
		panel.add(btnQuanLyKhachHang);
		
		JButton btnQuanLyHopDong = new JButton("Quản lý Hợp đồng cho thuê xe");
		btnQuanLyHopDong.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnQuanLyHopDong.setBounds(249, 108, 233, 44);
		panel.add(btnQuanLyHopDong);
		
		JButton btnQuanLyCacXe = new JButton("Quản lý các xe");
		btnQuanLyCacXe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnQuanLyCacXe.setBounds(249, 177, 233, 44);
		panel.add(btnQuanLyCacXe);
		
		JButton btnThongKeDoanhThu = new JButton("Thống kê doanh thu");
		btnThongKeDoanhThu.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnThongKeDoanhThu.setBounds(249, 257, 233, 44);
		panel.add(btnThongKeDoanhThu);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
