package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorSolicitarServico;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSolicitar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSolicitar frame = new TelaSolicitar();
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
	public TelaSolicitar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 626);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGeral = new JButton("Atendimento Geral");
		btnGeral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorSolicitarServico controler = new ControladorSolicitarServico();
				controler.adicionaSenha(2);
				TelaTicket telaTicket = new TelaTicket();
				telaTicket.setVisible(true);
				telaTicket.setSenha(controler.ultimaSenha());
				
				TelaAtendente tela = new TelaAtendente();
				tela.addLinhaSenha();
			}
		});
		btnGeral.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGeral.setBounds(10, 111, 512, 98);
		contentPane.add(btnGeral);
		
		JButton btnAgendada = new JButton("Consulta Agendada");
		btnAgendada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorSolicitarServico controler = new ControladorSolicitarServico();
				controler.adicionaSenha(3);
				TelaTicket telaTicket = new TelaTicket();
				telaTicket.setVisible(true);
				telaTicket.setSenha(controler.ultimaSenha());
				
				TelaAtendente tela = new TelaAtendente();
				tela.addLinhaSenha();
			}
		});
		btnAgendada.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAgendada.setBounds(10, 367, 512, 98);
		contentPane.add(btnAgendada);
		
		JButton btnPreferencial = new JButton("Atendimento Preferencial");
		btnPreferencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorSolicitarServico controler = new ControladorSolicitarServico();
				controler.adicionaSenha(1);
				TelaTicket telaTicket = new TelaTicket();
				telaTicket.setVisible(true);
				telaTicket.setSenha(controler.ultimaSenha());
				
				TelaAtendente tela = new TelaAtendente();
				tela.addLinhaSenha();
			}
		});
		btnPreferencial.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPreferencial.setBounds(566, 111, 512, 98);
		contentPane.add(btnPreferencial);
		
		JButton btnRetirada = new JButton("Retirada de Exames");
		btnRetirada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorSolicitarServico controler = new ControladorSolicitarServico();
				controler.adicionaSenha(4);
				TelaTicket telaTicket = new TelaTicket();
				telaTicket.setVisible(true);
				telaTicket.setSenha(controler.ultimaSenha());
				
				TelaAtendente tela = new TelaAtendente();
				tela.addLinhaSenha();
			}
		});
		btnRetirada.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetirada.setBounds(566, 367, 512, 98);
		contentPane.add(btnRetirada);
		
		JLabel lblNewLabel = new JLabel("Selecione o Servi??o desejado");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(366, 10, 399, 63);
		contentPane.add(lblNewLabel);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar?", "", 
		                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				
				if(input == 0) {
					setVisible(false);
				}
			}
		});
		btnFechar.setBounds(497, 552, 117, 25);
		contentPane.add(btnFechar);
	}
}