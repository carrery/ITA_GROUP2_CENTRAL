package servletATM;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ATMBalServlet
 */
@WebServlet(description = "ATM Bal", urlPatterns = { "/ATMBalServlet" })
public class ATMBalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ATMBalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = null;
		
		
		
		//String choice = request.getParameter();
		
		if(request.getParameter("checkBal") != null) {
			rd = request.getRequestDispatcher("/WEB-INF/html/checkBalance.html");
			rd.forward(request, response);
		} else if ( request.getParameter("withdrawMon") != null){
			rd = request.getRequestDispatcher("/WEB-INF/html/withdrawAtm.html");
			rd.forward(request, response);
		} else if(request.getParameter("depositMon") != null) {	
			rd = request.getRequestDispatcher("/WEB-INF/html/depositAtm.html");
			rd.forward(request, response);
		}else {
	
			rd = request.getRequestDispatcher("/WEB-INF/html/homeATM.html");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
