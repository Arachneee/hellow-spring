package hellow.hellowspring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hellow.hellowspring.repository.MemberRepository;
import hellow.hellowspring.repository.MemoryMemberRepository;
import hellow.hellowspring.service.MemberService;

@Configuration
public class SpringConfig {

	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository());
	}

	@Bean
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
}
