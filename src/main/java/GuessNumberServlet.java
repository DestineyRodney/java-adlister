import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name="GuessNumberServlet", urlPatterns ="/guess")
public class GuessNumberServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        System.out.println("random number" + randomNumber);

       int number =  Integer.parseInt(request.getParameter("number")); // must parse
        System.out.println(number);

        if (number == randomNumber) {
            response.sendRedirect("/correct.jsp");
        } else {
            response.sendRedirect("/incorrect.jsp");
        }
    }
}
