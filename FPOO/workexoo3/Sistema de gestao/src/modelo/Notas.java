package modelo;

import visao.Main;
public class Notas {

	public String componente;
	public float[] nota = new float[3];

	public Notas(String componente, float nota[]) {

		this.componente = componente;
		this.nota = nota;
	}

	public float obterMedia() {

		float result = 0;

		for (int i = 0; i < nota.length; i++) {
			result += nota[i];
		}
		return result / 3;
	}
}