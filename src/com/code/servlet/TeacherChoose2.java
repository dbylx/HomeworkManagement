package com.code.servlet;

import com.code.jdbc.TeacherJDBC;
import com.code.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/teacherChoose2")
public class TeacherChoose2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        TeacherJDBC teacherJDBC = new TeacherJDBC();
        ArrayList<StudentHomework> list = teacherJDBC.queryHomework();

        req.setAttribute("homeWorkList",list);
        req.getRequestDispatcher("jsp/queryHomework.jsp").forward(req, resp);
    }
}
