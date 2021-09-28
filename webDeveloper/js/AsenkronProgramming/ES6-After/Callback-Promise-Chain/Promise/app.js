//Olumlu Sonuç
function getData(data) { //Promise objesi döndüren fonksiyon

    return new Promise(function(resolve, reject) {


        setTimeout(function() {

            resolve("Olumlu Sonuç")

        }, 5000);
    });
};

getData("Merhaba").then(function(response) {
    console.log(response)
});


//Olumsuz Sonuç
function getDataCatch(data) { //Promise objesi döndüren fonksiyon

    return new Promise(function(resolve, reject) {


        setTimeout(function() {

            reject("Olumsuz Sonuç")

        }, 5000);
    });
};

getDataCatch("Merhaba").catch(function(err) {
    console.log(err)
});


//Resolve ve Reject aynı anda kullanımı
function getDataResolveReject(data) { //Promise objesi döndüren fonksiyon

    return new Promise(function(resolve, reject) {


        setTimeout(function() {

            if (typeof data === "string") {
                //Olumlu
                resolve(data);
            } else {
                //Olumsuz
                reject(new Error("Lütfen String bir değer girin"));
            }

        }, 5000);
    });
};

getDataResolveReject(24)
    .then(response => { console.log("Gelen Değer " + response); })
    .catch(err => console.error(err));




//Promise Chain yapısı 
//Sadece 1 defa catch kullanılır
function addTwo(number) {
    return new Promise(function(resolve, reject) {
        setTimeout(function() {
            if (typeof number === "number") {
                resolve(number + 2);
            } else {
                reject(new Error("Lütfen bir sayı girin."))
            }
        }, 6000)
    })
}

addTwo("Merhaba")
    .then(response => {
        console.log(response);
        return response + 2
    })
    .then(response2 => console.log(response2))
    .catch(err => console.error(err));