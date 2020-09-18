package controller;

import model.Model;


public class Controller {

    public static void main(String[] args) {

        int opcao = Model.retornaOpcaoEscolhidaNosMenus();
        validaOpcaoEscolhidaNoMenuPrincipal(opcao);
        
    }

    static void validaOpcaoEscolhidaNoMenuPrincipal(int opcao){

        while (opcao < 0 || opcao > 4){
            System.out.println("Opção invalida! Escolha novamente:");
            opcao = Model.retornaOpcaoEscolhidaNosMenus();
        }
    }
    
}
