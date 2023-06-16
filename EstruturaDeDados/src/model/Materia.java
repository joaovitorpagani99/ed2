package model;

public class Materia {
    
    private String materia;

    public Materia() {
    }

    public Materia(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Materia{" + "materia=" + materia + '}';
    }

    

}
