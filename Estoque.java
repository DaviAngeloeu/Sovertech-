import java.util.Scanner;
import java.util.ArrayList;
public class Estoque {

    
    private static ArrayList<Produto> pedidos = new ArrayList<>();
    private static ArrayList<Produto> produtos1 = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    private static ArrayList<Funcionario> atendentes = new ArrayList<>();
    
    
    
    
     
    public void cardapio(){

        
        Produto sorveteM = new Produto("Sorvete","Morango",4,5);
        
        

        produtos1.add(sorveteM);
        

        
        Produto milkC = new Produto("MilkShake","Chocolate",8,3);
        

        
        produtos1.add(milkC);
        

        
        Produto sundaeB = new Produto("Sundae","Baunilha",5,10);

       
        produtos1.add(sundaeB);

        for (int i=0; i<produtos1.size(); i++){
            System.out.println("Nome do produto: "+produtos1.get(i).getNome());
            System.out.println("Nome do sabor: "+produtos1.get(i).getSabor());
            System.out.println("Valor do produto: "+produtos1.get(i).getValor());
            System.out.println("Quantidades: "+produtos1.get(i).getQuantidade());
            
        }

    }
    public void cadastrarPedidos(){
        Pedido pedido = new Pedido();
        Produto produto = new Produto();
        Scanner entrada = new Scanner(System.in);

          
        System.out.println("Digite o nome do produto:");
        String nome = entrada.next();
        produto.setNome(nome);
        
        
        System.out.println("Digite o sabor do produto:");
        String sabor = entrada.next();
        produto.setSabor(sabor);
        System.out.println("Digite o valor do produto:");
        Double valor = entrada.nextDouble();
        produto.setValor(valor);
        
        System.out.println("Digite a quantidade de produtos:");
        int qtd = entrada.nextInt();
        produto.setQuantidade(qtd);
        
        pedidos.add(produto);
        
        pedido.adicionarCarrinho(produto);

        
        produtos1.add(produto);
                        
    }
    public void venda(String quantidade){
        
        int qtd = 0;
        
        for (Produto produto : produtos1) {
            
            if (produto.getNome().equalsIgnoreCase(quantidade)) {
                pedidos.add(produto);
                qtd += produto.getQuantidade();

               // qtd +=1;
            }
            //System.out.println("Quantidade do produto é "+qtd+" eo valor total é "+valorTotal);
        }
    }

    public void cadastrarProdutos(){
        Produto produto = new Produto();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        String nome = entrada.next();
        produto.setNome(nome);

        System.out.println("Digite o sabor do produto:");
        String sabor = entrada.next();
        produto.setSabor(sabor);
        System.out.println("Digite o valor do produto:");
        Double valor = entrada.nextDouble();
        produto.setValor(valor);
        
        System.out.println("Digite a quantidade de produtos:");
        int qtd = entrada.nextInt();
        produto.setQuantidade(qtd);
        produtos1.add(produto);
    }
    
    
    public void mostrarProdutosCadastrados(){
        for (int i=0; i<produtos1.size(); i++){
            System.out.println("Nome do produto: "+produtos1.get(i).getNome());
            System.out.println("Nome do sabor: "+produtos1.get(i).getSabor());
            System.out.println("Valor do produto: "+produtos1.get(i).getValor());
            System.out.println("Quantidades: "+produtos1.get(i).getQuantidade());
            
        }

    }

    public void mostrarPedidosCadastrados(){

        for (int i=0; i<pedidos.size(); i++){
            System.out.println("Nome do produto: "+pedidos.get(i).getNome());
            System.out.println("Nome do sabor: "+pedidos.get(i).getSabor());
            System.out.println("Valor do produto: "+pedidos.get(i).getValor());
            System.out.println("Quantidade de produtos: "+pedidos.get(i).getQuantidade());

            
            
        }

    }
    public void atualizarProdutos(){


        for (int i=0; i<produtos1.size(); i++){

            Produto atualizar = produtos1.get(i);
            System.out.println("["+i+"]"+atualizar.getNome());
            
            
            
        }
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite qual produto você quer atualizar:");
        int posicao = entrada.nextInt();
        System.out.println("Digite seu novo produto: ");
        String novo = entrada.next();
        Produto produto = produtos1.get(posicao);
        produto.setNome(novo);
        

    }

