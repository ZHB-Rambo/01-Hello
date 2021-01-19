package com.student.servlet;

import com.student.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        Student s1 = new Student("jack","18");
        Student s2 = new Student("tom","25");

        //{"name":?,"age":?}
        //{"s1":{"name":"?","age":"?"},"s2":{"name":"?","age":"?"}}
        String str = "{\"s1\":{\"name\":\""+s1.getName()
                +"\",\"age\":\""+s1.getAge()
                +"\"},\"s2\":{\"name\":\""+s2.getName()
                +"\",\"age\":\""+s2.getAge()+"\"}}";

        response.getWriter().println(str);
    }
}
