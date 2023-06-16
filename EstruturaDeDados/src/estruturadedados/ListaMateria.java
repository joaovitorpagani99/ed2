package estruturadedados;

import model.Materia;

public class ListaMateria {

    NoMateria inicio;
    NoMateria fim;
    private int tamanho;

    public void inserirInicio(Materia materia) {
        NoMateria no = new NoMateria();
        no.setMateria(materia);
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

    public Materia retirarInicio() {
        if (inicio == null) {
            return null;
        }
        Materia materia = inicio.getMateria();
        inicio = inicio.getProximo();
        if (inicio != null) {
            inicio.setAnterior(null);
        } else {
            fim = null;
        }
        tamanho--;
        return materia;
    }

    public void inserirFim(Materia materia) {
        NoMateria no = new NoMateria();
        no.setMateria(materia);
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

    public Materia retirarFim() {
        if (fim == null) {
            return null;
        }
        Materia materia = fim.getMateria();
        fim = fim.getAnterior();
        if (fim != null) {
            fim.setProximo(null);
        } else {
            inicio = null;
        }
        tamanho--;
        return materia;
    }

    public void inserirMeio(int indice, Materia materia) {
        if (indice <= 0) {
            inserirInicio(materia);
        } else if (indice >= tamanho) {
            inserirFim(materia);
        } else {

            NoMateria local = inicio;
            for (int i = 0; i < indice - 1; i++) {
                local = local.getProximo();
            }
            NoMateria no = new NoMateria();

            no.setMateria(materia);
            no.setAnterior(local);
            no.setProximo(local.getProximo());

            local.getProximo().setAnterior(no);
            local.setProximo(no);

            tamanho++;
        }
    }

    public Materia retirarMeio(int indice) {
        if (indice < 0 || indice >= tamanho || inicio == null) {
            return null;
        } else if (indice == 0) {
            return retirarInicio();
        } else if (indice == tamanho - 1) {
            return retirarFim();
        }

        NoMateria local = inicio;
        for (int i = 0; i < indice; i++) {
            local = local.getProximo();
        }
        NoMateria anterior = local.getAnterior();
        NoMateria proximo = local.getProximo();

        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);
        tamanho--;
        return local.getMateria();
    }

    public String retorno() {
        NoMateria local = inicio;
        String str = local.toString();
        while (local != null) {
            str = "" + local.getMateria();
            local = local.getProximo();
            return str;
        }
        return null;
    }

    public Materia alterar(Materia materia) {
        NoMateria atual = inicio;
        while (atual != null) {
            if (atual.getMateria() == materia) {
                atual.setMateria(materia);
                return atual.getMateria();
            }
            atual = atual.getProximo();
        }
        return null;
    }

    public void toSring() {
        NoMateria local = inicio;
        String str = local.toString();
        while (local != null) {
            str = "" + local.getMateria();
            local = local.getProximo();
            System.out.println(str);
        }
    }

    public Materia buscar(String mat) {
        NoMateria atual = inicio;
        while (atual != null) {
            if (atual.getMateria().getMateria().equals(mat)) {
               return atual.getMateria();
            } else {
                atual = atual.getProximo();
            }
        }
        return null;
    }
    
     public void exibirLista() {
        NoMateria atual = inicio;
        while (atual != null) {
                System.out.println(atual.getMateria());
                atual = atual.getProximo();
        }
    }
    
    

    public int getTamanho() {
        return tamanho;
    }

    public NoMateria getInicio() {
        return inicio;
    }

    public void setInicio(NoMateria inicio) {
        this.inicio = inicio;
    }

    public NoMateria getFim() {
        return fim;
    }

    public void setFim(NoMateria fim) {
        this.fim = fim;
    }

    public Object buscar(Materia materia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
