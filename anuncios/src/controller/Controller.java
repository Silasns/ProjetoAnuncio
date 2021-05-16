package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans anuncio = new JavaBeans();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			anuncios(request, response);
		} else if (action.equals("/insert")) {
			novoAnuncio(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	// Listar anuncios
	protected void anuncios(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("anuncio.jsp");
	}

	// Novo anuncios
	protected void novoAnuncio(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* teste de recebimento dos dados do fomulário
		System.out.println(request.getParameter("nomeAnuncio"));
		System.out.println(request.getParameter("cliente"));
		System.out.println(request.getParameter("dataInicio"));
		System.out.println(request.getParameter("dataFim"));
		System.out.println(request.getParameter("investimento"));
		*/
		
		//Setar variaveis JavaBeans
		anuncio.setNomeAnuncio(request.getParameter("nomeAnuncio"));
		anuncio.setCliente(request.getParameter("cliente"));
		anuncio.setDataInicio(request.getParameter("dataInicio"));
		anuncio.setDatatermino(request.getParameter("dataFim"));
		anuncio.setInvestimento(request.getParameter("investimento"));
	}
	/*
	 * teste conexão dao.testeConexao();
	 */

}
