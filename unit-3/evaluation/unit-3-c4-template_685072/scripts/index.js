// Ude Import export (MANDATORY)
// Onclicking store the news in local storage with key "news" so that you can access that on news.html page
import{navbar} from "../components/navbar.js"
document.getElementById("navbar").innerHTML=navbar()

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

// 
function append(data){
    console.log(data)
   let container= document.getElementById("result")
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
let country=document.getElementById("countries").children
console.log(country)

for(let el of country){
    el.addEventListener("click",search)
};
function search(){
    countries(this.id)
}
let d="in"
countries(d)
async function countries(d){
    try{
        let url=`https://masai-api.herokuapp.com/news/top-headlines?country=${d}`
        let res =await fetch(url)
        let data= await res.json()
        append(data.articles)
    }catch(err){
        console.log(arr)
    }
}
