package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Planilha;

public class DAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String entrada = "C:\\Users\\des\\Documents\\SENAI2022\\Logica\\aula25\\exercicio2\\dados\\entrada.csv";
	private String saida = "C:\\Users\\des\\Documents\\SENAI2022\\Logica\\aula25\\exercicio2\\dados\\saida.csv";
	
	public ArrayList<Planilha> abrir(){
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		try {
			br = new BufferedReader(new FileReader(entrada));
			String linha = br.readLine();
			while(linha != null) {
				p = new Planilha(linha);
				linhas.add(p);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return linhas;
	}
	
	public void salvarSoma(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.media()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}