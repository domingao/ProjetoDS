/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidade;

/**
 *
 * @author Informatica
 */
public class Cidade {
   int id;
   String nome;
   int cep;
   String uf;

    public Cidade(int id, String nome, int cep, String uf) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.uf = uf;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
   
}
