var slideNum = 0; //슬라이드 인덱스 초기값 선언 number
var slideAuto = null; //null - 없는것,  '' - 공백이 값
// on|off 역할을 하는 값을 스위치,플래그 라고함
//함수선언(아래)
function play_w(directw){ //좌우로 슬라이드되는 함수선언(왼쪽,오른쪽)
    //아래 3개의 조건중에 1개는 무조건 실행되는 구조
    if(directw=='right'){
        slideNum = slideNum + 1; //슬라이드 번호 증가
        if(slideNum>2) {slideNum = 0;}//슬라이드 이미지가 3개일때로 고정
    }
    else if(directw=='left'){
        slideNum = slideNum - 1; //슬라이드 번호 감소
        if(slideNum<0) {slideNum = 2;}//순서대로 무한반복을 명시
    }
    else {
        slideNum = directw; //string 으로 형 변환
    }
    
//rollingbtn영역안 li 태그에서 클래스 seq 인것 3개를 함수로 반복(3번)
$('.rollingbtn').find('li.seq a').each(function(){
    $('li.seq a img').attr('src',$('li.seq a img').attr('src').replace('_on.png', '_off.png'));
});
$('li.butt'+slideNum+' a img').attr('src',$('li.butt'+slideNum+' a img').attr('src').replace('_off.png', '_on.png'));
if(slideNum == 0) {
    //슬라이드 인덱스가 0일때 li태그를 1초간 서서히 사라지게 처리
    $('.viewImgList li.imglist1').animate({'opacity':0},1000);//서서히 사라지기
    $('.viewImgList li.imglist2').animate({'opacity':0},1000);//서서히 사라지기
    $('.viewImgList li.imglist0').animate({'opacity':1},1000);//서서히 나타나기
}else if(slideNum == 1) {
    $('.viewImgList li.imglist0').animate({'opacity':0},1000);//서서히 사라지기
    $('.viewImgList li.imglist2').animate({'opacity':0},1000);//서서히 사라지기
    $('.viewImgList li.imglist1').animate({'opacity':1},1000);//서서히 나타나기

}else if(slideNum == 2) {
    $('.viewImgList li.imglist0').animate({'opacity':0},1000);//서서히 사라지기
    $('.viewImgList li.imglist1').animate({'opacity':0},1000);//서서히 사라지기
    $('.viewImgList li.imglist2').animate({'opacity':1},1000);//서서히 나타나기
}
//플래그 true(자동슬라이드), false(슬라이드멈춤)
if(slideAuto){ //true 일때
    clearTimeout(slideAuto);//play_w 함수 실행 중지
} 
slideAuto = setTimeout('play_w("right")', 3000); //3초 단위로 play_w('right')실행
} //play_w 함수 끝