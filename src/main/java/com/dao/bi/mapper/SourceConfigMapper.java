package com.dao.bi.mapper;

import com.dao.bi.entity.SourceConfig;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SourceConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SourceConfig record);

    SourceConfig selectByPrimaryKey(Long id);

    List<SourceConfig> selectAll();

    int updateByPrimaryKey(SourceConfig record);
}