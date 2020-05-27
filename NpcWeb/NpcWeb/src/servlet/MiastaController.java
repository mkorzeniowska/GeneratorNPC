package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

import dataSource.MiastaUtil;


/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/MiastaController")
public class MiastaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiastaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("city");
        String country = request.getParameter("country");
        String populationString = request.getParameter("population");
        int population = 0;
        if (populationString != null && !populationString.isEmpty()) {
            population = Integer.parseInt(populationString);
        }

        String option = request.getParameter("option");
        String message = null;
        if ("add".equals(option)) {
            try {
                MiastaUtil.insert(name, country, population); //tu poprawić
                message = "Do bazy dodano miasto " + name;
            } catch (SQLException e) {
                message = "Nie udało się dodać miasta " + name;
                e.printStackTrace();
            }
            
        } else if ("delete".equals(option)) {
            try {
                MiastaUtil.delete(name);
                message = "Z bazy usunięto miasto " + name;
            } catch (SQLException e) {
                e.printStackTrace();
                message = "Nie udało się usunąć miasta " + name;
            }
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
