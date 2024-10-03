package calculus;

import java.io.IOException;
import java.io.PrintWriter;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sum
 */
@WebServlet("/Sum")
public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	
	String x = request.getParameter("num1");
	String y = request.getParameter("num2");
	String operation = request.getParameter("operation");
	
	
	Double result = null;
	

    double num1 = Double.valueOf(x);
    double num2 = Double.valueOf(y);

    switch (operation) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            /*if (num2 == 0) {
                throw new ArithmeticException("Toda divisão por 0 dá 0");
            }*/
            result = num1 / num2;
            break;
        default:
            throw new IllegalArgumentException("Operação inválida.");
    }
	
	
	
	out.write("<html><body>");
    out.println("<h1>Result</h1>");
    out.println("<p>Result: " + result + "</p>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
