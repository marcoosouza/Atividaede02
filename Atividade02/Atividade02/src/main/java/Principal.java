
public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir usuario
		Usuario usuario = new Usuario(11, "pablo", "pablo",'M');
		if(dao.inserirUsuario(usuario) == true) {
			System.out.println("Inserção com sucesso -> " + usuario.toString());
		}

		//Atualizar usuário
		usuario.setSenha("nova senha");
		dao.atualizarUsuario(usuario);
		
		//Excluir usuário
		dao.excluirUsuario(usuario.getCodigo());
		
		//Listar usuários
		Usuario[] usuarios = dao.getUsuarios();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
		// Sair
		dao.close();
	}
}
