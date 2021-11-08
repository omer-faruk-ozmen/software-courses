//Ajax , callback , http requests

class Request {
    constructor() {
        this.xhr = new XMLHttpRequest();
    }

    //Get Request
    get(url, callback) {
        this.xhr.open("GET", url); //Bağlantı açıldı

        // const temp = this; //1) hata önüne geçmek için yapılabilir.

        this.xhr.onload = function() {

                // 4) arrow functiona çevrilirse sorun çözülür
                //this.xhr.onload = ()=>{}


                if (this.xhr.status === 200) { // 2) hata önüne geçmek için this.status yazılır.
                    callback(null, this.xhr.responseText) //isteğimiz bitti
                } else {
                    //Hata durumu
                    callback("Herhangi bir hata oluştu", null)
                }
            }.bind(this) // 3) hata önüne geçmek için yazılır. this fonksiyonu değil requesti gösterir.


        this.xhr.send(); //istek gönderildi
    }
    post(url, data, callback) {
        this.xhr.open("POST", url);

        this.xhr.setRequestHeader("Content-type", "application/json"); //JSON verisi

        this.xhr.onload = () => {
            if (this.xhr.status === 201) {
                //Başarılı
                callback(null, this.xhr.responseText);
            } else {
                callback("Post Request : Herhangi bir hata oluştu", null)
            }
        }
        this.xhr.send(JSON.stringify(data));

    }
    put(url, data, callback) {
        this.xhr.open("PUT", url);

        this.xhr.setRequestHeader("Content-type", "application/json"); //JSON verisi

        this.xhr.onload = () => {
            if (this.xhr.status === 200) {
                //Başarılı
                callback(null, this.xhr.responseText);
            } else {
                callback("Put Request : Herhangi bir hata oluştu", null)
            }
        }
        this.xhr.send(JSON.stringify(data));

    }
    delete(url, callback) {
        this.xhr.open("DELETE", url); //Bağlantı açıldı

        // const temp = this; //1) hata önüne geçmek için yapılabilir.

        this.xhr.onload = function() {

                // 4) arrow functiona çevrilirse sorun çözülür
                //this.xhr.onload = ()=>{}


                if (this.xhr.status === 200) { // 2) hata önüne geçmek için this.status yazılır.
                    callback(null, "Veri silme işlemi başarılı") //isteğimiz bitti
                } else {
                    //Hata durumu
                    callback("Delete Request : Herhangi bir hata oluştu", null)
                }
            }.bind(this) // 3) hata önüne geçmek için yazılır. this fonksiyonu değil requesti gösterir.


        this.xhr.send(); //istek gönderildi
    }

}

const request = new Request();

/*
request.get("https://jsonplaceholder.typicode.com/albums", function(err, response) {
    if (err === null) {
        //Başarılı
        console.log(response)
    } else {
        //Hata
        console.log(err);
    }
}); */


//Get Request
request.get("https://jsonplaceholder.typicode.com/albums/51", function(err, response) {
    if (err === null) {
        //Başarılı
        console.log(response);
    } else {
        //Hata
        console.log(err);
    }
});



//Post Request
request.post("https://jsonplaceholder.typicode.com/albums", { userId: 2, title: "Thriller" }, function(err, album) {
    if (err === null) {
        console.log(album);
    } else {
        console.log(err);
    }
});


//Put Request 
//Id'si 10 olan albümün bilgilerini günceller
request.put("https://jsonplaceholder.typicode.com/albums/10", { userId: 2, title: "Thriller" }, function(err, album) {
    if (err === null) {
        console.log(album);
    } else {
        console.log(err);
    }
});


//Delete Request
//Id'si 51 olan objeyi siler ve boş obje döner.
request.delete("https://jsonplaceholder.typicode.com/albums/51", function(err, response) {
    if (err === null) {
        //Başarılı
        console.log(response);
    } else {
        //Hata
        console.log(err);
    }
});