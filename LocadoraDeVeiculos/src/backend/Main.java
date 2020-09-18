package backend;
import meio.Interface;

public class Main {

    public static void main(String[] args) {

        int opcao = Interface.retornaOpcaoEscolhidaNosMenus();
        validaOpcaoEscolhida(opcao);
        
    }

    static void validaOpcaoEscolhida(int opcao){

        while (opcao < 0 || opcao > 4){
            System.out.println("Opção invalida! Escolha novamente:");
            opcao = Interface.retornaOpcaoEscolhidaNosMenus();
        }
    }
    
}
