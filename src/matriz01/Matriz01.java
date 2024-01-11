package matriz01;

import javax.swing.*;
import java.util.Scanner;

public class Matriz01 {

    public static void main(String[] args) {
        //variavei
        String alunos[][] = new String[6][3];
        int l = 1, c = 1, n = 1, notas,media;
        String msg = "";
        
        Scanner enter = new Scanner(System.in);
        //entrada de dados
        while (c < 3) {

            alunos[l][c]= JOptionPane.showInputDialog("Digite o nome do " + c + " aluno ");//linha 1,1 nome 
            System.out.println("nome do aluno " + n + " linha " + l + "coluna" + c);
            msg += alunos[l][c] + "\n";
            l += 1;   //dece a linha 2,1

            while (l <= 5) {

                notas = Integer.parseInt(
                        alunos[l][c] = JOptionPane.showInputDialog("digite a " + n + " nota de " + alunos[1][c] + "\n")); //linha 2,1
                msg += n + " nota de " + alunos[1][c] + "= " + notas + "\n";
                

                System.out.println("norta " + n + " na linha " + l + "coluna" + c);
                System.out.println(alunos[l][c]);
                n += 1;
                l += 1;

            }
            n = 1;
            l = 1;
            c += 1;
        }
        JOptionPane.showMessageDialog(null, msg);

        //processamento
        //saida de dados
    }

}
