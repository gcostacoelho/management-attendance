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
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

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
		
		JPanel lista_servicos = new JPanel();
		lista_servicos.setForeground(new Color(51, 51, 51));
		tabbedPane.addTab("New tab", null, lista_servicos, null);
		lista_servicos.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Lista de Serviços");
		lblNewLabel_1.setBounds(12, 37, 156, 13);
		lista_servicos.add(lblNewLabel_1);
		
		JPanel desc_bar = new JPanel();
		desc_bar.setBackground(new Color(154, 153, 150));
		desc_bar.setBounds(12, 64, 891, 39);
		lista_servicos.add(desc_bar);
		desc_bar.setLayout(null);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(8, 8, 21, 23);
		desc_bar.add(checkBox);
		
		JTextPane txtpnSigla = new JTextPane();
		txtpnSigla.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnSigla.setBackground(new Color(154, 153, 150));
		txtpnSigla.setEditable(false);
		txtpnSigla.setText("Sigla");
		txtpnSigla.setBounds(37, 8, 42, 21);
		desc_bar.add(txtpnSigla);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setText("Nome");
		txtpnNome.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(new Color(154, 153, 150));
		txtpnNome.setBounds(91, 8, 42, 21);
		desc_bar.add(txtpnNome);
		
		JTextPane txtpnDescrio = new JTextPane();
		txtpnDescrio.setText("Descrição");
		txtpnDescrio.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnDescrio.setEditable(false);
		txtpnDescrio.setBackground(new Color(154, 153, 150));
		txtpnDescrio.setBounds(303, 8, 91, 21);
		desc_bar.add(txtpnDescrio);
		
		JTextPane txtpnStatus = new JTextPane();
		txtpnStatus.setText("Status");
		txtpnStatus.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnStatus.setEditable(false);
		txtpnStatus.setBackground(new Color(154, 153, 150));
		txtpnStatus.setBounds(552, 8, 64, 21);
		desc_bar.add(txtpnStatus);
		
		JTextPane txtpnAes = new JTextPane();
		txtpnAes.setText("Ações");
		txtpnAes.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnAes.setEditable(false);
		txtpnAes.setBackground(new Color(154, 153, 150));
		txtpnAes.setBounds(799, 8, 49, 21);
		desc_bar.add(txtpnAes);
		
		JList list_1 = new JList();
		list_1.setBounds(22, 115, 881, 436);
		lista_servicos.add(list_1);
		
		JPanel cadastro_servico = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_servico, null);
		cadastro_servico.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cadastro de Serviço");
		lblNewLabel_1_1.setBounds(10, 10, 146, 13);
		cadastro_servico.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(20, 35, 893, 542);
		cadastro_servico.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 48, 196, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblInformeASigla = new JLabel("Informe a sigla");
		lblInformeASigla.setBounds(22, 21, 114, 15);
		panel_1.add(lblInformeASigla);
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 48, 534, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(267, 21, 114, 15);
		panel_1.add(lblNome);
		
		JLabel lblInformeADescrio = new JLabel("Informe a descrição");
		lblInformeADescrio.setBounds(22, 91, 196, 15);
		panel_1.add(lblInformeADescrio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(22, 118, 779, 172);
		panel_1.add(textField_2);
		
		JLabel lblInformeOStatus = new JLabel("Informe o status");
		lblInformeOStatus.setBounds(22, 329, 196, 15);
		panel_1.add(lblInformeOStatus);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 356, 196, 24);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Cadastrar Serviço");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(633, 477, 168, 25);
		panel_1.add(btnNewButton);
		
		JPanel lista_usuario = new JPanel();
		tabbedPane.addTab("New tab", null, lista_usuario, null);
		lista_usuario.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Lista de Usuários");
		lblNewLabel_1_2.setBounds(10, 10, 175, 13);
		lista_usuario.add(lblNewLabel_1_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome"
			}
		));
		table.setBounds(23, 94, 362, 189);
		lista_usuario.add(table);
		
		JPanel cadastro_usuario = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_usuario, null);
		cadastro_usuario.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cadastrar Usuário");
		lblNewLabel_1_3.setBounds(10, 10, 103, 13);
		cadastro_usuario.add(lblNewLabel_1_3);
		
		JPanel lista_prioridade = new JPanel();
		tabbedPane.addTab("New tab", null, lista_prioridade, null);
		lista_prioridade.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("Lista de Prioridades");
		lblNewLabel_1_4.setBounds(10, 10, 118, 13);
		lista_prioridade.add(lblNewLabel_1_4);
		
		JPanel cadastro_prioridade = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_prioridade, null);
		cadastro_prioridade.setLayout(null);
		
		JLabel lblNewLabel_1_5 = new JLabel("Cadastro de Prioridade");
		lblNewLabel_1_5.setBounds(10, 10, 126, 13);
		cadastro_prioridade.add(lblNewLabel_1_5);
		
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
		
		JButton btnListServ = new JButton("Lista");
		btnListServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(lista_servicos);
			}
		});
		btnListServ.setBounds(30, 85, 154, 21);
		panel_3.add(btnListServ);
		
		JButton btnCadServ = new JButton("Cadastar");
		btnCadServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_servico);
			}
		});
		btnCadServ.setBounds(30, 118, 154, 21);
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
		
		JButton btnListUser = new JButton("Lista");
		btnListUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(lista_usuario);
			}
		});
		btnListUser.setBounds(42, 204, 132, 21);
		panel_3.add(btnListUser);
		
		JButton btnCadUser = new JButton("Cadastrar");
		btnCadUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_usuario);
			}
		});
		btnCadUser.setBounds(42, 235, 132, 21);
		panel_3.add(btnCadUser);
		
		JButton btnCadPrio = new JButton("Cadastrar Prioridade");
		btnCadPrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_prioridade);
			}
		});
		btnCadPrio.setBounds(42, 350, 132, 21);
		panel_3.add(btnCadPrio);
		
		JButton btnListPrio = new JButton("Lista de Prioridades");
		btnListPrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(lista_prioridade);
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
