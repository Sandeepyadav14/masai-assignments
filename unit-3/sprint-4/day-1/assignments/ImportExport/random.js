
import navbar from "./componenets/navbar.js"
// console.log(navbar)
document.getElementById("navbar").innerHTML=navbar

import {getdata,append} from "./componenets/fetch&append.js"

let res=await getdata(`https://www.themealdb.com/api/json/v1/1/random.php`)
res=res.meals
console.log(res)
let con=document.getElementById("container")
con.innerHTML=null
// getdata(res)
append(res,container)