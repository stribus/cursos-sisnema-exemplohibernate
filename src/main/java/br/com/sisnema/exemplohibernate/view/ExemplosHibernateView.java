package br.com.sisnema.exemplohibernate.view;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.sisnema.exemplohibernate.dao.CategoriaDAOMysql;
import br.com.sisnema.exemplohibernate.dao.CategoriaDAOPostgress;
import br.com.sisnema.exemplohibernate.dao.CategoriaDAO;
import br.com.sisnema.exemplohibernate.model.Categoria;

public class ExemplosHibernateView {
	
	
	public static void main(String[] args) {
		criarCategorias();
		listarCategorias();
		System.exit(0);
		
	}

	private static void listarCategorias() {
		listarCategoriasMySql();
		listarCategoriasPostgres();
	}
	
	private static void listarCategoriasPostgres() {
		List<Categoria> categorias = new CategoriaDAOPostgress().pesquisar(new Categoria());
		
		StringBuilder linhas = new StringBuilder();
		int cont=0;
		JOptionPane.showMessageDialog(null, "Categorias do Postgres");
		for (Categoria categoria : categorias) {
			
			linhas.append(categoria.toString()).append("\n");
			
			if( ++cont % 3 == 0){
				JOptionPane.showMessageDialog(null, linhas);
				linhas.setLength(0);
			}
		}
		
		if(linhas.length() > 0){
			JOptionPane.showMessageDialog(null, linhas);
		}
	}

	private static void listarCategoriasMySql() {
		List<Categoria> categorias = new CategoriaDAOMysql().pesquisar(new Categoria());
		
		StringBuilder linhas = new StringBuilder();
		int cont=0;
		JOptionPane.showMessageDialog(null, "Categorias do Mysql");
		for (Categoria categoria : categorias) {
			
			linhas.append(categoria.toString()).append("\n");
			
			if( ++cont % 3 == 0){
				JOptionPane.showMessageDialog(null, linhas);
				linhas.setLength(0);
			}
		}
		
		if(linhas.length() > 0){
			JOptionPane.showMessageDialog(null, linhas);
		}
	}

	private static void criarCategorias() {
		CategoriaDAO catDaoPost = new CategoriaDAOPostgress();
		CategoriaDAO catDaoMysq = new CategoriaDAOMysql();
		
		do{
			String descricao = JOptionPane.showInputDialog("Informe o nome da categoria");
			
			catDaoMysq.salvar(new Categoria(null, descricao));
			catDaoPost.salvar(new Categoria(null, descricao));
			
			if(JOptionPane.showConfirmDialog( null, "Inserir outra categoria? ", "", 
					JOptionPane.YES_NO_OPTION) 
					== JOptionPane.NO_OPTION){
				break;
			}
		} while(true);
				
	}


}
