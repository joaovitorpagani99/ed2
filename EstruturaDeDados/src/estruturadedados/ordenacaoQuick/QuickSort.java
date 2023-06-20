/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedados.ordenacaoQuick;

import estruturadedados.ListaAluno;
import estruturadedados.No;
import model.Aluno;

/**
 *
 * @author kaior
 */
public class QuickSort {

    public void quicksortPorNome(ListaAluno lista) {
        quicksortRecursivoPorNome(lista.getInicio(), lista.getFim());
    }

    private void quicksortRecursivoPorNome(No primeiro, No ultimo) {
        if (primeiro == null || ultimo == null || primeiro == ultimo) {
            return;
        }
        try {
            No pivô = ultimo;
            No i = primeiro;
            No j = primeiro;

            while (j != ultimo) {
                if (j.getAluno().getNome().compareTo(pivô.getAluno().getNome()) < 0) {
                    Aluno temp = i.getAluno();
                    i.setAluno(j.getAluno());
                    j.setAluno(temp);
                    i = i.getProximo();
                }
                j = j.getProximo();
            }

            Aluno temp = i.getAluno();
            i.setAluno(ultimo.getAluno());
            ultimo.setAluno(temp);

            quicksortRecursivoPorNome(primeiro, i.getAnterior());
            quicksortRecursivoPorNome(i.getProximo(), ultimo);
        } catch (NullPointerException e) {
            e.getMessage();
        }

    }

    public void quicksortPorIdade(ListaAluno lista) {
        quicksortRecursivoPorIdade(lista.getInicio(), lista.getFim());
    }

    private void quicksortRecursivoPorIdade(No primeiro, No ultimo) {
        if (primeiro == null || ultimo == null || primeiro == ultimo) {
            return;
        }

        No pivô = ultimo;
        No i = primeiro;
        No j = primeiro;
        try {
            while (j != ultimo) {
                if (j.getAluno().getIdade() < pivô.getAluno().getIdade()) {
                    Aluno temp = i.getAluno();
                    i.setAluno(j.getAluno());
                    j.setAluno(temp);
                    i = i.getProximo();
                }
                j = j.getProximo();
            }

            Aluno temp = i.getAluno();
            i.setAluno(ultimo.getAluno());
            ultimo.setAluno(temp);

            quicksortRecursivoPorIdade(primeiro, i.getAnterior());
            quicksortRecursivoPorIdade(i.getProximo(), ultimo);

        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    public void quicksortPorDesempenho(ListaAluno lista) {
        quicksortRecursivoPorDesempenho(lista.getInicio(), lista.getFim());
    }

    private void quicksortRecursivoPorDesempenho(No primeiro, No ultimo) {
        if (primeiro == null || ultimo == null || primeiro == ultimo) {
            return;
        }

        No pivô = ultimo;
        No i = primeiro;
        No j = primeiro;
        try {
            while (j != ultimo) {
                if (calcularDesempenho(j.getAluno(), primeiro) < calcularDesempenho(pivô.getAluno(), primeiro)) {
                    Aluno temp = i.getAluno();
                    i.setAluno(j.getAluno());
                    j.setAluno(temp);
                    i = i.getProximo();
                }
                j = j.getProximo();
            }

            Aluno temp = i.getAluno();
            i.setAluno(ultimo.getAluno());
            ultimo.setAluno(temp);

            quicksortRecursivoPorDesempenho(primeiro, i.getAnterior());
            quicksortRecursivoPorDesempenho(i.getProximo(), ultimo);
        } catch (NullPointerException e) {
            e.getMessage();
        }

    }

    private double calcularDesempenho(Aluno aluno, No lista) {
        double soma = 0.0;
        int count = 0;

        No notaAtual = lista;
        while (notaAtual != null) {
            soma += notaAtual.getAluno().getNota();
            count++;
            notaAtual = notaAtual.getProximo();
        }

        if (count == 0) {
            return 0.0; // Se o aluno não tiver notas, consideramos desempenho zero
        }

        return soma / count; // Média das notas
    }
}
