package br.com.reges.exercicio;
/**
 * Este Classe ficar� responsavel de inserir os dados nos seguintes objetos, 
 * e tambem vai conter o metodo main  
 * 
 * @author Fabio Tavares 
 *
 */
public class CadastroProfessores {

	public static void main(String[] args) {
		/**
		 * Cria��o do objeto fixo (Professor Fixo) com as seguintes passagens de parametros:
		 * nro matricola e nome.
		 */
		ProfessorFixo fixo = new ProfessorFixo(54,"Maisa Melo");
		/**
		 * Atribuindo valores do salario e carga horaria
		 */
		fixo.salario = 2500.00;
		fixo.cargaHoraria = 30; // Semanais
		/**
		 * Chamada do metodo dadosProfessor para visualizar os dados inseridos.
		 */
		fixo.dadosProfessor();
		/**
		 * Cria��o do objeto hora (ProfessorHorista) tambem com os parametros nro matricola e nome.
		 */
		ProfessorHorista hora = new ProfessorHorista(55,"Jo�o Rodrigues");
		/**
		 * Atribui��o de valores nas seguintes variaveis: Carga horaria e valor horas;
		 */
		hora.cargaHoraria = 44;
		hora.valorHoras = 50.00;
		/**
		 *  O salario do professor horista ser� composto pela Carga horaria * valor da horas
		 */
		hora.salario = hora.calcValorHora();
		hora.dadosProfessor();
	}
}
