# Projeto Estacionamento
Projeto para simular o funcionamento de um estacionamento. O código foi escrito de forma monolítica e procedural de propósito, com o objetivo de demonstrar conhecimentos em estruturas de dados simples e fins didáticos, e pode não representar uma abordagem ideal em contextos mais complexos ou em projetos de grande escala.
#

## Requisitos Funcionais
1. Atribuir carro a uma vaga.
2. Liberar vaga na saída do carro do estacionamento.
3. Listar vagas do estacionamento com a respectiva situação.
#

## Resisitos não funcionais
Com o desenvolvimento da aplicação serão listados
#

### Tela principal
![Tela 1](src/img/Tela_principal.png)
### Tela de entrada de veículo
![Tela 2](src/img/Entrada_de_veiculo.png)
### Tela de lista de vagas
![Tela 3](src/img/Listar_vagas.png)
### Tela de saída do sistema
![Tela 4](src/img/Saindo.png)
#

## Estrutura do Projeto
O projeto é composto por:
- Classe principal `Estacionamento` que controla a lógica do estacionamento.
- Arrays para representar as vagas de estacionamento.
- Métodos para entrada, saída e listagem de veículos.
#

## Tecnologias Utilizadas
- [Java](https://www.java.com/): Linguagem de programação principal.
- [Swing](https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html): Biblioteca Java para criar interfaces gráficas.
- [Eclipse](https://www.eclipse.org/): Ambiente de desenvolvimento integrado (IDE) utilizado para escrever e compilar o código.
- [Git](https://git-scm.com/): Sistema de controle de versão para gerenciar o código-fonte.
- [GitHub](https://github.com/): Plataforma de hospedagem de código-fonte.

#

## Melhorias

Durante o desenvolvimento da aplicação, percebi a oportunidade de implementar uma função adicional no código que seria relevante para o usuário. Ao considerar essa adição, identifiquei mais implicações positivas do que negativas:

* Melhoria na Funcionalidade: A inclusão da nova função proporcionará maior utilidade para os usuários.
* Resolução de Problemas: Essa função contribuiu para a lógica do projeto, simplificando o processo de codificação de funcionalidades mais complexas.
* Inovação: A criatividade na adição dessa função não planejada nos requisitos funcionais pode resultar em inovações surpreendentes e em recursos exclusivos que podem ser valiosos para os usuários. Além disso, essa inovação pode gerar insights para o levantamento de requisitos funcionais adicionais, levando ao desenvolvimento de uma nova versão com melhorias significativas.

Parte do código que não estava previsto nos requisitos funcionais:
```
private static void buscarVeiculo(String[] vagas) {
String placa = JOptionPane.showInputDialog(null, "Entre com a placa a ser buscada: ", "Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
  
	boolean veiculoEncontrado = false;

	for (int i = 0; i < vagas.length; i++) {
	    if (vagas[i].equals(placa)) {
		    JOptionPane.showMessageDialog(null, "Veículo encontrado na vaga " + i + ".", "Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
		    veiculoEncontrado = true;
		    break;
	    }
	}
	if (!veiculoEncontrado) {
	    JOptionPane.showMessageDialog(null, "Veículo não encontrado no estacionamento.", "Sistema de Estacionamento - " + VERSAO, JOptionPane.PLAIN_MESSAGE);
	}
}
```
