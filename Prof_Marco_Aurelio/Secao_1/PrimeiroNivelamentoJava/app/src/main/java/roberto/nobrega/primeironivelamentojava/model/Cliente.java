package roberto.nobrega.primeironivelamentojava.model;

// Esta classe faz parte da Arquitetura MVC (no caso, faz parte da Model (M), pois vai armazenar e apresentar dados para a
// a aplicação. Os dados ficarão armazenados em um Banco de Dados).

// OBS: A classe, em Java, é fortemente tipada (o que estiver definido em uma classe, possui um tipo).

public class Cliente{

    // OBS: Como a classe Cliente é pública, então qualquer classe poderá usá-la. String é um tipo não-primitivo de dado,
    // enquanto que int e boolean são tipos primitivos de dados.
    //    A classe Cliente é uma classe POJO (ou seja, uma classe que vai apenas apresentar atributo(s), construtor(es) e
    //    método(s) get(ters) e set(ters).

    // Os atributos serão do tipo private, pois apenas a classe Cliente é que poderá acessá-las.
    private String nome;   // Atalho: ctrl + d (quando colocar o cursor após o ; vai realizar uma cópia desta linha para baixo).
    private String email;
    private String telefone;
    private int idade;
    private boolean sexo;

    // public Cliente(){ super(); }    // Isto é o Construtor Padrão. Não é preciso colocá-lo, pois ele está presente no código,
    // porém de "maneira oculta".

    // OBS: Abaixo, temos um construtor, porém ele tem assinatura(s). Ou seja, não será possível usar o construtor padrão (apesar de estar
    // oculto), porém se você editar manualmente no código, então poderá usar (indicado na linha 22).
    public Cliente(String nome, String email, String telefone, int idade, boolean sexo) {  // "Construtor", com cinco assinaturas (parâmetros).
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
    }

    //      Abaixo, temos os métodos getters e setters. Os métodos getters servem para recuperar dados, enquanto que os métodos
    //      setters servem para alterar dados.
    //      OBS: QUando for construir um método, utilize o camelCase (ou seja, o nome do método começa com letra minúscula, enquanto
    //      que a "segunda parte" começa com letra maiúscula.
    //      OBS: Em POO, o(s) parâmetro(s) de um método é(são) chamado(s) de Assinatura(s) de Método.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // OBS: Como temos um atributo booleano, então, o AndroidStudio (usando a forma automática de criação de métodos
    // getters e setters) colocará a palavra is, em vez de get, para obter o dado do atributo sexo.
    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}