package lista03_2020_exc_3;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca;

	public ContaSimples() {
		
	}
	
	public ContaSimples(
				String banco, 
				int agencia, 
				int numeroConta, 
				double saldo,
				double saldoPoupanca
			) 
	{
		super(banco,agencia,numeroConta,saldo);
		setSaldoPoupanca(saldoPoupanca);
	}
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if(saldoPoupanca != 0)
			this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) { //precisa saber para quem vai ser depositado, certo?
		return true;
	}
	
	public boolean saquePoupanca(double valor) {
		if(valor > this.saldoPoupanca)
			return false;
		
		this.saldoPoupanca -= valor;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
