package com.code.servlet;

import com.code.jdbc.TeacherJDBC;
import com.code.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/dealSubmitHomework")
public class DealSubmitHomework extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TeacherJDBC teacherJDBC = new TeacherJDBC();
        ArrayList<StudentHomework> list = teacherJDBC.queryHomework();
        String title = list.get(Integer.valueOf(req.getParameter("param"))).getHomeworkTitle();
        ArrayList<StudentHomework> detalList = teacherJDBC.queryDetailHomework(title);
        req.setAttribute("detalList",detalList);
        req.setAttribute("title",title);
        req.getRequestDispatcher("jsp/submitHomework.jsp").forward(req, resp);





    }
}