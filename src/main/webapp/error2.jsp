<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
        <h1>Error 500 - bad request</h1>
    </div>

    <div class="img-container">
        <img src="images/error500.jpg" alt="Not Found Image" class="img-fluid">
    </div>
    
    <!-- Bootstrap JS and dependencies (optional, but used in some Bootstrap features) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.9/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</div>

</body>
</html>
