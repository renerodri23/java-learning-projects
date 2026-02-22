package org.rpalacios.webappform.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/registro")
public class FormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String pais = req.getParameter("pais");
        String[] lenguajes = req.getParameterValues("lenguajes");
        String[] roles = req.getParameterValues("roles");
        String idioma = req.getParameter("idioma");
        boolean habilitar = req.getParameter("habilitar") != null &&
                req.getParameter("habilitar").equals("on");
        String secreto = req.getParameter("secreto");

        Map<String, String> errores = new HashMap<>();

        if (username == null || username.isBlank()) {
            errores.put("username","El Username es requerido!");
        }

        if (password == null || password.isBlank()) {
            errores.put("password","El Password no puede ser vacio!");
        }

        if (email == null || !email.contains("@")) {
            errores.put("email","El Email es requerido y debe tener un formato de correo!");
        }

        if (pais == null || pais.isBlank()) {
            errores.put("pais","El Pais es requerido!");
        }

        if (lenguajes == null || lenguajes.length == 0) {
            errores.put("lenguajes","Debe seleccionar al menos un tema!");
        }

        if (roles == null || roles.length == 0) {
            errores.put("roles","Debe seleccionar al menos un Role!");
        }
        if (idioma == null) {
            errores.put("idioma" , "Debe seleccionar un Idioma!");
        }

        if (errores.isEmpty()) {
            try (PrintWriter out = resp.getWriter()) {
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("    <head>");
                out.print("        <meta charset=\"UFT-8\">");
                out.print("        <title>Resultado Form</title>");
                out.print("    </head>");
                out.print("    <body>");
                out.print("        <h1>Resultado Form</h1>");

                out.println("      <ul>");

                out.println("         <li> Username: " + username + "</li>");
                out.println("         <li> Password: " + password + "</li>");
                out.println("         <li> Email: " + email + "</li>");
                out.println("         <li> Pais: " + pais + "</li>");
                out.println("         <li>Lenguajes: <ul>");
                Arrays.asList(lenguajes).forEach(lenguaje -> {
                    out.println("             <li>" + lenguaje + "</li>");
                });
                out.println("         </ul></li>");

                out.println("         <li>Roles: <ul>");
                Arrays.asList(roles).forEach(role -> {
                    out.println("             <li>" + role + "</li>");
                });
                out.println("         </ul></li>");
                out.println("          <li>Idioma: " + idioma + "</li>");
                out.println("          <li>Habilitar: " + habilitar + "</li>");
                out.println("          <li>Secreto: " + secreto + "</li>");

                out.println("      </ul>");
                out.print("    </body>");
                out.print("</html>");
            }
        } else {
            /*errores.forEach(error -> {
                out.println("<li>"+error+"</li>");
            });
            out.println("<p><a href=\"/webapp-form/index.jsp\">Volver</a></p>");*/
            req.setAttribute("errores", errores);
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
