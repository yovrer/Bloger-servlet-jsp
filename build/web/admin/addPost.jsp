<%-- 
    Document   : addPost
    Created on : Jun 29, 2016, 2:44:29 PM
    Author     : abu shawesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="templates/header.jsp"></jsp:include>
    <%
    if (session.getAttribute("login") == null) {
        response.sendRedirect("login.jsp");
        return;
    }%>
<html>
    <%if (request.getAttribute("success") != null) {%>
    <p class="bg-success btn-lg"><%=request.getAttribute("success")%></p>
    <%}else if (request.getAttribute("error") != null){%>
    <p class="bg-danger btn-lg"><%=request.getAttribute("error")%></p>
    <%}%>
    <form action="addpost" method="post" role="form">
        <div class="form-group">
            <label for="">New Article or blog title</label>
            <input class="form-control" type="text" name="title" pleceholder="article title">
        </div>

        <div class="form-group">
            <label for="">New Article or blog content</label>
            <textarea id="mytextarea" class="form-control" cols="50" rows="20" name="content" pleceholder="article content"></textarea>
        </div>

        <input type="submit" class="btn btn-info btn-lg btn-block" value="Add New Article">
    </form>
</html>
<script src='cdn.tinymce.com/4/tinymce.min.js'></script>
<jsp:include page="templates/footer.jsp"/>