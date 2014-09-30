package control;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ClientePublicoBean;
import dao.DAOFactory;
import dao.Entidad;

/**
 * Servlet implementation class RegistraCliePubServet
 */
@WebServlet("/RegistraCliePub")
public class RegistraCliePubServet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistraCliePubServet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("administrador.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	ClientePublicoBean cliente= new ClientePublicoBean();
	cliente.setApePat(request.getParameter("txtApePat"));
	cliente.setApeMat(request.getParameter("txtApeMat"));
	cliente.setNombre(request.getParameter("txtNombre"));
	cliente.setDireccion(request.getParameter("txtDireccion"));
	cliente.setFechaNac(request.getParameter("cboFechaNac"));
	cliente.setFechaIng(request.getParameter("cboFechaIng"));
	cliente.setEmail(request.getParameter("txtEmail"));
	cliente.setPassword(request.getParameter("txtPassword"));
	
	Entidad<ClientePublicoBean> ClientePublicoDAO=
			DAOFactory.getFactoryConcrete(DAOFactory.ORACLE).getClientePublicoDAO();
	cliente =ClientePublicoDAO.insert(cliente);
	request.setAttribute("cliente", cliente);
	
	request.getRequestDispatcher("").forward(request,response);
	}

}
