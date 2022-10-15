/*
Save the user to local storage with key "user", in following format:- 
{
name: "",
image: "",
email: "",
country: "" (store country code "in", "ch", "nz", "us", "uk")
}
*/
function userdata(a,b,c,d){
    this.user_pic=a
    this.user_name=b
    this.user_email=c
    this.user_country=d
}
// let arr=JSON.parse(localStorage.getItem("user")) || []
  function datafun(e){
    e.preventDefault();

       let form=document.getElementById("from")

       let img=form.user_pic.value;
       let name=form.user_name.value;
       let email=form.user_email.value;
       let country=form.user_country.value;

       let person= new userdata(img,name,email,country)
    console.log(person)
       localStorage.setItem("user",JSON.stringify(person))
  }