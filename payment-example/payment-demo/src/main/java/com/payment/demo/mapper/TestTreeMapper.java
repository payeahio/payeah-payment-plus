package com.payment.demo.mapper;

import com.payment.common.mybatis.annotation.DataColumn;
import com.payment.common.mybatis.annotation.DataPermission;
import com.payment.common.mybatis.core.mapper.BaseMapperPlus;
import com.payment.demo.domain.TestTree;
import com.payment.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTreeMapper, TestTree, TestTreeVo> {

}
