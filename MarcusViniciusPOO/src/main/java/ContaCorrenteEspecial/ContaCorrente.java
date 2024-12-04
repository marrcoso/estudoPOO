package ContaCorrenteEspecial;

public class ContaCorrente {
	private String numero;
	private String titular;
	private double saldo;
	private double limiteConta;
	private double saldo2;
	
	 public ContaCorrente() {
		 this.numero = null;
		 this.titular = null;
		 this.saldo = 0.0;
		 this.limiteConta = 0.0;
	    }
	 
	 public ContaCorrente(String numero, String titular, double saldo, double limiteConta) {
		 this.numero = numero;
		 this.titular = titular;
		 this.saldo = saldo;
		 this.limiteConta = limiteConta;
	    }
	 
	 public String getNumero() {
		 return numero;
	 }
	 
	 public void setNumero(String numero) {
		 this.numero = numero;
	 }
	 
	 public String getTitular() {
		 return titular;
	 }
	 
	 public void setTitular(String titular) {
		 this.titular = titular;
	 }
	 
	 public double getSaldo() {
		 return saldo;
	 }
	 
	 public void setSaldo(double saldo) {
		 this.saldo = saldo;
	 }
	 
	 public double getLimiteConta() {
		 return limiteConta;
	 }
	 
	 public void setLimiteConta(double limiteConta) {
		 this.limiteConta = limiteConta;
	 }
	 
	 public void imprimirValores() {
		 System.out.println("Número: " +numero+
				 "\nTitular: " +titular+
				 "\nSaldo: " +saldo+
				 "\nLimite Disponível: " +limiteConta);
	 }
	 
	 public void depositar(double valor) {
		 this.saldo += valor;
		 this.saldo2 = this.saldo;
	 }
	 
	 public void saque(double valor) {
		 this.saldo2 = this.saldo;
		 this.saldo -= valor;
		 valor -= this.saldo2;
		 if (saldo < 0) {
			 this.limiteConta -= this.saldo2;
		 } else if (limiteConta < 0) {
			 System.out.println("Saldo Insuficiente!");
		 }
	 }

}
