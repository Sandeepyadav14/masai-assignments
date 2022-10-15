let sum=JSON.parse(localStorage.getItem("cart_items")) || []
  console.log(sum)
sandy(sum)
function sandy(sum){
    let con=document.getElementById("cart")
    var count=0
   sum.forEach(function(el ,index) {
         console.log(sum)
    let div= document.createElement("div")

    let img=document.createElement("img")
    img.src=el.image

    let name=document.createElement("h3")
    name.innerText=el.name

    let price=document.createElement("h3")
    price.innerText=el.price
    count+=el.price
    document.getElementById("cart_total").innerHTML=count
    console.log(count)

    let cart=document.createElement("button")
    cart.innerText="Remove"
    cart.addEventListener("click",function(){
       remove(el , index)
    })

    div.append(img,name,price,cart)
   con.append(div)
   });

   function remove(el ,index){
      sum.splice(index,1)

      localStorage.setItem("cart_items",JSON.stringify(sum))
      window.location.reload()
   }
}
