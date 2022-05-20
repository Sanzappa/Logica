package viewers;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controllers.ProcessaManutencoes;
import models.Manutencao;

public class FormManutencoes extends JFrame{
	
	private JPanel painel;
	private JLabel Id, data, Equipamento, custo, tempo;
	private JTextField tfId,tfData,equipamento,tfCusto,tfTempo;
	private JComboBox<String> equipamento;
	private JTextArea verResultado;
	private JButton cadastrar, buscar, alterar, excluir;
	private int autoId = ProcessaManutencoes.manutencoes.size() + 1;
	private String texto = "";
	
	FormManutencoes(){
		setTitle("Tela de usuario");
		setBounds(100, 100, 1000, 600);
		painel = new JPanel();
		painel.setBackground(new Color(199, 199, 199));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		Id = new JLabel("Id");
		Id.setBounds(20, 50, 120, 30);
		tfId = new JTextField();
		tfId.setBounds(140, 55, 255, 30);
		tfId.setEditable(false);
		//
		data = new JLabel("Data");
		data.setBounds(20, 90, 120, 30);
		tfData = new JTextField();
		tfData.setBounds(140, 95, 255, 30);
		//
		Equipamento = new JLabel("Equipamento");
		Equipamento.setBounds(20, 125, 120, 30);
		equipamento = new JComboBox<String>(new String[] { "Feminina", "Masculina" });
		equipamento.setBounds(140, 130, 255, 30);
		//
		tipoProuduto = new JLabel("*Produto:");
		tipoProuduto.setBounds(20, 165, 120, 30);
		produtos = new JComboBox<String>(new String[] { "Calça Jeans", "Blusa moletom", "Vestido", "Calça Moletom",
				"Camiseta", "Blusa", "Tênis", "Salto" });
		produtos.setBounds(140, 165, 255, 30);
		//
		valProduto = new JLabel("*Valor do Produto:");
		valProduto.setBounds(20, 240, 120, 30);
		tfvalProduto = new JTextField();
		tfvalProduto.setBounds(140, 240, 255, 30);
	}

}