package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.ComUserMapper;
import com.ruoyi.test.domain.ComUser;
import com.ruoyi.test.service.IComUserService;

/**
 * 用户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-29
 */
@Service
public class ComUserServiceImpl implements IComUserService 
{
    @Autowired
    private ComUserMapper comUserMapper;

    /**
     * 查询用户信息
     * 
     * @param id 用户信息主键
     * @return 用户信息
     */
    @Override
    public ComUser selectComUserById(Long id)
    {
        return comUserMapper.selectComUserById(id);
    }

    /**
     * 查询用户信息列表
     * 
     * @param comUser 用户信息
     * @return 用户信息
     */
    @Override
    public List<ComUser> selectComUserList(ComUser comUser)
    {
        return comUserMapper.selectComUserList(comUser);
    }

    /**
     * 新增用户信息
     * 
     * @param comUser 用户信息
     * @return 结果
     */
    @Override
    public int insertComUser(ComUser comUser)
    {
        return comUserMapper.insertComUser(comUser);
    }

    /**
     * 修改用户信息
     * 
     * @param comUser 用户信息
     * @return 结果
     */
    @Override
    public int updateComUser(ComUser comUser)
    {
        return comUserMapper.updateComUser(comUser);
    }

    /**
     * 批量删除用户信息
     * 
     * @param ids 需要删除的用户信息主键
     * @return 结果
     */
    @Override
    public int deleteComUserByIds(Long[] ids)
    {
        return comUserMapper.deleteComUserByIds(ids);
    }

    /**
     * 删除用户信息信息
     * 
     * @param id 用户信息主键
     * @return 结果
     */
    @Override
    public int deleteComUserById(Long id)
    {
        return comUserMapper.deleteComUserById(id);
    }
}
