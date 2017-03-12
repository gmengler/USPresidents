package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.PresidentDAO;
import data.PresidentDAOFileImpl;

/**
 * Servlet implementation class PresidentServlet
 */
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
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
<<<<<<< HEAD
=======
		String initialLoad = request.getParameter("load");
		ServletContext context = getServletContext();
		PresidentDAO stockDAO = (PresidentDAO)context.getAttribute("PresidentDAO");
>>>>>>> c710bd79357ce2b3736b6624c411dd60e65474f9

		HttpSession session = request.getSession();
		if(initialLoad!=null){
			System.out.println(presidentDAO.getPresident(1));
			session.setAttribute("currentPresident", presidentDAO.getPresident(1));
			
		}
		if (session.getAttribute("currentPresident") == null) {
			// first time
			session.setAttribute("currentlyDisplayedPresidentTermNumber", "1");
			int termNumber = Integer.valueOf((String)session.getAttribute("currentlyDisplayedPresidentTermNumber"));
			session.setAttribute("currentPresident", presidentDAO.getPresident(termNumber));
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
		HttpSession session = request.getSession();
		int termNumber;
		if (session.getAttribute("currentPresident") == null) {
			// first time
			session.setAttribute("currentlyDisplayedPresidentTermNumber", "1");
			termNumber = Integer.valueOf((String)session.getAttribute("currentlyDisplayedPresidentTermNumber"));
			session.setAttribute("currentPresident", presidentDAO.getPresident(termNumber));
		}
		termNumber = Integer.valueOf((String)session.getAttribute("currentlyDisplayedPresidentTermNumber"));

		if(request.getParameter("next")!= null){
			termNumber++;
			if (termNumber > 45) {
				termNumber = 1;
			}
		} else if(request.getParameter("previous")!= null){
			termNumber--;
			if (termNumber < 1) {
				termNumber = 45;
			}
		}
		else if(request.getParameter("getByTermNumber")!= null){
			termNumber = Integer.valueOf(request.getParameter("termNumber"));
		}
		session.setAttribute("currentPresident", presidentDAO.getPresident(termNumber));
		session.setAttribute("currentlyDisplayedPresidentTermNumber", String.valueOf(termNumber));
		request.getRequestDispatcher("/display.jsp").forward(request, response);


	}

}
