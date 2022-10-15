/*
Save the user to local storage with key "user", in following format:- 
{
name: "",
image: "",
email: "",
country: "" (store country code "in", "ch", "nz", "us", "uk")
}

*/
 function Countries(a,b,c,d){
    this.name=a;
    this.image=b;
    this.email=c;
    this.country=d
 }
  function getdata(){

     let name=document.getElementById("name").value;
     let image=document.getElementById("image").value;
     let email=document.getElementById("email").value;
     let country=document.getElementById("country").value;


     let x= new Countries(name,image,email,country)
     console.log(x)
     localStorage.setItem("user",JSON.stringify(x))
     window.location.reload()
  }
//   name: "",
// image: "",
// email: "",
// country: "" (store country code "in", "ch", "nz", "us", "uk")