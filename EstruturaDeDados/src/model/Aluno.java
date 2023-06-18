package model;

public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private Materia materia;
    private Double nota;

    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, String matricula, Materia materia, Double nota) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.materia = materia;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + ", materia=" + materia + ", nota=" + nota + '}';
    }

    
    
}
