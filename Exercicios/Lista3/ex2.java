package lista3;
import java.util.Random;
public class ex2 {

	public static void main(String[] args) {
		int dado[] = new int [10];	
		int i;
		int NumeroSortiado=0;
		int SomaVetor=0;
		int MaiorOcorrencia=0;
		int lancamento=0;
		float MediaArit=0;
		
		Random gerador = new Random();
		
		for(i=0;i<10;i++) 
		{
			dado[i]=gerador.nextInt(6)+1;
			System.out.println(dado[i]);
			SomaVetor += dado[i];
			MediaArit=(SomaVetor)/10;
			
			if(dado[i]==6) 
			{
				lancamento+=1;
			}
			
		}
		System.out.println("Média Aritimetica: "+MediaArit);
		System.out.println("Ocorrência da maior pontuação: "+lancamento);
	}

}