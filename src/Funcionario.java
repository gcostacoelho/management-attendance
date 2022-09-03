public class Funcionario {
    
    private String nome, cpf, email, telefone;
    private int permissao;

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
    
    public String getCpf() { return cpf; }
    
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public String getEmail() { return email; }
    
    public void setEmail(String email) { this.email = email; }
    
    public String getTelefone() { return telefone; }
    
    public void setTelefone(String telefone) { this.telefone = telefone; }    
    
    public int getPermissao() { return permissao; }
    
    public void setPermissao(int permissao) { this.permissao = permissao; }

    public Funcionario(String nome, String cpf, String email, String telefone, int permissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.permissao = permissao;
    }

    public String imprimeString() {
        return "Funcionario [cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", permissao=" + permissao
                + ", telefone=" + telefone + "]";
    }
    
    

}
