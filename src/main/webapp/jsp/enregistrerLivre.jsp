<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bibliothèque en ligne : Enregistrement</title>
</head>
<body>
	<% String titre = request.getParameter("titre");
		String auteur = request.getParameter("auteur");
		String annee = request.getParameter("annee");
	
	%>

    <% if (titre == null || auteur == null || annee == null) { %>

	<h1>Enregistrer un livre</h1>

	<form method="POST" action="enregistrerLivre">
		<label>Titre</label><input type="text" name="titre"> <br />
		<label>Auteur</label><input type="text" name="auteur"> <br />
		<label>Année de	parution</label><input type="text" name="annee"><br />
		<input type="submit" value="Send" />
	</form>
	
	<% } else { %>
	
	<h1>Résumé :</h1>
	
	<p>Titre = <%= titre %></p>
	<p>Auteur = <%= auteur %></p>
	<p>Année = <%= annee %></p>
	
	<% }%>
</body>
</html>