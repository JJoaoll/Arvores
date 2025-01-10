package Entidades;

public class No<T> {
    public enum Cor {
        RED, BLACK
    }
    
    private No<T> esq;
    private No<T> dir;
    private No<T> pai;
    private int id;
    private T dados;
    private Cor cor;


    public No(int id, T dados) {
        this.id = id;
        this.dados = dados;
        this.cor = Cor.RED;
    }
    

    public No() {
        this.cor = Cor.BLACK;
    }

    public No<T> getEsq() {
        return esq;
    }

    public void setEsq(No<T> esq) {
        this.esq = esq;
    }

    public No<T> getDir() {
        return dir;
    }

    public void setDir(No<T> dir) {
        this.dir = dir;
    }

    public No<T> getPai() {
        return pai;
    }

    public void setPai(No<T> pai) {
        this.pai = pai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
		this.id = id;
	}

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}

