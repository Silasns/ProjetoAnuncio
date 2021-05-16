package model;

public class JavaBeans {
	
	private String idAnuncio;
	private String nomeAnuncio;
	private String cliente;
	private String dataInicio;
	private String datatermino;
	private String investimento;
		
	public JavaBeans() {
		super();

	}
	
	public JavaBeans(String idAnuncio, String nomeAnuncio, String cliente, String dataInicio, String datatermino,
			String investimento) {
		super();
		this.idAnuncio = idAnuncio;
		this.nomeAnuncio = nomeAnuncio;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.datatermino = datatermino;
		this.investimento = investimento;
	}

	public String getIdAnuncio() {
		return idAnuncio;
	}
	public void setIdAnuncio(String idAnuncio) {
		this.idAnuncio = idAnuncio;
	}
	public String getNomeAnuncio() {
		return nomeAnuncio;
	}
	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDatatermino() {
		return datatermino;
	}
	public void setDatatermino(String datatermino) {
		this.datatermino = datatermino;
	}
	public String getInvestimento() {
		return investimento;
	}
	public void setInvestimento(String investimento) {
		this.investimento = investimento;
	}
	
	

}
