// for (let i = 0; i < $('.tab-button').length; i++){
//   $('.tab-button').eq(i).on('click', function(){
//     탭열기(i)
//   });
// }

$('.list').click(function(e) {

  탭열기(e.target.dataset.id)

});



function 탭열기(num) {
  $('.tab-button').removeClass('orange');
  $('.tab-button').eq(num).addClass('orange');
  $('.tab-content').removeClass('show');
  $('.tab-content').eq(num).addClass('show');
}