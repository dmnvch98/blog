package com.example.controller;

import com.example.service.BusinessService;
import com.example.service.impl.ServiceManager;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.slf4j.Logger;

public abstract class AbstractController extends HttpServlet{
    private static final long serialVersionUID = 6995593219882488672L;
    protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
    private BusinessService businessService;

    public final BusinessService getBusinessService() {
        return businessService;
    }

    @Override
    public void init() throws ServletException {
        businessService = ServiceManager.getInstance(getServletContext()).getBusinessService();
    }

    public final void forwardToPage(String jspPage, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("currentPage", "page/" + jspPage);
        req.getRequestDispatcher("/WEB-INF/JSP/page-template.jsp").forward(req,resp);
    }

    public final void forwardToFragment(String jspPage, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/JSP/fragment" + jspPage).forward(req,resp);
    }

}
