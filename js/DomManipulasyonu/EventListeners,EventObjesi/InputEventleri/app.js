const filter = document.getElementById("filter");

document.addEventListener("DOMContentLoaded", load);

function load(e) {
    console.log("Sayfa Yüklendi")
}


//Focus Event

filter.addEventListener("focus", run);
//Blur
filter.addEventListener("blur", run);

//Paste Event
filter.addEventListener("paste", run);

//Copy Event
filter.addEventListener("copy", run)

//Cut
filter.addEventListener("cut", run)

//Select
filter.addEventListener("select", run)


function run(e) {
    console.log(e.type)
}