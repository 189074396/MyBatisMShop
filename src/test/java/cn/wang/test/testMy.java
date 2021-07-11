package cn.wang.test;

import cn.wang.shop.domain.Member;
import cn.wang.shop.service.IMemebrServiceFront;
import cn.wang.shop.service.impl.IMermberServiceFrontImpl;
import cn.wang.utils.MD5Code;

import java.io.IOException;
import java.util.Date;

/**
 * @program: MyBatisMShop
 * @description:
 * @Package: cn.wang.test
 * @ClassName: testMy
 * @author: wang
 * @create: 2021/04/06 23:33
 * @Version: 1.0
 */
public class testMy {
    public static void main(String[] args) throws IOException {
        IMemebrServiceFront isf=new IMermberServiceFrontImpl();
        Member member=new Member();
        member.setMid("liuer");
        member.setPassword("D2AA051D2627CB323E2A65286AD978F7");
        member.setRegdate(new Date());
        try {
            boolean flag=isf.regist(member);
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new MD5Code().getMD5ofStr("liuer"));
    }
}
