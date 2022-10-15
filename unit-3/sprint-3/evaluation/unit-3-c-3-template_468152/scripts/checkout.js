// Each ticket will cost 100 Rupees
// If wallet amount is insufficient show alert "Insufficient Balance!";
// Else show "Booking successfull!" and adjust the wallet amount in real time
let amount = JSON.parse(localStorage.getItem("amount"));
amount=+amount
document.getElementById("wallet").innerHTML=amount

function Status(a,b){
    this.name=a
    this.number=b
}
function getdata(e){
    e.preventDefault()
    let form=document.getElementById("form")

    let user=form.user_name.value
    let seat=form.number_of_seats.value

    seat = +seat;
    let total = seat*100;
    if(total>amount){
      alert("Insufficient Balance!")
    }
    else{
        alert("Booking successful!");
        let newAmount = amount - total;
        localStorage.setItem("amount",JSON.stringify(newAmount));
        location.reload();
    }
}

let arr=JSON.parse(localStorage.getItem("movie"))
console.log(arr)
let con=document.getElementById("movie")

let div=document.createElement("div")

let title=document.createElement("p")
title.innerText=arr.Title

let img=document.createElement("img")
img.src=arr.Poster

div.append(title,img)
con.append(div)


// Poster: "https://m.media-amazon.com/images/M/MV5BMjMyNDkzMzI1OF5BMl5BanBnXkFtZTgwODcxODg5MjI@._V1_SX300.jpg"
// Title: "Thor: Ragnarok"
// Type: "movie"
// Year: "2017"
// imdbID: "tt3501632"
