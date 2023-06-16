package estruturadedados;

import model.Aluno;

public class ListaAluno {

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaAluno() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void inserirInicio(Aluno aluno) {
        No no = new No();
        no.setAluno(aluno);
        no.setAnterior(null);
        no.setProximo(inicio);
        if (inicio != null) {
            inicio.setAnterior(no);
        }
        inicio = no;
        if (tamanho == 0) {
            fim = inicio;
        }
        tamanho++;
    }

    public Aluno retirarInicio() {
        if (inicio == null) {
            return null;
        }
        Aluno aluno = inicio.getAluno();
        inicio = inicio.getProximo();
        if (inicio != null) {
            inicio.setAnterior(null);
        } else {
            fim = null;
        }
        tamanho--;
        return aluno;
    }

    public void inserirFim(Aluno aluno) {
        No no = new No();
        no.setAluno(aluno);
        no.setProximo(null);
        no.setAnterior(fim);
        if (fim != null) {
            fim.setProximo(no);
        }
        fim = no;
        if (tamanho == 0) {
            inicio = fim;
        }
        tamanho++;
    }

    public Aluno retirarFim() {
        if (fim == null) {
            return null;
        }
        Aluno aluno = fim.getAluno();
        fim = fim.getAnterior();
        if (fim != null) {
            fim.setProximo(null);
        } else {
            inicio = null;
        }
        tamanho--;
        return aluno;
    }

    public void inserirMeio(int indice, Aluno aluno) {
        if (indice <= 0) {
            inserirInicio(aluno);
        } else if (indice >= tamanho) {
            inserirFim(aluno);
        } else {
            No local = inicio;
            for (int i = 0; i < indice - 1; i++) {
                local = local.getProximo();
            }
            No no = new No();
            no.setAluno(aluno);
            no.setAnterior(local);
            no.setProximo(local.getProximo());
            local.getProximo().setAnterior(no);
            local.setProximo(no);
            tamanho++;
        }
    }

    public Aluno retirarMeio(int indice) {
        if (indice < 0 || indice >= tamanho || inicio == null) {
            return null;
        } else if (indice == 0) {
            return retirarInicio();
        } else if (indice == tamanho - 1) {
            return retirarFim();
        }

        No local = inicio;
        for (int i = 0; i < indice; i++) {
            local = local.getProximo();
        }
        local.getAnterior().setProximo(local.getProximo());
        local.getProximo().setAnterior(local.getAnterior());
        tamanho--;
        return local.getAluno();
    }

    public String retornar() {
        No local = inicio;
        StringBuilder str = new StringBuilder();
        while (local != null) {
            str.append(local.getAluno()).append(" ");
            local = local.getProximo();
        }
        return str.toString();
    }

    public void exibirLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.getAluno().toString() + "\n");
            atual = atual.getProximo();
        }
    }

    public void alterar(Aluno aluno) {
        while (inicio != null) {
            if (inicio.getAluno().getMatricula().equals(aluno.getMatricula())) {
                inicio.setAluno(aluno);
            }
            inicio.getProximo();
        }
    }

    public Aluno buscar(String mat) {
        No atual = inicio;
        while (atual != null) {
            if (atual.aluno.getMatricula().equals(mat)) {
                return atual.aluno;
            } else {
                atual = atual.proximo;
            }
        }
        return null;
    }
    
     public Aluno buscarNome(String nome) {
        No atual = inicio;
        while (atual != null) {
            if (atual.aluno.getNome().equals(nome)) {
                return atual.aluno;
            } else {
                atual = atual.proximo;
            }
        }
        return null;
    }
}
