<%--
    Document   : createperson
    Created on : 17.07.2017, 17:33:53
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booklist</title>
    </head>
    <body>
        <jsp:include page = "header.jsp" />
        <h1>Booklist</h1>
        <%
            List<String[]> bookList = (ArrayList<String[]>) session.getAttribute("BOOKLIST");
            if (bookList == null /* || items.isEmpty() */) {
        %>
        <% } else { %>
<!--        <ol>
            <% for (String[] book : bookList) {%>
            <li><%= book[0]%>&nbsp;<%= book[1]%>&nbsp;<%= book[2]%>&nbsp;
                <%= book[3]%>&nbsp;<%= book[4]%>&nbsp;<%= book[5]%></li>
                <% } %>
        </ol>-->
        
            <% for (int ii=0; ii<bookList.size();ii++) {%>          
            <li><%= ii%>&nbsp;<%= bookList.get(ii)[0]%>&nbsp;<%= bookList.get(ii)[1]%>&nbsp;
                <%= bookList.get(ii)[2]%>&nbsp;<%= bookList.get(ii)[3]%>&nbsp;
                <%= bookList.get(ii)[4]%>&nbsp;<%= bookList.get(ii)[5]%>&nbsp;
                <a href="FrontController?action=delete&id=<%= ii%>">Löschen</a>&nbsp;
                <a href="FrontController?action=update&id=<%= ii%>">Bearbeiten</a></li>
                <% } %>
        
        <% }%>
        <jsp:include page = "footer.jsp" />
    </body>
</html>
