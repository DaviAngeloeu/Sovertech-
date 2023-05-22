import java.util.ArrayList;
public class Funcionario extends Pessoa {
    private String funcao;
    private int horarioTrabalho;
    private double salario;
    private ArrayList<Funcionario> equipe;

    public Funcionario(){}
  
    public Funcionario(String nome, String cpf, String endereco,String telefone, String funcao, int horarioTrabalho, double salario) {
      super(nome, cpf, endereco, telefone);
      this.funcao = funcao;
      this.horarioTrabalho = horarioTrabalho;
      this.salario = salario;
      equipe = new ArrayList<Funcionario>();
    }
  
    public void mostraDadosDoFuncionario() {
      System.out.println("=====Dados do Funcionario=====");
      super.mostrarDados();
      System.out.println("Função: " + getFuncao());
      System.out.println("Salário: " + getSalario());
      System.out.println("Jornada de Trabalho: " + getHorarioTrabalho() + " Horas");
    }
  
    public String getFuncao() {
      return funcao;
    }
  
    public void setFuncao(String funcao) {
      this.funcao = funcao;
    }
  
    public int getHorarioTrabalho() {
      return horarioTrabalho;
    }
  
    public void setHorarioTrabalho(int horarioTrabalho) {
      this.horarioTrabalho = horarioTrabalho;
    }
  
    public double getSalario() {
      return salario;
    }
  
    public void setSalario(double salario) {
      this.salario = salario;
    }
    
    public  ArrayList<Funcionario> getEquipe() {
        return equipe;
    }

    public void adicionarEquipe(Funcionario funcionario){
      equipe.add(funcionario);
    }

   
    
}