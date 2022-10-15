
function home(){
    window.location.reload();

}


function product(){
    window.location.href="product.html"
}

function Product(a,b,c,d,e,f){
    this.name=a;
    this.category=b;
    this.image=c;
    this.price=d;
    this.gender=e;
    this.sold=f;
}


   let arr=JSON.parse(localStorage.getItem("products")) || []
    console.log(arr)
   function getdata(e){
    e.preventDefault();

     let form =document.getElementById("form")

     let name=form.name.value;
     let category=form.category.value;
     let image=form.image.value;
     let price= form.price.value;
     let gender=form.gender.value;
     let sold=form.sold.value;


     let x=new Product(name,category,image,price,gender,sold)
    //  console.log(x)
       arr.push(x)
     localStorage.setItem("Products",JSON.stringify(arr))
    form.reset()
}