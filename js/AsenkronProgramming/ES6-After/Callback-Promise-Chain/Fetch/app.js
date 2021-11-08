//Text Dosyası
function getTextFile() {
    fetch("example.txt")
        .then(response => response.text())
        .then(data => console.log(data))
        .catch(err => console.log(err))

}

getTextFile();


//Json Dosyası (Local'de)
function getJsonFile() {

    fetch("example.json")
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(err => console.log(err))
}

getJsonFile()

//Api ile Json Alma

//https://jsonplaceholder.typicode.com/posts

function getExternalAPI() {
    fetch("https://www.hepsiburada.com/api/v1/navigation/1722")
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(err => console.log(err))
}

getExternalAPI();