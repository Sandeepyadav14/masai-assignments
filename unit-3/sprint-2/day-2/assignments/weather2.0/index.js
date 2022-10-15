async function getdata(){
    let query=document.getElementById("query").value;
    // let city=document.getElementById("city")
    // city.innerText=query

    try{
        //  let res=await fetch(`https://api.openweathermap.org/data/2.5/forecast?q=${query}&units=metric&appid=32ba0bfed592484379e51106cef3f204`)
         let res=await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${query}&units=metric&appid=32ba0bfed592484379e51106cef3f204`)
         let data =await res.json();
         console.log(data)
         append(data)
    }catch(err){
        console.log(err)
    }
}

function append(data){
   
  let con=document.getElementById("sandy")
  con.innerHTML=null
    
    let div=document.createElement("div")

    let name=document.createElement("h2")
    name.innerText=data.name
    console.log(data.name)
    let temp=document.createElement("p")
    temp.innerText="Temprature : "+data.main.temp+"° C"

    let min_temp=document.createElement("p")
    min_temp.innerText="Min Temrature : "+data.main.temp_min+"° C"

    let max_temp=document.createElement("p")
    max_temp.innerText="Max Temprature : "+data.main.temp_max+"° C"

    let cloud=document.createElement("p")
    cloud.innerText="Cloud : "+data.weather[0].description

    let icon=document.createElement("img")
    icon.src=`http://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png`

    div.append(name,temp,min_temp,max_temp,cloud,icon)
    con.append(div)    


    let url=(`https://maps.google.com/maps?q=${data.name}&t=&z=13&ie=UTF8&iwloc=&output=embed`)

    let iframe=document.getElementById("gmap_canvas")
    iframe.src=url

}

function getLocation() {
    navigator.geolocation.getCurrentPosition(success);
  
    function success(pos) {
      const crd = pos.coords;
  
      console.log("Your current position is:");
      console.log(`Latitude : ${crd.latitude}`);
      console.log(`Longitude: ${crd.longitude}`);
      console.log(`More or less ${crd.accuracy} meters.`);
      getWeatherOnLocation(crd.latitude, crd.longitude);
    }
  }
getLocation()


  function getWeatherOnLocation(lat, lon) {
    let url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&units=metric&appid=32ba0bfed592484379e51106cef3f204`;
  
    fetch(url)
      .then(function (res) {
        return res.json();
      })
      .then(function (res) {
        console.log(res);
        append(res);
      })
      .catch(function (err) {
        console.log(err);
      });
  }