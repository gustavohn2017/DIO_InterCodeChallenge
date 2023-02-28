package SalvandoMusicas;



import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            String arquivoDoPc = leitor.next();


            if (arquivoDoPc.toLowerCase().endsWith(".mp3")){
                System.out.println("Salvar");
                return;

            }else{
                System.out.println("Deletar");
                return;
            }
        }

        



        

    }
}