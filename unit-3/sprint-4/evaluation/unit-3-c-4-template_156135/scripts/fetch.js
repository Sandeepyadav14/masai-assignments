

let newssearch async(value)=>{
    try{
        let res =await fetch(`https://masai-mock-api.herokuapp.com/news?q=${value}`)

        let data = await res
    }
}