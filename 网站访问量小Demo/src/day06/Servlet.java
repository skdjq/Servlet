package day06;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
* 统计网站访问量小练习
* */
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        Integer count = (Integer)servletContext.getAttribute("count");
        if(count == null){
            servletContext.setAttribute("count",1);
        }else{
            servletContext.setAttribute("count",count + 1);
        }
        //打印流
        PrintWriter pt = response.getWriter();
        pt.print(count);
    }
}
