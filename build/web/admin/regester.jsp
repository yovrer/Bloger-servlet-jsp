<%-- 
    Document   : regester
    Created on : Jun 29, 2016, 6:25:26 PM
    Author     : abu shawesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="templates/header.jsp" />
<br>
<%if (request.getAttribute("success") != null) {%>
<p class="bg-success btn-lg"><%=request.getAttribute("success")%></p>
<%} else if (request.getAttribute("error") != null) {%>
<p class="bg-danger btn-lg"><%=request.getAttribute("error")%></p>
<%}%>
<div class="container">
    <div class="row">
        <div class="col-md-6">

            <form class="form-horizontal" action="regester" method="POST">
                <fieldset>
                    <div id="legend">
                        <legend class="">Register</legend>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="username">Username</label>
                        <div class="controls">
                            <input type="text" id="username" name="username" placeholder="" class="form-control input-lg">
                            <p class="help-block">Username can contain any letters or numbers, without spaces</p>
                        </div>
                    </div>


                    <div class="control-group">
                        <label class="control-label" for="password">Password</label>
                        <div class="controls">
                            <input type="password" id="password" name="password" placeholder="" class="form-control input-lg">
                            <p class="help-block">Password should be at least 6 characters</p>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="password_confirm">Password (Confirm)</label>
                        <div class="controls">
                            <input type="password" id="password_confirm" name="password_confirm" placeholder="" class="form-control input-lg">
                            <p class="help-block">Please confirm password</p>
                        </div>
                    </div>

                    <div class="control-group">
                        <!-- Button -->
                        <div class="controls">
                            <button class="btn btn-success">Register</button>
                        </div>
                    </div>
                </fieldset>
            </form>

        </div> 
    </div>
</div>
<br>
<br>
<a class="btn btn-danger" href="">Delete</a>
<jsp:include page="templates/footer.jsp"/>