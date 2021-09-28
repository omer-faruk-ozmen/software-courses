// Http Status
// 200 : OK
// 403 : Forbidden
// 404 : Not Found 
// 505 : Internal Server Error
// 0: request not initialized
// 1: server connection established
// 2: request received
// 3: processing request
// 4: request finished and response is ready

document.getElementById("btn").addEventListener("click", function() {


    // XMLHttpRequest
    const xhr = new XMLHttpRequest();

    //Sadece readyState == 3 olduğunda çalışır.
    xhr.onprogress = function() {
        console.log("Process İşleniyor", this.readyState)
    }



    //Sadece readyState == 4 olduğunda çalışır.
    xhr.onload = function() {
        if (this.status === 200) {
            document.getElementById("ajax").textContent = this.responseText;
        }
    }


    /*
  

    xhr.onreadystatechange = function() {
        //console.log(this.readyState);
        console.log(this.status)

        if (this.status == 200 && this.readyState == 4) {
            //Response Hazır
            console.log(this.responseText);
        }
    } */
    xhr.open("GET", "example.txt", true);

    xhr.send();


});