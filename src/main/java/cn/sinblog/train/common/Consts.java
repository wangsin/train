package cn.sinblog.train.common;

import java.util.HashMap;

public class Consts {
    private final HashMap<Integer, String> errMsgMap = new HashMap<>();

    private static final Integer success = 0;
    private static final Integer unknownErr = -1;
    private static final Integer dbErr = -2;

    public Consts() {
        // init
        this.errMsgMap.put(success, "成功");
        this.errMsgMap.put(unknownErr, "未知错误");
        this.errMsgMap.put(dbErr, "数据库错误");
    }

    public String getErrMsg(Integer errNo) {
        return this.errMsgMap.get(errNo);
    }

    public BasicEcho echoWithErrNo(Integer errNo) {
        return new BasicEcho(this.getErrMsg(errNo), errNo);
    }
}
