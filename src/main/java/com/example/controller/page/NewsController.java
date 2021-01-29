package com.example.controller.page;

import com.example.controller.AbstractController;
import com.example.exception.ApplicationException;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/news", "/news/*"})
public class NewsController extends AbstractController {
    private static final long serialVersionUID = 216595477139640552L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        forwardToPage("news.jsp", req, resp);

    }
}