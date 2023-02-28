package CamaroteBlueCold;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        leitor.close();
        for (int i = 0; i <= tamanhoDaFila; ++i) { if(i%2!=0) pessoasNoCamarote+=1;}
        System.out.println(pessoasNoCamarote+" pessoas no camarote");
    }
}