<%-- 
    Document   : index
    Created on : Jun 25, 2016, 3:52:38 PM
    Author     : abu shawesh
--%>
<jsp:include page="templates/header.jsp" />
<%
    if (session.getAttribute("login") == null) {
        response.sendRedirect("login.jsp");
        return;
    }%>
<br>
<div class="list-group">
    <div class="list-group-item">
        <a class="list-group-item" href="addPost.jsp">
            <h4 class="list-group-item-heading">
                Add Post or Article
            </h4>
            <p class="list-group-item-text">
                Create New post or article to your CMS blog system with pdo way
            </p>
        </a>
        <a class="list-group-item" href="delete.jsp">
            <h4 class="list-group-item-heading">
                Delete Post or Article
            </h4>
            <p class="list-group-item-text">
                Delete Old post or article from your CMS blog system with pdo way
            </p>
        </a>
        <a class="list-group-item" href="logout">
            <h4 class="list-group-item-heading">
                Logout
            </h4>
            <p class="list-group-item-text">
                Logout and go have some fun
            </p>
        </a>
    </div>
</div> <!-- End list-group -->  
<jsp:include page="templates/footer.jsp"/>