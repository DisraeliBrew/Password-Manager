// --== CS400 File Header Information ==--
// Name: Taylor Mehmen
// Email: tmehmen@wisc.edu
// Team: LD
// Role: BackEnd
// TA: Divyanshu
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

function onLoad() {
    document.getElementById("messageSpot").innerText = "This is the preloading message"
}

function login() {
    let usernameSpot = document.getElementById("email");
    let passwordSpot = document.getElementById("pass");
    let username = usernameSpot.value;
    let password = passwordSpot.value;

    correctName = controller.enterUsername(username);
    correctPass = controller.enterPassword(username,password);
    if(correctName){
        if(correctPass){
            //change where this prints
            document.getElementById("messageSpot").innerText = "Now they should be logged in"
            window.location.replace("userPage.html");
            localStorage.setItem("currentUsername",username);
        }
        else{
            //change where this prints
            document.getElementById("messageSpot").innerText = "Invalid Password"
        }
    }
    else{
        //change where this prints
        document.getElementById("messageSpot").innerHTML = "Invalid Username"
    }
}
function newUser() {
    let username = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let confirm = document.getElementById("confirmPassword").value;
    if (!controller.enterUsername(username)) {
    if (password.localeCompare(confirm) == 0) {
        controller.createUser(username, password);
        document.getElementById("userMessage").innerHTML += "You have successfully been registered";
        window.location.replace("userPage.html");
    } else {
        document.getElementById("userMessage").innerHTML += "The passwords you entered do not match";
    }
}
    else{
        document.getElementById("userMessage").innerHTML += "That username already exists";
    }

    //change where this prints

}

function addUserSite(){
    let siteName = document.getElementById("siteName").value;
    let password = document.getElementById("password").value;
    let siteUsername = document.getElementById("siteUsername").value;
    let confirmPassword = document.getElementById("confirmPassword").value;
    let userUsername = localStorage.getItem("currentUsername")
    if (password.localeCompare(confirmPassword) == 0) {
        controller.addUserSite(siteName, siteUsername, password,
            userUsername)
            document.getElementById("siteConfirmation").innerHTML = "Added site"
    }
    else{
        //change where this prints
        document.getElementById("siteConfirmation").innerText = "Passwords Dont Match";
    }
}



function showPassword() {
    let userUsername = localStorage.getItem("currentUsername")
    let siteName = document.getElementById("site").value;
    let info = controller.getInfo(siteName, userUsername);
    siteInfo = JSON.parse(info);
    //change where this prints
    document.getElementById("messageSpot").innerText = "Username: " +siteInfo["username"] + " Password: " +siteInfo["password"];
}


function getUserName(){
    let username = localStorage.getItem("currentUsername");
    document.getElementById("welcomeUser").innerHTML += username;
}

/*
function makeTaylor(){
    controller.createUser("Taylor","password")
    controller.addUserSite("Twitter","tmehmen","password","Taylor")
    controller.addUserSite("Insta","tmehmen","password","Taylor")
    controller.addUserSite("Facebook","tmehmen","password","Taylor")
    let listSites = controller.getUserSites("Taylor")
    document.getElementById("messageSpot").innerHTML = listSites[0]
}
*/
