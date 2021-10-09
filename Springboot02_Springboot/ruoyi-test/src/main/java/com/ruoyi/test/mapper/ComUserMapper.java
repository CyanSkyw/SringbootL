package com.ruoyi.test.mapper;

import java.util.List;
import com.ruoyi.test.domain.ComUser;

/**
 * 用户信息Mapper接口
 * 
 * @author ruoyi
 * @date 2021-09-29
 */
public interface ComUserMapper 
{
    /**
     * 查询用户信息
     * 
     * @param id 用户信息主键
     * @return 用户信息
     */
    public ComUser selectComUserById(Long id);

    /**
     * 查询用户信息列表
     * 
     * @param comUser 用户信息
     * @return 用户信息集合
     */
    public List<ComUser> selectComUserList(ComUser comUser);

    /**
     * 新增用户信息
     * 
     * @param comUser 用户信息
     * @return 结果
     */
    public int insertComUser(ComUser comUser);

    /**
     * 修改用户信息
     * 
     * @param comUser 用户信息
     * @return 结果
     */
    public int updateComUser(ComUser comUser);

    /**
     * 删除用户信息
     * 
     * @param id 用户信息主键
     * @return 结果
     */
    public int deleteComUserById(Long id);

    /**
     * 批量删除用户信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComUserByIds(Long[] ids);
}
