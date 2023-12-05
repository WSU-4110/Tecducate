/* function for the search button*/

function searchAndHighlight() {
    var searchTerm = document.getElementById("input").value;
    var elements = document.body.querySelectorAll("*:not(script):not(style)"); // Select all elements except script and style
    var regex = new RegExp(searchTerm, 'gi');
    var matchFound = false;

    elements.forEach(function (element) {
        var matches = element.innerHTML.match(regex);

        if (matches) {
            matchFound = true;
            element.innerHTML = element.innerHTML.replace(regex, function (match) {
                return '<span class="highlight">' + match + '</span>';
            });
        } else {
            element.innerHTML = element.innerHTML.replace(/<span class="highlight">(.*?)<\/span>/g, '$1');
        }
    });

    if (!matchFound && searchTerm.trim() !== "") {
        alert("No match found for '" + searchTerm + "'");
    }
}
