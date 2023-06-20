package model;

public class Materia {

    private String materia;
    private int nAluno;
    

    public Materia() {
    }

    public Materia(String materia) {
        this.materia = materia;
        this.nAluno = 0;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getnAluno() {
        return nAluno;
    }

    public void setnAluno(int nAluno) {
        this.nAluno = getnAluno() + nAluno;
    }
    
    

    @Override
    public String toString() {
        return "Materia{" + "materia=" + materia + ", nAluno=" + nAluno + '}';
    }

    
}
