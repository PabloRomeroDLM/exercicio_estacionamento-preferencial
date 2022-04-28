import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //variavel
        int number;
        //informativo ao, a motorista 
        System.out.println("digite 1 para idoso, 2 pcd, 3 gestante ou 4 para nenhuma das opcoes: ");
        number = read.nextInt();
        // condicao positiva com calculo 
        if(number<4 && number>0) {
            System.out.println("permitido estacionar");
        }
        //condicao negativa com calculo
        else if(number==4){
            System.out.println("proibido estacionar");}
    }
}
       
        

        
    
