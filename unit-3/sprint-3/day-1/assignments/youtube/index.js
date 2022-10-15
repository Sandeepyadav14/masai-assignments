

async function getdata(){
    let x=document.getElementById("search").value;

    try{
        let res=await fetch(`https://youtube.googleapis.com/youtube/v3/search?&q=${x}&maxResults=20&part=snippet&key=AIzaSyD4FBlPEPRpLXAmXWCNCon5PoRLNJuN34I`)

        let data=await res.json()
        console.log(data.items)
        append(data.items)
    }catch(err){
        console.log(err)
    }

}
// let arr=JSON.parse(localStorage.getItem("u")) ||[]
function append(data){
    let con=document.getElementById("divs")
    con.innerHTML=null

    data.forEach(function(el) {
        let div=document.createElement("div")
        div.addEventListener("click",function(){
            // arr.push(el)
            localStorage.setItem("u",JSON.stringify(el))
            window.location.href="video.html"
        })

        // let iframe=document.createElement("iframe")
        // iframe.src="https://www.youtube.com/embed/"+el.id.videoId
// 
        let img=document.createElement("img")
        img.src=el.snippet.thumbnails.high.url


        let title=document.createElement("p")
        title.innerText=el.snippet.title
        div.append(img,title)
        con.append(div)
    });
}
async function display(){

    try{
      
        let res =await fetch(`https://youtube.googleapis.com/youtube/v3/videos?part=snippet&maxResults=100&chart=mostPopular&locale=India&regionCode=IN&key=AIzaSyD4FBlPEPRpLXAmXWCNCon5PoRLNJuN34I`)
       let data=await res.json();

       append(data.items)
    }catch(err){
        console.log(err)
    }

}
display()