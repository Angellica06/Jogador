package futebol;

import java.util.Calendar;
import java.util.Date;

public class JogadorTeste {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		
		jogador.nome = "Gabriel";
		jogador.posicao = "Defesa";
		jogador.nacionalidade = "Brasileiro";
		jogador.altura = 1.75;
		jogador.peso = 84;
		
		//Define data
		Calendar data1 = Calendar.getInstance();
		data1.set(1985, 10, 23);
		Calendar hoje = Calendar.getInstance();
		
		//Calcular idade atual
		int idadeAtual = (hoje.get(Calendar.YEAR) - data1.get(Calendar.YEAR));
		
		
		System.out.println("Informações do jogador:");
		System.out.println("Nome do jogador: " + jogador.getNome());
		System.out.println("Posição: " + jogador.getPosicao());
		System.out.println("Nacionalidade: " + jogador.getNacionalidade());
		System.out.println("Data de nascimento: " + data1.get(Calendar.DATE) + "/" + 
		data1.get(Calendar.MONTH) + "/" + data1.get(Calendar.YEAR));
		System.out.println("Altura: " + jogador.getAltura());
		System.out.println("Peso: " + jogador.getPeso());
		
	  
		//Tempo para aposentar
		int tempoAposentar = (idadeAtual);
		if(jogador.getPosicao() == "Defesa") {
			tempoAposentar = 40 - idadeAtual;
			System.out.println("Faltam " + tempoAposentar + " anos para se aposentar.");
		}
		else if(jogador.getPosicao() == "Meio campo"){
			tempoAposentar = idadeAtual - 38;
			System.out.println("Faltam " + tempoAposentar + " anos para se aposentar.");
		}
		else if(jogador.getPosicao() == "Atacante"){
			tempoAposentar = idadeAtual - 35;
			System.out.println("Faltam " + tempoAposentar + " anos para se aposentar.");
		}
				
	}

}
 