package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Controller.ControladorAtendimento;
import Model.Entity.Ticket;

import View.TelaAtendente;

public class Monitor extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel SenhaAtual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monitor frame = new Monitor();
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
	public Monitor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(58, 63, 722, 131);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Senha Atual: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_1.setBounds(10, 41, 194, 35);
		panel.add(lblNewLabel_1);
		
		SenhaAtual = new JLabel("");
		SenhaAtual.setFont(new Font("Tahoma", Font.BOLD, 29));
		SenhaAtual.setBounds(207, 41, 194, 35);
		panel.add(SenhaAtual);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 22));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{""},
				{""},
				{""},
			},
			new String[] {
				"Dados Senha"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(99);
		table.getColumnModel().getColumn(0).setMinWidth(62);
		table.setRowHeight(38);
		table.setBounds(58, 265, 721, 120);
		contentPane.add(table);
		addLinhaProximaSenha();
		
		JLabel lblNewLabel = new JLabel("Monitor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 10, 822, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblProximasSenhas = new JLabel("Proximas Senhas: ");
		lblProximasSenhas.setHorizontalAlignment(SwingConstants.LEFT);
		lblProximasSenhas.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblProximasSenhas.setBounds(58, 235, 243, 27);
		contentPane.add(lblProximasSenhas);
		
		updateSenha(() -> {
			boolean bol = true;
			while(bol) {
				try {
					addLinhaProximaSenha();
					senhaAtual();
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
	
	public void addLinhaProximaSenha() {
		DefaultTableModel model =  (DefaultTableModel) table.getModel();
		
		model.setNumRows(0);
		for(int i=0; i < TelaAtendente.senhasMonitor.size() ; i++) {
			if (TelaAtendente.senhasMonitor.get(i).getStatus()) {
				model.addRow((
					new String[] {
						TelaAtendente.senhasMonitor.get(i).getSenha()
					}
				));
			}
		}
	}
	
	public void senhaAtual() {
	
		for(int i=0; i < TelaAtendente.senhasMonitor.size() ; i++) {
			if (TelaAtendente.senhasMonitor.get(i).getStatus()) {
				SenhaAtual.setText(TelaAtendente.senhasMonitor.get(i).getSenha());
				break;
			}
			
		}
	}
	
	public void updateSenha(Runnable runnable) {
	    new Thread(() -> {
	        try {
	            runnable.run();
	        }
	        catch (Exception e){
	            System.err.println(e);
	        }
	    }).start();
	}
}
