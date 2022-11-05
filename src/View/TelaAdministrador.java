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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.ControladorPrincipal;
import Model.Entity.Funcionario;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;

public class TelaAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField nomeFunc;
	private JTextField cpfFunc;
	private JTextField cargoFunc;
	private JTextField emailFunc;
	private JTextField telFunc;
	private final JComboBox permiFunc = new JComboBox();
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
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Sigla", "Nome", "Descri\u00E7\u00E3o", "Status"
			}
		));
		table_1.getColumnModel().getColumn(0).setMinWidth(16);
		table_1.setBounds(12, 135, 891, 453);
		lista_servicos.add(table_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Lista de Serviços");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_3.setBounds(10, 20, 175, 24);
		lista_servicos.add(lblNewLabel_1_2_3);
		
		JPanel cadastro_servico = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_servico, null);
		cadastro_servico.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(20, 74, 893, 503);
		cadastro_servico.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 48, 196, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 48, 534, 22);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(22, 118, 779, 172);
		panel_1.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 356, 196, 24);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Cadastrar Serviço");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(633, 468, 168, 25);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2_2 = new JLabel("Informe a Sigla");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(22, 25, 124, 22);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Informe o Nome");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1.setBounds(266, 25, 124, 22);
		panel_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Infome a Descrição");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_2.setBounds(22, 94, 124, 22);
		panel_1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Informe o Status");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_3.setBounds(22, 332, 124, 22);
		panel_1.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Cadastro de Serviço");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_2.setBounds(10, 23, 175, 24);
		cadastro_servico.add(lblNewLabel_1_2_2);
		
		JPanel lista_usuario = new JPanel();
		tabbedPane.addTab("New tab", null, lista_usuario, null);
		lista_usuario.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Lista de Funcionário");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(10, 29, 189, 24);
		lista_usuario.add(lblNewLabel_1_2);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Teste", "523.123.154-09", null},
			},
			new String[] {
				"Nome", "CPF", "Crago"
			}
		));
		table.setBounds(10, 143, 905, 457);
		lista_usuario.add(table);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Usuário");
		btnNewButton_1.setBounds(743, 75, 141, 25);
		lista_usuario.add(btnNewButton_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Excluir", "Atualizar"}));
		comboBox_1.setBounds(59, 86, 111, 21);
		lista_usuario.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ação:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(20, 89, 45, 13);
		lista_usuario.add(lblNewLabel_2);
		
		JPanel cadastro_usuario = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_usuario, null);
		cadastro_usuario.setLayout(null);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Cadastro de Funcionário");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_2_1_1.setBounds(10, 30, 216, 24);
		cadastro_usuario.add(lblNewLabel_1_2_2_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(20, 81, 893, 429);
		cadastro_usuario.add(panel_1_1_1);
		
		nomeFunc = new JTextField();
		nomeFunc.setColumns(10);
		nomeFunc.setBounds(23, 50, 534, 22);
		panel_1_1_1.add(nomeFunc);
		
		JButton btnNewButton_2_1 = new JButton("Cadastrar Usuário");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorPrincipal controller = new ControladorPrincipal();
		        controller.executa(TelaAdministrador.this);
		        JOptionPane.showMessageDialog(null, nomeFunc.getText() + " Cadastrado com sucesso!");
		        telFunc.setText("");
				cpfFunc.setText("");
				emailFunc.setText("");
				nomeFunc.setText("");
			}
		});
		btnNewButton_2_1.setBounds(645, 363, 168, 25);
		panel_1_1_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Informe o Nome");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1_1.setBounds(22, 27, 124, 22);
		panel_1_1_1.add(lblNewLabel_2_2_1_1_1);
		
		cpfFunc = new JTextField();
		cpfFunc.setColumns(10);
		cpfFunc.setBounds(24, 123, 203, 22);
		panel_1_1_1.add(cpfFunc);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Informe o CPF");
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1_1_1.setBounds(23, 100, 124, 22);
		panel_1_1_1.add(lblNewLabel_2_2_1_1_1_1);
		
		cargoFunc = new JTextField();
		cargoFunc.setColumns(10);
		cargoFunc.setBounds(268, 123, 289, 22);
		panel_1_1_1.add(cargoFunc);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Informe o Cargo");
		lblNewLabel_2_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1_1_1_1.setBounds(267, 100, 124, 22);
		panel_1_1_1.add(lblNewLabel_2_2_1_1_1_1_1);
		
		emailFunc = new JTextField();
		emailFunc.setColumns(10);
		emailFunc.setBounds(24, 208, 203, 22);
		panel_1_1_1.add(emailFunc);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1 = new JLabel("Informe o E-mail");
		lblNewLabel_2_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1_1_1_1_1.setBounds(23, 185, 204, 22);
		panel_1_1_1.add(lblNewLabel_2_2_1_1_1_1_1_1);
		
		telFunc = new JTextField();
		telFunc.setColumns(10);
		telFunc.setBounds(269, 208, 203, 22);
		panel_1_1_1.add(telFunc);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1_1 = new JLabel("Informe o Telefone");
		lblNewLabel_2_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1_1_1_1_1_1.setBounds(268, 185, 204, 22);
		panel_1_1_1.add(lblNewLabel_2_2_1_1_1_1_1_1_1);
		
		JComboBox permiFunc = new JComboBox();
		permiFunc.setModel(new DefaultComboBoxModel(new String[] {"Atendente", "Administrador"}));
		permiFunc.setBounds(23, 301, 196, 24);
		panel_1_1_1.add(permiFunc);
		
		JLabel lblNewLabel_2_2_3_2 = new JLabel("Informe o Permissão");
		lblNewLabel_2_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_3_2.setBounds(23, 277, 124, 22);
		panel_1_1_1.add(lblNewLabel_2_2_3_2);
		
		JPanel lista_prioridade = new JPanel();
		tabbedPane.addTab("New tab", null, lista_prioridade, null);
		lista_prioridade.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Lista de Prioridades");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(10, 10, 175, 24);
		lista_prioridade.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ação:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(20, 70, 45, 13);
		lista_prioridade.add(lblNewLabel_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Excluir", "Atualizar"}));
		comboBox_1_1.setBounds(59, 67, 111, 21);
		lista_prioridade.add(comboBox_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Cadastrar Prioridade");
		btnNewButton_1_1.setBounds(744, 65, 141, 25);
		lista_prioridade.add(btnNewButton_1_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Descri\u00E7\u00E3o", "Peso", "Status"
			}
		));
		table_2.setBounds(10, 109, 905, 457);
		lista_prioridade.add(table_2);
		
		JPanel cadastro_prioridade = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_prioridade, null);
		cadastro_prioridade.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(20, 76, 893, 503);
		cadastro_prioridade.add(panel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(23, 50, 534, 22);
		panel_1_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(22, 118, 779, 172);
		panel_1_1.add(textField_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(22, 356, 196, 24);
		panel_1_1.add(comboBox_2);
		
		JButton btnNewButton_2 = new JButton("Cadastrar Serviço");
		btnNewButton_2.setBounds(633, 468, 168, 25);
		panel_1_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Informe o Nome");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1.setBounds(22, 27, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Infome a Descrição");
		lblNewLabel_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_2_1.setBounds(22, 94, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("Informe o Peso");
		lblNewLabel_2_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_3_1.setBounds(22, 332, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_3_1);
		
		JLabel lblNewLabel_2_2_3_1_1 = new JLabel("Informe o Status");
		lblNewLabel_2_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_3_1_1.setBounds(361, 332, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_3_1_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(361, 356, 196, 24);
		panel_1_1.add(comboBox_2_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Cadastro de Prioridade");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_2_1.setBounds(10, 25, 216, 24);
		cadastro_prioridade.add(lblNewLabel_1_2_2_1);
		
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
		btnListServ.setBounds(42, 87, 132, 21);
		panel_3.add(btnListServ);
		
		JButton btnCadServ = new JButton("Cadastar");
		btnCadServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_servico);
			}
		});
		btnCadServ.setBounds(42, 118, 132, 21);
		panel_3.add(btnCadServ);
		
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setForeground(Color.BLACK);
		panel_11_1.setBackground(Color.BLACK);
		panel_11_1.setBounds(20, 161, 177, 2);
		panel_3.add(panel_11_1);
		
		JLabel lblServio_1 = new JLabel("Funcionário");
		lblServio_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServio_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblServio_1.setBounds(10, 169, 187, 25);
		panel_3.add(lblServio_1);
		
		JButton btnListUser = new JButton("Lista");
		btnListUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(lista_usuario);
				addLinha();
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
		
		JButton btnCadPrio = new JButton("Cadastrar");
		btnCadPrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_prioridade);
			}
		});
		btnCadPrio.setBounds(42, 350, 132, 21);
		panel_3.add(btnCadPrio);
		
		JButton btnListPrio = new JButton("Lista");
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
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSair.setBounds(42, 574, 132, 21);
		panel_3.add(btnSair);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public JTable getTable() {
		return table;
	}

	public JTable getTable_1() {
		return table_1;
	}

	public JTable getTable_2() {
		return table_2;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public JTextField getNomeFunc() {
		return nomeFunc;
	}

	public JTextField getCpfFunc() {
		return cpfFunc;
	}

	public JTextField getCargoFunc() {
		return cargoFunc;
	}

	public JTextField getEmailFunc() {
		return emailFunc;
	}

	public JTextField getTelFunc() {
		return telFunc;
	}
	
	public JComboBox getpermiFunc() {
		return permiFunc;
	}
	public void addLinha() {
		DefaultTableModel model =  (DefaultTableModel)table.getModel();
		ControladorPrincipal controle = new ControladorPrincipal();
		ArrayList<Funcionario> funcionarios = controle.consultar();
		model.setNumRows(0);
		for(int i=0; i < funcionarios.size() ; i++) {
			model.addRow((new String[] {funcionarios.get(i).getNomeFun(), funcionarios.get(i).getCpf(), funcionarios.get(i).getCargo()}));
		}
	}
}
