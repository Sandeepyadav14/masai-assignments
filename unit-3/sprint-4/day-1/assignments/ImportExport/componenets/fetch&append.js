
 async function getdata(url){
   try{

   let res=await fetch(url)
   let data=await res.json();
   return data

   }
   catch(error){
    console.log(error)
   }
 }

 function append(data,container){
    
    data.forEach(el => {
         let div=document.createElement("div")
         let image=document.createElement("img")
         image.src=el.strMealThumb
         
         let title=document.createElement("p")
         title.innerText=el.strMeal

         div.append(image,title)
         container.append(div)

    });
   
   
}
 export{getdata,append}

