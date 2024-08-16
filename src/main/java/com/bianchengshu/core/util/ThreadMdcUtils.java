package com.ei.bianchengshu.core.util;

import cn.hutool.core.util.IdUtil;
import org.slf4j.MDC;

import java.util.Map;

public class ThreadMdcUtils {
    private static final String TRACE_ID = "TRACE_ID";

    public static Runnable wrapAsync(Runnable task, Map<String, String> context) {
        return () -> {
            if (context == null) {
                MDC.clear();
            } else {
                MDC.setContextMap(context);
            }
            if (MDC.get(TRACE_ID) == null) {
                MDC.put(TRACE_ID, IdUtil.simpleUUID());
            }
            try {
                task.run();
            } finally {
                MDC.clear();
            }
        };
    }
}