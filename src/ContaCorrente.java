
//public class ContaCorrente implements Conta, Tributavel {
public class ContaCorrente implements ContaTributavel {

	private double saldo;

	@Override
	public double getValorImposto() {
		return this.saldo * 0.01;

	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;

	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 2;

	}

}
