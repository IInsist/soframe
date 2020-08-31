package cn.com.soframe.module.reviewRecord.service.impl;

import cn.com.soframe.module.reviewRecord.entity.TReviewRecord;
import cn.com.soframe.module.reviewRecord.repository.TReviewRecordRepository;
import cn.com.soframe.module.reviewRecord.service.TReviewRecordServiceI;
import cn.com.soframe.utils.RedisUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 审核记录表 服务实现类
 * </p>
 *
 * @author fujh
 * @since 2020-08-21
 */
@Service
@Slf4j
public class TReviewRecordImpl extends ServiceImpl<TReviewRecordRepository, TReviewRecord> implements TReviewRecordServiceI {

    @Resource
    private TReviewRecordRepository reviewRecordRepository;

    /**
     * 自动装配Redis对象
     */
    @Autowired
    private RedisUtil redisUtil;

}
