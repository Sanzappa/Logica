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
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "C:\\Users\\des\\Documents\\SENAI2022\\work23(welli)\\planilha\\dados\\entrada.csv";
	private String saida = "C:\\Users\\des\\Documents\\SENAI2022\\work23(welli)\\planilha\\dados\\saida.csv";
	
	public ArrayList<Planilha> abrir() throws IOException {
		
			ArrayList<Planilha> linhas = new ArrayList();
			
			Planilha p;
			
		try {
			br = new BufferedReader(new FileReader(entrada));
			String l = br.readLine();
			while (l != null) {
				p = new Planilha(l);
				linhas.add(p);
				l = br.readLine();
			}
		br.close();	
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		return linhas;
	}
	
	public void salvarSoma(ArrayList<Planilha> linhas){
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.adicao() + "\r\n" );
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	public void salvarMult(ArrayList<Planilha> linhas){
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.mult() + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
	public void salvarSub(ArrayList<Planilha> linhas){
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.sub() + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	public void salvarDiv(ArrayList<Planilha> linhas){
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.div() + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}