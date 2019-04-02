/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaCarro {
    
    public static void main(String[] args){
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2019;
     
        System.out.println("Modelo do carro: "+ meuCarro.modelo);
    }
    
}
