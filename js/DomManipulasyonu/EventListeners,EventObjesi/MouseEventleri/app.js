const cardBody = document.querySelectorAll(".card-body")[1];

const title = document.querySelector("#tasks-title");


/* //Click Event
title.addEventListener("click", run);

//Double Click Event
title.addEventListener("dblclick", run);

//Mouse Down
title.addEventListener("mousedown", run);

//Mouse Up (tıklamayı bırakınca oluşur)
title.addEventListener("mouseup", run);

//Mouse Over (elementin üzerine gelince oluşur)
title.addEventListener("mouseover", run);

//Mouse Out (elementten çıkınca oluşur)
title.addEventListener("mouseout", run); */


// cardBody.addEventListener("mouseover", run)
// cardBody.addEventListener("mouseout", run)


//Mouse Enter ve Mouse Leave
cardBody.addEventListener("mouseenter", run);
cardBody.addEventListener("mouseleave", run);


function run(e) {
    console.log(e.type);
}