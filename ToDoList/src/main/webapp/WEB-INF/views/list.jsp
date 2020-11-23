<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Task List</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body style='background-image: url("/nature.jpg"); font-family: verdana;'>
	<div class="container">
		<div class='row justify-content-center' style='margin-top: 15px;'>
			<div class="col-6">
				<h1 style='margin-top: 60px; color: #191970'>List of your daily tasks</h1>
			</div>
		</div>
		<div class="col-md-2 ml-md-auto">
			<div id="headingOne" style='margin-bottom: 15px;'>
				<h5 class="mb-0">
					<button class="btn btn-info btn" data-toggle="collapse"
						data-target="#collapseOne" aria-expanded="true"
						aria-controls="collapseOne">
						Info ? <span style='font-size: 70%;'> click here * </span>
					</button>
				</h5>
			</div>
		</div>
		<div id="collapseOne" class="collapse" aria-labelledby="headingOne">
			<div class="card-body" style='color: #191970; font-size: 140%;'>
				How to remove a summary from your task list? You can remove a summary just click on it!
			</div>
		</div>
		<div class="list-group">
			<c:forEach items="${list}" var="item">
				<a class="list-group-item list-group-item-action list-group-item-info"
					style='color: #191970; font-size: 180%; margin-bottom: 8px;'
					href="complete?id=${item.id}"> ${item.summary}</a>
			</c:forEach>
		</div>
		<a class="btn btn-primary" style='margin-top: 7px;' href="save">Add new summary</a>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>