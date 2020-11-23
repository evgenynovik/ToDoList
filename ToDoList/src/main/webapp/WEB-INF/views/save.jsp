<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Save</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body
	style='background-image: url("/nature.jpg"); font-family: verdana;'>
	<br>
	<div class="container">
		<div class="col-7">
			<form action="save" method="post">
				<div class="form-group">
					<label style='color: #191970; font-size: 180%;'>Summary</label>
					 <input
						type="text" class="form-control" style='margin-top: 10px;'
						name="summary" placeholder="type your summary here"></input>
					<button class="btn btn-primary" style='margin-top: 14px;'>Save</button>

				</div>
			</form>
			<a class="btn btn-info"
				style='margin-top: 14px;' href="list">Whole
				task list </a>
		</div>
	</div>
</body>
</html>