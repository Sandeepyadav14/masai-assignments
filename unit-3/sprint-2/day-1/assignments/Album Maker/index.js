
function getdata(e){
    e.preventDefault()
    
    let url=document.getElementById("image").value
    
    if(url==""){
        alert("Please fill the image input")
    }

    let data=JSON.parse(localStorage.getItem("images")) || []

     data.push(url)

     localStorage.setItem("images",JSON.stringify(data))
     let form=document.getElementById("form")
     form.reset()

}



function sandy(e){
    e.preventDefault()
    let time=document.getElementById("time").value
    console.log(time)

    
    if(time==""){
        alert("Please fill the time input")
    }
   localStorage.setItem("time",JSON.stringify(time))
    
   let form=document.getElementById("forms")
   form.reset()


}










function get(){
    window.location.href="slidshow.html"
}

function url(){
      document.getElementById("container").style.display="block"
}
function time(){
    document.getElementById("time_container").style.display="block"
}