<%--
    Document   : createperson
    Created on : 17.07.2017, 17:33:53
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hemmerling.aufgabe05d_buecherverwaltung.model.business.BookService"%>
<%@page import="com.hemmerling.aufgabe05d_buecherverwaltung.model.persistence.Book"%>
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
            BookService bookService = (BookService) session.getAttribute("bookservice");

            List<Book> bookList = bookService.get();
            if (bookList == null /* || items.isEmpty() */) {
        %>
        <% } else { %>
<!--        <ol>
            <% for (Book book : bookList) {%>
            <li><%= book.getId()%>&nbsp;<%= book.getTitle()%>&nbsp;<%= book.getAuthor()%>&nbsp;
                <%= book.getYearOfRelease()%>&nbsp;<%= book.getIsbn()%>&nbsp;<%= book.getGenre()%></li>
                <% } %>
        </ol>-->
        
            <% for (int ii=0; ii<bookList.size();ii++) {%>          
            <li><%= ii%>&nbsp;<%= bookList.get(ii).getId()%>&nbsp;<%= bookList.get(ii).getTitle()%>&nbsp;
                <%= bookList.get(ii).getAuthor()%>&nbsp;<%= bookList.get(ii).getYearOfRelease()%>&nbsp;
                <%= bookList.get(ii).getIsbn()%>&nbsp;<%= bookList.get(ii).getGenre()%>&nbsp;
                <a href="FrontController?action=delete&id2=<%= ii%>">Löschen</a>&nbsp;
                <a href="FrontController?action=update&id2=<%= ii%>">Bearbeiten</a></li>
                <% } %>
        
        <% }%>
        <jsp:include page = "footer.jsp" />
    </body>
</html>
