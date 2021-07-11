package cn.wang.shop.dao.impl;

import cn.wang.shop.dao.IMemberDao;
import cn.wang.shop.domain.Member;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: MyBatisMShop
 * @description:
 * @Package: cn.wang.shop.dao.impl
 * @ClassName: IMemberDaoImpl
 * @author: wang
 * @create: 2021/04/15 16:57
 * @Version: 1.0
 */
public class IMemberDaoImpl implements IMemberDao {
    private InputStream in;
    private SqlSessionFactoryBuilder builder;
    private SqlSession session;
    private static IMemberDaoImpl iMemberDaoImpl;

    private IMemberDaoImpl() throws IOException {
       in= Resources.getResourceAsStream("SqlMapConfig.xml");
       builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        session=factory.openSession();
    }
    public static IMemberDaoImpl getInstance()throws IOException{
        if(iMemberDaoImpl==null){
            iMemberDaoImpl=new IMemberDaoImpl();
        }
        return iMemberDaoImpl;
    }
    public void close(){
        iMemberDaoImpl.session.close();
    }


    @Override
    public List<Member> selectSets(List<String> ids) {
        return null;
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    @Override
    public Member findById(String mid) {
        return null;
    }

    @Override
    public boolean addUser(Member member) {
        int result;
        boolean flag=false;
        result=iMemberDaoImpl.session.insert("cn.wang.shop.dao.IMemberDao.addUser",member);
        if(result==1){
            flag=true;
        }
        iMemberDaoImpl.session.commit();
        this.close();
        return flag;
    }

    @Override
    public void deleteUser(List<String> ids) {

    }

    @Override
    public void updateUser(Member member) {

    }

    @Override
    public List<Member> findByName(String name) {
        return null;
    }
}
