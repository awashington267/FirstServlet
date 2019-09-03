import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/hello")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailId = request.getParameter("emailId");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<p> firstName :: " + firstName + "</p>");
        printWriter.print("<p> lastName :: " + firstName + "</p>");
        printWriter.print("<p> firstName :: " + firstName + "</p>");
        printWriter.print("<p> firstName :: " + firstName + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

        System.out.println("firstName :: " + firstName);
        System.out.println("lastName :: " + lastName);
        System.out.println("emailId :: " + emailId);
        System.out.println("password :: " + password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String p = request.getParameter("param1");

        String msg = "<html><body>" + p + "</body></html>";
        response.getWriter().print(msg);
    }
}
