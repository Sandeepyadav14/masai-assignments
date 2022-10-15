
let id;
let counter=0

let time=JSON.parse(localStorage.getItem("time"))
console.log(time)
function slide(){


    let data=JSON.parse(localStorage.getItem("images"))
    console.log(data)

  
   let div=document.getElementById("container")
   div.innerHTML=null

   let img=document.createElement("img")
   img.src=data[counter]

   div.append(img)
   counter++
  id= setInterval(function(){

    console.log(counter)
      if(counter==data.length){
        counter=0
      }
     img.src=data[counter]

   counter++
    
   },time)
   div.append(img)


}

function stop(){
  console.log(counter)

  clearInterval(id)
}

document.getElementById("number").addEventListener("keypress",function(e){
    if(e.key=="Enter"){
        let number=document.getElementById("number").value
        localStorage.setItem("time",JSON.stringify(number))
        window.location.reload()
        slide()
    
    }
})


function tr(){
    
    let number=document.getElementById("number").value
    if(number==""){
        alert("Please fill the Number input")
    }
    localStorage.setItem("time",JSON.stringify(number))
    window.location.reload()
    
   
}

function home(){
    window.location.href="index.html"
}

let x=document.getElementById("container")
x.addEventListener("click",tree)

   function tree(){
    slide()
   
    
   }



