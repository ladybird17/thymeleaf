package study.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import study.dto.Member;

@Controller
public class ThymeleafStudyController {
	private int count = 0;
	
	//웹 브라우저의 주소창에 입력된 url
	@RequestMapping("/")
	public String index() {
		/*
		@Controller 어노테이션 사용시
		@RequestMapping으로 연동된 메소드의 
		반환타입이 String일 경우, 
		return "문자열" 입력시 
		지정된 위치(templates 폴더)에서 지정한 문자열을 가진 
		html 파일을 찾음.
		 */
		return "index";
	}
	
	@RequestMapping("/thymeleaf")
	public String thymeleaf(Model model) {
		/*
		 Model 클래스는 Controller에서 
		 사용자가 요청한 정보의 처리된 내용을
		 담고 있는 객체.
		 View 부분으로 넘겨줄 데이터의 모음.
		 */

		String result="";
		boolean flag = false;
		
		if(count%2==0) {
			result="짝수";
			flag=true;
			count++;
		}
		else {
			result="홀수";
			flag=false;
			count++;
		}
		
		Member member = new Member(); //study.dto에서 만들어놓은 멤버변수들과 getter,setter
		member.setName("김커피");
		member.setEmail("coffee@naver.com");
		member.setTel("010-1111-2222");
		member.setAddress("부산");
		
		Member member2 = new Member("곰돌이","bear@naver.com","010-1113-7777","대전");
		Member member3 = new Member("토끼","rabbit@naver.com","010-2223-8888","대구");
		Member member4 = new Member("거북이","turtle@naver.com","010-3333-9999","부산");
		
		List<Member> list = new ArrayList<Member>();
		list.add(member);
		list.add(member2);
		list.add(member3);
		list.add(member4);
		
		/*
		 thymeleaf가 받을 데이터.
		 첫번째 매개변수가 thymeleaf에서 사용할 변수명.
		 두번째 매개변수가 실제 데이터가 됨
		*/
		
		model.addAttribute("data","thymeleaf");
		model.addAttribute("hi","Hello world");
		model.addAttribute("btnText",result); 
		model.addAttribute("member",member); //위에서 멤버변수들이 저장된 클래스 사용했음
		model.addAttribute("url","test");
		model.addAttribute("h","hello"); //리터럴 대체
		model.addAttribute("w","world");
		model.addAttribute("flag",flag); //조건 연산
		model.addAttribute("btnPrimary","btn btn-primary");
		model.addAttribute("chk",true);
		model.addAttribute("datas",list);
		
		return "thymeleaf";
	}
	
	//링크 테스트
	@RequestMapping("/test/test")
	public String testtest() {
		return "/test/test";
	}
}
