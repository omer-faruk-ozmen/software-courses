console.log(2 == 2);
console.log("js" == "java");
console.log(2 == "2");
console.log(2 === "2"); //hem değerler hemde tipler aynı mı?
console.log(2 > 1);
console.log(2 > 4);
console.log(2 != 4);
console.log(2 < 4);
console.log(4 < 2);
console.log(2 >= 2);
console.log(2 <= 4);


/* Mantıksal Bağlaçlar */


//Not !
console.log(!(2 == 2));

//And &&
console.log((2 == 2) && ("ahmet" == "ahmet"));
console.log((4 == 2) && ("ahmet" == "ahmet"));

//Or ||
console.log((4 == 2) || ("ahmet" == "ahmet"));



/* Koşul durumları */


//if 
const error = true;

if (error == true) {
    console.log("Hata oluştu")
} else {
    console.log("Hata oluşmadı")
}

const user = "ttp";

if (user === "ofo") {
    console.log("Kullanıcı Bulundu")
} else {
    console.log("Kullanıcı Bulunamadı")
}


//Turnary
console.log(user === "ttp" ? "Kullanıcı Bulundu" : "Kullanıcı Bulunamadı")