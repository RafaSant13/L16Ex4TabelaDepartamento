package controller;

import model.Departamento;
import model.Lista;

@SuppressWarnings("unchecked")
public class DepartamentoControle {
	
	
	Lista<Departamento> [] dep = new Lista[4];

	public DepartamentoControle() {
		int tamanho = dep.length;
		for (int i = 0; i < tamanho; i++){
			dep[i] = new Lista<Departamento>();
		}
	}
	
	public void add(Departamento departamento) throws Exception {
		int hash = departamento.hashCode();
		dep[hash].addLast(departamento);
	}
	
	public void searchDepartamento(Departamento departamento) throws Exception {
		int tamanhoV = dep.length;
		for (int i = 0; i< tamanhoV; i++) {
			Lista<Departamento> l = dep[i];
			int tamanhoL = l.size();
			for (int j = 0; j< tamanhoL; j++) {
				Departamento d = l.get(j);
				if (departamento.nome.equalsIgnoreCase(d.nome)) {
					System.out.println(d);
					break;
				}
			}
			
		}
	}
	
	public void searchAndar(Departamento departamento) throws Exception {
		int hash = departamento.hashCode();
		Lista<Departamento> l = dep[hash];
		System.out.print("Andar "+ hash+" : ");
		int tamanho = l.size();
		for (int i = 0; i<tamanho;i++) {
			Departamento d = l.get(i);
			System.out.print(d.nome+" - "+d.descricao+ " -> ");
		}
		System.out.println("NULL");
	}
	
	public void remove(Departamento departamento) throws Exception {
		int tamanhoV = dep.length;
		for (int i = 0; i< tamanhoV; i++) {
			Lista<Departamento> l = dep[i];
			int tamanhoL = l.size();
			for (int j = 0; j< tamanhoL; j++) {
				Departamento d = l.get(j);
				if (departamento.nome.equalsIgnoreCase(d.nome)) {
					l.remove(j);
				}
			}
			
		}
	}

}
