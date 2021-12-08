import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessNumberServlet", urlPatterns = "/correct")
public class NumberGuessWinServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String outcome = "Winner";

        request.setAttribute("outcome", outcome);
        request.getRequestDispatcher("/guessOutcome.jsp").forward(request, response);

    }
}
