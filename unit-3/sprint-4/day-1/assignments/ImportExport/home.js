
import navbar from "./componenets/navbar.js"
// console.log(navbar)
document.getElementById("navbar").innerHTML=navbar

import {getdata,append} from "./componenets/fetch&append.js"




document.getElementById("search").addEventListener("input",function(){
    debouncing(sandy,100)
})
    let id;
async function sandy(){
let d=document.getElementById("search").value
let res=await getdata(`https://www.themealdb.com/api/json/v1/1/search.php?s=${d}`)
 res=res.meals
let con=document.getElementById("container")
con.innerHTML=null
    
append(res,con)
    }
    function debouncing(fun,delay){
       if(id){
        setInterval(id)
       }
       id=setTimeout(function(){
        fun()
       },delay)
    }


   const arr=new Array(4).fill([])
   arr[2].push(5)
   console.log(arr)