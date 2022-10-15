

async function addPost(){
    
    
    let title=document.getElementById("title").value;
    let image=document.getElementById("url").value;
    let price=document.getElementById("price").value;
    let send_data={
        title:title,
        image:image,
        price:price
    };
    let res= await fetch(` http://localhost:3000/data`,{
        method:'POST',

        body:JSON.stringify(send_data),

        headers:{
            'Content-Type':'application/json',
        },

        

    });
    let data=await res.json()
    console.log(data)
}


async function deletePost(){
     let id =document.getElementById("delete_id").value;

     let res= await fetch(`http://localhost:3000/list/${id}`,{
        method:'DELETE',

        headers:{
            'Content-Type':'application/json',

        },
     })
     let data= await res.json()
     console.log(data)
}

async function updateproduct(){
    let id=document.getElementById("up_id").value
    // let title=document.getElementById("up_title").value
    let image=document.getElementById("up_url").value

    let send_data={
        // title:title,
        image:image
    }

    let res=await fetch(`http://localhost:3000/data/${id}`,{
        method:'PATCH',

        body:JSON.stringify(send_data),

        headers:{
            'Content-Type':'application/json',

        },
    })
    let data =await res.json()
    console.log(data)
}

async function replaceproduct(){
    let id=document.getElementById("re_id").value
    let title=document.getElementById("re_title").value
    let url1=document.getElementById("re_url1").value
    let url2=document.getElementById("re_url2").value
    let price=document.getElementById("re_price").value

    let send_data={
        title:title,
        url1:url1,
        url2:url2,
        price:price
    }

    let res=await fetch(`http://localhost:3000/shirt/${id}`,{
        method:'PUT',

        body:JSON.stringify(send_data),

        headers:{
            'Content-Type':'application/json',

        },
    })
    let data =await res.json()
    console.log(data)
}