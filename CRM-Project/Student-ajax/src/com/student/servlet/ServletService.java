package com.student.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletService extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = request.getServletPath();

        if("/ServletService/addServlet".equals(path)){
            addServlet(request,response);
        }else if("/ServletService/deleteServlet".equals(path)){
            deleteServlet(request,response);
        }else if("/ServletService/updateServlet".equals(path)){
            updateServlet(request,response);
        }else if("/ServletService/selectServlet".equals(path)){
            selectServlet(request,response);
        }
    }

    private void selectServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("查询学生");
    }

    private void updateServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("修改学生");
    }

    private void deleteServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("删除学生");
    }

    private void addServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("添加学生");
    }
}
