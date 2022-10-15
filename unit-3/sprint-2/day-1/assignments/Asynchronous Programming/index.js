

// name, release date, poster (add url of a poster), IMDb rating,

let movieobj=[
    {
        name:"R.Rajkumar",
        release_date:"6 December 2013",
        IMDb:5.2,
        poster:"https://wallpapercave.com/dwp1x/wp8033253.jpg"
    },

    {
        name:"Bachchan Pandey",
        release_date:"18 March 2022",
        IMDb:5.5,
        poster:"https://wallpapercave.com/dwp1x/wp10388577.jpg"
    },

    {
        name:"Ek Villain Returns",
        release_date:"29 July 2022",
        IMDb:6.9,
        poster:"https://wallpapercave.com/dwp1x/wp11310406.jpg"
    },

    {
        name:"Laagan",
        release_date:"15 June 2001",
        IMDb:8.1,
        poster:"https://c4.wallpaperflare.com/wallpaper/605/744/965/adventure-bollywood-drama-india-wallpaper-preview.jpg"
    },

    {
        name:"Mission Mangal",
        release_date:"15 August 2019",
        IMDb:6.5,
        poster:"https://i0.wp.com/www.socialnews.xyz/wp-content/uploads/2019/07/04/Mission-Mangal-Movie-First-Look-Poster-.jpg?w=773&h=773&crop=1&quality=80&zoom=1&ssl=1"
    },

    {
        name:"Brother",
        release_date:"14 August 2015",
        IMDb:6.4,
        poster:"https://wallpapercave.com/wp/wp8154132.jpg"
    },

    {
        name:"Pushpa",
        release_date:"17 December 2021",
        IMDb:7.6,
        poster:"https://wallpapercave.com/dwp1x/wp8356149.jpg"
    },


    {
        name:"RRR",
        release_date:"25 March 2022",
        IMDb:8.0,
        poster:"https://wallpapercave.com/dwp1x/wp10944769.jpg"
    },
     
    {
        name:"KGF-2",
        release_date: "14 April 2022",
        IMDb:8.4,
        poster:"https://wallpapercave.com/wp/wp8753869.jpg"
    },


]

let data=JSON.parse(localStorage.getItem("movies"))


  localStorage.setItem("movies",JSON.stringify(movieobj))

data.forEach(function (el){
    let container=document.getElementById("container")

    let div=document.createElement("div")
    
     let name=document.createElement("p")
     name.innerText=el.name
     name.style.cursor="pointer"
     

     let release_date=document.createElement("p")
     release_date.innerText=el.release_date

     let IMDb=document.createElement("p")
     IMDb.innerText=el.IMDb
     IMDb.style.color="red"
     IMDb.style.marginBottom="10px"

     let poster=document.createElement("img")
     poster.src=el.poster

     div.append(poster,name,release_date,IMDb)
     container.append(div)

});