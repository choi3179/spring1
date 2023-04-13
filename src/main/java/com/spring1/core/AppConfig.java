package com.spring1.core;

import com.spring1.core.discount.FixDiscountPolicy;
import com.spring1.core.member.MemberService;
import com.spring1.core.member.MemberServiceImpl;
import com.spring1.core.member.MemoryMemberRepository;
import com.spring1.core.order.OrderService;
import com.spring1.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }

}
