import exercicios.*;
/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        final var cidade = new Cidade("Palmas");
        final var pessoa = new PessoaRecordShallow("José", cidade);

        pessoa.setCidade(new Cidade("Miracema")); //ERRO
        pessoa.cidade().setNome("Miracema");

        final var cr = new CidadeRecord("Palmas");
        final var pr = new PessoaRecord("Manoel",cr);
        pr.setCidade(new Cidade("Miracema")); //ERRO
        pr.cidade.setNome("Paraíso"); //ERRO
    }
}
