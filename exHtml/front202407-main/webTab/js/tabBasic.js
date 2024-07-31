// function openPop() {
//     $(".winPopup").show(500);
// }
// function closePop() {
//     $(".winPopup").hide();
// }
// ----- 공지사항버튼 마우스OVER오버 효과 ---
$("#tabNews").mouseover(function () {
   // $(this).css("background-color", "lightgray");
   $(this).css("cursor", "pointer");
   $(this).css(
      {
         "background-color": "gray",
         "color": "white",
         "font-weight": "bold"
      }
   );
});
// ----- 공지사항버튼 마우스OUT아웃 효과 ---
$("#tabNews").mouseleave(function () {
   // $(this).css("background-color", "rgb(208, 250, 245)");
   $(this).css("cursor", "none");
   $(this).css(
      {
         "background-color": "rgb(208, 250, 245)",
         "color": "black",
         "font-weight": "normal"
      }
   );
});
// ----- 공지사항버튼 마우스CLICK클릭 효과 ---
$("#tabNews").click(function (e) {
   // 공지사항 버튼
   // $(this).css({
   //     "border-bottom":"0",
   //     "background-color": "white"
   // });

   // 공지사항 BOX
   // $("selector").css(propertyName, value);

   $("#box1").show();
   $("#box2").hide();
});
// ----- 갤러리버튼 마우스CLICK클릭 효과 ---
$("#tabGallery").click(function (e) {
   $("#box2").show();
   $("#box1").hide();
});
// ----- 갤러리버튼 온ON메서드(over,out) 효과 ---
$("#tabGallery").on(
   {
      mouseover: function () {
         $(this).css(
            {
               "cursor": "pointer",
               "background-color": "gray",
               "color": "white",
               "font-weight": "bold"
            }
         );
      },
      mouseleave: function () {
         $(this).css(
            {
               "cursor": "pointer",
               "background-color": "rgb(208, 250, 245)",
               "color": "black",
               "font-weight": "normal"
            }
         );
      },
   }
);