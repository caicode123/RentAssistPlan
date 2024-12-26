package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.model.entity.BrowsingHistory;
import com.caicode.lease.web.app.mapper.BrowsingHistoryMapper;
import com.caicode.lease.web.app.service.BrowsingHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author caicode
 * @description 针对表【browsing_history(浏览历史)】的数据库操作Service实现
 */
@Service
public class BrowsingHistoryServiceImpl extends ServiceImpl<BrowsingHistoryMapper, BrowsingHistory>
        implements BrowsingHistoryService {
}