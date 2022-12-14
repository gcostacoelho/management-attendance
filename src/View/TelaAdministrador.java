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

import Controller.ControladorFuncionario;
import Controller.ControladorManterServico;
import Controller.ControladorPrioridade;
import Model.Entity.Funcionario;
import Model.Entity.Prioridade;
import Model.Entity.Servico;
import Model.Entity.ComboItem;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField siglaServ;
	private JTextField nomeServ;
	private JTextField descServ;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField nomePri;
	private JTextField descricaoPri;
	private JTextField nomeFunc;
	private JTextField cpfFunc;
	private JTextField cargoFunc;
	private JTextField emailFunc;
	private JTextField telFunc;
	private JComboBox permiFunc;
	private JComboBox pesoPri;
	private JComboBox statusPri;
	private JComboBox servico_select;
	private JTextField usuarioFunc;
	private JTextField senhaFunc;
	
	/*--------------*/
	private JComboBox statusServ;
	
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
		tabbedPane.setBounds(204, -26, 930, 652);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(462, 5, 1, 1);
		panel.add(layeredPane);
		
		JPanel lista_funcionario = new JPanel();
		tabbedPane.addTab("New tab", null, lista_funcionario, null);
		lista_funcionario.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Lista de Funcion??rio");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(10, 29, 189, 24);
		lista_funcionario.add(lblNewLabel_1_2);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Irineu", "487794949", null},
			},
			new String[] {
				"Nome", "CPF", "Cargo"
			}
		));
		table.setBounds(10, 168, 905, 432);
		lista_funcionario.add(table);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Excluir", "Atualizar"}));
		comboBox_1.setBounds(59, 86, 111, 21);
		lista_funcionario.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("A????o:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(20, 89, 45, 13);
		lista_funcionario.add(lblNewLabel_2);
		
		JPanel desc_bar_1 = new JPanel();
		desc_bar_1.setLayout(null);
		desc_bar_1.setBackground(new Color(154, 153, 150));
		desc_bar_1.setBounds(10, 119, 908, 41);
		lista_funcionario.add(desc_bar_1);
		
		JTextPane txtpnNome_1 = new JTextPane();
		txtpnNome_1.setText("Nome");
		txtpnNome_1.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnNome_1.setEditable(false);
		txtpnNome_1.setBackground(new Color(154, 153, 150));
		txtpnNome_1.setBounds(17, 10, 42, 21);
		desc_bar_1.add(txtpnNome_1);
		
		JTextPane txtpnCpf = new JTextPane();
		txtpnCpf.setText("CPF");
		txtpnCpf.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnCpf.setEditable(false);
		txtpnCpf.setBackground(new Color(154, 153, 150));
		txtpnCpf.setBounds(310, 10, 91, 21);
		desc_bar_1.add(txtpnCpf);
		
		JTextPane txtpnCargo = new JTextPane();
		txtpnCargo.setText("Cargo");
		txtpnCargo.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnCargo.setEditable(false);
		txtpnCargo.setBackground(new Color(154, 153, 150));
		txtpnCargo.setBounds(607, 10, 64, 21);
		desc_bar_1.add(txtpnCargo);
		
		JPanel lista_servicos = new JPanel();
		lista_servicos.setForeground(new Color(51, 51, 51));
		tabbedPane.addTab("New tab", null, lista_servicos, null);
		lista_servicos.setLayout(null);
		
		JPanel desc_bar = new JPanel();
		desc_bar.setBackground(new Color(154, 153, 150));
		desc_bar.setBounds(12, 92, 891, 39);
		lista_servicos.add(desc_bar);
		desc_bar.setLayout(null);
		
		JTextPane txtpnSigla = new JTextPane();
		txtpnSigla.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnSigla.setBackground(new Color(154, 153, 150));
		txtpnSigla.setEditable(false);
		txtpnSigla.setText("Sigla");
		txtpnSigla.setBounds(12, 8, 42, 21);
		desc_bar.add(txtpnSigla);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setText("Nome");
		txtpnNome.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(new Color(154, 153, 150));
		txtpnNome.setBounds(223, 8, 42, 21);
		desc_bar.add(txtpnNome);
		
		JTextPane txtpnDescrio = new JTextPane();
		txtpnDescrio.setText("Descri????o");
		txtpnDescrio.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnDescrio.setEditable(false);
		txtpnDescrio.setBackground(new Color(154, 153, 150));
		txtpnDescrio.setBounds(449, 8, 91, 21);
		desc_bar.add(txtpnDescrio);
		
		JTextPane txtpnStatus = new JTextPane();
		txtpnStatus.setText("Status");
		txtpnStatus.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnStatus.setEditable(false);
		txtpnStatus.setBackground(new Color(154, 153, 150));
		txtpnStatus.setBounds(672, 8, 64, 21);
		desc_bar.add(txtpnStatus);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"bdbd", "bdbd", "bdbdbb", null},
			},
			new String[] {
				"Sigla", "Nome", "Descri\u00E7\u00E3o", "Status"
			}
		));
		table_1.getColumnModel().getColumn(0).setMinWidth(16);
		table_1.setBounds(12, 143, 891, 445);
		lista_servicos.add(table_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Lista de Servi??os");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_3.setBounds(10, 20, 175, 24);
		lista_servicos.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("A????o:");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(12, 59, 45, 13);
		lista_servicos.add(lblNewLabel_2_3);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"Excluir", "Atualizar"}));
		comboBox_1_2.setBounds(51, 56, 111, 21);
		lista_servicos.add(comboBox_1_2);
		
		JPanel cadastro_servico = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_servico, null);
		cadastro_servico.setLayout(null);
		
		JButton btnNewButton_1_2 = new JButton("Cadastrar Servi??os");
		btnNewButton_1_2.setBounds(730, 53, 172, 25);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_servico);
			}
		});
		lista_servicos.add(btnNewButton_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(20, 74, 893, 503);
		cadastro_servico.add(panel_1);
		panel_1.setLayout(null);
		
		siglaServ = new JTextField();
		siglaServ.setBounds(22, 48, 196, 22);
		panel_1.add(siglaServ);
		siglaServ.setColumns(10);
		
		nomeServ = new JTextField();
		nomeServ.setBounds(267, 48, 534, 22);
		panel_1.add(nomeServ);
		nomeServ.setColumns(10);
		
		descServ = new JTextField();
		descServ.setColumns(10);
		descServ.setBounds(22, 118, 779, 172);
		panel_1.add(descServ);
		
		statusServ = new JComboBox();
		statusServ.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		statusServ.setBounds(22, 356, 196, 24);
		panel_1.add(statusServ);
		
		JButton btnNewButton = new JButton("Cadastrar Servi??o");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorManterServico controller = new ControladorManterServico();
				controller.executa(TelaAdministrador.this);
				JOptionPane.showMessageDialog(null, nomeServ.getText() + " Cadastrado com sucesso!");
				siglaServ.setText("");
				nomeServ.setText("");
				descServ.setText("");
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
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Infome a Descri????o");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_2.setBounds(22, 94, 124, 22);
		panel_1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Informe o Status");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_3.setBounds(22, 332, 124, 22);
		panel_1.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Cadastro de Servi??o");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_2.setBounds(10, 23, 175, 24);
		cadastro_servico.add(lblNewLabel_1_2_2);
		
		JPanel cadastro_funcionario = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_funcionario, null);
		cadastro_funcionario.setLayout(null);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Cadastro de Funcion??rio");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_2_1_1.setBounds(10, 30, 216, 24);
		cadastro_funcionario.add(lblNewLabel_1_2_2_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(20, 81, 893, 429);
		cadastro_funcionario.add(panel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Funcion??rio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_funcionario);
			}
		});
		btnNewButton_1.setBounds(743, 84, 172, 25);
		lista_funcionario.add(btnNewButton_1);
		
		nomeFunc = new JTextField();
		nomeFunc.setColumns(10);
		nomeFunc.setBounds(23, 50, 534, 22);
		panel_1_1_1.add(nomeFunc);
		
		JButton btnNewButton_2_1 = new JButton("Cadastrar Funcion??rio");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorFuncionario controller = new ControladorFuncionario();
		        controller.executa(TelaAdministrador.this);
		        JOptionPane.showMessageDialog(null, nomeFunc.getText() + " Cadastrado com sucesso!");
		        telFunc.setText("");
				cpfFunc.setText("");
				emailFunc.setText("");
				nomeFunc.setText("");
				cargoFunc.setText("");
				usuarioFunc.setText("");
				senhaFunc.setText("");
				
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
		
		permiFunc = new JComboBox();
		permiFunc.setModel(new DefaultComboBoxModel(new String[] {"Atendente", "Administrador"}));
		permiFunc.setBounds(23, 301, 196, 24);
		panel_1_1_1.add(permiFunc);
		
		JLabel lblNewLabel_2_2_3_2 = new JLabel("Informe a Permiss??o");
		lblNewLabel_2_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_3_2.setBounds(23, 277, 124, 22);
		panel_1_1_1.add(lblNewLabel_2_2_3_2);
		
		usuarioFunc = new JTextField();
		usuarioFunc.setColumns(10);
		usuarioFunc.setBounds(629, 51, 203, 22);
		panel_1_1_1.add(usuarioFunc);
		
		senhaFunc = new JTextField();
		senhaFunc.setColumns(10);
		senhaFunc.setBounds(629, 124, 203, 22);
		panel_1_1_1.add(senhaFunc);
		
		JLabel lblNewLabel_2_2_1_1_1_1_2 = new JLabel("Informe o Usu??rio");
		lblNewLabel_2_2_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1_1_1_2.setBounds(629, 27, 124, 22);
		panel_1_1_1.add(lblNewLabel_2_2_1_1_1_1_2);
		
		JLabel lblNewLabel_2_2_1_1_1_1_3 = new JLabel("Informe a Senha");
		lblNewLabel_2_2_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1_1_1_3.setBounds(629, 100, 124, 22);
		panel_1_1_1.add(lblNewLabel_2_2_1_1_1_1_3);
		
		JPanel lista_prioridade = new JPanel();
		tabbedPane.addTab("New tab", null, lista_prioridade, null);
		lista_prioridade.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Lista de Prioridades");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(10, 10, 175, 24);
		lista_prioridade.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("A????o:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(20, 70, 45, 13);
		lista_prioridade.add(lblNewLabel_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Excluir", "Atualizar"}));
		comboBox_1_1.setBounds(59, 67, 111, 21);
		lista_prioridade.add(comboBox_1_1);
		

		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"ttet", "tete", "tetet", null},
			},
			new String[] {
				"Nome", "Descri\u00E7\u00E3o", "Peso", "Status"
			}
		));
		table_2.setBounds(10, 143, 905, 423);
		lista_prioridade.add(table_2);
		
		JPanel desc_bar_1_1 = new JPanel();
		desc_bar_1_1.setLayout(null);
		desc_bar_1_1.setBackground(new Color(154, 153, 150));
		desc_bar_1_1.setBounds(10, 95, 908, 41);
		lista_prioridade.add(desc_bar_1_1);
		
		JTextPane txtpnNome_1_1 = new JTextPane();
		txtpnNome_1_1.setText("Nome");
		txtpnNome_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnNome_1_1.setEditable(false);
		txtpnNome_1_1.setBackground(new Color(154, 153, 150));
		txtpnNome_1_1.setBounds(17, 10, 42, 21);
		desc_bar_1_1.add(txtpnNome_1_1);
		
		JTextPane txtpnDescrio_1 = new JTextPane();
		txtpnDescrio_1.setText("Descri????o");
		txtpnDescrio_1.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnDescrio_1.setEditable(false);
		txtpnDescrio_1.setBackground(new Color(154, 153, 150));
		txtpnDescrio_1.setBounds(226, 10, 91, 21);
		desc_bar_1_1.add(txtpnDescrio_1);
		
		JTextPane txtpnPeso = new JTextPane();
		txtpnPeso.setText("Peso");
		txtpnPeso.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnPeso.setEditable(false);
		txtpnPeso.setBackground(new Color(154, 153, 150));
		txtpnPeso.setBounds(456, 10, 64, 21);
		desc_bar_1_1.add(txtpnPeso);
		
		JTextPane txtpnStatus_1 = new JTextPane();
		txtpnStatus_1.setText("Status");
		txtpnStatus_1.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnStatus_1.setEditable(false);
		txtpnStatus_1.setBackground(new Color(154, 153, 150));
		txtpnStatus_1.setBounds(682, 10, 64, 21);
		desc_bar_1_1.add(txtpnStatus_1);
		
		JPanel cadastro_prioridade = new JPanel();
		tabbedPane.addTab("New tab", null, cadastro_prioridade, null);
		cadastro_prioridade.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(20, 76, 893, 503);
		cadastro_prioridade.add(panel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Cadastrar Prioridade");
		btnNewButton_1_1.setBounds(744, 65, 141, 25);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_prioridade);
			}
		});
		lista_prioridade.add(btnNewButton_1_1);
		
		nomePri = new JTextField();
		nomePri.setColumns(10);
		nomePri.setBounds(23, 50, 534, 22);
		panel_1_1.add(nomePri);
		
		descricaoPri = new JTextField();
		descricaoPri.setColumns(10);
		descricaoPri.setBounds(22, 118, 779, 172);
		panel_1_1.add(descricaoPri);
		
		pesoPri = new JComboBox();
		pesoPri.setModel(new DefaultComboBoxModel(new String[] {"Atendimento Geral", "Atendimento Preferencial"}));
		pesoPri.setBounds(22, 356, 196, 24);
		panel_1_1.add(pesoPri);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Informe o Nome");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1_1.setBounds(22, 27, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Infome a Descri????o");
		lblNewLabel_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_2_1.setBounds(22, 94, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("Informe o Peso");
		lblNewLabel_2_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_3_1.setBounds(22, 332, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_3_1);
		
		JLabel lblNewLabel_2_2_3_1_1 = new JLabel("Informe o Status");
		lblNewLabel_2_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_3_1_1.setBounds(306, 332, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_3_1_1);
		
		statusPri = new JComboBox();
		statusPri.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		statusPri.setBounds(306, 356, 196, 24);
		panel_1_1.add(statusPri);
		
		JButton btnNewButton_2 = new JButton("Cadastrar prioridade");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorPrioridade controller = new ControladorPrioridade();
		        controller.executa(TelaAdministrador.this);
		        JOptionPane.showMessageDialog(null, nomePri.getText() + " Cadastrado com sucesso!");
		        descricaoPri.setText("");
			}
		});
		btnNewButton_2.setBounds(649, 428, 183, 25);
		panel_1_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_2_3_1_1_1 = new JLabel("Informe o servi??o");
		lblNewLabel_2_2_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_2_2_3_1_1_1.setBounds(576, 332, 124, 22);
		panel_1_1.add(lblNewLabel_2_2_3_1_1_1);
		
		servico_select = new JComboBox();
		servico_select.setBounds(573, 356, 196, 24);
		panel_1_1.add(servico_select);
		
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
		
		JLabel lblServio = new JLabel("Servi??o");
		lblServio.setHorizontalAlignment(SwingConstants.CENTER);
		lblServio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblServio.setBounds(10, 52, 187, 25);
		panel_3.add(lblServio);
		
		JButton btnListServ = new JButton("Lista");
		btnListServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(lista_servicos);
				addLinhaServ();
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
		
		JLabel lblServio_1 = new JLabel("Funcion??rio");
		lblServio_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServio_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblServio_1.setBounds(10, 169, 187, 25);
		panel_3.add(lblServio_1);
		
		JButton btnListUser = new JButton("Lista");
		btnListUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(lista_funcionario);
				addLinhaFunc();
			}
		});
		btnListUser.setBounds(42, 204, 132, 21);
		panel_3.add(btnListUser);
		
		JButton btnCadUser = new JButton("Cadastrar");
		btnCadUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_funcionario);
			}
		});
		btnCadUser.setBounds(42, 235, 132, 21);
		panel_3.add(btnCadUser);
		
		JButton btnCadPrio = new JButton("Cadastrar");
		btnCadPrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(cadastro_prioridade);
				addItensServico();
			}
		});
		btnCadPrio.setBounds(42, 350, 132, 21);
		panel_3.add(btnCadPrio);
		
		JButton btnListPrio = new JButton("Lista");
		btnListPrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedComponent(lista_prioridade);
				addLinhaPri();
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
				TelaLogin login = new TelaLogin();
				login.frame.setVisible(true);
				setVisible(false);
			}
		});
		btnSair.setBounds(42, 574, 132, 21);
		panel_3.add(btnSair);
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	
	/*--------------Cadastrar servicos--------------*/
	public JTextField getSiglaServ() {
		return siglaServ;
	}

	public JTextField getNomeServ() {
		return nomeServ;
	}

	public JTextField getDescServ() {
		return descServ;
	}
	
	public JComboBox getStatusServ() {
		return statusServ;
	}

	public void addLinhaServ() {
		DefaultTableModel model =  (DefaultTableModel)table_1.getModel();
		ControladorManterServico controle = new ControladorManterServico();
		ArrayList<Servico> servico = controle.consultar();
		
		model.setNumRows(0);
		for(int i=0; i < servico.size() ; i++) {
			model.addRow((
				new String[] {
					servico.get(i).getSigla(),
					servico.get(i).getNome(), 
					servico.get(i).getDesc(),
					servico.get(i).verificaStatus()
					
				}
			));
		}
	}
	
	/*---------------------------------------------------*/

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
		return nomePri;
	}

	public JTextField getTextField_5() {
		return descricaoPri;
	}
	
	/*--------------Cadastrar funcionario--------------*/

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
	
	public JTextField getUsuarioFunc() {
		return usuarioFunc;
	}
	
	public JTextField getSenhaFunc() {
		return senhaFunc;
	}
	
	public void addLinhaFunc() {
		DefaultTableModel model =  (DefaultTableModel)table.getModel();
		ControladorFuncionario controle = new ControladorFuncionario();
		ArrayList<Funcionario> funcionarios = controle.consultar();
		model.setNumRows(0);
		for(int i=0; i < funcionarios.size() ; i++) {
			model.addRow((
				new String[] {
					funcionarios.get(i).getNomeFun(), 
					funcionarios.get(i).getCpf(), 
					funcionarios.get(i).getCargo()
				}
			));
		}
	}
	
	
	
	//Prioridade
	
	public JTextField getNomePri() {
		return nomePri;
	}
	
	public JTextField getDescricaoPri() {
		return descricaoPri;
	}
	
	public JComboBox getPesoPri() {
		return pesoPri;
	}
	
	public JComboBox getStatusPri() {
		return statusPri;
	}
	
	public JComboBox getIdServico() {
		return servico_select;
	}
	
	public void addLinhaPri() {
		DefaultTableModel model =  (DefaultTableModel)table_2.getModel();
		ControladorPrioridade controle = new ControladorPrioridade();
		ArrayList<Prioridade> prioridade = controle.consultar();
		
		model.setNumRows(0);
		for(int i=0; i < prioridade.size() ; i++) {
			model.addRow((
				new String[] {
					prioridade.get(i).getNomePri(),
					prioridade.get(i).getDescricaoPri(),
					prioridade.get(i).getPesoStr(),
					prioridade.get(i).verificaStatus()
					
				}
			));
		}
	}
	
	
	
	public void addItensServico() {
		ControladorManterServico controle = new ControladorManterServico();
		ArrayList<Servico> servicos = controle.consulta_idServico();
		
		for(int i = 0;i < servicos.size(); i++) {
			servico_select.addItem(new ComboItem(servicos.get(i).getNome(), servicos.get(i).getIdServico()));
			
		}
	}
}
