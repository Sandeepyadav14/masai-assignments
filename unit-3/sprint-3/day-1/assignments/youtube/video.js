
let arr=JSON.parse(localStorage.getItem("u")) 
display(arr)
function display(arr){
  console.log(arr)
    let con=document.getElementById("con")

    
        
        let div=document.createElement("div")

        let video=document.createElement("iframe")
        video.src="https://www.youtube.com/embed/"+arr.id.videoId

        div.append(video)
        con.append(div)
    
}
document.getElementById("home").addEventListener("click",function(){
    window.location.href="index.html"
})