/**
 * 
 */

/**
 * @author bmacedo
 *
 */
public class ContaPoupanca implements Conta {

	/**
	 * 
	 */
	private double saldo;

	@Override
	public double getSaldo() {

		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += (valor - 0.1);

	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 3;

	}

}
