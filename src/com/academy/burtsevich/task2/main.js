const myImage = document.querySelector("img");

myImage.onclick = function () {
    const mySrc = myImage.getAttribute("src");
    if (mySrc === "images/Guy1_3x4.jpg") {
        myImage.setAttribute("src", "images/Guy2_3x4.jpg");
    } else {
        myImage.setAttribute("src", "images/Guy1_3x4.jpg");
    }
};


document.querySelector("ul").onclick = function () {
    alert("Здесь могло бы что-то быть... но нет");
};
