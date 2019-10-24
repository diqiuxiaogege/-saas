package com.tuiba.saasadmininster.wdqz.dao;

import com.tuiba.saasadmininster.wdqz.bean.Wdqz;
import com.tuiba.saasadmininster.wdqz.bean.WdqzExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WdqzMapper {
    int countByExample(WdqzExample example);

    int deleteByExample(WdqzExample example);

    int deleteByPrimaryKey(Integer wdqzId);

    int insert(Wdqz record);

    int insertSelective(Wdqz record);

    List<Wdqz> selectByExample(WdqzExample example);

    Wdqz selectByPrimaryKey(Integer wdqzId);

    int updateByExampleSelective(@Param("record") Wdqz record, @Param("example") WdqzExample example);

    int updateByExample(@Param("record") Wdqz record, @Param("example") WdqzExample example);

    int updateByPrimaryKeySelective(Wdqz record);

    int updateByPrimaryKey(Wdqz record);

    List<Wdqz> selectByStatusExample(Integer Status);

}