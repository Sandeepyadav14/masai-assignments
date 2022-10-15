//store the products array in localstorage as "products"

function Sandy(a,b,c,d){
    this.type=a;
    this.desc=b;
    this.price=c;
    this.image=d;

}


let arr=JSON.parse(localStorage.getItem("products")) || []
console.log(arr)
function getdata(e){
    e.preventDefault();

    let form=document.getElementById("products")


    let type=form.type.value;
    let desc=form.desc.value;
    let price=form.price.value;
    let image=form.image.value;

    let x=new Sandy(type,desc,price,image)

     arr.push(x)
    localStorage.setItem("products",JSON.stringify(arr))
    form.reset()
}

document.getElementById("show_products").addEventListener("click",function(){
    window.location.href="inventory.html"
})