package exercicios;

public record PessoaRecordShallow(String nome, Cidade cidade){
    public PessoaRecordShallow(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Cidade cidade() {
        return cidade;
    }
}
