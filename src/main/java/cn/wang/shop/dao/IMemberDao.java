package cn.wang.shop.dao;

import cn.wang.shop.domain.Member;
import org.apache.ibatis.annotations.CacheNamespace;

import java.util.List;
@CacheNamespace
public interface IMemberDao {
    /**
     * 批量查询用户
     * @param ids
     * @return
     */
    List<Member> selectSets(List<String> ids);

    /**
     * 查询所有用户
     * @return
     */
    List<Member> findAll();

    /**
     * 根据id查询用户
     * @param mid
     * @return
     */
    Member findById(String mid);

    /**
     * 添加用户
     * @param member
     */
    boolean addUser(Member member);

    /**
     * 删除多个用户
     * @param ids
     */
    void deleteUser(List<String> ids);

    /**
     * 更新用户
     * @param member
     */
    void updateUser(Member member);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    List<Member> findByName(String name);
}
