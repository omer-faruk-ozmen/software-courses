//Yeni Element Oluşturma

const newLink = document.createElement("a");
const cardbody = document.getElementsByClassName("card-body")[1];
newLink.id = "clear-todos";
newLink.className = "btn btn-danger";
newLink.href = "https://www.google.com";
newLink.target = "_blank";

newLink.appendChild(document.createTextNode("Farklı Sayfaya Git"));

//Text Content

// newLink.textContent = "Farklı Sayfaya Git" - Güvenli değil

//Text Node

const text = document.createTextNode("Naber");
cardbody.appendChild(text);

cardbody.appendChild(newLink);


console.log(cardbody)
console.log(newLink)





//Element Silme
const todoList = document.querySelector("ul.list-group");
const todos = document.querySelectorAll("li.list-group-item")

//Remove
todos[0].remove();
todos[0].remove();


//Remove Child
todoList.removeChild(todoList.lastElementChild);
todoList.removeChild(todos[2]);

console.log(todoList);
console.log(todos);