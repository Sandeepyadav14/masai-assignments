// Ude Import export (MANDATORY)
import{navbar} from "../components/navbar.js"
document.getElementById("navbar").innerHTML=navbar()
let a=JSON.parse(localStorage.getItem("news"))
console.log(a)
let container=document.getElementById("detailed_news")


let div=document.createElement("div")
div.setAttribute("id","news")
let img=document.createElement("img")
img.src=a.urlToImage

let content=document.createElement("p")
content.innerText=a.content


let title=document.createElement("h3")
title.innerText=a.title

div.append(img,title,content)
container.append(div)






document.getElementById("search_input").addEventListener("keydown",keydown)
function keydown(event){
  if(event.key=="Enter"){
   event.preventDefault();

   async function getdata(){
    let query=document.getElementById("search_input").value
    try{
    let  url=`https://masai-api.herokuapp.com/news?q=${query}`
      let res=  await fetch(url)
      let data= await res.json()
    //   console.log(data)
      append(data.articles)
    }catch(err){
      console.log(err)
    }

   }
   getdata()
  }
  
}
function append(data){
    console.log(data)
   let container= document.getElementById("detailed_news")
   container.innerHTML=null

    data.forEach(function(el){
        let div=document.createElement("div")
        div.setAttribute("id","news")
  let img=document.createElement("img")
    img.src=el.urlToImage
    
    let content=document.createElement("h3")
    content.innerText=el.content
    content.style.display="none"
  
    let div1=document.createElement("div")

    let title=document.createElement("h3")
    title.innerText=el.title
    title.setAttribute("id","title")
    title.addEventListener("click",function(){
        store(el)
    })

    let description=document.createElement("p")
    description.innerText=el.description
    description.setAttribute("id","description")
    div1.append(title,description)
    div.append(img,div1)
    container.append(div)

    });

function store(el){
   console.log(el)
    localStorage.setItem("news",JSON.stringify(el))
    window.location.href="news.html"
    console.log("hii")

}
}