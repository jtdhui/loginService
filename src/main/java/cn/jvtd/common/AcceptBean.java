package cn.jvtd.common;

/**
 * API接口接受参数的实体类
 */
public class AcceptBean {

    private AcceptBean() {
    }

    private static volatile AcceptBean instance;

    private String version;   //接受数据的版本号

    private Object data;      //接受的数据

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static AcceptBean getIstance() {
        if (instance == null) {
            synchronized (AcceptBean.class) {
                if (instance == null) {
                    instance = new AcceptBean();
                }
            }
        }
        return instance;
    }

}
