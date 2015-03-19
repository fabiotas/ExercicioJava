package br.com.reges.exercicio;
/**
 * Foi feito a classe professor horista herdando os dados do professor fixo
 * 
 * @author Fabio Tavares
 *
 */
public class ProfessorHorista extends ProfessorFixo {
	
	/**
	 * terá apenas um atributo diferencial que será valorHoras
	 */
	double valorHoras;

	
	public ProfessorHorista(int nroMatricula, String nome){
		super(nroMatricula, nome);
	}
	
	/**
	 * Este metodo será responsavel por calcular o valor da hora de trabalho do professor
	 * 
	 * @return salario
	 */
	public double calcValorHora(){
		return super.cargaHoraria * valorHoras;
	}

}
