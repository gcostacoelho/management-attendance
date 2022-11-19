package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorFuncionario;
import Model.Entity.Funcionario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;
import java.awt.Point;


public class TelaCadastro extends JFrame{
	private final JComboBox permissao = new JComboBox();
	private JTextField nomeFun;
	private JTextField cpf;
	private JTextField telefone;
	private JTextField email;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TelaCadastro() {
		setLocation(new Point(414, 421));
		setSize(new Dimension(589, 500));
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe o nome:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(117, 99, 109, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblCadastrarUsuario = new JLabel("Cadastrar Usuario");
		lblCadastrarUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		lblCadastrarUsuario.setBounds(117, 34, 150, 14);
		getContentPane().add(lblCadastrarUsuario);
		
		JLabel lblInformeOCpf = new JLabel("Informe o cpf:");
		lblInformeOCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblInformeOCpf.setBounds(117, 142, 96, 14);
		getContentPane().add(lblInformeOCpf);
		
		JLabel lblInformeOTelefone = new JLabel("Informe o telefone:");
		lblInformeOTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblInformeOTelefone.setBounds(116, 231, 129, 14);
		getContentPane().add(lblInformeOTelefone);
		
		JLabel lblInformeOEmail = new JLabel("Informe o email:");
		lblInformeOEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblInformeOEmail.setBounds(117, 183, 109, 14);
		getContentPane().add(lblInformeOEmail);
		permissao.setModel(new DefaultComboBoxModel(new String[] {"Atendente", "Administrador"}));
		permissao.setToolTipText("Permissao\r\n");
		permissao.setBounds(200, 271, 109, 31);
		getContentPane().add(permissao);
		
		nomeFun = new JTextField();
		nomeFun.setBounds(230, 97, 150, 20);
		getContentPane().add(nomeFun);
		nomeFun.setColumns(10);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(230, 140, 150, 20);
		getContentPane().add(cpf);
		
		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(251, 229, 129, 20);
		getContentPane().add(telefone);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(236, 182, 150, 20);
		getContentPane().add(email);
		
		JLabel lblPermissao = new JLabel("Permissao:");
		lblPermissao.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPermissao.setBounds(117, 278, 83, 14);
		getContentPane().add(lblPermissao);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorFuncionario controller = new ControladorFuncionario();
		        controller.executa(TelaCadastro.this);
		        JOptionPane.showMessageDialog(null, nomeFun.getText() + " Cadastrado com sucesso!");
		        telefone.setText("");
				cpf.setText("");
				email.setText("");
				nomeFun.setText("");
			}
		});
		btnSalvar.setBounds(291, 334, 89, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(78, 334, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telefone.setText("");
				cpf.setText("");
				email.setText("");
				nomeFun.setText("");
			}
		});
		btnLimpar.setBounds(182, 335, 85, 21);
		getContentPane().add(btnLimpar);
		
	}

	public JTextField getNomeFun() {
		return nomeFun;
	}

	public void setNomeFun(JTextField nomeFun) {
		this.nomeFun = nomeFun;
	}

	public JTextField getCpf() {
		return cpf;
	}

	public void setCpf(JTextField cpf) {
		this.cpf = cpf;
	}

	public JTextField getTelefone() {
		return telefone;
	}

	public void setTelefone(JTextField telefone) {
		this.telefone = telefone;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JComboBox getPermissao() {
		return permissao;
	}
}