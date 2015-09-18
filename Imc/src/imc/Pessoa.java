/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author 31410324
 */
public class Pessoa {
    private double peso;
    private int altura;
    private String nome;
    private int idade;
    private String sexo;
    
    
    public double calculaIMC(int peso , int altura){
        double imc = 0;
        
        imc = peso /(altura*altura);
        
        return imc;
    }
    
    public String chechaIMC(double imc){
       if(imc < 16) return  ("Magreza grave");
       
       else if((imc > 16) && (imc < 17))
           return  ("Magreza moderada");
       
       else if((imc > 17) && (imc < 18.5))
           return  ("Magreza leve");
       
       else if((imc > 18.5) && (imc < 25))
           return  ("Saudável");
       
       else if((imc > 25) && (imc < 30))
           return  ("Sobrepeso");
       
       else if((imc > 30) && (imc < 35))
           return  ("Obesidade Grau 1");
       
       else if((imc > 35) && (imc < 40))
           return  ("Obesidade Grau 2 ](Severa) ");
       
       else 
           return  ("Obesidade Grau 3 (Mórbida) ");
       
    }
}
