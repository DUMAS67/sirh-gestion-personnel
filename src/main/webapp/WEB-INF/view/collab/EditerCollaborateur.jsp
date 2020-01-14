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
<title>SGP - Editer</title>
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
					href="#">Collaborateurs <span class="sr-only">(current)</span></a>
				</li>
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
	<form method="post">
		<p></p>
		<div class="container">
			<div class="row">
				<div class="col-3"></div>
				<div class="col-6 text-left">
					<!-- affiche les données venant de la classe EditerCollaborateurControlleur -->

						<c:set var="col" scope="page" value="${colMatr}"></c:set>
						<h2>
							<c:out value="${col.nom}"></c:out>
							<c:out value="${col.prenom}"></c:out>
							-
							<c:out value="${col.matricule}"></c:out>
						</h2>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" value=""
						id="defaultCheck1"> <label class="form-check-label"
						for="defaultCheck1"> Désactiver </label>
				</div>
			</div>
			<p></p>
			<div class="row">
				<div class="col-3">
					<img class="align-middle"
						src="https://thafd.bing.com/th/id/OIP.OXyOULVOTF4gvyMjUfaptgHaE6?w=265&h=173&c=7&o=5&dpr=1.25&pid=1.7"
						width="200" height="200" alt="">
				</div>
				<div class="col-8">
					<div class="accordion" id="accordionExample">
						<div class="card">
							<div class="card-header" id="headingOne">
								<h2 class="mb-0">
									<button class="btn btn-link" type="button"
										data-toggle="collapse" data-target="#collapseOne"
										aria-expanded="true" aria-controls="collapseOne">
										Intitulé</button>
								</h2>
							</div>
							<div id="collapseOne" class="collapse show"
								aria-labelledby="headingOne" data-parent="#accordionExample">
								<div class="card-body">
									<div class="container">
										<div>
											<div class="form-group row">
												<label for="inputCivilite"
													class="col-sm-3 col-form-label text-right">Civilité</label>
												<div class="col-9">
													<select class="custom-select" name="civilite"
														id="inputGroupSelect02">
														<option selected>Choose...</option>
														<option value="M.">M.</option>
														<option value="Mme">Mme</option>
													</select>
												</div>
											</div>
										</div>
										<div>
											<div class="form-group row">
												<label for="inputNom"
													class="col-sm-3 col-form-label text-right">Nom</label>
												<div class="col-sm-9">
													<!--  Affecte la valeur du nom au formulaire non modifiable-->
													<input type="text" class="form-control"
														value='<c:out value="${col.nom}"></c:out>' readonly>
												</div>
											</div>
										</div>
										<div class="form-group row">
											<label for="inputPrenom"
												class="col-sm-3 col-form-label text-right">Prénom</label>
											<div class="col-sm-9">
												<!--  Affecte la valeur du préom au formulaire non modifiable-->
												<input type="text" class="form-control"
													value='<c:out value="${col.prenom}"></c:out>' readonly>
											</div>
										</div>
										<div class="form-group row">
											<label for="inputDateNaissance"
												class="col-sm-3 col-form-label text-right">Date de
												Naissance</label>
											<div class="col-sm-9">
												<!--  Affecte la valeur de la date de naissance au formulaire non modifiable-->
												<input type="text" class="form-control"
													value='<c:out value="${col.dateNaissance}"></c:out>'
													readonly>
											</div>
										</div>
										<div class="form-group row">
											<label for="inputAdresse"
												class="col-sm-3 col-form-label text-right">Adresse</label>
											<div class="col-sm-9">
												<!--  Affecte la valeur de l'adresse au formulaire modifiable-->
												<textarea name="adresse" class="form-control"
													id="inputAdresse" rows="3"
													placeholder='<c:out value="${col.adresse}"></c:out>'></textarea>
											</div>
										</div>
										<div class="form-group row">
											<label for="inputNSS"
												class="col-sm-3 col-form-label text-right">Numéro de
												Sécurité Sociale</label>
											<div class="col-sm-9">
												<!--  Affecte la valeur du numero de Sécurité Sociale au formulaire non modifiable-->
												<input type="number" class="form-control" id="inputNSS"
													value='<c:out value="${col.numeroDeSecuriteSociale}"></c:out>'
													readonly>
											</div>
										</div>
										<div class="form-group row">
											<label for="inputTel"
												class="col-sm-3 col-form-label text-right">Numéro de
												telephone</label>
											<div class="col-sm-9">
												<!--  Récupère la valeur du numéro de téléphone -->
												<input type="tel" name="telephone" class="form-control"
													id="inputTel"
													value='<c:out value="${col.numeroTelephone}"></c:out>'>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="accordion" id="accordionExample">
						<div class="card">
							<div class="card-header" id="headingOne">
								<h2 class="mb-0">
									<button class="btn btn-link" type="button"
										data-toggle="collapse" data-target="#collapseTwo"
										aria-expanded="true" aria-controls="collapseTwo">
										Poste</button>
								</h2>
							</div>
							<div id="collapseTwo" class="collapse"
								aria-labelledby="headingOne" data-parent="#accordionExample">
								<div class="card-body">
									<div class="container">
										<div class="form-group row">
											<label for="inputDepartement"
												class="col-sm-3 col-form-label text-right">Departement</label>
											<div class="col-9">
												<select class="custom-select" name="departement"
													id="inputGroupSelect01">
													<option selected>Choose...</option>
													<!--  affiche les valeurs des départements pour choix -->

													<c:forEach items="${listeDepartement}" var="lD">
														<option value='<c:out value="${lD.id}"></c:out>'>
															<c:out value="${lD.nom}"></c:out>
														</option>
													</c:forEach>
												</select>
											</div>
										</div>
										<div class="form-group row">
											<label for="inpuFonction"
												class="col-sm-3 col-form-label text-right">Fonction</label>
											<div class="col-sm-9">
												<!--  Récupère la fonction du Collaborateur -->
												<input type="text" name="fonction" class="form-control"
													id="inputFonction"
													value='<c:out value="${col.intitulePoste}"></c:out>'>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="accordion" id="accordionExample">
						<div class="card">
							<div class="card-header" id="headingOne">
								<h2 class="mb-0">
									<button class="btn btn-link" type="button"
										data-toggle="collapse" data-target="#collapseTrois"
										aria-expanded="true" aria-controls="collapseTrois">
										Coordonnées bancaires</button>
								</h2>
							</div>

							<div id="collapseTrois" class="collapse "
								aria-labelledby="headingOne" data-parent="#accordionExample">
								<div class="card-body">
									<div class="container">
										<div class="form-group row">
											<label for="inputBanque"
												class="col-sm-3 col-form-label text-right">Banque</label>
											<div class="col-sm-9">
												<!--  Récupère le nom de la Banque -->
												<input name="banque" type="text" class="form-control"
													id="inputBanque"
													value='<c:out value="${col.banque}"></c:out>'>
											</div>
										</div>
										<div class="form-group row">
											<label for="inputIban"
												class="col-sm-3 col-form-label text-right">IBAN</label>
											<div class="col-sm-9">
												<!--  Récupère la valeur du Iban du compte bancaire -->
												<input name="iban" type="text" class="form-control"
													id="inputIban" value='<c:out value="${col.iban}"></c:out>'>
											</div>
										</div>
										<div class="form-group row">
											<label for="inputBIC"
												class="col-sm-3 col-form-label text-right">BIC</label>
											<div class="col-sm-9">
												<!--  Récupère la valeur du BIC du compte bancaire -->
												<input name="bic" type="text" class="form-control"
													id="inputBIC" value='<c:out value="${col.bic}"></c:out>'>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row"></div>
			<p></p>
			<div class="row">
				<div class="col-11 text-right">
					<button type="submit" name="sauvegarder class="btnbtn-primary">Sauvegarder</button>
				</div>
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
