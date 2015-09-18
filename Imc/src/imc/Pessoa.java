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
    private double altura;
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(){
        this.peso = 0.0;
        this.altura = 0.0;
        this.nome = "";
        this.idade = 0;
        this.sexo = "";
    }
    public double calculaIMC(){
        
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
