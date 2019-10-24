package com.tuiba.saasadmininster.xxfxComment.dao;

import com.tuiba.saasadmininster.xxfxComment.bean.Xxfx_comment;
import com.tuiba.saasadmininster.xxfxComment.bean.Xxfx_commentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Xxfx_commentMapper {
    int countByExample(Xxfx_commentExample example);

    int deleteByExample(Xxfx_commentExample example);

    int deleteByPrimaryKey(Integer xxfxCommentId);

    int insert(Xxfx_comment record);

    int insertSelective(Xxfx_comment record);

    List<Xxfx_comment> selectByExampleWithBLOBs(Xxfx_commentExample example);

    List<Xxfx_comment> selectByExample(Xxfx_commentExample example);

    Xxfx_comment selectByPrimaryKey(Integer xxfxCommentId);

    int updateByExampleSelective(@Param("record") Xxfx_comment record, @Param("example") Xxfx_commentExample example);

    int updateByExampleWithBLOBs(@Param("record") Xxfx_comment record, @Param("example") Xxfx_commentExample example);

    int updateByExample(@Param("record") Xxfx_comment record, @Param("example") Xxfx_commentExample example);

    int updateByPrimaryKeySelective(Xxfx_comment record);

    int updateByPrimaryKeyWithBLOBs(Xxfx_comment record);

    int updateByPrimaryKey(Xxfx_comment record);
}