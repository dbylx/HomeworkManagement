package com.code.servlet;

import com.code.jdbc.StudentJDBC;
import com.code.jdbc.TeacherJDBC;
import com.code.model.Student;
import com.code.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/FinallyHomework")
public class SubmitFinallyHomework extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentJDBC studentJDBC = new StudentJDBC();

        String username = (String) req.getSession().getAttribute("username1");
        String title = (String) req.getSession().getAttribute("title");
        String content = req.getParameter("content");
        PrintWriter out = resp.getWriter();
        if(studentJDBC.submitHomework(username,title,content)){
            out.println("<script>");
            out.println("alert('Add successful！');");
            out.println("</script>");
        }else{
            out.println("<script>");
            out.println("alert('Add fail！');");
            out.println("</script>");
        }

    }
}
