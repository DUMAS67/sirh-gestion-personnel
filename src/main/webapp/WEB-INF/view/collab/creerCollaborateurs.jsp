<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/css/bootstrap.css">
<meta charset="UTF-8">
<title>SGP - Crer Collaborateur</title>
</head>
<body>
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
				<li class="nav-pills"><a class="nav-link active" href="#">Collaborateurs
						<span class="sr-only"></span>
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
	<main>
	<div class="container"></div>
	<div class="row"></div>
	<div class="col text-left">
		<p>
		<h2>Nouveau Collaborateur</h2>
		</p>
	</div>
	</div>
	<form method="post">
		<p></p>
		<div class="form-group row">
			<div class="col-2"></div>
			<label for="inputNom" class="col-sm-2 col-form-label">Nom</label>
			<div class="col-sm-4">
				<input name="nom" type="text" class="form-control" id="inputNom">
			</div>
		</div>
		<div class="form-group row">
			<div class="col-2"></div>
			<label for="inputPrenom" class="col-sm-2 col-form-label">Prénom</label>
			<div class="col-sm-4">
				<input name="prenom" type="text" class="form-control"
					id="inputPrenom">
			</div>
		</div>
		<div class="form-group row">
			<div class="col-2"></div>
			<label for="inputDateNaissance" class="col-sm-2 col-form-label">Date
				de Naissance</label>
			<div class="col-sm-4">
				<input name="dateNaissance" type="date" class="form-control"
					id="inputDateNaissance">
			</div>
		</div>
		<div class="form-group row">
			<div class="col-2"></div>
			<label for="inputAdresse" class="col-sm-2 col-form-label">Adresse</label>
			<div class="col-sm-4">
				<textarea name="adresse" class="form-control" id="textarea" rows="3"></textarea>
			</div>
		</div>
		<div class="form-group row">
			<div class="col-2"></div>
			<label for="inputNSS" class="col-sm-2 col-form-label">Numéro
				de Sécurité Sociale</label>
			<div class="col-sm-4">
				<input name="numeroSS" type="number" class="form-control"
					id="inputNSS">
			</div>
		</div>
		<div class="form-group row">
			<div class="col-2"></div>
			<label for="inputDepartement" class="col-sm-2 col-form-label">Departement</label>
			<div class="col-sm-4">
				<input name="departement" type="text" class="form-control"
					id="inputNSS">
			</div>
		</div>
		<div class="form-group row">
			<div class="col-2"></div>
			<label for="inputFonction" class="col-sm-2 col-form-label">Fonction</label>
			<div class="col-sm-4">
				<input name="fonction" type="text" class="form-control"
					id="inputNSS">
			</div>
		</div>
		<div class="form-group row">
			<div class="col-sm-8 text-right">
				<!-- Button trigger modal -->
				<button type="submit" name="creer" class="btn btn-primary">Créer</button>
			</div>
		</div>
	</form>
	</main>


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