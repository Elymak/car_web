<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <% String name = request.getParameter("name"); %>

        <% if (name == null) { %>
            <form method="POST" action="hello">
                <label>Your name: </label><input type="text" name="name" />
                <br/>
                <input type="submit" value="Send" />
            </form>
        <% } else { %>
            <p>Hello, <%= name %></p>
        <% } %>
    </body>
</html>