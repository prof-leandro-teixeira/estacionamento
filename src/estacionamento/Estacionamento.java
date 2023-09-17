package estacionamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Estacionamento {
    public static final String VERSAO = "1.0.0";

    public static void main(String[] args) {

	String[] vagas = new String[10];
	for (int i = 0; i < vagas.length; i++) {
	    vagas[i] = "";
	}

	String escolha;

	do {
	    LocalDateTime agora = LocalDateTime.now();
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	    String dataHoraFormatada = agora.format(formato);

	    escolha = exibirMenu(dataHoraFormatada);

	    if (escolha != null) {
		switch (escolha) {

		case "0": // Saída
		    break;

		case "1": // Entrada de Veículo
		    entradaDeVeiculo(vagas);
		    break;

		case "2": // Saída de Veículo
		    saidaDeVeiculo(vagas);
		    break;

		case "3": // Vagas Livres
		    listarVagas(vagas);
		    break;

		case "4": // Busca veículo
		    buscarVeiculo(vagas);
		    break;

		default:
		    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.",
			    "Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
		    break;
		}
	    }
	} while (!"0".equals(escolha));
	JOptionPane.showMessageDialog(null, "Saindo do programa.", "Sistema de Estacionamento - " + VERSAO,
		JOptionPane.PLAIN_MESSAGE);
    }

    private static String exibirMenu(String dataHoraFormatada) {
	return JOptionPane.showInputDialog(null,
		dataHoraFormatada + "\n\nEntre com a opção desejada:\n0 - Sair do sistema."
			+ "\n1 - Entrada de veículo." + "\n2 - Saída de veículo." + "\n3 - Listar vagas."
			+ "\n4 - Busca veículo.\n\n",
		"Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
    }

    // 1 - Entrada de Veículo
    private static void entradaDeVeiculo(String[] vagas) {
	String placa = JOptionPane.showInputDialog(null, "Entrada de veículo.\nEntre com a placa: ",
		"Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
	boolean veiculoEncontrado = false;
	for (int i = 0; i < vagas.length; i++) {
	    if (vagas[i].equals(placa)) {
		JOptionPane.showMessageDialog(null, "Veículo já se encontra no estacionamento!",
			"Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
		return;
	    }
	    if (!veiculoEncontrado) {
		int vaga = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a vaga: ",
			"Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE));
		vagas[vaga] = placa;
		break;
	    }
	}
    }

    // 2 - Saída de Veículo
    private static void saidaDeVeiculo(String[] vagas) {
	String placa = JOptionPane.showInputDialog(null, "Entre com a placa: ", "Sistema de Estacionamento - " + VERSAO,
		JOptionPane.PLAIN_MESSAGE);
	boolean veiculoEncontrado = false;
	for (int i = 0; i < vagas.length; i++) {
	    if (vagas[i].equals(placa)) {
		vagas[i] = "";
		veiculoEncontrado = true;
		JOptionPane.showMessageDialog(null, "Veículo saiu com sucesso.",
			"Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
		break;
	    }
	}
	if (!veiculoEncontrado) {
	    JOptionPane.showMessageDialog(null, "Veículo não encontrado no estacionamento.",
		    "Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
	}
    }

    // 3 - Listar vagas
    private static void listarVagas(String[] vagas) {
	StringBuilder mensagem = new StringBuilder();
	mensagem.append("Lista de vagas:\n");

	for (int i = 0; i < vagas.length; i++) {
	    if (vagas[i].isEmpty()) {
		mensagem.append("Vaga " + i + "\n");
	    }
	    if (!vagas[i].isEmpty()) {
		mensagem.append("Vaga " + i + ": " + vagas[i] + "\n");
	    }

	}
	JOptionPane.showMessageDialog(null, mensagem.toString(), "Sistema de Estacionamento - " + VERSAO,
		JOptionPane.PLAIN_MESSAGE);
    }

    // 4 - buscar veículo
    private static void buscarVeiculo(String[] vagas) {
	String placa = JOptionPane.showInputDialog(null, "Entre com a placa a ser buscada: ",
		"Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);

	boolean veiculoEncontrado = false;

	for (int i = 0; i < vagas.length; i++) {
	    if (vagas[i].equals(placa)) {
		JOptionPane.showMessageDialog(null, "Veículo encontrado na vaga " + i + ".",
			"Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
		veiculoEncontrado = true;
		break;
	    }
	}
	if (!veiculoEncontrado) {
	    JOptionPane.showMessageDialog(null, "Veículo não encontrado no estacionamento.",
		    "Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
	}
    }
}