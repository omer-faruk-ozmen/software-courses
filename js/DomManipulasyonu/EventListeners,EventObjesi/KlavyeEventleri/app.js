const filterInput = document.getElementById("filter");
const todoForm = document.getElementById("todo-form")

// todoForm.addEventListener("submit", submitForm);

// function submitForm(e) {
//     console.log("Submit eventi")

//     e.preventDefault();
// }

// filterInput.onfocus = function() {
//     console.log("Naber")
// }


// filterInput.addEventListener("focus", function(e) {
//     console.log(e)
//     console.log("Naber");
//     console.log(e.target);
//     console.log(e.target.placeholder);
//     console.log(e.target.className);
// });



//Klavye Eventleri 
const header = document.querySelector(".card-header");
const todoInput = document.querySelector("#todo");

todoInput.addEventListener("keyup", changeText);

function changeText(e) {
    header.textContent = e.target.value;
    // console.log(e.target.value);
}


// //keypress (sadece harfler ve sayılar)
// document.addEventListener("keypress", run);

// function run(e) {
//     console.log(e.which);
//     console.log(e.key);
//     console.log("Naber");
// }

// //keydown (tuşa bastığımız andan itibaren her şeyi alır.)
// document.addEventListener("keydown", run);

// function run(e) {
//     console.log(e.key);
// }

//keyup (tuşa basmayı bırakınca algılar)
// document.addEventListener("keyup", run);

function run(e) {
    console.log(e.key);
}