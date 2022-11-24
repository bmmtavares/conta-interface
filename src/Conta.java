
public interface Conta {
	public abstract double getSaldo();
	public abstract void deposita(double valor);
	public abstract void saca(double valor);
	public abstract void atualiza(double taxaSelic);
}
