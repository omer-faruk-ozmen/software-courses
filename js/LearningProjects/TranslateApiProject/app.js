//Prototype, Ajax, Callback

addEventListeners();

function addEventListeners() {
    document.getElementById("translate-form").addEventListener("submit", translateWord)

    //Change
    document.getElementById("language").onchange = function() {
        //Arayüz İşlemleri
        console.log("Event")
        ui.changeUI();
    }
}

const translate = new Translate(document.getElementById("word").value, document.getElementById("language").value);
const ui = new UI();

function translateWord(e) {
    translate.chacgeParameters(document.getElementById("word").value, document.getElementById("language").value)

    translate.traslateWord(function(err, response) {
        if (err) {
            console.log(err)
        } else {
            ui.displayTranslate(response)
        }
    });

    e.preventDefault();
}