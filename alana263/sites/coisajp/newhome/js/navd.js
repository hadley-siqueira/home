$(document).ready(function () {
  $(window).scroll(
      {
        previousTop: 0
      },
      function () {
        var currentTop = $(window).scrollTop();
        if (currentTop < this.previousTop) {
          $("ul").removeClass("nvd");
        } else {
          $("ul").addClass("nvd");
        }
        this.previousTop = currentTop;

  });
});
