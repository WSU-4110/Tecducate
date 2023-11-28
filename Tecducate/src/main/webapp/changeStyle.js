/* This function will run every time the 'style' button is clicked. */

function toggleStyles() {
  const body = document.querySelector("body")
  body.classList.toggle("style")

  const changeStyleButton = document.querySelector("#change-style-button")

  if (body.classList.contains("style")) {
    changeStyleButton.innerText = "Style"
  } else {
    changeStyleButton.innerText = "Style"
  }
}

