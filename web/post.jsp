<%@page import="com.sjshawesh.DAO.PostDAO"%>
<%@page import="com.sjshawesh.dbconnect.DbConnect"%>
<%@page import="com.sjshawesh.map.Post"%>
<jsp:include page="templates/header.jsp"/>
<%

    if (request.getParameter("id") == null) {
        response.sendError(404, "The page note found");
        return;
    } else if (!request.getParameter("id").matches("\\d+")) {
        response.sendError(505, "The ID is not Integer");
        return;
    }

    Post p = PostDAO.getPost(Integer.parseInt(request.getParameter("id")));
    
    if (p == null) {
        response.sendError(404, "The page note found");
        return;
    }
    
%>
<div class="container">
    <div class="row">
        <section class="article">
            <ul class="list-group">
                <li class="list-group-item">
                    <blockquote>
                        <h3><%=p.getTitle()%></h3>
                        <div><%=p.getContent()%></div>
                        <br>
                        <p>
                            <span class="glyphicon glyphicon-arrow-left"></span>
                            <a href="index.jsp">Back Home</a>
                        </p>
                    </blockquote>
                </li>
            </ul>
        </section>
    </div>
</div>


<jsp:include page="templates/footer.jsp"/>