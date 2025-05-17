import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	     
	    float hamburguer = 6.00f;
	    float refrigerante = 7.00f;
	    float nuggets = 6.00f;
	    
	    System.out.println("Menu da Lanchonete do ITU \n");
	    System.out.println("1- Hamburguer = R$" + hamburguer);
	    System.out.println("2- Refrigerante = R$" + refrigerante);
	    System.out.println("3- Nuggets = R$" + nuggets);
	    
	    System.out.println("O que vc gostaria de pedir do menu ?: ");
	    float menu = scan.nextFloat();
	    
	    System.out.println("Quantas unidades deste item vc deseja: ");
	    float unidades = scan.nextFloat();
	    
	    hamburguer = hamburguer * unidades;
	    refrigerante = refrigerante * unidades;
	    nuggets = nuggets * unidades;
	    
	    float carrinho = 0f;
	    
	    if (menu == 1){
	        carrinho = hamburguer;
	    }
	    else if (menu == 2){
	        carrinho = refrigerante;
	    }
	    else if (menu == 3){
	        carrinho = nuggets;
	    }
	    
	    System.out.println("Insira quanto vc tem na carteira: ");
	    float carteira = scan.nextFloat();
	    
	    if (carteira < carrinho){
	        System.out.println("Não tem dinheiro suficiente");
	    }
	    else if (carteira >= carrinho){
	        System.out.println("Compra realizada");
	    }
	    
	    
	}
}
