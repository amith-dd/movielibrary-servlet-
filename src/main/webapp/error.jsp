<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Error Page</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <style>
        body {
            background-color: #f8f9fa;
        }

        .error-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .header {
            text-align: center;
            margin-bottom: 30px;
        }

        .img-container {
            width: 75%; /* Set the image size to 75% of the screen width */
            max-width: 600px; /* Optional: Set a maximum width for the image */
        }
    </style>
</head>
<body>

<div class="container error-container">
    <div class="header">
        <!-- Your header content goes here -->
        <h1>Error 404 - not found</h1>
        <p>Sorry, the page you are looking for might be in another castle.</p>
    </div>

    <div class="img-container">
        <img src="images/2488756.jpg" alt="Not Found Image" class="img-fluid">
    </div>
    
    <!-- Bootstrap JS and dependencies (optional, but used in some Bootstrap features) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.9/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</div>



<% class hello{
	public  int sum(int a, int b){
		return a+b;
	}
}%>

<% hello h = new hello(); %>
<%= h.sum(1, 2) %>















</body>
</html>