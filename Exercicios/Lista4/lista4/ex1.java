package lista4;

public class ex1 {

	public static void main(String[] args) {
		ex1Molde cliente = new ex1Molde();
		
		cliente.nome ="Amanda";
		cliente.idade =26;
		cliente.cpf ="839.835.253-54";
		
		cliente.informarnome();
		cliente.informaridade();
		cliente.informarcpf();

	}

}