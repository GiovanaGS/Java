package lista4;

public class ex2Molde {

		String marca,cor;
		float peso;
		int quantidade;
		
		public ex2Molde (String marca,String cor,float peso,int quantidade)
		{
			this.marca=marca;
			this.cor=cor;
			this.peso=peso;
			this.quantidade=quantidade;
		}
		
		public void mostrarinformacao() 
		{
			System.out.println("_______________________________");
			System.out.println("Marca: "+marca);
			System.out.println("Cor: "+cor);
			System.out.println("Peso: "+peso+"kg");
			System.out.println("Quantidade de pessoas: "+quantidade);
		}
		
		
}
