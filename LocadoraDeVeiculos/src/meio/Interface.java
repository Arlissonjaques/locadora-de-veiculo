
package meio;
import java.util.Scanner;
import frontend.Menu;



public class Interface {


    public static int retornaOpcaoEscolhidaNosMenus(){
        Scanner entrada = new Scanner(System.in);

        System.out.print(Menu.menuPrincipal());
        
        int opcao = entrada.nextInt();
        entrada.close();

        return opcao;
    }
}
