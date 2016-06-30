<%-- 
    Document   : delete
    Created on : Jun 25, 2016, 5:00:36 PM
    Author     : abu shawesh
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sjshawesh.DAO.PostDAO"%>
<%@page import="com.sjshawesh.map.Post"%>
<jsp:include page="templates/header.jsp" />
<%
    if (session.getAttribute("login") == null) {
        response.sendRedirect("login.jsp");
        return;
    }%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="row">
    <table class="table table-hover">
        <thead>
            <tr>
                <th><h4>CMS or Blog title</h4></th>
                
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
           
                <%
                ArrayList<Post> allpost = PostDAO.getAllPost();
                for(Post p : allpost){
                %>
                
                    <tr>
                        <td><label for=""><%=p.getTitle()%></label></td>
                        <td><a class="btn btn-danger" href="delete?id=<%=p.getId()%>">Delete</a></td>
                    </tr>
                <%}%>
           
        </tbody>
    </table>
</div> <!-- End row -->
<jsp:include page="templates/footer.jsp"/>