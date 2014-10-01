package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ClientePublicoBean;
import dao.DAOFactory;
import dao.Entidad;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	ClientePublicoBean cliente = new ClientePublicoBean();
		cliente.setCodCliPu(Integer.parseInt(request.getParameter("txt_cuenta")));
		cliente.setPassword(request.getParameter("txt_password"));
		
		DAOFactory factory=
				DAOFactory.getFactoryConcrete(DAOFactory.ORACLE);
		Entidad<ClientePublicoBean> clienteDAO=factory.getClientePublicoDAO();
		ClientePublicoBean clientedb = clienteDAO.findById(cliente);
		
		String pagina=null;
		if(clientedb==null){
			String mensaje="Usuario no existe";
			request.setAttribute("mensaje", mensaje);
			pagina="mensaje.jsp";
		}else{
			if(clientedb.getPassword().toUpperCase().equals(cliente.getPassword().toUpperCase())){
				HttpSession session=request.getSession(true);
				session.setAttribute("cliente", clientedb);
				pagina="adminstrador.jsp";
			}else{
				String mensaje="Clave Incorrecta";
				request.setAttribute("mensaje", mensaje);
				pagina="mensaje.jsp";
			}
		}
		request.getRequestDispatcher(pagina).
			forward(request, response);
	}

}
