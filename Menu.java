
import java.util.Scanner;
public class Menu{
    public static void menuPrincipal(){
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("MENU PRINCIPAL");
        System.out.println("1-Cliente." + "\n" + "2-Funcionario."+ "\n"+ "0-SairDoPrograma.");
        System.out.println("Digite qual opção deseja:");
        int opcao = entrada.nextInt();

        while (opcao >= 0){
            if (opcao == 0){
                System.out.println("Programa encerrado!");
                break;
            }
            else if (opcao == 1){
                menuCliente();
            }
            else if (opcao == 2){
                menuFuncionario();
            }
            
        }
    }
    public static void menuCliente(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("====Cliente====");
        System.out.println("1-FazerPedido" +"\n"+"2-FazerCadastro"+"\n"+"3-CancelarPedido"+"\n"+"4-AtualizarCadastro"+"\n"+"5-historico de Pedidos");
        System.out.println("Qual função deseja fazer?");
        int cliente= entrada.nextInt();
        while(cliente >=0){
            if (cliente == 0 ){
                menuPrincipal();
                break;
            }
            else if (cliente == 1){
                System.out.println("Temos os sabores: Morango, Chocolate, Baunilha.");
                Estoque estoque = new Estoque();    
                estoque.cadastrarPedidos();
                break;
                   
            }
            
                    
            else if(cliente==2){
                System.out.println("====Cadastro do cliente====");
                Estoque estoque = new Estoque();
                estoque.cadastrarClientes();        
                
               //Chamar o método atendentes cliente
                break;
            }
            else if (cliente == 3){
                Estoque estoque = new Estoque();
                estoque.cancelarPedidos();
            //Chamar o método cancelar pedido
                System.out.println("Cliente cancelou o pedido!");
                break;
            }
            else if (cliente == 4){
                Estoque estoque = new Estoque();
                estoque.atualizarCadastroDeCliente();
                break;
            }
            else if(cliente == 5){
                Estoque estoque = new Estoque();
                estoque.mostrarPedidosCadastrados();
                break;
            }


        
        }
                      

    }
    public static void menuFuncionario(){
        Estoque e = new Estoque();
        Produto p = new Produto();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("====Funcionarios====");
        System.out.println("1-Atendente"+"\n"+"2-Gerente"+"\n"+"Menu Principal, aperte 0");
        int funcionario = entrada.nextInt();
        while(funcionario >= 0){
            if(funcionario==0){
                menuPrincipal();
                //retornar as opções ou ao menu principal
                break;
            }
            else if (funcionario == 1){
                System.out.println("====Atendente====");
                System.out.println("1-Criar Pedido"+"\n"+"2-Alterar Estoque"+"\n"+"3-Remover Produto");
                System.out.println("Qual opção deseja fazer?");

                int atendente = entrada.nextInt();
                while(atendente >=0){
                    if(atendente == 0){
                        menuFuncionario();
                        //retornar as opções ou ao menu principal
                        break;
                    }
                    else if (atendente == 1){
                        Estoque estoque = new Estoque();
                        estoque.cadastrarPedidos();
                        break;
                        //Criar Pedido
                           
                    }
                            
                    
                    else if (atendente == 2){
                        Estoque estoque = new Estoque();
                        estoque.alterarEstoque();
                        break;
                        //Alterar Estoque
                    }
                    else if(atendente == 3){
                        Estoque estoque = new Estoque();
                        estoque.removerProdutos();
                        break;
                        //Remove Produto
                    }
                }
                
            }
            else if (funcionario == 2){
                System.out.println("====Gerente====");
                System.out.println("1-AdicionarProduto"+"\n"+"2-CriarPedido"+"\n"+"3-AlterarEstoque"+"\n"+"4-AlterarProduto"+"\n"+"5-RemoverProduto"+"\n"+"6-CancelarPedido"+"\n"+"7-RemoverFuncionario"+"\n"+"8-AdicionarFuncionario"+"\n"+"9-Mostrar funcionarios cadastrados"+"\n"+"10-Mostrar produtos cadastrados");
                System.out.println("Deseja voltar ao menu do Funcionario? Aperte 0");
                int gerente = entrada.nextInt();
                while(gerente >=0){
                    Estoque estoque = new Estoque();
                    Pedido pedido = new Pedido();
                    Funcionario f = new Funcionario();
                    Produto produto = new Produto();
                    if(gerente == 0){
                        menuFuncionario();
                        //retornar as opções ou ao menu principal
                        break;
                    }
                    else if (gerente == 1){
                        estoque.cadastrarProdutos();
                        
                        break;
                        // AdicionaProduto
                    }
                    else if(gerente == 2){
                        estoque.cadastrarPedidos();
                        break;
                        
                        // CriarPedido
                    }
                    else if (gerente == 3){
                        estoque.alterarEstoque();
                        break;
                        // AlterarEstoque
                    }
                    else if (gerente == 4){
                        estoque.atualizarProdutos();
                        break;
                        // AlterarProduto
                    }
                    else if (gerente == 5){
                        estoque.removerProdutos();
                        break;
                        // RemoverProduto
                    }
                    else if (gerente == 6){
                        estoque.cancelarPedidos();
                        break;
                        
                        // RemoverPedido
                    }
                    else if (gerente == 7){
                        estoque.removerFuncionario();
                        break;
                        
                        // RemoverFuncionario
                    }
                    else if (gerente == 8){

                        estoque.menuDeCadastroFuncionario();
                        break; 
                        // AdicionarFuncionario
                    }
                    else if (gerente == 9){
                    
                        estoque.mostrarCadastroFuncionario();
                        break;
                        
                    }
                    else if (gerente == 10){
                        estoque.mostrarProdutosCadastrados();
                        break;
                    }
                    
                }
            }
        }
        
                        
    }   
}