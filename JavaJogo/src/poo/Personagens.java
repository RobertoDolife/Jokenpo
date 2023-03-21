/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author roberto
 */
public class Personagens {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    private int life;
    private int pontuacao;
    
    //variáveis
    
    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
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

    public Personagens(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    public void Andar(int direcao)
    {
       if (direcao > 0)
       {
           System.out.println("Andando para Direita ------>");
       }
       else if (direcao < 0)
       {
           System.out.println(" <------ Andando para Esquerda");         
       }
       else
       {
           System.out.println(" ---- Personagem Parado ----");         
       }           
    
    }
    
    
    public void Vida()
    {
        if (life > 0) {
            life -= 10;
            System.out.println("Você perdeu 10 pontos de vida. Vida atual: " + life);
        } else {
            System.out.println("Game Over! Voce perdeu todas as vidas.");
        }
    }
    

    
}