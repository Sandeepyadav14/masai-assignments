

function Student(a,b,c,d,e){
    this.name=a;
    this.course=b;
    this.unit=c;
    this.image=d
    this.batch=e;
}



function getdata(e){
    e.preventDefault();
    let form=document.getElementById("form")

    let name=form.name.value;
    let course=form.course.value;
    let unit=form.unit.value;
    let image=form.image.value;
    let batch=form.batch.value;

    let x=new Student(name,course,unit,image,batch)

   let arr=JSON.parse(localStorage.getItem("studentdata")) || []

  arr.push(x)

  localStorage.setItem("studentdata",JSON.stringify(arr))

}

function dashboard(){
    window.location.href="dashboard.html"
}