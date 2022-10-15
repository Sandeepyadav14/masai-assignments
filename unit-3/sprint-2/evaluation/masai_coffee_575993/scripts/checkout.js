

function Checkout(a,b,c){
    this.name=a;
    this.number=b;
    this.address=c;
}
function getdata(e){
    e.preventDefault()
    let form=document.getElementById("form")

    let name=form.name.value
    let number=form.number.value
    let address=form.address.value

   if(name=="" || number=="" || address==""){
    alert("Please fill the form")
   }
   else{
    let x=new Checkout(name,number,address)
    setTimeout(function(){
        alert("Your order is accepted ")
    },0)
    setTimeout(function(){
        alert(" Your order is being Prepared ")
    },3000)
    setTimeout(function(){
        alert("Your order is being packed ")
    },8000)
    setTimeout(function(){
        alert("Your order is out for delivery ")
    },10000)
    setTimeout(function(){
        alert("Order delivered")
    },12000)
   }

   
    

}
