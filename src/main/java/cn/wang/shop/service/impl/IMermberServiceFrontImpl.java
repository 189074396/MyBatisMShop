package cn.wang.shop.service.impl;

import cn.wang.shop.dao.IMemberDao;
import cn.wang.shop.dao.impl.IMemberDaoImpl;
import cn.wang.shop.domain.Member;
import cn.wang.shop.service.IMemebrServiceFront;

import java.io.IOException;

/**
 * @program: MyBatisMShop
 * @description:
 * @Package: cn.wang.shop.service.impl
 * @ClassName: IMermberServiceFrontImpl
 * @author: wang
 * @create: 2021/04/15 16:46
 * @Version: 1.0
 */
public class IMermberServiceFrontImpl implements IMemebrServiceFront{
    private IMemberDao memberDao;
    {
        try {
            memberDao = IMemberDaoImpl.getInstance();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean regist(Member vo) throws Exception{
        boolean flag=false;
        try {
            if(memberDao.findById(vo.getMid())==null){
               flag= memberDao.addUser(vo);
            }
            return flag;
        }catch (Exception e){
            throw e;
        }
    }
}
