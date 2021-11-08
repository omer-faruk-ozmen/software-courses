const todoInput = document.getElementById("todo");
let element;

element = todoInput;
element = todoInput.className;

todoInput.classList.add("newClass");
todoInput.classList.add("newClass1");
todoInput.classList.remove("newClass");
todoInput.classList.remove("newClass1");

element = todoInput;
element = todoInput.placeholder;
element = todoInput.getAttribute("placeholder");
todoInput.setAttribute("placeholder", "naber")
todoInput.setAttribute("titile", "Input");

todoInput.removeAttribute("name");

element = todoInput;


console.log(element);