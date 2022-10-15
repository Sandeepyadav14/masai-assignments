
let datas=JSON.parse(localStorage.getItem("data"))
console.log(datas)
display(datas)

function display(datas){

  let container = document.getElementById("products")

  datas.forEach(function(el,index){
       
    let div=document.createElement("div")
    let div2=document.createElement("div")

    let image=document.createElement("img")
    image.src=el.image

    let name=document.createElement("p")
    name.innerText=el.name

    let cat=document.createElement("p")
    cat.innerText=el.category

    let price=document.createElement("p")
    price.innerText=el.price

    let soldtext=document.createElement("p")
    soldtext.innerText=el.sold
    soldtext.setAttribute("id","out")
    
    

    let sold=document.createElement("button")
    sold.innerText="Sold"
    sold.addEventListener("click",function(){
      if(soldtext.innerHTML=="false"){
        soldtext.innerHTML="true"
        sold.style.background="red"
      }
      else if(soldtext.innerHTML=="true"){
        soldtext.innerHTML="false"
        sold.style.background="green"
      }
    })

    let remove=document.createElement("button")
    remove.innerText="Remove"
    remove.addEventListener("click",function(){
       datas.splice(index,1)
       localStorage.setItem("data",JSON.stringify(datas))
       window.location.reload()
    })
    div2.append(remove,sold)
   div.append(image,name,cat,price,soldtext,div2)
   
   container.append(div)
  });
}

document.getElementById("home").addEventListener("click",function(){
  window.location.href="index.html"
})