package lista4;

public class ex3Molde {
	
	String nome;
	int idade;
	String cpf;
	int quarto;
		
	
	public void informarnome()
	{
		System.out.println("Idade: "+this.nome);
	}
	
	public void informaridade()
	{
		System.out.println("Idade: "+this.idade);
	}
	
	public void informarcpf()
	{
		if(this.cpf.length()==14)
			System.out.println("cpf: "+this.cpf);
		else
			System.out.println("por favor digite o cpf corretamente 14 d�gitos");
	}
	
	public void informarquarto()
	{
		System.out.println("O quarto do paciente �: "+this.quarto);
	}
	
}
