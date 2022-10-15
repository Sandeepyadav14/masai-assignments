

//  https://masai-mock-api.herokuapp.com/hotels/search?city={query}


async function getdata(){
      let value=document.getElementById("query").value
    try{
    let url=`https://masai-mock-api.herokuapp.com/hotels/search?city=${value}`
    
    let res =await fetch(url);
    let data=await res.json();
   console.log(data)
append(data.hotels)

}catch (err){
    console.log(err)
}

  }
  let arr=JSON.parse(localStorage.getItem("set"))
  function append(data){
    console.log(data)
    let cont=document.getElementById("hotels_list")
     data.forEach(function(el){
        let div=  document.createElement("div")
         let img=document.createElement("img")
         img.src=el.Images.one

         let title =document.createElement("h2")
         title.innerText=el.Title

         let price=document.createElement("h2")
         price.innerText=el.Price

         let cat=document.createElement("h2")
         cat.innerText=el.Ac

         let btn=document.createElement("button")
         btn.innerText="Book"
         btn.addEventListener("click",function(){
          book(el)
         })
         
       div.append(img,title,price,cat,btn)
       cont.append(div)
     });
     function book(el){
      arr.push(el)
      localStorage.setItem("set",JSON.stringify(arr))
      alert("Your booking is successful!")
     }
  }