$(document).ready(function(){
    $('.to_top a').smoothScroll();

    // 모바일용 메뉴 보이기/숨기기 액션처리
	$('.openMOgnb').click(function(){
		//alert('메뉴보이기 액션클릭');
		// $('.header_cont').css('display' , 'block');
		$('.header_cont').slideDown("slow");
		$('#header').addClass('on');
	});
    $('.closePop').click(function(){
		// $('.header_cont').css('display' , 'none');
		$('.header_cont').slideUp("fast");
		$('#header').removeClass('on');
	});
});

// PC용 대메뉴 마우스 아웃시 조건에 맞으면, 서브메뉴 사라지는 액션
var isOver1 = false; // 대메뉴1번이 false 일때 서브메뉴가 사라지는 조건
var isOverSub1 = false; // 서브메뉴 1번이 false 일때 서브메뉴가 사라지는 조건
// 1번 서브메뉴 숨기는 함수(아래)
function goHide1() {
	if(!isOver1 && !isOverSub1) { //2개변수값이 모두 false 일때.
		$('.gnb_depth2_1').stop().fadeOut('fast');
	}
}
var isOver2 = false; // 대메뉴2번이 false 일때 서브메뉴가 사라지는조건
var isOverSub2 = false; // 서브메뉴2번이 false 일때 서브메뉴가 사라지는조건
// 2번 서브메뉴 숨기는 함수(아래)
function goHide2() {
	if(!isOver2 && !isOverSub2) {
		$('.gnb_depth2_2').stop().fadeOut('fast');
	}
}
// PC용 대메뉴 마우스 롤오버 이벤트 = 서브메뉴가 나타나는 액션 만들기(아래) 
$(document).ready(function(){
	// 대메뉴 1번 액션
	$('.openAll1').mouseover(function(){
		if( parseInt($('header').css('width')) >=1049){
			$('.gnb_depth2_1').stop().fadeIn('fast');
		}
		isOver1 = true; //true 일때 나타나는 조건
	});
	$('.openAll1').mouseout(function(){
		isOver1 = false;
		setTimeout('goHide1()', 200); // 기본은 goHide1(), mouseout 이벤트를 놓치면 안되기때문에 setTimeout 사용
	});
	// 서브메뉴 1번 액션
	$('.gnb_depth2_1').mouseover(function(){
		isOverSub1 = true; 
	});
	$('.gnb_depth2_1').mouseout(function(){
		isOverSub1 = false;
		setTimeout('goHide1()' , 200);
	});
    // 대메뉴 2번 액션
	$('.openAll2').mouseover(function(){
		if( parseInt($('header').css('width')) >=1049){
			$('.gnb_depth2_2').stop().fadeIn('fast');
		}
		isOver2 = true; //true 일때 나타나는 조건
	});
	$('.openAll2').mouseout(function(){
		isOver2 = false;
		setTimeout('goHide2()', 200);
	});
	// 서브메뉴 2번 액션
	$('.gnb_depth2_2').mouseover(function(){
		isOverSub2 = true; 
	});
	$('.gnb_depth2_2').mouseout(function(){
		isOverSub2 = false;
		setTimeout('goHide2()' , 200);
	});
});
