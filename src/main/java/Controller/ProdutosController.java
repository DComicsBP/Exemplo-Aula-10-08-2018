/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 10070269
 */
@Controller
public class ProdutosController {
    ArrayList<Produto> produtos = new ArrayList<>(); 
    
    public ProdutosController(){
   
        Produto p1 = new Produto(); 
        
        p1.setId(4);
        p1.setNome("Farinha");
        p1.setValor(7.8f);
       
         Produto p2 = new Produto(); 
        
        p2.setId(5);
        p2.setNome("Farofa");
        p2.setValor(9);
       
        
       Produto p3 = new Produto(); 
        
        p3.setId(1);
        p3.setNome("Batata");
        p3.setValor(4.5f);
       
        Produto p4 = new Produto(); 
        
        p4.setId(2);
        p4.setNome("Feijão");
        p4.setValor(5.7f);
        
        Produto p5 = new Produto(); 
        
        p5.setId(3);
        p5.setNome("Arroz");
        p5.setValor(6.7f);
       
    }
    
    public List<Produto> listar(){
        return produtos; 
    }
}