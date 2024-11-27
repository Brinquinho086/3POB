package Projeto_AV2;

import Projeto_AV2.controller.FuncionarioController;
import Projeto_AV2.view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        FuncionarioController controller = new FuncionarioController();
        
        FuncionarioView view = new FuncionarioView(controller);
        
        view.exibirMenu();
    }
}