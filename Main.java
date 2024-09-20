public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João", 70, 1.75);
        System.out.println("IMC da pessoa: " + pessoa.calcularIMC());

       
        Atleta atleta = new Atleta("Maria", 60, 1.70, "Corrida");
        System.out.println("IMC do atleta: " + atleta.calcularIMC());
    }
}
