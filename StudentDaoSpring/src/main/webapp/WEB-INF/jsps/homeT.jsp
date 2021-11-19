<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Crime Information Portal</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>



</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark" id="navbar">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">CrimeInfo</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#menu">
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
					fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
                    <path fill-rule="evenodd"
						d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z" />
                </svg>
			</button>
			<div class="collapse navbar-collapse" id="menu">
				<ul class="navbar-nav mx-auto  ">
					<li class="nav-item"><a href="#" class="nav-link my-2 ">Home</a></li>
					<li class="nav-item"><a href="#dish" class="nav-link my-2"></a></li>
					<li class="nav-item"><a href="#room" class="nav-link my-2"></a></li>
					<li class="nav-item"><a href="#about" class="nav-link my-2">About</a></li>

				</ul>


				<select name="dogMenu" id="dogMenu" class=" btn btn-success">
					<option value="nothing">Login as</option>
					<option value="/admin">Admin</option>
					<option value="/login">Officer</option>
					<option value="/citizenlogin">Citizen</option>
				</select>



			</div>


		</div>
	</nav>


	<h1 align="center">Welcome to Online Crime Information Portal</h1>
	<hr>
	






<script type="text/javascript">
	var url = document.getElementById('dogMenu');
	url.onchange = function() {
		var userOption = this.options[this.selectedIndex];
		if (userOption.value != "nothing") {
			window.open(userOption.value, "Login", "");
		}
	}
</script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
		integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
		integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
		crossorigin="anonymous"></script>

</body>
</html>