package com.spring1.core;

import com.spring1.core.discount.DiscountPolicy;
import com.spring1.core.discount.FixDiscountPolicy;
import com.spring1.core.discount.RateDiscountPolicy;
import com.spring1.core.member.MemberRepository;
import com.spring1.core.member.MemberService;
import com.spring1.core.member.MemberServiceImpl;
import com.spring1.core.member.MemoryMemberRepository;
import com.spring1.core.order.OrderService;
import com.spring1.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
