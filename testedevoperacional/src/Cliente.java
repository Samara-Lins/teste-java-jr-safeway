import java.util.List;

public class Cliente {
	private String cpf;
	private String nome;
	private String username;
	private Integer idade;
	private List<Produto> carrinho;

	public Cliente(String cpf, String nome, String username, Integer idade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.username = username;
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void comprar(Produto produto) {
		this.carrinho.add(produto);
	}

	public void fecharCompra() {
		for (Produto produto : carrinho) {
			Venda venda = new Venda();
			venda.setEmpresa(produto.getEmpresa());
			venda.setCódigo(venda.getEmpresa().getVendas().size()); // simula o AUTO INCREMENT do MySQL para gerar um código para a venda com base no registro de vendas da empresa
			venda.setCliente(this); // relaciona o objeto Cliente que chama o método à venda feita
			venda.getItens().add(produto); // adiciona o produto a lista de itens da venda
			venda.setValor(produto.getPreco()*produto.getQuantidade()); // calcula o valor da venda
			venda.setComissaoSistema(); // acessa o atributo comissaoSistema da venda
			double liquida = venda.getValor() - venda.getComissaoSistema();
			venda.getEmpresa().setSaldo(venda.getEmpresa().getSaldo() + liquida);
			venda.getEmpresa().getVendas().add(venda);

			// resumo da compra do cliente
			for (Produto item : carrinho) {
				System.out.println(item.getNome());
				System.out.println("Quantidade: " + item.getQuantidade());
				System.out.println("Total: R$" + item.getPreco()*item.getQuantidade());
			}
		}

	}
}
