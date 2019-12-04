import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/discount")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listprice = Float.parseFloat(request.getParameter("listprice"));
        float rate = Float.parseFloat(request.getParameter("rate"));
        double discount = rate * listprice*0.01;
        double price= listprice - discount;
        String des= request.getParameter("des");
        PrintWriter writer =response.getWriter();
        writer.println("<html>");
        writer.println("<div style=border:solid>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<p> Description: "+des+" </p>");
        writer.println("<p>List price: " +listprice+ " $ </p>");
        writer.println("<p>Discount percent: " +rate+ " % </p>");
        writer.println("<p>Discount amount: " +discount+" $ </p>");
        writer.println("<p>Discount Price: " +price+ " $ </p>");
        writer.println("</div>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
