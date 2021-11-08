const name = "Ömer Faruk Özmen";
const department = "Bilişim";
const salary = 4000;


const html1 = `İsim: ${name}\nDepartman:${department}\nMaaş:${salary}`

function a() {
    return "Merhaba";
}


const html = `
<ul>
<li>${name}</li>
<li>${department}</li>
<li>${salary}</li>
<li>${10/4}</li>
<li>${a()}</li>
</ul>
`;

document.body.innerHTML = html;
console.log(a)