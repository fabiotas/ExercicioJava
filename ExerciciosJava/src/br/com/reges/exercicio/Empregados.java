package br.com.reges.exercicio;

import java.text.DateFormat;
import java.util.*;
import java.text.*;

public class Empregados {

	int numMatricula;
	String nome, funcao, dt2;
	double salario;
	Date dtAdmissao = new Date();
	
	public static void main(String[] args) {
		
		Empregados funcionario = new Empregados();
		funcionario.ReceberDados();
		funcionario.mostrarDados();
		
	}
	
	public void ReceberDados(){
		Scanner tecla = new Scanner(System.in);
		DateFormat f = DateFormat.getDateInstance();		
		
		System.out.println("Informe o Código: ");
		numMatricula = tecla.nextInt();
		System.out.println("Informe o nome do funcionario: ");
		nome = tecla.nextLine();
		System.out.println("Informe a funcao: ");
		funcao = tecla.nextLine();/*
		System.out.println("Informe o salario: ");
		salario = tecla.nextDouble();*/
		System.out.println("Informe a data de admissao(se deixar em branco será usado a data de hoje):");
		String admissao = tecla.nextLine();
		if(admissao != null){
			Date dtAdmissao = new Date(admissao);
		}
				
	}
	public void mostrarDados(){
		System.out.println("Codigo do Funcionario: "+numMatricula+"\nNome: "+nome+"\nfuncao: "+funcao+"data de Admissao: "+dtAdmissao);
	}
}
