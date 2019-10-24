package com.tuiba.saasadmininster.wdqzComment.dao;

import com.tuiba.saasadmininster.wdqzComment.bean.Wdqz_comment;
import com.tuiba.saasadmininster.wdqzComment.bean.Wdqz_commentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Wdqz_commentMapper {
    int countByExample(Wdqz_commentExample example);

    int deleteByExample(Wdqz_commentExample example);

    int deleteByPrimaryKey(Integer wdqzCommentId);

    int insert(Wdqz_comment record);

    int insertSelective(Wdqz_comment record);

    List<Wdqz_comment> selectByExample(Wdqz_commentExample example);

    Wdqz_comment selectByPrimaryKey(Integer wdqzCommentId);

    int updateByExampleSelective(@Param("record") Wdqz_comment record, @Param("example") Wdqz_commentExample example);

    int updateByExample(@Param("record") Wdqz_comment record, @Param("example") Wdqz_commentExample example);

    int updateByPrimaryKeySelective(Wdqz_comment record);

    int updateByPrimaryKey(Wdqz_comment record);
}