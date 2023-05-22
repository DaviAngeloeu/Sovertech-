import java.util.ArrayList;

public class Produto {
    private String nome;
    private double valor;
    private int quantidade;
    private String sabor;
    
    
  
  public Produto(){}

  public Produto(String nome, String sabor, double valor, int quantidade) {
    this.nome = nome;
    this.sabor = sabor;
    this.valor = valor;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public int getQuantidade() {
      return quantidade;
  }
  public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
  }

  public void diminuirQuantidade(int quantidade){
    this.quantidade -= quantidade;
  }

  public void aumentarQuantidade(int quantidade){
    this.quantidade += quantidade;
  }

  public String getSabor() {
      return sabor;
  }
  public void setSabor(String sabor) {
      this.sabor = sabor;
  }
  

  public void mostrarEstoque(){
    System.out.println("Nome do produto: "+getNome()+"\n"+"Sabor: "+getSabor()+"\n"+"valor: "+getValor()+"\n"+"Quantidades do produto: "+ getQuantidade());
  }





  
  

  
}
