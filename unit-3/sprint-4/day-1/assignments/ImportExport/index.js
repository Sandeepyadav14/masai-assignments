let arr=[]
class User{
    constructor(){
        this.organization='masai';

    }

    #validateUsername(username){
        let value=username.includes('@')?false :true;
        return value;
    }

    #validatePassword(password){
        let value=password.includes('123')?false:true;

        return value
    }
    signUp(username,password){
        console.log(username)
        console.log(password)
        let isValidate=false

        isValidate=this.#validateUsername(username) && this.#validatePassword(password)

        if(isValidate){
            this.username=username
            this.password=password

            console.log("User Register succesfully")
            let x=document.getElementById("gs")
            x.style.display="block"
            x.innerText="User Register succesfully"
            let a=document.getElementById("login_div")

            a.style.display="block"
            document.getElementById("signup_div").style.display="none"
           arr.push(this)
        }else{
            console.log("Please Enter correct details")
            let x=document.getElementById("rs")
            x.style.display="block"
            x.innerText="Please Enter correct det"
        }
    }
    login(username,password){
        console.log(this.username)
        console.log
        if(username==this.username && password==this.password){
            console.log("Log In succesfully")
            // let x=document.getElementById("gs")
            // x.style.display="block"
            // x.innerText="Log In succesfully"
            window.location.href="home.html"
        }
        else{
            console.log("Please enter correct")
            let d=document.getElementById("gs")
            d.style.display="none"
            let x=document.getElementById("rs")
            x.style.display="block"
            x.innerText="Please enter correct"
        }
    }

    
}
let user_data=JSON.parse(localStorage.getItem("user_data"))
let x1=new User()
let users_name=user_data.username
let users_password=user_data.password
x1.signUp(users_name,users_password)

let user_data_log=JSON.parse(localStorage.getItem("user_data_log"))
let x2=new User()
let users_name_log=user_data_log.username
let users_password_log=user_data_log.password
x1.login(users_name_log,users_password_log)



function getdata(){
    let data={
    username:document.getElementById("name").value,
    password:document.getElementById("password").value
    }
    localStorage.setItem("user_data",JSON.stringify(data))
    window.location.reload()
}
function log(){
    
    let data_log={
        username:document.getElementById("log_name").value,
        password:document.getElementById("log_password").value
        }
        localStorage.setItem("user_data_log",JSON.stringify(data_log))
        window.location.reload()
}

