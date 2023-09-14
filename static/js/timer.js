window.onload = function() {
    var min = 30;
    var sec = 60;
    setTimeout(function () {
        var a= new Date();
        document.getElementById("timer").innerHTML = min + " : " + sec;
        sec--;
        if (sec == 00) {
            min--;
            sec = 60;
            if (min == 0) {
                min = 30;
            }
        }
    },500);
}
  function resetTimer()
  {

  }