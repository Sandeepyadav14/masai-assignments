import  sidebar  from "../components/sidebar.js"

 document.getElementById("sidebar").innerHTML=sidebar

 function userdata(){
    let data=JSON.parse(localStorage.getItem("user"))
    let x=data.country
    // getdata(x)
   let con=document.getElementById("sidebar")
    let div =document.createElement("div")
    let image=document.getElementById("image")
    image.src=data.image
    
    let name=document.getElementById("name")
    name.innerText=data.name

    let email=document.getElementById("email")
    email.innerText=data.email

    let country=document.getElementById("country")
    if(data.country=="in"){
        country.innerText="India"
    }
    if(data.country=="ch"){
        country.innerText="China"
    }
    if(data.country=="us"){
        country.innerText="USA"
    }
    if(data.country=="uk"){
        country.innerText="UK"
    }
    if(data.country=="nz"){
        country.innerText="New Zealand"
    }
    div.append(image,name,email,country)
    
   con.append(div)
    
}
userdata()

let data=JSON.parse(localStorage.getItem("news"))

console.log(data)
let con=document.getElementById("show_news")

let div=document.createElement("div")
 
let img=document.createElement("img")
img.src=data.urlToImage

let title=document.createElement("h3")
title.innerText=data.title

let desc=document.createElement("h4")
desc.innerText=data.description

div.append(img,title,desc)
con.append(div)