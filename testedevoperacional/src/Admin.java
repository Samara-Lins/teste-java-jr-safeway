import java.util.List;

public class Admin extends Usuario {
    String username;
    String senha;

    public Admin(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    // getters e setters

    @Override
    public String getSenha() {
        return super.getSenha();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    // métodos de acesso e manipulação dos dados das empresas
    
    public Integer getIdEmpresa(Empresa empresa) {
        return empresa.getId();
    }

    public String getNomeEmpresa(Empresa empresa) {
        return empresa.getNome();
    }
    
    public String getCNPJEmpresa(Empresa empresa) {
        return empresa.getCnpj();
    }

    public double getTaxa(Empresa empresa) {
        return empresa.getTaxa();
    }

    public double getSaldo(Empresa empresa) {
        return empresa.getSaldo();
    }

    public List<Venda> getVendas(Empresa empresa) {
        return empresa.getVendas();
    }

    public void setIdEmpresa(Empresa empresa, Integer newId) {
        empresa.setId(newId);
    }

    public void setNomeEmpresa(Empresa empresa,String nome) {
        empresa.setNome(nome);
    }

    public void setCnpjEmpresa(Empresa empresa,String cnpj) {
        empresa.setCnpj(cnpj);
    }

    public void setTaxaEmpresa(Empresa empresa, double taxa) {
        empresa.setTaxa(taxa);
    }

    public void setSaldoEmpresa(Empresa empresa, double saldo) {
        empresa.setSaldo(saldo);
    }
}
