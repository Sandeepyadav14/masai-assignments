function signup(a,b,c){
    this.name=a;
    this.email=b;
    this.password=c;
}


function submitfun(e){
     e.preventDefault()
     let form=document.getElementById("formid")

     let name=form.name.value;
     let email=form.email.value;
     let password=form.password.value;



     let x=new signup(name,email,password)
     

     let arr=JSON.parse(localStorage.getItem("users")) || []

     arr.push(x)
     
     localStorage.setItem("users",JSON.stringify(arr))
}