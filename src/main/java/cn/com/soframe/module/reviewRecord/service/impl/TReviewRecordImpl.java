package cn.com.soframe.module.reviewRecord.service.impl;

import cn.com.soframe.module.reviewRecord.entity.TReviewRecord;
import cn.com.soframe.module.reviewRecord.repository.TReviewRecordRepository;
import cn.com.soframe.module.reviewRecord.service.TReviewRecordServiceI;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 审核记录表 服务实现类
 * </p>
 *
 * @author fujh
 * @since 2020-08-21
 */
@Service
public class TReviewRecordImpl extends ServiceImpl<TReviewRecordRepository, TReviewRecord> implements TReviewRecordServiceI {

}
