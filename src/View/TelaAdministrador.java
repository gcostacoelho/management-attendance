package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaAdministrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdministrador frame = new TelaAdministrador();
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
	public TelaAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1148, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(204, -11, 930, 637);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(462, 5, 1, 1);
		panel.add(layeredPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Lista de Serviços");
		lblNewLabel_1.setBounds(10, 10, 77, 13);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cadstro de Serviço");
		lblNewLabel_1_1.setBounds(10, 10, 77, 13);
		panel_2.add(lblNewLabel_1_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Lista de Usuários");
		lblNewLabel_1_2.setBounds(10, 10, 96, 13);
		panel_4.add(lblNewLabel_1_2);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cadastrar Usuário");
		lblNewLabel_1_3.setBounds(10, 10, 103, 13);
		panel_5.add(lblNewLabel_1_3);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("Lista de Prioridades");
		lblNewLabel_1_4.setBounds(10, 10, 118, 13);
		panel_6.add(lblNewLabel_1_4);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_1_5 = new JLabel("Cadastro de Prioridade");
		lblNewLabel_1_5.setBounds(10, 10, 126, 13);
		panel_7.add(lblNewLabel_1_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setForeground(new Color(255, 255, 255));
		panel_3.setBounds(0, 0, 207, 626);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Management Attendance");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 187, 25);
		panel_3.add(lblNewLabel);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 0, 0));
		panel_11.setForeground(new Color(0, 0, 0));
		panel_11.setBounds(20, 44, 177, 2);
		panel_3.add(panel_11);
		
		JLabel lblServio = new JLabel("Serviço");
		lblServio.setHorizontalAlignment(SwingConstants.CENTER);
		lblServio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblServio.setBounds(10, 52, 187, 25);
		panel_3.add(lblServio);
		
		JButton btnListServ = new JButton("Lista de Serviços");
		btnListServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(panel_1);
			}
		});
		btnListServ.setBounds(42, 87, 132, 21);
		panel_3.add(btnListServ);
		
		JButton btnCadServ = new JButton("Cadastar Serviço");
		btnCadServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(panel_2);
			}
		});
		btnCadServ.setBounds(42, 118, 132, 21);
		panel_3.add(btnCadServ);
		
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setForeground(Color.BLACK);
		panel_11_1.setBackground(Color.BLACK);
		panel_11_1.setBounds(20, 161, 177, 2);
		panel_3.add(panel_11_1);
		
		JLabel lblServio_1 = new JLabel("Usuário");
		lblServio_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServio_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblServio_1.setBounds(10, 169, 187, 25);
		panel_3.add(lblServio_1);
		
		JButton btnListUser = new JButton("Lista de Usuários");
		btnListUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(panel_4);
			}
		});
		btnListUser.setBounds(42, 204, 132, 21);
		panel_3.add(btnListUser);
		
		JButton btnCadUser = new JButton("Cadastrar Usuário");
		btnCadUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(panel_5);
			}
		});
		btnCadUser.setBounds(42, 235, 132, 21);
		panel_3.add(btnCadUser);
		
		JButton btnCadPrio = new JButton("Cadastrar Prioridade");
		btnCadPrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(panel_7);
			}
		});
		btnCadPrio.setBounds(42, 350, 132, 21);
		panel_3.add(btnCadPrio);
		
		JButton btnListPrio = new JButton("Lista de Prioridades");
		btnListPrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(panel_6);
			}
		});
		btnListPrio.setBounds(42, 319, 132, 21);
		panel_3.add(btnListPrio);
		
		JLabel lblServio_1_1 = new JLabel("Prioridade");
		lblServio_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServio_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblServio_1_1.setBounds(10, 284, 187, 25);
		panel_3.add(lblServio_1_1);
		
		JPanel panel_11_1_1 = new JPanel();
		panel_11_1_1.setForeground(Color.BLACK);
		panel_11_1_1.setBackground(Color.BLACK);
		panel_11_1_1.setBounds(20, 276, 177, 2);
		panel_3.add(panel_11_1_1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(42, 574, 132, 21);
		panel_3.add(btnSair);
	}
}
