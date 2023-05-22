import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    
       
       
        Menu menu = new Menu();
        
        

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
                menu.menuCliente();
            }
            else if (opcao == 2){
                menu.menuFuncionario();
            }
            
        }
        
    }
}
/*public class Main {
    public static void main(String[] args) {
        do {
            Menu menu = new Menu();
            Scanner entrada = new Scanner(System.in);
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - Cliente" + "\n" + "2 - Funcionário" + "\n" + "0 - Sair do Programa");
            System.out.println("Digite a opção desejada:");
            int opcao = entrada.nextInt();
            boolean flag = false;
            while (!flag) {
                try {
                    opcao = entrada.nextInt();
                    flag = true;

                    if (opcao == 0) {
                        System.out.println("Programa encerrado!");
                        break;
                    } else if (opcao == 1) {
                        // Chamar o menu do cliente
                        menu.menuCliente();
                    } else if (opcao == 2) {
                        // Chamar o menu do funcionário
                        menu.menuFuncionario();
                    } else {
                        throw new ValorInvalidoException("Opção inválida!");
                    }

                } catch (ValorInvalidoException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        } while (true);
    }
}

class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}*/

