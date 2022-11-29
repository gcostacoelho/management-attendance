package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Entity.Ticket;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTicket extends JFrame {

	private JPanel contentPane;
	private JLabel senha, servico, dataHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTicket frame = new TelaTicket();
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
	public TelaTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Senha");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(10, 20, 347, 21);
		contentPane.add(titulo);
		
		senha = new JLabel("PR1");
		senha.setFont(new Font("Tahoma", Font.BOLD, 15));
		senha.setHorizontalAlignment(SwingConstants.CENTER);
		senha.setBounds(10, 51, 347, 21);
		contentPane.add(senha);
		
		servico = new JLabel("Serviço: Atendimento Preferencial");
		servico.setHorizontalAlignment(SwingConstants.CENTER);
		servico.setFont(new Font("Tahoma", Font.BOLD, 15));
		servico.setBounds(10, 82, 347, 21);
		contentPane.add(servico);
		
		dataHora = new JLabel("Data: 12/11/2022 Hora: 16:00");
		dataHora.setHorizontalAlignment(SwingConstants.CENTER);
		dataHora.setFont(new Font("Tahoma", Font.BOLD, 15));
		dataHora.setBounds(10, 113, 347, 21);
		contentPane.add(dataHora);
		
		JButton fechar = new JButton("Fechar");
		fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		fechar.setBounds(141, 190, 85, 21);
		contentPane.add(fechar);
	}
	
	public void setSenha(Ticket ticket) {
		senha.setText(ticket.getSiglaServico() + ticket.getSenha());
		servico.setText("Serviço: " + ticket.getNomeSer());
		dataHora.setText("Data: " + ticket.getDataSenha() + " Hora: " + ticket.getHoraSenha());
	}
}
