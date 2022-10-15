

 function login(){

 
 var emails=document.getElementById("email").value
 var passwords=document.getElementById("password").value
 var arr=JSON.parse(localStorage.getItem("users")) || []
 event.preventDefault();
 var newobj=true
 var login=false

 newobj=arr.filter(function(value){
    if(value.email==emails && value.password==passwords){
        login=true
    }
    if(value.password!=passwords && value.email!=emails){
        login= false
    }
 })
 if(login==true){
    alert("Login successful!" )
 }else{
    alert("User doesn't exist, Sign Up" )
 }
}