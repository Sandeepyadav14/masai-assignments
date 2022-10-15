

 async function register(){
   
    let register_data={
         name:document.getElementById("name").value,
         email:document.getElementById("email").value,
         password:document.getElementById("password").value,
         username:document.getElementById("username").value,
         mobile:document.getElementById("mobile").value,
         description:document.getElementById("desc").value
    }
    if(register_data.name=="" || register_data.email=="" || register_data.password=="" || register_data.username=="" || register_data.mobile=="" || register_data.description==""){
      alert("Please Fill the all form's input")
    }else{
 
      let res=await fetch('https://masai-api-mocker.herokuapp.com/auth/register',{
        method:'POST',
        
        body:JSON.stringify(register_data),

        headers:{
            'Content-Type':'application/json',

        },
        
       })
        let data=await res.json();
          console.log(data)
       if(data.message== 'Registration failed, user already exists'){
        alert("Registration failed, user already exists")
       }else{
        window.location.href="login.html"
       }
      }
    
}

