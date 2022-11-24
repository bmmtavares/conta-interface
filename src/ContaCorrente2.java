
public class ContaCorrente2 implements ContaTributavel {

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualiza(double taxaSelic) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	Conta c=new ContaCorrente2();
	Tributavel t=new ContaCorrente2();

}
