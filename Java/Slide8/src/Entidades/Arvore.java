package Entidades;

public class Arvore<T> {
    private No<T> raiz;
    public final No<T> NIL;

    public Arvore() {
        NIL = new No<T>();
        NIL.setEsq(null);
        NIL.setDir(null);
        NIL.setPai(null);
        raiz = NIL;
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }
    
    public No<T> getNIL() {
        return this.NIL;
    }
}

