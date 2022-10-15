 
let url=`https://grocery-masai.herokuapp.com/items`

async function setdata(){
    try{
        let res=await fetch(url)

        let user=await res.json();
        console.log(user.data)
        append(user.data)
    }
    catch(err){
        console.log(err)
    }
}
setdata()
  
function append(data){
    let arr=JSON.parse(localStorage.getItem("cart_items")) || []
    console.log(arr)
   let container= document.getElementById("groceries")
//    console.log(arr)
    data.forEach(function (el) {
        let div= document.createElement("div")

         let img=document.createElement("img")
         img.src=el.image

         let name=document.createElement("h3")
         name.innerText=el.name

         let price=document.createElement("h3")
         price.innerText=el.price
         

         let cart=document.createElement("button")
         cart.innerText="Add to Cart"
         cart.addEventListener("click",function(){
            addtocart(el)
         })

         div.append(img,name,price,cart)
        container.append(div)
        });



        function  addtocart(el){
          let sum=  document.getElementById("wallet").innerHTML
          let count=+sum
        //   console.log(count)
          
          var x=count-el.price
          
          if(el.price>x){
            console.log(x)
            console.log(el.price)
            document.getElementById("wallet").innerHTML=x

          }
          
            arr.push(el)
            // console.log(arr)
            localStorage.setItem("cart_items",JSON.stringify(arr))
            
        }

        
}