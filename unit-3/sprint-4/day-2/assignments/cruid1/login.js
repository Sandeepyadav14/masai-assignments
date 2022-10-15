

async function login(){
 try{
    let log_data={
       username:document.getElementById("log_username").value,
       password:document.getElementById("log_password").value
    }
     if(log_data.username=="" || log_data.password==""){
       alert("Please Fill the form's input")
     }
    let res= await fetch('https://masai-api-mocker.herokuapp.com/auth/login',{
        method:'POST',
        body:JSON.stringify(log_data),
        headers:{
            'Content-Type':'application/json',

        },
    })
    let data=await res.json()
    console.log(data)
     // let username=log_data.username
    // let token=data.token
    let {username}=log_data
    let {token}=data

    profile(username,token)
   }
   catch(err){
    console.log(err)
    alert("Data not matched")
   }
   
   
}


async function profile(username,token){


    let res=await fetch(`https://masai-api-mocker.herokuapp.com/user/${username}`,{
    
        headers:{
            'Content-Type':'application/json',
            Authorization: `Bearer ${token}`,
        },
    })
    let data=await res.json()
    console.log(data)
    alert("login Successfull")
    localStorage.setItem("user",JSON.stringify(data))
    window.location.href="product.html"
    
}