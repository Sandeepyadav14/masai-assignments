getdata()
async function getdata(){
   try{
      let res=await fetch(`https://www.themealdb.com/api/json/v1/1/random.php`)
      
      let data=await res.json()
      console.log(data)
      append(data.meals)
   }catch(err){
    console.log(err)
   }
}
function append(data){
    let con=document.getElementById("con")

    data.forEach(el => {
        let div=document.createElement("div")
         div.setAttribute("id","tr")
        let title=document.createElement("p")
        title.innerText=el.strMeal
        
        let image=document.createElement("img")
        image.src=el.strMealThumb
         
        let desc=document.createElement("p")
        desc.innerText=el.strInstructions
        desc.setAttribute("id","desc")

        let  cat=document.createElement("h2")
        cat.innerText=`Food Category: ${el.strCategory}`
        let divcl=document.createElement("div")
        divcl.setAttribute("id","cl")
        let loc=document.createElement("h2")
        loc.innerText=`Food Place: ${el.strArea}`
        loc.setAttribute("id","f")
       
        let sdiv=document.createElement("div")
        sdiv.setAttribute("id","x")
        let s1=document.createElement("p")
        if(el.strIngredient1==null || el.strIngredient1==null){
            el.strIngredient1==""
        }else if(el.strIngredient1=="" || el.strIngredient1==""){
            el.strIngredient1==""
            
        }else{
            s1.innerText=`${el.strIngredient1} : ${el.strMeasure1}`
        }
        

        let s2=document.createElement("p")
        if(el.strIngredient2==null || el.strIngredient2==null){
            el.strIngredient2==""
        }else if(el.strIngredient2=="" || el.strIngredient2==""){
            el.strIngredient2==""
            
        }else{
            s2.innerText=`${el.strIngredient2} : ${el.strMeasure2}`
        }


        let s3=document.createElement("p")
        if(el.strIngredient3==null || el.strIngredient3==null){
            el.strIngredient3==""
        }else if(el.strIngredient3=="" || el.strIngredient3==""){
            el.strIngredient3==""
            
        }else{
            s3.innerText=`${el.strIngredient3} : ${el.strMeasure3}`
        }


        let s4=document.createElement("p")
        if(el.strIngredient4==null || el.strIngredient4==null){
            el.strIngredient4==""
        }else if(el.strIngredient4=="" || el.strIngredient4==""){
            el.strIngredient4==""
            
        }else{
            s4.innerText=`${el.strIngredient4} : ${el.strMeasure4}`
        }


        let s5=document.createElement("p")
        if(el.strIngredient5==null || el.strIngredient5==null){
            el.strIngredient5==""
        }else if(el.strIngredient5=="" || el.strIngredient5==""){
            el.strIngredient5==""
            
        }else{
            s5.innerText=`${el.strIngredient5} : ${el.strMeasure5}`
        }


        let s6=document.createElement("p")
        if(el.strIngredient6==null || el.strIngredient6==null){
            el.strIngredient6==""
        }else if(el.strIngredient6=="" || el.strIngredient6==""){
            el.strIngredient6==""
            
        }else{
            s6.innerText=`${el.strIngredient6} : ${el.strMeasure6}`
        }


        let s7=document.createElement("p")
        if(el.strIngredient7==null || el.strIngredient7==null){
            el.strIngredient7==""
        }else if(el.strIngredient7=="" || el.strIngredient7==""){
            el.strIngredient7==""
            
        }else{
            s7.innerText=`${el.strIngredient7} : ${el.strMeasure7}`
        }


        let s8=document.createElement("p")
        if(el.strIngredient8==null || el.strIngredient8==null){
            el.strIngredient8==""
        }else if(el.strIngredient8=="" || el.strIngredient8==""){
            el.strIngredient8==""
            
        }else{
            s8.innerText=`${el.strIngredient8} : ${el.strMeasure8}`
        }


        let s9=document.createElement("p")
        if(el.strIngredient9==null || el.strIngredient9==null){
            el.strIngredient9==""
        }else if(el.strIngredient9=="" || el.strIngredient9==""){
            el.strIngredient9==""
            
        }else{
            s9.innerText=`${el.strIngredient9} : ${el.strMeasure9}`
        }


        let s10=document.createElement("p")
        if(el.strIngredient10==null || el.strIngredient10==null){
            el.strIngredient10==""
        }else if(el.strIngredient10=="" || el.strIngredient10==""){
            el.strIngredient10==""
            
        }else{
            s10.innerText=`${el.strIngredient10} : ${el.strMeasure10}`
        }


        let s11=document.createElement("p")
        if(el.strIngredient11==null || el.strIngredient11==null){
            el.strIngredient11==""
        }else if(el.strIngredient11=="" || el.strIngredient11==""){
            el.strIngredient11==""
            
        }else{
            s11.innerText=`${el.strIngredient11} : ${el.strMeasure11}`
        }


        let s12=document.createElement("p")
        if(el.strIngredient12==null || el.strIngredient12==null){
            el.strIngredient12==""
        }else if(el.strIngredient12=="" || el.strIngredient12==""){
            el.strIngredient12==""
            
        }else{
            s12.innerText=`${el.strIngredient12} : ${el.strMeasure12}`
        }


        let s13=document.createElement("p")
        if(el.strIngredient13==null || el.strIngredient13==null){
            el.strIngredient13==""
        }else if(el.strIngredient13=="" || el.strIngredient13==""){
            el.strIngredient13==""
            
        }else{
            s13.innerText=`${el.strIngredient13} : ${el.strMeasure13}`
        }



        let s14=document.createElement("p")
        if(el.strIngredient14==null || el.strIngredient14==null){
            el.strIngredient14==""
        }else if(el.strIngredient14=="" || el.strIngredient14==""){
            el.strIngredient14==""
            
        }else{
            s14.innerText=`${el.strIngredient14} : ${el.strMeasure14}`
        }


        let s15=document.createElement("p")
        if(el.strIngredient15==null || el.strIngredient15==null){
            el.strIngredient15==""
        }else if(el.strIngredient15=="" || el.strIngredient15==""){
            el.strIngredient15==""
            
        }else{
            s15.innerText=`${el.strIngredient15} : ${el.strMeasure15}`
        }


        let s16=document.createElement("p")
        if(el.strIngredient16==null || el.strIngredient16==null){
            el.strIngredient16==""
        }else if(el.strIngredient16=="" || el.strIngredient16==""){
            el.strIngredient16==""
            
        }else{
            s16.innerText=`${el.strIngredient16} : ${el.strMeasure16}`
        }


        let s17=document.createElement("p")
        if(el.strIngredient17==null || el.strIngredient17==null){
            el.strIngredient17==""
        }else if(el.strIngredient17=="" || el.strIngredient17==""){
            el.strIngredient17==""
            
        }else{
            s17.innerText=`${el.strIngredient17} : ${el.strMeasure17}`
        }


        let s18=document.createElement("p")
        if(el.strIngredient18==null || el.strIngredient18==null){
            el.strIngredient18==""
        }else if(el.strIngredient18=="" || el.strIngredient18==""){
            el.strIngredient18==""
            
        }else{
            s18.innerText=`${el.strIngredient18} : ${el.strMeasure18}`
        }


        
        
        let s19=document.createElement("p")

        if(el.strIngredient19==null || el.strIngredient19==null){
            el.strIngredient19==""
        }else if(el.strIngredient19=="" || el.strIngredient19==""){
            el.strIngredient19==""
            
        }else{
            s19.innerText=`${el.strIngredient19} : ${el.strMeasure19}`
        }


        let s20=document.createElement("p")
        if(el.strIngredient20==null || el.strIngredient20==null){
            el.strIngredient20==""
        }else if(el.strIngredient20=="" || el.strIngredient20==""){
            el.strIngredient20==""
            
        }else{
            s20.innerText=`${el.strIngredient20} : ${el.strMeasure20}`
        }
           

        let iframe=document.createElement("a")
        iframe.innerText="You Tube link"
        iframe.href=el.strYoutube
        iframe.setAttribute("id","link")
       
        
        sdiv.append(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20)
         divcl.append(cat,loc,iframe)
        div.append(title,image,divcl)
        con.append(desc,div,sdiv)
        
    });
}