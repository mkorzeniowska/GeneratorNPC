package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;
import utility.NpcUtil;
/**
 * Servlet implementation class NpcController
 */
@WebServlet("/NpcController")
public class NpcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NpcController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String option = request.getParameter("option");
		
		if("random".equals(option))
		{
			try {
				Person person = NpcUtil.generateRandom();
				request.setAttribute("person", person);
				request.getRequestDispatcher("result.jsp").forward(request, response);
				} catch (SQLException e) { e.printStackTrace(); }
		}
		
      
        
	}

}
