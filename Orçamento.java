import java.util.Scanner;

public class Orçamento {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        
        System.out.print("Empresa: ");
        String empresa = money.nextLine();
        
        System.out.print("Gerente: ");
        String gerente = money.nextLine();
        
        System.out.print("1° Lucro total: ");
        double pri_lucro = money.nextDouble();
        
        System.out.print("2° Lucro total: ");
        double seg_lucro = money.nextDouble();
        
        System.out.print("Taxa do 1°: ");
        double pri_taxa = money.nextDouble();
        
        System.out.print("Taxa do 2°: ");
        double seg_taxa = money.nextDouble();
        
        if(pri_lucro > 20000) {
            System.out.println("==========RELATORIO==========");
            System.out.println("| EMPRESA:       |" + empresa);
            System.out.println("| GERENTE:       |" + gerente);
            System.out.println("| LUCRO TOTAL:   |" + pri_lucro);
            System.out.println("| TAXA A PAGAR:  |" + pri_taxa);
            System.out.printf(" | TOTAL A PAGAR: |%.2f", pri_lucro * (pri_taxa / 100));
        }
        else if(seg_lucro > 45000) {
            System.out.println("==========RELATORIO==========");
            System.out.println("| EMPRESA:       |" + empresa);
            System.out.println("| GERENTE:       |" + gerente);
            System.out.println("| LUCRO TOTAL:   |" + seg_lucro);
            System.out.println("| TAXA A PAGAR:  |" + seg_taxa);
            System.out.printf(" | TOTAL A PAGAR: |%.2f", seg_lucro * (seg_taxa / 100));
        }
        else {
            System.out.println("======RELATORIO FINAL========");
            System.out.println("| EMPRESA: |" + empresa);
            System.out.println("| GERENTE: |" + gerente);
            System.out.println("| 1°LUCRO: |" + pri_lucro);
            System.out.println("| 2°LUCRO: |" + seg_lucro);
            System.out.println("| TOTAL:   |" + (pri_lucro + seg_lucro));
        }
    }
}