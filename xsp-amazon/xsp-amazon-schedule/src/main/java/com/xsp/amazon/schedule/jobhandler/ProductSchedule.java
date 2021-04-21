package com.xsp.amazon.schedule.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductSchedule {
    private static Logger logger = LoggerFactory.getLogger(ProductSchedule.class);

    /**
     * Sample
     */
    @XxlJob(value = "sampleHandler", init = "init", destroy = "destroy")
    public void sampleHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, 这里是XxlJobHelper.log的内容。");
        logger.info("这里是logger.info的内容。");
        System.out.println("XXL-JOB Sample.");

        String param = XxlJobHelper.getJobParam();
        System.out.println("获取的参数是：" + param);
    }
    public void init() {
        logger.info("这里是init方法。");
    }
    public void destroy() {
        logger.info("这里是destroy方法。");
    }

    /**
     * 同步商品信息
     */
    @XxlJob("syncProductHandler")
    public void syncProductHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, sync product.");
        logger.info("商品数据同步！！！");
        System.out.println("自动同步商品数据");
    }
}
