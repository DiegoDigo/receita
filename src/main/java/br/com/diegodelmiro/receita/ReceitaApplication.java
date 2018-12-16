package br.com.diegodelmiro.receita;

import br.com.diegodelmiro.receita.api.Controller;

public class ReceitaApplication {


    public static void main(String[] args) {
        Controller a = new Controller();
        System.out.println(a.buscarCnpj("66723933000115"));
    }

}

