package model;

public class Digimon {
    private int idade;
    private int fome;
    private int peso;
    private int felicidade;
    private boolean banheiro;
    private String apelido;

    public int getIdade() {
        return idade;
    }
    public int getFome() {
        return fome;
    }
    public int getPeso() {
        return peso;
    }
    public int getFelicidade() {
        return felicidade;
    }

    public Boolean getBanheiro(){
        return banheiro;
    }

    public String getApelido(){
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;

    }
    public void setPeso(int peso) {
        this.peso = peso;
    }


    public void aumentarFome(int valor) {
        fome += valor;

    }
    public void aumentarPeso(int valor){
        peso += valor;
    }
    public void diminuirPeso(int valor){
        peso -= valor;
    }

    public void diminuirFome(int valor){
        fome -= valor;
    }
    public void aumentarFelicidade(int valor) {
        felicidade += valor;
    }

}




