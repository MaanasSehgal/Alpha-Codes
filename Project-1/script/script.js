const mobileBtn = document.getElementById("mobile-cta");
const nav = document.querySelector("nav");
const mobileBtnExit = document.getElementById("mobile-exit");

//setting up hamburger menu
mobileBtn.addEventListener("click", () => {
	nav.classList.add("menu-btn");
});

mobileBtnExit.addEventListener("click", () => {
	nav.classList.remove("menu-btn");
});
