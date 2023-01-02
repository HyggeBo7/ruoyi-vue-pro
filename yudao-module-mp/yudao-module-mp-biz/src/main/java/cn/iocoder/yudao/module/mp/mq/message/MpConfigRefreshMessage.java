package cn.iocoder.yudao.module.mp.mq.message;

import cn.iocoder.yudao.framework.mq.core.pubsub.AbstractChannelMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 微信配置数据刷新 Message
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MpConfigRefreshMessage extends AbstractChannelMessage {

    @Override
    public String getChannel() {
        return "mp.config-data.refresh";
    }

}