package interfaceExemplo;

public class EquipamentoEletronico {
	
	public float tensao;
	public float consumo;

	
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		if (consumo > 0)
		this.consumo = consumo;
	}
	
	
	public float getTensao() {
		return tensao;
	}
	public void setTensao(float tensao) {
		if (tensao > 0)
		this.tensao = tensao;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico [tensao=");
		builder.append(tensao);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
	

}
