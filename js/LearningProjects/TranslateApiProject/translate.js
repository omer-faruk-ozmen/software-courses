function Translate(word, language) {
    this.apikey = "trnsl.1.1.20210926T090032Z.e429f2f402dc2176.2679c217c8e0c92d24ba93ac6762b371a49c1162";
    this.word = word;
    this.language = language;

    //XHR
    this.xhr = new XMLHttpRequest();

}

Translate.prototype.traslateWord = function(callback) {
    //Ajax işlemleri
    const endpoint = `https://translate.yandex.net/api/v1.5/tr.json/translate?key=${this.apikey}&text=${this.word}&lang=${this.language}&format=html`

    this.xhr.open("GET", endpoint);
    this.xhr.onload = () => {
        if (this.xhr.status === 200) {
            const json = JSON.parse(this.xhr.responseText);
            const text = json.text[0];
            callback(null, text);
        } else {
            callback("Bir hata oluştu", null)
        }
    }


    this.xhr.send();
};

Translate.prototype.chacgeParameters = function(newWord, newLanguage) {
    this.word = newWord;
    this.language = newLanguage;
}