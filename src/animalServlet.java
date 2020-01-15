

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class animalServlet
 */
@WebServlet("/animalServlet")
public class animalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public animalServlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String animal = request.getParameter("animal");
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		
		printWriter.print("<br />");
		printWriter.print("<br />");
		
		if (animal.equals("cat"))
			printWriter.print("<img src=cat.png>");
		else if (animal.equals("dog"))
			printWriter.print("<img src=dog.png>");
		else if (animal.equals("hamster"))
			printWriter.print("<img src=hamster.png>");
		else if (animal.equals("parrot"))
			printWriter.print("<img src=parrot.png>");
		
		
	}

}
