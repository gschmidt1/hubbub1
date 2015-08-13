<%@page contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">fieldset {margin:8px;}</style>
        <title>Hubbub&trade; Version 1</title>
    </head>
    <body>
        <p><img src="images/hubbub.png"/></p>
        <h1 style="background-color: #abcdef;">Welcome to Hubbub1!</h1>
        <h2 style="background-color: #fedcba">Timeline</h2>
        
        <c:forEach var="post" items="${posts}">
        <div style="border: 1px solid teal; margin: 8px; padding: 8px;">
                <span style="margin:8px;padding:8px; font-size:larger;">${users[post.userId].userName}</span>
                <span style="font-size:smaller;">(user since ${users[post.userId].joinDate})</span>
                <div style="background-color:lightgray;margin:8px;padding:8px;">   
                    ${post.content}
                </div>
                <span style="margin:8px; padding:8px; font-size:smaller;">Posted ${post.postDate}</span>    
        </div>
        </c:forEach>
             
        <h3 style="background-color: #fedcba">Copyright 2015 Austincc.edu</h3>
    </body>
</html>
