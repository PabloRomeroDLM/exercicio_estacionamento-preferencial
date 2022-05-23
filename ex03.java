package exercicio6;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
	
        Scanner read = new Scanner(System.in);
        
        //variável criada para a simplificação dos calculos
        
        int number;
        
        // pint de texto, pedindo para informar se é ou não algumas das opções
        
        System.out.println("digite 1 para idoso, 2 pcd, 3 gestante ou 4 para nenhuma das opcoes: ");
        number = read.nextInt();
        
        //condição if junto a um calclulo, terminar um espaço aceitável entre duas numerações e printar texto positivo

        if(number<4 && number>0) {
            System.out.println("permitido estacionar");
        }
        
        // condição negativa junto a um calculo
        
        else if(number==4){
            System.out.println("proibido estacionar");
       
        

        
    }
}
}
	


