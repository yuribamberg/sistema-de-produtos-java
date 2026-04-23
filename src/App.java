import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Produto [] produtos = new Produto[5];

        int escolha = 0;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        while (escolha != 4) {

            System.out.print("\n1 - Cadastrar produto \n2 - Listar produtos \n3 - Buscar produtos \n4 - Sair\n");
            System.out.print("\nEscolha: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

        if(escolha == 1) {
            if(total < 5) {
                produtos[total] = new Produto();

            System.out.print("\nDigite o nome do produto: ");
            produtos[total].nome = scanner.nextLine();
            System.out.print("\nDigite o preço do produto: R$");
            produtos[total].preco = scanner.nextDouble();
            scanner.nextLine();

            total++;

            } else {
                System.out.println("\nLimite de produtos atingido.");
            }
        }

            if(escolha == 2) {
                for(int i = 0; i < total; i++) {
                    if(produtos[i] != null) {
                        System.out.println("Nome: " + produtos[i].nome);
                        System.out.println("Preço: " + produtos[i].preco);
                }
            }
        }

    boolean encontrado = false;
        if(escolha == 3) {
            System.out.print("\nDigite o nome do produto: ");
            String nomeBuscado = scanner.nextLine();

            for(int i = 0; i < total; i++) {
            if (produtos[i] != null && produtos[i].nome.equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                System.out.println("\nProduto encontrado!");

                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Preço: R$" + produtos[i].preco);
            } 
          } 
            if(!encontrado) {
                System.out.println("\nProduto não encontrado.");
            }
        
     }
}
scanner.close();
  }
}
class Produto {
    String nome;
    double preco;
}