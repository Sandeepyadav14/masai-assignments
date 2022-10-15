
let data=JSON.parse(localStorage.getItem("products"))
console.log(data)
append(data)

function append(data){

  let container = document.getElementById("products")

  data.forEach(function(el){
       
    let div=document.getElementById("div")

    let image=document.createElement("img")
    image.src=el.image

    let name=document.createElement("p")
    name.innerText=el.name

    let category=document.getElementById("p")
    category.innerText=el.category
    
    let price=document.createElement("p")
    price.innerText=el.price

    let sold=document.createElement("button")
    sold.innerText="Sold"

    let remove=document.createElement("burron")
    remove.innerText="Remove"

   div.append(image,name,category,price,sold,remove)
   container.append(div)
  });
}