    public void removerProdutos(){
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<produtos1.size(); i++){

            Produto atualizar = produtos1.get(i);
            System.out.println("["+i+"]"+atualizar.getNome());
            
            
            
        }
        System.out.println("Digite qual produto você quer remover:");
        int posicao = entrada.nextInt();
        produtos1.remove(posicao);

    }
    public void cancelarPedidos(){
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<pedidos.size(); i++){
            Produto cancelar = pedidos.get(i);
            System.out.println("["+i+"]"+cancelar.getNome());
        }
        System.out.println("Digite qual produto você quer remover:");
        int posicao = entrada.nextInt();
        pedidos.remove(posicao);

    }

    //FUNCIONARIO ATENDENTE

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void menuDeCadastroFuncionario(){
        Funcionario f = new Funcionario();
        Scanner entrada = new Scanner(System.in);                
                        
                        
        System.out.println("Digite seu nome:");
        
        String escreve = entrada.next();
        f.setNome(escreve);
        System.out.println("Digite seu cpf:");
        String cpf = entrada.next();
        f.setCpf(cpf);
        System.out.println("Digite seu endereço:");
        String endereco = entrada.next();
        f.setEndereco(endereco);
        
        System.out.println("Digite seu telefone:");
        String telefone = entrada.next();
        f.setTelefone(telefone);
        System.out.println("Digite a função:");
        String funcao = entrada.next();
        f.setFuncao(funcao);
        
        System.out.println("Digite o horario trabalhado:");
        int hora = entrada.nextInt();
        
        f.setHorarioTrabalho(hora);
        System.out.println("Digite o salario:");
        double salario = entrada.nextDouble();
        f.setSalario(salario);
        atendentes.add(f);



        
    }
    

    public void removerFuncionario(){
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<atendentes.size(); i++){

            Funcionario remove = atendentes.get(i);
            System.out.println("["+i+"]"+remove.getNome());
            
            
        }
        System.out.println("Digite qual funcionario você quer remover:");
        int posicao = entrada.nextInt();
        atendentes.remove(posicao);
    }

    public void mostrarCadastroFuncionario(){
        System.out.println("=====Funcionarios cadastrados=====");
        for (int i=0; i<atendentes.size(); i++){
            System.out.println("NOME: "+atendentes.get(i).getNome());
            System.out.println("CPF: "+atendentes.get(i).getCpf());
            System.out.println("ENDEREÇO: "+atendentes.get(i).getEndereco());
            System.out.println("FUNÇÃO: "+atendentes.get(i).getFuncao());
            System.out.println("HORAS TRABALHADAS: "+atendentes.get(i).getHorarioTrabalho());
            System.out.println("TELEFONE:"+atendentes.get(i).getTelefone());
            System.out.println("SALARIO: "+atendentes.get(i).getSalario());
        }    
    }

    public void cadastrarClientes(){
        Scanner entrada = new Scanner(System.in);
        Cliente c = new Cliente();
                        
        System.out.println("Digite seu nome:");
        
        String escreve = entrada.next();
        c.setNome(escreve);
        System.out.println("Digite seu cpf:");
        String cpf = entrada.next();
        c.setCpf(cpf);
        System.out.println("Digite seu endereço:");
        String endereco = entrada.next();
        c.setEndereco(endereco);
        System.out.println("Digite seu telefone:");
        String telefone = entrada.next();
        c.setTelefone(telefone);
        clientes.add(c);
    }

    public void atualizarCadastroDeCliente(){
        
        for (int i=0; i<clientes.size(); i++){

            Cliente atualizar = clientes.get(i);
            
            System.out.println("["+i+"]"+atualizar.getTelefone());
            
            
        }
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite qual dado você quer atualizar:");
        int posicao = entrada.nextInt();
        
        System.out.println("Digite seus novo telefone: ");
        String telefone = entrada.next();
        
        
        Cliente c = clientes.get(posicao);
        c.setTelefone("Novo Telefone cadastrado -> "+telefone);
        
    }

    public void alterarEstoque(){
        for (int i=0; i<produtos1.size(); i++){

            Produto atualizar = produtos1.get(i);
            System.out.println("["+i+"]"+atualizar.getNome());
            
            
            
        }
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite qual produto você quer atualizar no estoque:");
        int posicao = entrada.nextInt();
        System.out.println("Digite a nova quantidade de produtos: ");
        int novo = entrada.nextInt();
        Produto produto = produtos1.get(posicao);
        produto.setQuantidade(novo);

    }
    

    

    

    
    
}

