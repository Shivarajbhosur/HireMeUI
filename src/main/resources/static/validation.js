function validateLoginForm() {
  //var email = document.forms["loginForm"]["email"].value;
  var email = document.getElementById("email");
  var password = document.getElementById("psw");
  if (email == "" || password == "") {
    alert("Email and password must be filled out");
    return false;
  }
  if (!validateEmail(email)) {
          /*alert("Invalid email format");*/
          var errorElement = document.getElementById("emailError");
          errorElement.innerHTML = "Invalid email format";
          return false;
      }
      return true;
}

function validateRegisterForm(){
    var firstName = document.getElementById("firstName");
    var lastName = document.getElementById("lastName");
    var email = document.getElementById("email");
    var contactNumber = document.getElementById("contactNumber");
    var password = document.getElementById("psw");

    // Check if all fields are filled out
    if (firstName == "" || lastName == "" || email == "" || contactNumber == "" || password == "") {
        alert("All fields must be filled out");
        return false;
    }
    if (!validateEmail(email)) {
              /*alert("Invalid email format");*/
              var errorElement = document.getElementById("emailError");
              errorElement.innerHTML = "Invalid email format";
              return false;
          }
          return true;
}
function validateEmail(email) {
    // Regular expression for email format
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}

