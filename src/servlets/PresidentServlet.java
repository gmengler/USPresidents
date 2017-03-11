package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.PresidentDAO;
import data.PresidentDAOFileImpl;

/**
 * Servlet implementation class PresidentServlet
 */
@WebServlet("/Presidents.do")
public class PresidentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PresidentDAO presidentDAO;

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		ServletContext context = getServletContext();
		presidentDAO = new PresidentDAOFileImpl(context);
		context.setAttribute("presidentDAO", presidentDAO);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		PresidentDAO stockDAO = (PresidentDAO)context.getAttribute("PresidentDAO");

		HttpSession session = request.getSession();
		if (session.getAttribute("currentPresident") == null) {
			// first time
			session.setAttribute("currentPresident", presidentDAO.getNextPresident());
		}
		request.getRequestDispatcher("/display.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		PresidentDAO stockDAO = (PresidentDAO)context.getAttribute("PresidentDAO");

		HttpSession session = request.getSession();
		if (session.getAttribute("currentPresident") == null) {
			// first time
			session.setAttribute("currentPresident", presidentDAO.getNextPresident());
		}
		if(request.getParameter("next")!= null){
			session.setAttribute("currentPresident", presidentDAO.getNextPresident());
		} else if(request.getParameter("previous")!= null){
			session.setAttribute("currentPresident", presidentDAO.getPreviousPresident());
		}
		request.getRequestDispatcher("/display.jsp").forward(request, response);


	}

}
