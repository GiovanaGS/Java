package heranca;

public class AcoesAnimais {
	
	public static void main(String[]args) 
	{
      Cachorro cachorro = new Cachorro();
      cavalo cavalo = new cavalo();
      Preguica preguica = new Preguica();
      
      
      cachorro.setAcao("Correr");
      cachorro.setNome("Duck");
      cachorro.setIdade(5);
      cachorro.setEmitirSom("latir");
      
      cavalo.setAcao("Correr");
      cavalo.setNome("Ana");
      cavalo.setIdade(7);
      cavalo.setEmitirSom("potoco");
      
      preguica.setAcao("Subir em arvore");
      preguica.setNome("léo");
      preguica.setIdade(8);
      preguica.setEmitirSom("som de preguiça");
      
      
      System.out.println("Nome do cachorro é: "+cachorro.getNome()+"\nIdade do cachorro: "+cachorro.getIdade()+"\nA ação do cachorro é: "+cachorro.getAcao()+"\nO som do cachorro é: "+cachorro.getEmitirSom() );
      System.out.println("Nome do cavalo é: "+cavalo.getNome()+"\nA idade do cavalo é: "+cavalo.getIdade()+"\nA ação do cavalo é: "+cavalo.getAcao()+"\nO som do cavalo é: "+cavalo.getEmitirSom());
      System.out.println("O nome da preguiça é: "+preguica.getNome()+"\nA idade da preguiça é: "+preguica.getIdade()+"\nA ação da preguiça é: "+preguica.getAcao()+"\nO som da preguiça é: "+preguica.getEmitirSom());
 }
}