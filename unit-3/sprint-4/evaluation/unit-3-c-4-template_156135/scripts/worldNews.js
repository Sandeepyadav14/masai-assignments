

let arr=JSON.parse(localStorage.getItem("user"))
console.log(arr)

let container=document.getElementById("slidebar")

let image=document.getElementById("user_image")
image.src=innerHTML=`${arr.img}`
let name=document.getElementById("user_name").innerHTML=`${arr.user_name}`
let email=document.getElementById("user_email").innerHTML=`${arr.user_email}`
let country=document.getElementById("user_country").innerHTML=`${arr.user_country}`

// let api=`https://masai-mock-api.herokuapp.com/news?q={query}`

// document.getElementById("search_box").addEventListener("keydown",searchnews)
   
// let search=(e)=>{
//   if(e.key=="Enter"){
//     let value=document.getElementById("search_box")
  
//      newssearch(value).then((data){
        
    
//      })
  
  
  
  


  