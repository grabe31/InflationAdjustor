package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.InflationAdjustor;

/**
 * Servlet implementation class getUserDataServlet
 */
@WebServlet("/getUserDataServlet")
public class getUserDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
       
    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userGross = request.getParameter("userGross");
		String userYear = request.getParameter("userYear");
		
		InflationAdjustor IA = new InflationAdjustor(userGross, userYear);
		
		request.setAttribute("userResult", IA);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		

}
	
}
