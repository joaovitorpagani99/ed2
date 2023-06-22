/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedados.ordenacaoQuick;

import estruturadedados.ListaMateria;
import estruturadedados.NoMateria;
import javax.swing.JOptionPane;
import model.Materia;

/**
 *
 * @author 2020101202010022
 */
public class QuickSortMateria {

    public void quicksortPorNome(ListaMateria lista) {
        quicksortRecursivoPorNome(lista.getInicio(), lista.getFim());
    }

    private void quicksortRecursivoPorNome(NoMateria primeiro, NoMateria ultimo) {
        if (primeiro == null || ultimo == null || primeiro == ultimo) {
            return;
        }
        try {
            NoMateria atual = ultimo;
            NoMateria i = primeiro;
            NoMateria j = primeiro;

            while (j != ultimo) {
                if (j.getMateria().getMateria().compareTo(atual.getMateria().getMateria()) < 0) {
                    Materia temp = i.getMateria();
                    i.setMateria(j.getMateria());
                    j.setMateria(temp);
                    i = i.getProximo();
                }
                j = j.getProximo();
            }

            Materia temp = i.getMateria();
            i.setMateria(ultimo.getMateria());
            ultimo.setMateria(temp);

            quicksortRecursivoPorNome(primeiro, i.getAnterior());
            quicksortRecursivoPorNome(i.getProximo(), ultimo);
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    public void sort(ListaMateria lista) {
        NoMateria inicio = lista.getInicio();
        NoMateria fim = lista.getFim();

        quickSort(lista, inicio, fim);
    }

    private static void quickSort(ListaMateria lista, NoMateria inicio, NoMateria fim) {

            if (inicio != fim && inicio != null && fim != null) {
                NoMateria Atual = particionar(lista, inicio, fim);
                quickSort(lista, inicio, Atual.getAnterior());
                quickSort(lista, Atual.getProximo(), fim);
            }
        

    }

    private static NoMateria particionar(ListaMateria lista, NoMateria inicio, NoMateria fim) {
        int pivot = fim.getMateria().getnAluno();
        NoMateria i = inicio.getAnterior();
        try {
            for (NoMateria j = inicio; j != fim; j = j.getProximo()) {
                if (j.getMateria().getnAluno() <= pivot) {
                    i = (i == null) ? inicio : i.getProximo();
                    swap(lista, i, j);
                }
            }
            i = (i == null) ? inicio : i.getProximo();
            swap(lista, i, fim);
        } catch (NullPointerException e) {
      
        }
        return i;
    }

    private static void swap(ListaMateria lista, NoMateria a, NoMateria b) {
        Materia temp = a.getMateria();
        a.setMateria(b.getMateria());
        b.setMateria(temp);
    }

}
