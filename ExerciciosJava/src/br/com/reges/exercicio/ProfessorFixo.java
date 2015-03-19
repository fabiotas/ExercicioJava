package br.com.reges.exercicio;
/**
 * Esta classe é a super classe de professores, 
 * apartir desta será feita a classe professor horista.
 * 
 * @author Fabio Tavares
 *
 */
public class ProfessorFixo {

	/**
	 * Professor Fixo tem os seguintes Atributos: nro da matricola, 
	 * nome carga horaria que será semanais, e o salario;
	 */
	int nroMatricola;
	String nome;
	int cargaHoraria;
	double salario;
	
	/**
	 * A assinatura da classe tem os seguintes parametros: 
	 * 
	 * @param nroMatricola
	 * @param nome
	 */
	public ProfessorFixo( int nroMatricola, String nome){
		
		this.nroMatricola = nroMatricola;
		this.nome = nome;
		
	}
	
	/**
	 * Foi criado o seguinte metodo(dadosProfessor) apenas para impressão dos dados do professor. 
	 */
	
	public void dadosProfessor(){ 
		System.out.println("O professor "+nome+" tem o seguinte salario: "+salario);
	}
}
