

let arr=JSON.parse(localStorage.getItem("data"))
console.log(arr)
displaydata(arr)

function displaydata(arr){

    let con1=document.getElementById("div1")
    let con2=document.getElementById("div2")


        let head=document.getElementById("n").innerHTML=arr.name
        let div=document.createElement("div")

        let birth=document.createElement("p")
        birth.innerText="Birth Year : "+arr.birth_year

        let gender=document.createElement("p")
        gender.innerText="Gender : "+arr.gender

        let height=document.createElement("p")
        height.innerText="Height : "+arr.height

        let eye_color=document.createElement("p")
        eye_color.innerText="Eye Color : "+arr.eye_color

        let mass=document.createElement("p")
        mass.innerText="Mass : "+arr.mass

        let hair=document.createElement("p")
        hair.innerText="Hair Color : "+arr.hair_color

       con1.append(birth,gender,height)
       con2.append(eye_color,mass,hair)



        
}
document.querySelector("button").addEventListener("click",function(){
    window.location.href="index.html"
})

