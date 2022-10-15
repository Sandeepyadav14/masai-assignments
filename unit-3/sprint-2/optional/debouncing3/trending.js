
display()
async function display(){

    try{
        
        // let res= await fetch(`https://api.themoviedb.org/3/movie/popular?api_key=8272f11b304ba4c8c83fbf3e11d21486&page=1`)
        let res =await fetch(`https://api.themoviedb.org/3/trending/movie/day?api_key=8272f11b304ba4c8c83fbf3e11d21486`)
       let data=await res.json()
       console.log(data.results)
       append(data.results)
    }catch(err){
        console.log(err)
    }

}

function append(data){
    let con =document.getElementById("container")

    data.forEach(function (el){
        console.log(data)
      let div=document.createElement("div")

      let title=document.createElement("p")
      title.innerText=el.title

      let img2=document.createElement("img")
      img2.src="https://image.tmdb.org/t/p/w500"+el.poster_path
      img2.setAttribute("id","foto")
    //   https://image.tmdb.org/t/p/w500/p1F51Lvj3sMopG948F5HsBbl43C.jpg

      div.append(img2,title)
      con.append(div)
    });

}
document.getElementById("logo").addEventListener("click",function(){
    window.location.href="index.html"
})