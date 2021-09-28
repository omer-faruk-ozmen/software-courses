// Window Object

let value;

value = document;

value = document.all;
value = document.all.length;
value = document.all[6];
value = document.all[document.all.length - 1];

const elements = document.all;
// for (let i = 0; i < elements.length; i++) {
//     console.log(elements[i])
// }


// const collections = Array.from(document.all);
// collections.forEach(function(collections) {
//     console.log(collections)
// })

value = document.all[8];
value = document.body;
value = document.head;
value = document.location;
value = document.location.port;
value = document.URL
value = document.characterSet;


//Script Etiketler
value = document.scripts;
value = document.scripts.length;
value = document.scripts[0];


//Linkler
value = document.links;
value = document.links[0];
value = document.links[document.links.length - 1];
value = document.links[document.links.length - 1].getAttribute("class");
value = document.links[document.links.length - 1].getAttribute("href");
value = document.links[document.links.length - 1].className;
value = document.links[document.links.length - 1].classList;


//Formlar
value = document.forms;
value = document.forms.length;
value = document.forms[0];
value = document.forms["form"];
value = document.forms[0].id;
value = document.forms[0].getAttribute("id");
value = document.forms[0].name;
value = document.forms[0].method;


console.log(value);

//Element Seçme 
let element;


//id ye göre seçme
element = document.getElementById("todo-form");
element = document.getElementById("tasks-title");

//class a göre seçme
element = document.getElementsByClassName("list-group-item");
element = document.getElementsByClassName("list-group-item")[0];
element = document.getElementsByClassName("card-header");

//Tag e göre seçme
element = document.getElementsByTagName("div");

//Query Selector - Css Selector - Tek Bir Element
element = document.querySelector("#todo-form");
element = document.querySelector("#tasks-title");

element = document.querySelector(".list-group-item");

element = document.querySelector("li");
element = document.querySelector("div");

//QuerySelectorAll - Tüm Elementleri Seç
element = document.querySelectorAll(".list-group-item");

// element.forEach(function(el) {
//     console.log(el);
// });


//Element Style Özelliklerini Değiştirme
element = document.querySelector("#clear-todos");

/*
console.log(element.id)
console.log(element.className)
console.log(element.classList)
console.log(element.classList[1])
console.log(element.textContent)
console.log(element.innerHTML);
console.log(element.href); 
console.log(element.style); */

element.className = "btn btn-primary";
element.style.color = "#000";
element.style.marginLeft = "20px";
element.href = "https://www.google.com.tr";
element.target = "_blank"

// element.textContent = "Sil"
element.innerHTML = "<span style='color:green'>Sil</span> "



const elementler = document.querySelectorAll(".list-group-item")
elementler.forEach(function(el) {
    el.style.color = "red";
    el.style.background = "#eee";
})

let element2 = document.querySelector("li:last-child")

element2 = document.querySelector("li:nth-child(3)");
element2 = document.querySelector("li:nth-child(2)");

element2 = document.querySelectorAll("li:nth-child(odd)");
element2 = document.querySelectorAll("li:nth-child(even)");

element2.forEach(function(el) {
    el.style.background = "#ccc"
})




console.log(element2)


console.log(element.textContent);



//DOM'lar üzerinde gezme
let value1;
const todoList = document.querySelector(".list-group");
const todo = document.querySelector(".list-group-item:nth-child(2)")
const carddrow = document.querySelector(".card.row")

value1 = todoList;
value1 = todo;
value1 = carddrow;



//Child Nodes - Text Dahil
value1 = todoList.childNodes;
value1 = todoList.childNodes[0];


//Children - Element
value1 = todoList.children;
value1 = todoList.children[1];
value1 = todoList.children[todoList.children.length - 1];
value1 = todoList.children[todoList.children.length - 1].textContent = "Yeni Content";


value1 = carddrow;
value1 = carddrow.children;
value1 = carddrow.children[2].children[1].textContent = "Yeni Content.";


value1 = todoList;
value1 = todoList.firstElementChild;
value1 = todoList.lastElementChild;
value1 = todoList.childElementCount;

value1 = carddrow;
value1 = carddrow.parentElement;
value1 = carddrow.parentElement.parentElement;


//Element Kardeşleri

value1 = todo;
value1 = todo.previousElementSibling;
value1 = todo.nextElementSibling;
value1 = todo.nextElementSibling.nextElementSibling;

value1 = todo.previousElementSibling.previousElementSibling;


console.log(value1);