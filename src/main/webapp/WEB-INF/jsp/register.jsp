<html>
<head>
<link href="/register.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="/validation.js"></script>
</head>
<body>

<form name="registerForm" action="/home" method="post" style="text-align: -webkit-center;" onsubmit="return validateRegisterForm()">
  <div class="container">
    <h1 style="text-align: center;">Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    <label><b>First Name</b></label>
    <input type="text" id= "firstName" placeholder="Enter First Name" name="firstName" required>

    <label><b>Last Name</b></label>
    <input type="text" id= "lastName" placeholder="Enter last Name" name="lastName"  required>

    <label for="email"><b>Email</b></label>
    <input type="text" id= "email" placeholder="Enter Email" name="email" required>
    <div id="emailError" style="color: red;"></div>

    <label><b>Contact Number</b></label>
    <input type="number" id= "contactNumber" placeholder="Enter Contact Number" name="contactNumber" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" id= "psw" placeholder="Enter Password" name="psw" required>


    <hr>

    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="/login">Sign in</a>.</p>
  </div>
</form>

</body>
</html>
