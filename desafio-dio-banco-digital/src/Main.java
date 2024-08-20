
public class Main {

	public static void main(String[] args) {
		
		Cliente dani = new Cliente();
		dani.setNome("Daniele");
		Conta cc = new ContaCorrente(dani);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(dani);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
