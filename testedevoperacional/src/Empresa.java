import java.util.List;

public class Empresa {
	private Integer id;
	private String nome;
	private String cnpj;
	private Double taxa;
	private Double saldo;
	private List<Venda> vendas;

	public Empresa() {
		super();
	}

	public Empresa(Integer id, String nome, String cnpj, Double taxa, Double saldo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.taxa = taxa;
		this.saldo = saldo;
	}

	// getters e setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public List<Venda> getVendas() {
		return this.vendas;
	}

	// worker methods:

	public void listarVendas() {
		for (Venda venda : vendas) {
			System.out.println("Venda " + venda.getCódigo());
			System.out.println("Comissão do sistema: " + venda.getComissaoSistema());
			System.out.println("Venda líquida: R$" + (venda.getValor() - venda.getComissaoSistema()));
		}
	}
}
