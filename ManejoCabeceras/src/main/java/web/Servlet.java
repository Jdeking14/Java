
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException{
    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    String metodoHttp = request.getMethod();
    out.print("<html>");
    out.print("<head>");
    out.print("<title>Headers HTTP</title>");
    out.print("</head>");
    out.print("<body>");
    out.print("<h1>Headers HTTP</h1>");
    out.print("<br>");
    out.print("Metodo HTTP: " + metodoHttp);
    
    String uri = request.getRequestURI();
    out.print("<br>");
    out.print("<br>");
    out.print("Uri Solicitada: " + uri);
    out.print("<br><br>");
    //imprimimos todasd las cabeceras disponibles
        Enumeration cabeceros = request.getHeaderNames();
    while(cabeceros.hasMoreElements()){
        String nombreCabecera = cabeceros.nextElement().toString();
        out.print("<b> " + nombreCabecera + "</b>:");
        out.print(request.getHeader(nombreCabecera));
        out.print("<br> ");
    }
    
    out.print("</body>");
    out.print("</html>");
    
    out.close();
    }
}
