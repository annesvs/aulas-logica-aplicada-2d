public class Pessoa {
    // Atributos
    String nome;
    String sobrenome;

    // Métodos
    public void falar() {
        System.out.println("falei");
    }
    // Sobrecarga do método falar()
    public String falar(String volume){
        return "falei" + volume;
    }
    // Construtor
    Pessoa(){

    }
    Pessoa(String _nome){
        this.nome = _nome;
    }
}
