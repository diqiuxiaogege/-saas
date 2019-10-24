package com.tuiba.saasadmininster.xxfx.dao;

import com.tuiba.saasadmininster.xxfx.bean.Xxfx;
import com.tuiba.saasadmininster.xxfx.bean.XxfxExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XxfxMapper {
    int countByExample(XxfxExample example);

    int deleteByExample(XxfxExample example);

    int deleteByPrimaryKey(Integer xxfxId);

    int insert(Xxfx record);

    int insertSelective(Xxfx record);

    List<Xxfx> selectByExample(XxfxExample example);

    Xxfx selectByPrimaryKey(Integer xxfxId);

    int updateByExampleSelective(@Param("record") Xxfx record, @Param("example") XxfxExample example);

    int updateByExample(@Param("record") Xxfx record, @Param("example") XxfxExample example);

    int updateByPrimaryKeySelective(Xxfx record);

    int updateByPrimaryKey(Xxfx record);

    List<Xxfx> selectByStatusExample(Integer Status);
}