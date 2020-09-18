
package model;


import java.util.Scanner;
import view.Menu;


public class Model{


    public static int retornaOpcaoEscolhidaNosMenus(){
        Scanner entrada = new Scanner(System.in);

        System.out.print(Menu.menuPrincipal());
        
        int opcao = entrada.nextInt();
        entrada.close();

        return opcao;
    }
}
