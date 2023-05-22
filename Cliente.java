import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String historico;
    
  
    public Cliente(){}
    public Cliente(String nome, String cpf, String endereco,String telefone, String historico) {
        super(nome, cpf, endereco, telefone);
        this.historico = historico;
    }

    public void mostraDados() {
        super.mostrarDados();
        System.out.println("Histórico: " + getHistorico());
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    public void historicoDeCompras(){
        System.out.println("Historico de Compras de "+getNome()+"é" +getHistorico());
    }

    
}

