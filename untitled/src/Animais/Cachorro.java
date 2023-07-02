package Animais;

public class Cachorro { //Criação da classe cachorro
    // Atributos abaixo
    public String   nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;

    public String estadoDeEspirito;

    // métodos abaixo
    public void comer(){}

    public void latir() {
        System.out.println("au au au");
    }

    public String pegar() {
        return "bolinha";
    }
        public String interagir(String acao){
            // utilizar o switch no lugar de varios if e else.
            switch (acao){
                case "carinho": this.estadoDeEspirito = "feliz"; break; // o break faz ler a próxima linha
                case "vai dormir!": this.estadoDeEspirito = "bravo"; break; //sem o break a leitura termina no default
                case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
                case "nada": this.estadoDeEspirito = "neutro"; break;
                default: this.estadoDeEspirito = "neutro";  // se nao for nenhuma das opçoes a seguir
        }
        return this.estadoDeEspirito;
    }

}

