// Add the coffee to local storage with key "coffee"

getdata()
async function getdata(){
    try{
        let res= await fetch(`https://masai-api.herokuapp.com/coffee/menu`)

        let data=await res.json()
        append(data.menu.data)
    }catch(error){
        console.log(error)
    }
}
let arr=JSON.parse(localStorage.getItem("coffee")) || []

let x= document.getElementById("coffee_count")
x.innerHTML=arr.length
console.log(arr)
// let count=0
function append(data){
    console.log(data)
  let con=document.getElementById("menu")

  data.forEach(function(el){
    
    let div=document.createElement("div")
    let img=document.createElement("img")
    img.src=el.image

    let title=document.createElement("p")
    title.innerText=el.title
    
    let price=document.createElement("p")
    price.innerText=el.price

    let btn=document.createElement("button")
    btn.innerText="Add To Bucket"
    btn.setAttribute("id","add_to_bucket")
    btn.addEventListener("click",function(){
        arr.push(el)
        localStorage.setItem("coffee",JSON.stringify(arr))
        window.location.href="bucket.html"
    })

    div.append(img,title,price,btn)
    con.append(div)
  });

}
