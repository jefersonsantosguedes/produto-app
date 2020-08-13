

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cod = request.getParameter("cod");
		String descricao = request.getParameter("descricao");
		String valor = request.getParameter("valor").toString();
		
		if(cod.isEmpty() || descricao.isEmpty() || valor.isEmpty() ) {
			response.getWriter().print("Todos os campos devem ser preenchidos");
			System.out.print("Todos os campos devem ser preenchidos ");
		} else {
		response.getWriter().print("INSERT INTO PRODUTOS(COD, DESCRICAO, VALOR)"
				+ " VALUES("+cod+","+"'"+descricao+"'"+","+valor+");");
		System.out.print("INSERT INTO PRODUTOS(COD, DESCRICAO, VALOR)"
				+ " VALUES("+cod+","+descricao+","+valor+"); ");
		}
	}

}
