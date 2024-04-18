package models;

// Uma classe ela serve para representar um objeto ou um conceito do mundo real
// e trazer ela para o mundo da preogramação
// geralmente classes na gramatica são substantivos, ou seja, nome de coisas
// uma classe é composta por atributos e métodos
// as classes que são substantivos
// que são o core do dominio do problema são chamados de classes de entidade
// as classes de entidade no java geralmente são pojos (plain old java objects) ou beans
// basicamente são classes que tem atributos, getters e setters, construtores e toString
public class Musica {
    // Atributos são as caracteristicas do objeto
    // Atributos são adjetivos ou substantivos
    // atributos tem a seguinte estrutura: visibilidade, tipo, nome
    // visibilidade: public, private, protected, default
    // tipo: int, double, float, String, boolean, char
    // nome: nome do atributo
    private String nome;
    private String artista;
    private String genero;
    private int duracao;
    private int anoLancamento;

    // construtor é um método especial que é chamado quando um objeto é instanciado
    public Musica() {
    }

    public Musica(String nome, String artista, String genero, int duracao, int anoLancamento) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        setDuracao(duracao);
        setAnoLancamento(anoLancamento);
    }

    // getters são métodos que retornam o valor do atributo
    public String getNome() {
        return nome;
    }

    // setters são métodos que alteram o valor do atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            System.out.println("A duração da música não pode ser negativa ou zero!");
            return;
        }
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento <= 0) {
            System.out.println("O ano de lançamento da música não pode ser negativo ou zero!");
            return;
        }
        this.anoLancamento = anoLancamento;
    }

    // Métodos são as ações que o objeto pode realizar
    // Métodos são verbos
    // métodos tem a seguinte estrutura: visibilidade, tipo de retorno, nome,
    // parâmetros
    // visibilidade: public, private, protected, default
    // tipo de retorno: int, double, float, String, boolean, char, void
    // nome: nome do método
    // parâmetros: são os valores que o método precisa para funcionar
    public void tocar() {
        System.out.println("Tocando a música " + nome);
    }

    public void curtir() {
        System.out.println("Curtindo a música " + nome);
    }

    public void pausar() {
        System.out.println("Pausando a música " + nome);
    }

    public String getDuracaoFormatada() {
        int minutos = duracao / 60;
        int segundos = duracao % 60; // resto da divisão, ex: 61 % 60 = 1
        return "%dm%ds".formatted(minutos, segundos);
    }

    @Override
    public String toString() {
        return "models.Musica{nome='%s', artista='%s', genero='%s', duracao=%d, anoLancamento=%d}"
                .formatted(nome, artista, genero, duracao, anoLancamento);
    }
}