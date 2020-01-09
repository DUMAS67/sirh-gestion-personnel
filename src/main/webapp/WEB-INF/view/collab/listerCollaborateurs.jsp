<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/css/bootstrap.css">
<meta charset="UTF-8">
<title>SGP - App</title>
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
			List<Collaborateur> listeCollaborateurs = (List<Collaborateur>) request.getAttribute("listeCollaborateur");
			
			for (Collaborateur collaborateur : listeCollaborateurs) {
		%>
		<li><%=collaborateur.getMatricule()%></li>
		<li><%=collaborateur.getNom()%></li>
		<li><%=collaborateur.getPrenom()%></li>
		
		<%
			}
		%>
	</ul>
</body>
</html>
