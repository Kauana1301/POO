package br.com.generation.poo.exercicios;

public class TestaExercicio02 {

	public static void main(String[] args) {
		
		Exercicio02 aviao1 = new Exercicio02();
		//Exercicio02 aviao2 = new Exercicio02();
		
		aviao1.setCompanhiaArea("Gol.");
		aviao1.setDestino("Cuba ");
		aviao1.setQuantidadePessoas(200);
		aviao1.setTamanho(60);
		
		System.out.println("Companhia aérea: " + aviao1.getCompanhiaArea());
		System.out.println("Com destino a: " + aviao1.getDestino());
		System.out.println("Quantidade Pessoas no voou: " + aviao1.getQuantidadePessoas());
		System.out.println("Tamanho do avião é de: " + aviao1.getTamanho() + " cm.");
	}

}
