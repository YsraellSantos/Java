package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Cursor;

public class CadrastroDev extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textTelefone;
	private JTextField textData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadrastroDev frame = new CadrastroDev();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadrastroDev() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 479);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Principal
		JLabel lblNewLabel = new JLabel("Tela de Cadrastro");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 31));
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel.setBounds(163, 20, 282, 38);
		contentPane.add(lblNewLabel);

		// Campo Nome
		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(23, 103, 137, 29);
		contentPane.add(lblNome);

		// Nome Digitação nome
		textNome = new JTextField();
		textNome.setBounds(23, 142, 170, 29);
		contentPane.add(textNome);
		textNome.setColumns(10);

		// Campo Email
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(23, 216, 66, 29);
		contentPane.add(lblEmail);

		// Campo Digitação Email
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(23, 263, 170, 29);
		contentPane.add(textEmail);

		// Campo Telefone
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelefone.setBounds(374, 103, 85, 29);
		contentPane.add(lblTelefone);

		// Campo Digitação telefone
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(374, 142, 170, 29);
		contentPane.add(textTelefone);

		// Campo Data Nascimento
		JLabel lblDate = new JLabel("Data Nascimento:");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDate.setBounds(379, 216, 150, 29);
		contentPane.add(lblDate);

		// Campo Digitação data
		textData = new JTextField();
		textData.setColumns(10);
		textData.setBounds(374, 263, 170, 29);
		contentPane.add(textData);

		JButton btnCadrastra = new JButton("Cadrastar");
		btnCadrastra.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnCadrastra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String nome = textNome.getText();
				String email = textEmail.getText();
				String telefone = textTelefone.getText();
				String data = textData.getText();
				

				System.out.println(nome);
				System.out.println(email);
				System.out.println(telefone);
				System.out.println(data);

			}
		});
		btnCadrastra.setFont(new Font("Arial", Font.PLAIN, 22));
		btnCadrastra.setBounds(163, 394, 271, 38);
		contentPane.add(btnCadrastra);

	}
}
