<%-- 
    Document   : index
    Created on : Jun 25, 2016, 12:14:25 AM
    Author     : abu shawesh
--%>

<%@page import="com.sjshawesh.DAO.PostDAO"%>
<%@page import="com.sjshawesh.map.Post"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="templates/header.jsp"/>
<div class="container">
    <div class="row">
        <%
        ArrayList<Post> k = PostDAO.getAllPost();
        for (Post p :k){
           
        
        %>
			<article class="col-md-12">
				<div class="thumbnail">
					<div class="caption">
					<h2><a href="post.jsp?id=<%=p.getId()%>">
                                                <%=p.getTitle()%>
					</a></h2>
					<div class="content"><%= p.getContent()%></div><br>
				<a class="btn btn-info btn-lg btn-block" href="post.jsp?id=<%=p.getId()%>">Read More</a>
				</div>
				</div>
			</article>
                        <%}%>
        
    </div>
        
</div> <!-- End container -->

<jsp:include page="templates/footer.jsp"/>
    







