package transferencia;

public class Cliente {
    private String nome;
    private String cpf;
    private String rg;

    //sentença criada pelo contrutor alt+insert ou botao direito GENERATION
    public Cliente(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    //sentença criada pelo Getter alt+insert ou botao direito GENERATION

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}
