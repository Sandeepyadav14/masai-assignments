
 import  sidebar  from "../components/sidebar.js"

 document.getElementById("sidebar").innerHTML=sidebar

function userdata(){
    let data=JSON.parse(localStorage.getItem("user"))
    let x=data.country
    getdata(x)
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


document.getElementById("search").addEventListener("keypress",function(e){
    if(e.key=="Enter"){
    
       sandy()
     
      
    }
})

async function sandy(){
    let a=document.getElementById("search").value
    try{
        let res=await  fetch(`https://masai-mock-api-2.herokuapp.com/news?q=${a}`)
        let data=await res.json()
        console.log(data.articles)
        displaydata(data.articles)
    }catch(error){
    console.log(error)
    }
  }

  async function getdata(x){
     
    try{
        let res=await  fetch(`https://masai-mock-api-2.herokuapp.com/news/top-headlines?country=${x}`)
        let data=await res.json()
        console.log(data.articles)
        displaydata(data.articles)
    }catch(error){
    console.log(error)
    }
  }
   function displaydata(data){
    let con=document.getElementById("news_container")
    con.innerHTML=null
       data.forEach(function(el){
         let div=document.createElement("div")
         div.setAttribute("class","news")
         div.addEventListener("click",function(){
            localStorage.setItem("news",JSON.stringify(el))
            window.location.href="news.html"
         })

         let title=document.createElement("p")
         title.innerText=el.title

         let author=document.createElement("p")
         author.innerText=el.author

         let img=document.createElement("img")
         img.src=el.urlToImage
           let div1  =document.createElement("div")
               div1.append(title,author)
        div.append(img,div1)
         con.append(div)
       });
   }

   let c=document.getElementById("count").children
   for(var el of c){
    el.addEventListener("click",search)
   }
   function search(){
    getdata(this.id)
   }
