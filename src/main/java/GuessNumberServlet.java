import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name="GuessNumberServlet", urlPatterns ="/guess")
public class GuessNumberServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        System.out.println("random number" + randomNumber);

       int number =  Integer.parseInt(request.getParameter("number")); // must parse
        System.out.println(number);

        if (number == randomNumber) {
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }
    }
}
