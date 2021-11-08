//Local Storage

//SetItem

localStorage.setItem("hareket", "burpee")
localStorage.setItem("tekrar", 50) //String olarak kaydeder

//GetItem
const value = localStorage.getItem("tekrar");
console.log(value)
console.log(typeof value)

//Clear Local Storage
localStorage.clear();

localStorage.setItem("hareket", "burpee")
localStorage.setItem("tekrar", 50)

console.log(localStorage.getItem("sport")) //Anahtar olmadığı için null döner

if (localStorage.getItem("hareket") === null) {
    console.log("Sorgulanan veri bulunmuyor")
} else {
    console.log("Sorguladığınız veri bulundu ")
}


// Local Storage - Array Yazma


//Yanlış
const todos = ["Todo 1", "Todo 2", "Todo 3"];
localStorage.setItem("todos", todos)

console.log(localStorage.getItem("todos"))

//Doğru(json ile array liste çevirme)
const todos1 = ["Todo 1", "Todo 2", "Todo 3"];
localStorage.setItem("todos1", JSON.stringify(todos1))

const value1 = JSON.parse(localStorage.getItem("todos1"));
console.log(value1)


//Örnek
const form = document.getElementById("todo-form");
const todoInput = document.getElementById("todo");

form.addEventListener("submit", addTodo);

function addTodo(e) {
    const value = todoInput.value;

    let todos;
    if (localStorage.getItem("todos") === null) {
        todos = [];
    } else {
        todos = JSON.parse(localStorage.getItem("todos"));
    }

    todos.push(value);

    localStorage.setItem("todos", JSON.stringify(todos));



    e.preventDefault();
}