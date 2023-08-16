package br.com.etecia.jogadorasselecao;

public class Jogadoras {
    private String nome;
    private String titulos;
    private String times;
    private String posicao;

    private int imagem;

    public Jogadoras(String nome, String titulos, String times, String posicao, int imagem) {
        this.nome = nome;
        this.titulos = titulos;
        this.times = times;
        this.posicao = posicao;
        this.imagem = imagem;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
