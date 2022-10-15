
// console.log(arr)
// console.log(arr)
var arr=JSON.parse(localStorage.getItem("data")) || []
displaydata(arr)
function displaydata(arr){
     let container=document.getElementById("products_data")
    // console.log(data)
    arr.forEach(function(el,index){
        console.log(products_data)

    let div=document.createElement("div")

    let img=document.createElement("img")
    img.src=el.p_image

    let brand=document.createElement("p")
    brand.innerText=el.b_name

    let type=document.createElement("p")
    type.innerText=el.p_name

    let price=document.createElement("p")
    price.innerText=el.p_price
    // console.log(img,brand,type,price)


    let button=document.createElement("button")
    button.innerText="Remove"
    button.setAttribute("id","remove_product")
    button.addEventListener("click",function(){
        remove(el,index)
    })
    div.append(img,brand,type,price,button)
container.append(div)   
    });
    
}
// append()



function remove(el,index){
    arr.splice(index,1)
    localStorage.setItem("data",JSON.stringify(arr))
    // windows.location.reload()
    window.location.reload()
}
document.getElementById("add_product").addEventListener("click",function(){
    window.location.href="index.html"
})