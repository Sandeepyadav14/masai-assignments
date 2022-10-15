//store the products array in localstorage as "data"

function product(a,b,c,d){
    this.b_name=a;
    this.p_name=b;
    this.p_price=c;
    this.p_image=d;

}
var arr=JSON.parse(localStorage.getItem("data")) || []
console.log(arr)
function myfun(e){
    e.preventDefault();

    let form=document.getElementById("product_form")

    let b_name=form.product_brand.value;
    let p_name=form.product_name.value;
    let p_price=form.product_price.value;
    let p_image=form.product_image.value;

  let x=new product(b_name,p_name,p_price,p_image)
  console.log(x)
    arr.push(x)
    console.log(arr)
localStorage.setItem("data",JSON.stringify(arr))
window.location.reload()

}
document.getElementById("show_products").addEventListener("click",function(){
    window.location.href="inventory.html"
})