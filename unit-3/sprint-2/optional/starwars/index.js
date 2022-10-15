let id;

async function getdata(){
  document.getElementById("search").style.borderBottom="1px solid white"
  document.getElementById("btn").style.marginTop="9px"
  document.getElementById("child").style.height="350px"
  let x=document.getElementById("search").value
  
//   alert("joi")

  try{
     let res=await fetch(`https://swapi.dev/api/people/?search=${x}`)
     let data=await res.json()
     console.log(data.results)
     append(data.results)
  }catch(error){
    console.log(error)
  }

}

function append(data){
    let con=document.getElementById("data")
      
    data.forEach(function (el){
         
      let div=document.createElement("div")
      div.addEventListener("click",function(){
       localStorage.setItem("data",JSON.stringify(el))
       window.location.href="profile.html"
      })
     
        let name=document.createElement("p")
        name.innerText=el.name
        name.setAttribute("id","name")

        let div1=document.createElement("div")

        let birth=document.createElement("p")
        birth.setAttribute("id","birth")
        birth.innerText=el.birth_year

        let gender=document.createElement("p")
        gender.innerText=el.gender
        gender.setAttribute("id","gender")

        div1.append(name,birth)
        div.append(div1,gender)
        con.append(div)
    });
}
function debouncing(fun,delay){
   

    if(id){
        setInterval(id)
    }
    setTimeout(function(){
        fun()
    },delay)
}