
let data=JSON.parse(localStorage.getItem("studentdata")) 
console.log(data)

display(data)

function display(data){

    let con =document.getElementById("container")

    data.forEach(function(el,index){
        let div=document.createElement("div")

        
        let img=document.createElement("img")
        img.src=el.image

        let name=document.createElement("p")
        name.innerText=el.name
        name.setAttribute("id","name")

        let course=document.createElement("p")
        course.innerText=el.course
        course.setAttribute("id","course")

        let unit=document.createElement("p")
        unit.innerText=el.unit
        unit.setAttribute("id","unit")
        
        let batch=document.createElement("p")
        batch.innerText=el.batch
        batch.setAttribute("id","batch")


        let button=document.createElement("button")
        button.innerText="Remove"
        button.setAttribute("id","button")
        button.addEventListener("click",function(){

            data.splice(index,1)
            localStorage.setItem("studentdata",JSON.stringify(data))
            window.location.reload()
        })
        
        div.append(img,name,course,unit,batch,button)
        con.append(div)
    });
}

function count(){
    let data=JSON.parse(localStorage.getItem("studentdata"))|| [];
    let obj=[];
console.log(data);
    for(let i=0;i<data.length;i++)
    {
      if(!obj[data[i].batch])
      {
        obj[data[i].batch]=0;
      }
    }
    for(let i=0;i<data.length;i++)
    {
        obj[data[i].batch]++;
    }
    for(let key in obj)
    {
      let div=document.createElement("div")

      let list=document.createElement("li")
      list.innerText=key+":"+obj[key];

      div.append(list);
      document.getElementById("batchCount").append(div)
    }
    // console.log(obj);
}
count()
