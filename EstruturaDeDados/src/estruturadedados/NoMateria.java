package estruturadedados;

import model.Materia;

public class NoMateria {

	private Materia materia;
	private NoMateria proximo;
	private NoMateria anterior;
	
        
        
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public NoMateria getProximo() {
		return proximo;
	}
	public void setProximo(NoMateria proximo) {
		this.proximo = proximo;
	}
	public NoMateria getAnterior() {
		return anterior;
	}
	public void setAnterior(NoMateria anterior) {
		this.anterior = anterior;
	}

    @Override
    public String toString() {
        return "NoMateria{" + "materia=" + materia + ", proximo=" + proximo + ", anterior=" + anterior + '}';
    }

}
