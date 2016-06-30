<%-- 
    Document   : login
    Created on : Jun 25, 2016, 3:56:01 PM
    Author     : abu shawesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="templates/header.jsp" />
<br>
<%if (request.getAttribute("error") != null) {%>
<p class="bg-danger btn-lg"><%=request.getAttribute("error")%></p>
<%}%>
<form action="login" method="post" rol="form">
    <div class="form-group">
        <label for="">Username : </label>
        <input type="text" class="form-control" name="username" placeholder="username">
    </div>
    <div class="form-group">
        <label for="">Password : </label>
        <input type="password" class="form-control" name="password" placeholder="password">
    </div>
    <input type="submit" class="btn btn-info btn-lg btn-block" value="Login"> 
</form>
<br><br>

<jsp:include page="templates/footer.jsp"/>