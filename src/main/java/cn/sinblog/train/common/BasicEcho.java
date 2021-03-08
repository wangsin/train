package cn.sinblog.train.common;

public class BasicEcho {
    private String errMsg = "";
    private Integer errno = 0;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public BasicEcho(String errMsg, Integer errno) {
        this.errMsg = errMsg;
        this.errno = errno;
    }
}
