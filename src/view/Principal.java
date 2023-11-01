package view;

import javax.swing.JOptionPane;

import controller.DepartamentoControle;
import model.Departamento;

public class Principal {

	public static void main(String[] args) {
		DepartamentoControle dc = new DepartamentoControle();
			
		try {
			Departamento d = new Departamento(0, "celulares e smartphones",  "Artigos para telefonia m�vel");
			dc.add(d);
			d = new Departamento(0, "tv e v�deo", "Artigos para televisores");
			dc.add(d);
			d = new Departamento(0, "consoles e games", "Artigos para video games");
			dc.add(d);
			d = new Departamento(0, "�udio", "Artigos de som");
			dc.add(d);
			d = new Departamento(0, "telefonia fixa", "Artigos para telefonia");
			dc.add(d);
			d = new Departamento(0, "inform�tica", "Computadores e laptops corporativos");
			dc.add(d);
			d = new Departamento(0, "acess�rios e perif�ricos", "Hardwares");
			dc.add(d);
			d = new Departamento(0, "pc gamer", "Computadores e laptops gamers");
			dc.add(d);
			d = new Departamento(1, "eletrodom�sticos", "Artigos Eletrodom�sticos");
			dc.add(d);
			d = new Departamento(1, "eletroport�teis", "Artigos Eletroport�teis");
			dc.add(d);
			d = new Departamento(1, "ar e ventila��o", "Ventiladores e Ar condicionado");
			dc.add(d);
			d = new Departamento(1, "m�veis e decora��o", "M�veis");
			dc.add(d);
			d = new Departamento(1, "casa e constru��o", "Materiais para constru��o");
			dc.add(d);
			d = new Departamento(1, "cama, mesa e banho", "Artigos para cama, mesa e banho");
			dc.add(d);
			d = new Departamento(2, "livros", "Livraria");
			dc.add(d);
			d = new Departamento(2, "instrumentos musicais", "Instrumentos m�sicas e acess�rios");
			dc.add(d);
			d = new Departamento(2, "m�sica", "Discos");
			dc.add(d);
			d = new Departamento(2, "filmes e s�ries", "DVD e Blu-ray");
			dc.add(d);
			d = new Departamento(3, "mercado", "Itens de supermercado");
			dc.add(d);
			d = new Departamento(3, "automotivo", "Pe�as e acess�rios para autom�veis");
			dc.add(d);
			d = new Departamento(3, "brinquedos", "Itens infantis");
			dc.add(d);
			d = new Departamento(3, "beb�s", "Itens para a primeira inf�ncia");
			dc.add(d);
			d = new Departamento(3, "gift cards", "Cart�es presente");
			dc.add(d);
			d = new Departamento(3, "pet shop", "Comida e acess�rios para pet");
			dc.add(d);
			d = new Departamento(3, "papelaria", "Itens de papelaria");
			dc.add(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int x = 0;
		while(x!=9) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 - Adicionar departamento\n2 - Pesquisar\n3 - Remover departamento\n9 - Fim"));
			switch(x) {
			case 1:
				int andar = Integer.parseInt(JOptionPane.showInputDialog("Insira o andar do departamento: "));
				if (andar < 0 || andar > 4) {
					while (andar < 0 || andar > 4) {
						JOptionPane.showMessageDialog(null, "Andar Inv�lido");
						andar = Integer.parseInt(JOptionPane.showInputDialog("Insira novamente o andar do departamento: "));
					}
				}
				String nome = JOptionPane.showInputDialog("Insira o nome do departamento: ");
				String descricao = JOptionPane.showInputDialog("Insira a descri��o do departamento: ");
				Departamento dep = new Departamento(andar, nome, descricao);
				try {
					dc.add(dep);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				int y = Integer.parseInt(JOptionPane.showInputDialog("Pesquisar\n1 - Por departamento\n2 - Por andar"));
				switch(y) {
				case 1:
					Departamento depD = new Departamento();
					depD.nome = JOptionPane.showInputDialog("Insira o departamento a ser pesquisado: ");
					try {
						dc.searchDepartamento(depD);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					Departamento depA = new Departamento();
					depA.andar = Integer.parseInt(JOptionPane.showInputDialog("Insira o andar a ser pesquisado: "));
					try {
						dc.searchAndar(depA);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Valor Inv�lido");
					break;
				}
				break;
			case 3:
				Departamento depR = new Departamento();
				depR.nome = JOptionPane.showInputDialog("Insira o departamento a ser removido: ");
				try {
					dc.remove(depR);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor Inv�lido");
				break;
			}
		}
		
		
		
	}

}
