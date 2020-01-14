
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/css/bootstrap.css">
<meta charset="UTF-8">
<title>SGP - App</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img
			src="https://thafd.bing.com/th/id/OIP.OXyOULVOTF4gvyMjUfaptgHaE6?w=265&h=173&c=7&o=5&dpr=1.25&pid=1.7"
			width="30" height="30" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-pills active"><a class="nav-link active"
					href="#">Collaborateurs <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Statistiques
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Activités
						<span class="sr-only">(current)</span>
				</a></li>
			</ul>
		</div>
	</nav>
	<aside>
		<div class="container">
			<div class="row">
				<div class="col text-right">
					<a href="../collaborateur/nouveau" class="btn btn-primary">Ajouter
						un nouveau collaborateur</a>
				</div>
			</div>
			<div class="row">
				<div class="col text-left">
					<h2>Les Collaborateurs</h2>

				</div>
			</div>
			<div class="row">
				<div class="col-4 text-left">
					<h8> Recherche un nom ou un prénom qui commence par :</h8>
				</div>
				<div class="col">
					<form class="form-inline my-2 my-lg-0 ">
						<input class="form-control mr-sm-2" type="search" placeholder=""
							aria-label="search" style="width: 160px">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Rechercher</button>
					</form>
				</div>
				<div class="col">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" value=""
							id="defaultCheck1"> <label class="form-check-label"
							for="defaultCheck1"> Voir les collaborateurs désactivés </label>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-4 text-right">
					<h8> Filtrer par département :</h8>
				</div>
				<div class="col-2">
					<select class="custom-select my-1 mr-sm-2"
						id="inlineFormCustomSelectPref">
						<option selected>Tous</option>
						<!--  récupère la liste des département et l'affiche -->
						<c:forEach items="${listeDepartement}" var="lD">
							<option value='<c:out value="${lD.id}"></c:out>'>
								<c:out value="${lD.nom}"></c:out>
							</option>
						</c:forEach>

					</select>
				</div>
				<div class="col"></div>
			</div>
		</div>
	</aside>
	<main>
	<p></p>
	<!--Première ligne de Card-->
	<div class="container">
		<div class="row">
			<!--  récupère la liste des collaborateurs à afficcher -->



			<c:forEach items="${listeCollaborateur}" var="lC">


				<div class="col">
					<p></p>
					<div class="card" style="width: 21rem;">
						<!--  affiche les noms et prénoms -->
						<h5 class="card-header">
							<c:out value="${lC.nom}"></c:out>
							<c:out value="${lC.prenom}"></c:out>
						</h5>
						<div class="card-body">
							<div class="row">
								<div class="col">
									<div class="media">
										<img class="align-self-center mr-3" class="mr-2"
											src="https://thafd.bing.com/th/id/OIP.OXyOULVOTF4gvyMjUfaptgHaE6?w=265&h=173&c=7&o=5&dpr=1.25&pid=1.7"
											width="48" height="48" alt="">
										<!--  affiche la fonction, le département et l'email du collaborateur-->
										<ul style="list-style: none;" class="col">
											<li class="#"><h6 class="#">
													<c:out value="${lC.intitulePoste}"></c:out>
												</h6></li>
											<li class="#"><h6 class="#">
													<c:out value="${lC.departement.nom}"></c:out>
												</h6></li>
											<li class="#"><h6 class="#">
													<c:out value="${lC.emailPro}"></c:out>
												</h6></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col text-right">
									<!-- redirige sur la page editer avec le numero de matricule seectionné-->
									<c:url value="../collaborateur/editer" var="myURL">
										<c:param name="matricule" value="${lC.matricule}" />
									</c:url>
									<a href="../collaborateur/editer" class="btn btn-primary">Editer</a>
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
			<!--Deuxième ligne de Card-->
	</main>
	<!-- TODO -->
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous">
		
	</script>
</body>
</html>
