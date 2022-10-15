// Store the wallet amount to your local storage with key "amount"

let amount = JSON.parse(localStorage.getItem("amount"));
amount = +amount;
function getdata(){
    let money = document.getElementById("amount").value;
    money = amount + (+money);
    localStorage.setItem("amount",JSON.stringify(money));
    location.reload();
}
 document.getElementById("wallet").innerHTML=amount