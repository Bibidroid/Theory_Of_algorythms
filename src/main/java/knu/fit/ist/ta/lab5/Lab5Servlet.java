package knu.fit.ist.ta.lab5;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "Lab5Servlet", urlPatterns = {"/lab5"})
public class Lab5Servlet extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String find = request.getParameter("find");
        int result = Lab5Task.linearSearch(Long.parseLong(find));
        request.setAttribute("result", result);
        request.getRequestDispatcher("lab5.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
