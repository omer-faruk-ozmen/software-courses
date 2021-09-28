async function test(data) {
    //Promise return new Promise


    /* return new Promise((resolve, reject) => {
        resolve(data);
    }); */

    //return data;

    let promise = new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Bu bir değerdir.")
        }, 1000)
    })
    let response = await promise; //5 saniye bekleyecek

    //Await sadece async olan fonksiyonlar içerisinde çalışır.


    return response;


}

test("Merhaba").then(response => console.log(response))


async function testData(data) {
    let promise = new Promise((resolve, reject) => {
        setTimeout(() => {
            if (typeof data === "string") {
                resolve(data);
            } else {
                reject(new Error("Lütfen string bir değer girin."))
            }
        }, 2000)
    });
    const response = await promise;

    return response;
};

testData("Bu bir string değer").then(data => console.log(data)).catch(err => console.log(err))
testData(1).then(data => console.log(data)).catch(err => console.error(err))

async function getCurrency(url) {

    const response = await fetch(url); //Response Object
    console.log(response);

    const data = await response.json(); //Json Object

    return data;

}
getCurrency("https://jsonplaceholder.typicode.com/posts").then(i => console.log(i))