package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import Controller.ControladorAtendimento;
import Controller.ControladorPrioridade;
import Model.Entity.Prioridade;
import Model.Entity.Ticket;

import javax.swing.UIManager;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaAtendente extends JFrame {

	private JPanel content;
	private JTable tableSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtendente frame = new TelaAtendente();
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
	public TelaAtendente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1147, 651);
		content = new JPanel();
		content.setBackground(Color.LIGHT_GRAY);
		content.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(content);
		content.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		panel.setBounds(0, 0, 221, 614);
		content.add(panel);
		panel.setLayout(null);
		
		JButton solicitarServico = new JButton("Solicitar Serviço");
		solicitarServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSolicitar menu = new TelaSolicitar();
				menu.setVisible(true);
			}
		});
		solicitarServico.setBounds(20, 104, 172, 21);
		panel.add(solicitarServico);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				login.frame.setVisible(true);
				setVisible(false);
			}
		});
		btnSair.setBounds(20, 570, 172, 21);
		panel.add(btnSair);
		
		JLabel lblNewLabel_3 = new JLabel("Management Attendance");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 36, 187, 25);
		panel.add(lblNewLabel_3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setForeground(Color.BLACK);
		panel_11.setBackground(Color.BLACK);
		panel_11.setBounds(15, 71, 182, 2);
		panel.add(panel_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(231, 140, 888, 1);
		content.add(panel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(367, 97, 178, 26);
		content.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o guichê:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(243, 96, 114, 27);
		content.add(lblNewLabel_1);
		
		JLabel lblAtendimento = new JLabel("Atendimento");
		lblAtendimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtendimento.setFont(new Font("Verdana", Font.BOLD, 20));
		lblAtendimento.setBounds(231, 10, 159, 41);
		content.add(lblAtendimento);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(943, 24, 159, 41);
		content.add(panel_2);
		
		JButton btnNewButton_2 = new JButton("Chamar próxima senha");
		btnNewButton_2.setBounds(231, 165, 196, 41);
		content.add(btnNewButton_2);
		
		
		JButton btnNewButton_1_1 = new JButton("Alterar Guichê");
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1_1.setBounds(573, 100, 172, 21);
		content.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fila de atendimento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(231, 249, 159, 13);
		content.add(lblNewLabel_2);
		
		tableSenha = new JTable();
		tableSenha.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Senha"
			}
		));
		tableSenha.setBounds(233, 275, 502, 271);
		content.add(tableSenha);
		addLinhaSenha();
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addLinhaSenha();
			}
		});
		btnAtualizar.setBounds(618, 243, 117, 25);
		content.add(btnAtualizar);
		
	}
	
	public void addLinhaSenha() {
		DefaultTableModel model =  (DefaultTableModel) tableSenha.getModel();
		ControladorAtendimento controle = new ControladorAtendimento();
		ArrayList<Ticket> tickets = controle.consultaSenha();
		
		model.setNumRows(0);
		for(int i=0; i < tickets.size() ; i++) {
			
			model.addRow((
				new String[] {
					tickets.get(i).getSiglaServico()  + " " +
					Integer.toString(tickets.get(i).getSenha()) + " " +
					tickets.get(i).getHoraSenha()
				}
			));
		}
	}
}
