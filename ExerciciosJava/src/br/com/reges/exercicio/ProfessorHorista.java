package br.com.reges.exercicio;
/**
 * Foi feito a classe professor horista herdando os dados do professor fixo
 * 
 * @author Fabio Tavares
 *
 */
public class ProfessorHorista extends ProfessorFixo {
	
	/**
	 * ter� apenas um atributo diferencial que ser� valorHoras
	 */
	double valorHoras;

	
	public ProfessorHorista(int nroMatricula, String nome){
		super(nroMatricula, nome);
	}
	
	/**
	 * Este metodo ser� responsavel por calcular o valor da hora de trabalho do professor
	 * 
	 * @return salario
	 */
	public double calcValorHora(){
		return super.cargaHoraria * valorHoras;
	}

}
