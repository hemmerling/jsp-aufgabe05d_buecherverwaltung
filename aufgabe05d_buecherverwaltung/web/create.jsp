<%-- 
    Document   : create
    Created on : 17.07.2017, 17:33:53
    Author     : Administrator
--%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.hemmerling.aufgabe05d_buecherverwaltung.model.persitence.*"%>
<%@page import="com.hemmerling.aufgabe05d_buecherverwaltung.model.business.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buch anlegen [Web Components ( aufgabe05d_buchverwaltung )]</title>
    </head>
    <body>
        <jsp:include page = "header.jsp"/>
        <h1>Buch anlegen</h1>

        <script type="text/javascript">
            function fillForm1() {
                document.getElementsByName("id")[0].value = '0';
                document.getElementsByName("titel")[0].value = 'Buch für Männer';
                document.getElementsByName("autor")[0].value = 'Joe Doe';
                document.getElementsByName("erscheinungsjahr")[0].value = 2017;
                document.getElementsByName("isbn")[0].value = '1-84356-028-3';
                document.getElementsByName("genre")[0].value = 'sachbuch';
            }
            function fillForm2() {
                document.getElementsByName("id")[0].value = '1';
                document.getElementsByName("titel")[0].value = 'Mein Frauenbuch';
                document.getElementsByName("autor")[0].value = 'Mary Doe';
                document.getElementsByName("erscheinungsjahr")[0].value = "2016";
                document.getElementsByName("isbn")[0].value = '1-84356-028-4';
                document.getElementsByName("genre")[0].value = 'sachbuch';
            }
        </script>
        <form method="post" action="FrontController" name="theForm">
            <%
//            Enumeration paramNames = request.getParameterNames();
//            while (paramNames.hasMoreElements()) {
//                String paramName = (String) paramNames.nextElement();
//                String paramValue = request.getParameter(paramName);
//                if (paramValue != null && !paramValue.trim().isEmpty()) {
//                    out.print(paramValue + "</BR>");
//                }
//            } 
            if ((request.getParameter("action")!=null) &&
                (request.getParameter("action").equals("update")) &&
                (request.getParameter("id")!=null)) {
                BookService bookService = BookService.getInstance(); // Singleton
                String idString = request.getParameter("id");
                int id = Integer.valueOf(idString);
                out.println("<input type='hidden' name='action' value='set' />");
                out.println("<input type='hidden' name='id' value='" + idString + "' />");
                out.println("ID: <input type='text' name='id' value='" + bookService.get().get(id)[0] + "'/>");
                out.println("Titel: <input type='text' name='titel' value='" + bookService.get().get(id)[1] + "'/>");
                out.println("Autor: <input type='text' name='autor' value='" + bookService.get().get(id)[2] + "'/>");
                out.println("Erscheinungsjahr: <input type='text' name='erscheinungsjahr' value='" + bookService.get().get(id)[3] + "'/>");
                out.println("ISBN: <input type='text' name='isbn' value='" + bookService.get().get(id)[4] + "'/>");
                out.println("Genre: <input type='text' name='genre' value='" + bookService.get().get(id)[5] + "'/>");
            } else { %>
                <input type="hidden" name="action" value="create" />
                ID: <input type="text" name="id" />
                Titel: <input type="text" name="titel" />
                Autor: <input type="text" name="autor" />
                Erscheinungsjahr: <input type="text" name="erscheinungsjahr" />
                ISBN: <input type="text" name="isbn" />
                Genre: <input type="text" name="genre" />
            <% } %>
            <input type="button" value="Ausfüllen des Forumulars #1" onclick="fillForm1()"  />
            <input type="button" value="Ausfüllen des Forumulars #2" onclick="fillForm2()"  />
            <input type="reset" value="Reset" />
            <input type="submit" value="Submit" />
        </form>
        <jsp:include page = "footer.jsp" />
    </body>
</html>
