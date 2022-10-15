// On clicking remove button the item should be removed from DOM as well as localstorage.
let data=JSON.parse(localStorage.getItem("coffee")) || []
var total=data.reduce(function(count,el){
    return count+Number(el.price)
},0)
document.getElementById("total_amount").innerHTML=total
display(data)
function display(data){
    console.log(data)
    let con=document.getElementById("bucket")

// console.log(count)
    data.forEach(function (el,index){
        let div=document.createElement("div")
        let img=document.createElement("img")
        img.src=el.image
    
        let title=document.createElement("p")
        title.innerText=el.title
        
        let price=document.createElement("p")
        price.innerText=el.price
        
    
        let btn=document.createElement("button")
        btn.innerText="Remove Item"
        btn.setAttribute("id","remove_coffee")
        btn.addEventListener("click",function(){
            // arr.push(el)
            data.splice(index,1)
            localStorage.setItem("coffee",JSON.stringify(data))
            window.location.reload()   
        })
    
        div.append(img,title,price,btn)
        con.append(div)
      });
}
document.getElementById("confirm_checkout").addEventListener("click",function(){
    console.log("hiii")
    window.location.href="checkout.html"
})