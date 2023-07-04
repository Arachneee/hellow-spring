package hellow.hellowspring.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hellow.hellowspring.repository.JdbcMemberRepository;
import hellow.hellowspring.repository.JdbcTemplateMemberRepository;
import hellow.hellowspring.repository.JpaMemberRepository;
import hellow.hellowspring.repository.MemberRepository;
import hellow.hellowspring.repository.MemoryMemberRepository;
import hellow.hellowspring.service.MemberService;
import jakarta.persistence.EntityManager;

@Configuration
public class SpringConfig {
	//private DataSource dataSource;

	// @Autowired
	// public SpringConfig(DataSource dataSource) {
	// 	this.dataSource = dataSource;
	// }

	private EntityManager em;
	@Autowired
	public SpringConfig(EntityManager em) {
		this.em = em;
	}

	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository());
	}

	@Bean
	public MemberRepository memberRepository() {
		// return new MemoryMemberRepository();
		// return new JdbcMemberRepository(dataSource);
		// return new JdbcTemplateMemberRepository(dataSource);
		return new JpaMemberRepository(em);
	}
}
