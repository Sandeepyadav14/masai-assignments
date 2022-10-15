


document.getElementById("add_more_product").addEventListener("click",function(){
    window.location.href="index.html"
})


let data=JSON.parse(localStorage.getItem("products")) || []


data.forEach(function(el,index){
    
let container=document.getElementById("all_products")

let div=document.createElement("div")


let image=document.createElement("img")
image.src=el.image

let type=document.createElement("p")
type.innerText=el.type

let desc=document.createElement("p")
desc.innerText=el.desc

let price=document.createElement("p")
price.innerText=el.price


let remove=document.createElement("button")
remove.innerText="Remove"
remove.setAttribute( "id","remove_product")
remove.addEventListener("click",function(){
  
    data.splice(index,1)
    localStorage.setItem("products",JSON.stringify(data))
    window.location.reload()


})

div.append(image,type,desc,price,remove)
container.append(div)


});
