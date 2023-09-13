package com.payment.system.api.service;

import com.payment.system.api.domain.SysLogininfor;
import com.payment.common.mybatis.core.page.PageQuery;
import com.payment.common.mybatis.core.page.TableDataInfo;

import java.util.List;

/**
 * 系统访问日志情况信息 服务层
 *
 * @author ruoyi
 */
public interface ISysLogininforService {

    TableDataInfo<SysLogininfor> selectPageLogininforList(SysLogininfor logininfor, PageQuery pageQuery);

    /**
     * 新增系统登录日志
     *
     * @param logininfor 访问日志对象
     */
    int insertLogininfor(SysLogininfor logininfor);

    /**
     * 查询系统登录日志集合
     *
     * @param logininfor 访问日志对象
     * @return 登录记录集合
     */
    List<SysLogininfor> selectLogininforList(SysLogininfor logininfor);

    /**
     * 批量删除系统登录日志
     *
     * @param infoIds 需要删除的登录日志ID
     * @return 结果
     */
    int deleteLogininforByIds(Long[] infoIds);

    /**
     * 清空系统登录日志
     */
    void cleanLogininfor();
}
