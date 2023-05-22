import java.util.ArrayList;

public class Pedido {
    private int data;
    private ArrayList<Produto> carrinhos = new ArrayList<>();
    private double valorTotal;
    private Cliente cliente;
    

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void valorTotal(){
        Produto p = new Produto();
        this.valorTotal *= p.getQuantidade();
    }

    public ArrayList<Produto> getProdutos() {
        return carrinhos;
    }

    public void adicionarCarrinho(Produto produtos) {
        this.carrinhos.add(produtos);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}