<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Weather Monitoring</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Weather Monitoring Application</h1>
        <div class="card">
            <div class="card-body">
                <form action="${pageContext.request.contextPath}/weather" method="post">
                    <div class="mb-3">
                        <label for="city" class="form-label">Enter City:</label>
                        <input type="text" class="form-control" id="city" name="city" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Get Weather</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>