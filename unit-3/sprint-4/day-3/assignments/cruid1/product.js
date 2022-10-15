

async function getdata(){

    try{
        let res=await fetch(` http://localhost:3000/data`)
        let data=await res.json()
        console.log(data)
        append(data)
    }
    catch(error){
        console.log(error)
    }
}
getdata()

let id;
let arr=JSON.parse(localStorage.getItem("product")) || []
if(arr.length>9){
    document.getElementById("p").innerHTML=arr.length
}else{
  let a=document.getElementById("p")
  a.innerHTML="0"+arr.length
}

function append(data){

    let con=document.getElementById("con")
    con.innerHTML=null

    data.forEach(el => {
        let div=document.createElement("div")

        let img=document.createElement("img")
        img.src=el.image
        

        let title=document.createElement("p")
        title.innerText=el.title

        let div1=document.createElement("div")
        
        let span =document.createElement("p")
        span.innerText="₹"
        span.setAttribute("id","rupee")
        let price=document.createElement("p")
        price.innerText=el.price
        price.setAttribute("id","price")

        let btn=document.createElement("button")
        btn.innerText="Add To Cart"
        btn.setAttribute("id","btn")
        btn.addEventListener("click",function(){
            arr.push(el)
           localStorage.setItem("product",JSON.stringify(arr))
           window.location.reload()
        })
        div1.append(span,price)
         div.append(img,title,div1,btn)
         con.append(div)
    });
}
async function listdata(a){
    let query=document.getElementById("search").value

    try{
        let res= await fetch(`http://localhost:3000/list/?q=${query}`)
        let data= await res.json()
        append(data)
    }catch(error){
        console.log(error)
    }
}
async function data(x){
    try{
        let res= await fetch(`http://localhost:3000/list/?q=${x}`)
        let data= await res.json()
        append(data)
    }catch(error){
        console.log(error)
    }
}

let shirt=document.getElementById("shirt")
shirt.addEventListener("click",function(){
   let x=shirt.innerHTML
   data(x)
})

let tshirt=document.getElementById("tshirt")
tshirt.addEventListener("click",function(){
   let x=tshirt.innerHTML
   data(x)
})

let shoes=document.getElementById("shoes")
shoes.addEventListener("click",function(){
   let x=shoes.innerHTML
   data(x)
})
let saree=document.getElementById("saree")
saree.addEventListener("click",function(){
   let x=saree.innerHTML
   data(x)
})
let datas=JSON.parse(localStorage.getItem("user"))
document.getElementById("a").innerHTML=datas.username