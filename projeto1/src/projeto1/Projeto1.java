package projeto1;


public class Projeto1 {

    public static void main(String[] args) {
        Carro carro = new Carro ("Toyota", "Corolla");
        carro.andar();
    }
}
    

class Carro {
    private String marca;
    private String nome;
    public Carro (String marca, String nome){
    this.marca = marca;
    this.nome = nome;
    }    
  public void andar(){
      System.out.println("O carro " + marca + " " + nome + " esta andando");
    }
}

