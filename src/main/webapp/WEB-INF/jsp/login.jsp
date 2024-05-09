<html>
<head>
<link href="/register.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="/validation.js"></script>
</head>
<body>
<h1> ${Status} </h1>

<form name="loginForm" action="/login" method="post" style="text-align: -webkit-center;" onsubmit="return validateLoginForm()">
  <div class="container">
  <h1 style="text-align: center;">Login Form</h1>
    <label for="email"><b>Username</b></label>
        <input type="text" id= "email" placeholder="Enter email" name="email" required>
        <div id="emailError" style="color: red;"></div>


        <label for="psw"><b>Password</b></label>
        <input type="password" id= "psw" placeholder="Enter Password" name="psw" required>

        <button type="submit" class="registerbtn" style="width: 45%;">Login</button>

        <a href="register" class="buttonforanchor">Register</a>
  </div>
</form>

</body>
</html>
