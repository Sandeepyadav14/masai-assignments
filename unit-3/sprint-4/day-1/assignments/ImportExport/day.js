
import navbar from "./componenets/navbar.js"
// console.log(navbar)
document.getElementById("navbar").innerHTML=navbar

import {getdata,append} from "./componenets/fetch&append.js"

let res=await getdata(`https://www.themealdb.com/api/json/v1/1/random.php`)
console.log(res.meals)
res=res.meals

let con=document.getElementById("container")
append(res,con)