    package estruturadedados;

    import model.Aluno;


    public class No {

             Aluno aluno;
             No proximo;
             No anterior;

            public Aluno getAluno() {
                    return aluno;
            }
            public void setAluno(Aluno aluno) {
                    this.aluno = aluno;
            }
            public No getProximo() {
                    return proximo;
            }
            public void setProximo(No proximo) {
                    this.proximo = proximo;
            }
            public No getAnterior() {
                    return anterior;
            }
            public void setAnterior(No anterior) {
                    this.anterior = anterior;
            }
    }
