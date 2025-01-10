package Aplicacoes;

import Entidades.Arvore;
import Entidades.No;

public class Metodos<T> {
	
	private Arvore<T> arvore;

	public Metodos(Arvore<T> arvore) {
		super();
		this.arvore = arvore;
	}
	
	public No<T> inserirNo(No<T> atual, int id, T dados) {
	    if (atual == null) {
	        No<T> novoNo = new No<>(id, dados);
	        return novoNo;
	    }

	    if (id < atual.getId()) {
	        atual.setEsq(inserirNo(atual.getEsq(), id, dados));
	    } else if (id > atual.getId()) {
	        atual.setDir(inserirNo(atual.getDir(), id, dados));
	    }
	    return atual;
	}
	
	public No<T> buscaRec(No<T> atual, int id) {
		if (atual == null || atual.getId() == id) {
			return atual;
		}
		
		if (id < atual.getId()) {
			return buscaRec(atual.getEsq(), id);
		}

		return buscaRec(atual.getDir(), id);
	}
	
	public No<T> buscaIte(No<T> atual, int id){
		while (atual != null && atual.getId() != id) {
			if (id < atual.getId()) {
				atual = atual.getEsq();
			} else {
				atual = atual.getDir();
			}
		}
		return atual;
	}
	
	public No<T> removerNo(No<T> atual, int id) {
		if (atual == null) {
			return null;
		}
		
		if(atual.getId() > id) {
			atual.setEsq(removerNo(atual.getEsq(), id));
		
		} else if(atual.getId() < id) {
			atual.setDir(removerNo(atual.getDir(), id));
		
		} else {
			if (atual.getDir() == null && atual.getEsq() == null) {
				return null;
			
			} else if(atual.getEsq() == null) {
				return atual.getDir();
			
			} else if(atual.getDir() == null) {
				return atual.getEsq();
			
			} else {
				 // Encontrar o sucessor (menor nó da subárvore direita)
			    No<T> menor = encontrarMenor(atual.getDir());

			    // Copiar o id e dados do sucessor para o nó atual
			    atual.setId(menor.getId());
			    atual.setDados(menor.getDados());

			    // Remover o nó sucessor da subárvore direita
			    atual.setDir(removerNo(atual.getDir(), menor.getId()));
			}
		}
		return atual;
	}
	
	private No<T> encontrarMenor(No<T> atual){
		while (atual.getEsq() != null) {
			atual = atual.getEsq();
		}
		return atual;
	}
		
}