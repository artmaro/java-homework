package org.helloservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ekokuykin on 24.05.15.
 */
@WebServlet("/duke")
public class DukeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setBufferSize(8192);
        try (PrintWriter out = response.getWriter()) {
            out.println("<html lang=\"en\">"
                    + "<head><title>Duke page</title></head>");

            // then write the data of the response
            out.println("<body  bgcolor=\"#ffffff\">"
                    + "<img src=\"resources/images/duke.thumbsup.gif\" "
                    + "alt=\"Duke waving his hand\">"
                    + "<h2>Duke page</h2>"
                    );


            out.println("</body></html>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
