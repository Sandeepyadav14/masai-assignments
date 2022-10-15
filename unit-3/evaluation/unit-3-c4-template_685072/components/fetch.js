

document.getElementById("search_input").addEventListener("keydown",keydown)
function keydown(event){
  if(event.key=="Enter"){
   event.preventDefault();

   async function getdata(query){
    // let query=document.getElementById("search_input").value
    try{
    let  url=`https://masai-api.herokuapp.com/news?q=${query}`
      let res=  await fetch(url)
      let data= await res.json()
    //   console.log(data)
      return(data.articles)
    }catch(err){
      console.log(err)
    }

   }
//    getdata()
  }
  
}
// export{keydown}










function append(data,container){
    console.log(data)
   let container= document.getElementById("result")
   container.innerHTML=null

    data.forEach(function(el){
        let div=document.createElement("div")
        div.setAttribute("id","news")
  let img=document.createElement("img")
    img.src=el.urlToImage
    
  
    let div1=document.createElement("div")

    let title=document.createElement("h4")
    title.innerText=el.title
    title.setAttribute("id","title")

    let description=document.createElement("p")
    description.innerText=el.description
    description.setAttribute("id","description")
    div1.append(title,description)
    div.append(img,div1)
    container.append(div)

    });



}
export {getdata,append}