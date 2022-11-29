package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.Box;
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
import java.awt.event.ActionEvent;

public class TelaAtendente extends JFrame {

	private JPanel contentPane;

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
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		panel.setBounds(0, 0, 221, 614);
		contentPane.add(panel);
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
		contentPane.add(panel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(367, 97, 178, 26);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o guichê:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(243, 96, 114, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAtendimento = new JLabel("Atendimento");
		lblAtendimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtendimento.setFont(new Font("Verdana", Font.BOLD, 20));
		lblAtendimento.setBounds(231, 10, 159, 41);
		contentPane.add(lblAtendimento);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(943, 24, 159, 41);
		contentPane.add(panel_2);
		
		JButton btnNewButton_2 = new JButton("Chamar próxima senha");
		btnNewButton_2.setBounds(231, 165, 171, 41);
		contentPane.add(btnNewButton_2);
		
		JList list = new JList();
		list.setBounds(231, 272, 549, 317);
		contentPane.add(list);
		
		JButton btnNewButton_1_1 = new JButton("Alterar Guichê");
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1_1.setBounds(573, 100, 172, 21);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fila de atendimento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(231, 249, 159, 13);
		contentPane.add(lblNewLabel_2);
	}
}
