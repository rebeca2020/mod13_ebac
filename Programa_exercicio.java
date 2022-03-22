//package br.com.exercicio;

public class Programa_exercicio {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome("Marleci");
		pf.setCpf("123.152.146-32");
		pf.setRg("16.958.093-3");
		pf.setTelefone(22252115l);
		pf.setEndereco("Estrada das rosas, 748");
		imprimir(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome("Bruno");
		pj.setTelefone(24554421l);
		pj.setCnpj("31.336.323-7");
		pj.setEndereco("Rua joão santos, 45");
		imprimir(pj);
		
	
	}

	private static void imprimir(Pessoa pessoa) {
		
		if(pessoa instanceof Pessoa ) {
			Pessoa pesFis = (Pessoa) pessoa; //faz o casting
			System.out.println("Telefone do(a) " + pessoa.getNome() + " é " + pessoa.getTelefone()  + " e o endereço é: " + pessoa.getEndereco());
		}
	
	}
	
	
	

}


