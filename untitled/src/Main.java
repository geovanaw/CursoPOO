public class Main {

    public static void main(String[] args) {

        Animais.Cachorro cachorro1 = new Animais.Cachorro();
        //Definiu na memória (do java) o objeto cachorro com os atributos a seguir.
        // Ao rodar o código, retorna o "id" do cachorro
        cachorro1.nome = "Theo";
        cachorro1.cor = "preto";
        cachorro1.altura = 30;
        cachorro1.peso = 4.500;
        cachorro1.tamanhoDoRabo = 9;

        Animais.Gato gato1 = new Animais.Gato("Momon", "Preto", 15, 3, 8);
        Animais.Gato gato2 = new Animais.Gato("Aura", "Preto", 15, 3, 8);
        System.out.println(gato1.toString());
        System.out.println(gato2.toString());

        System.out.println("O número de gatos cadastrados é " + gato1.getNumeroDeGatos());




        // interagindo com métodos(ações)
        cachorro1.latir();

        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
        System.out.println("O cachorro está " + cachorro1.interagir(""));
    }
}