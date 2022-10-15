// Implement debouncing for network request
// On clicking book now store the selected movie in localstorage as key "movie"
// so that you can retrive it on checkout.html page

let amount = JSON.parse(localStorage.getItem("amount"));

document.getElementById("wallet").innerHTML=amount

async function getdata(){
    let s=document.getElementById("search").value
    try{
        let res=await fetch(`https://www.omdbapi.com/?apikey=3015d72d&s=${s}`)
        let data=await res.json()
        console.log(data.Search)
        display(data.Search)
    }catch(error){
        console.log(error)
    }
}
let id;
let arr=JSON.parse(localStorage.getItem("movie"))
function display(data){
    let con= document.getElementById("movies")
    con.innerHTML=null

    data.forEach(function (el) {
        let div=document.createElement("div")

        let img=document.createElement("img")
        img.src=el.Poster

        let title=document.createElement("p")
        title.innerText=el.Title

        let btn=document.createElement("button")
        btn.innerText="book now"
        btn.setAttribute("class","book_now")
        btn.addEventListener("click",function(){
        //   arr.push(el)
          localStorage.setItem("movie",JSON.stringify(el))
          window.location.href="checkout.html"
        })

        div.append(img,title,btn)
        con.append(div)
    });
}
function debouncing(fun,delay){

    if(id){
        clearInterval(id)
    }
    id=setTimeout(function(){
        fun()
    },delay)
}