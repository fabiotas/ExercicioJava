package br.com.reges.exercicio;

import java.util.*;
/**
 * Foi criado uma classe principal filme onde será incluido os metodos e os atributos do filme
 * 
 * @author Fabio Tavares
 *
 */
public class Filme {
/**
 * Variaveis do filme 
 */
	int codFilme,quant;
	String nome, sinopse, atores, distribuidora, classificaçao, genero;
	/**
	 * Na classe filme criei o metodo main para fazermos os testes do filme.
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * no metodo main foi criado o objeto filme
		 */
		Filme filme = new Filme();
		/**
		 * Logo a baixo estarei inserindo alguns valores fixo do filme.
		 */
		filme.codFilme = 1;
		filme.nome = "Poeira em alto mar";
		filme.genero = "Ação";
		/**
		 * No metodo main esta chamando o metodo mostrarFilme que vem da classe filme.
		 */
		filme.mostrarFilme();
	}
/**
 * Na classe filme criei o metodo mostrarFilme para visualizar os atributos do filme.
 */
	public void mostrarFilme(){
		/**
		 * criei uma variavel opção para receber do usuario que tipo de descrição ele deseja;
		 */
		int opc;
		/**
		 *  Instanciei a classe Scanner criando o objeto teclado pois irei precisar de alguns metodo da classe Scanner, 
		 *  para receber dados do usuario 
		 */
		Scanner teclado = new Scanner(System.in);
		/**
		 * utilizei o try catch para caso o usuario informar algum dado errado ou o sistema de algum problema ele não pare todo o processo
		 */
		try{
		opc = 0;
		/**
		 * criei manualmente um verificador para caso o usuario insira um numero difente de 0 e 1 o sistema não deixe seguir
		 */
		while(opc == 0){
			System.out.println("Escolha uma das opções:\n1-Descrição Abreviada.\n2-Descrição Completa.");
			opc = teclado.nextInt();
		
			if(opc != 1 && opc != 2){
				System.out.println("Por favor insira uma opção entre 1 e 2.");
				opc = 0;
			}
	    }
		
	
     	if (opc == 1){
			System.out.println("Código do filme: "+codFilme+"\nNome do Filme: "+nome+"\nGerero: "+genero);
		}else{
			System.out.println("Código do filme: "+codFilme+"\nNome do Filme: "+nome+"\nGerero: "+genero+
					"\nsinopse: "+sinopse+"\nAtores: "+atores+"\nDistribuidora: "+distribuidora);
		}
		}catch(Exception error){
			System.out.println("Erro: "+error);
		}
	}
		
	
}
	

