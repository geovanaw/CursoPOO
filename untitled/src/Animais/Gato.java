package Animais;

public class Gato {
    // utilizando construtores para setar os atributos e private + set para deixar as informações mais "seguras"
    // não são todos que conseguem acessar
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;

    static int numeroDeGatos;

    public String getNome(){
        return this.nome;
    }

    public void setNome(){
        if(nome.equals("Bob")){ // não deixa colocar o nome bob
            this.nome = null;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }


    //construtor padrão
    public Gato(){}
    // construtor preenche todos ao mesmo tempo
    public Gato(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeGatos ++;
    }

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }


    public static void setNumeroDeGatos(int numeroDeGatos) {
        Gato.numeroDeGatos = numeroDeGatos;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

