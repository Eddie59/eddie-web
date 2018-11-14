package com.em.eddieweb.common.config.druid;

/**
 * BaseDruid class
 *
 * @author Administrator
 * @date
 */
public abstract class BaseDruid {
    private String url;
    private String username;
    private String password;
    private String drivername;
    private int initMaxConn;
    private int maxPoolConn;
    private int minPoolConn;
    private int waitTimeOut;
    private String validSql;
    private boolean testOnBorrow;
    private boolean testWhileIdle;
    private boolean poolPreparedStatements;

    public String getDrivername() {
        return drivername;
    }

    public String getPassword() {
        return password;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getInitMaxConn() {
        return initMaxConn;
    }

    public int getMaxPoolConn() {
        return maxPoolConn;
    }

    public int getMinPoolConn() {
        return minPoolConn;
    }

    public int getWaitTimeOut() {
        return waitTimeOut;
    }

    public String getValidSql() {
        return validSql;
    }

    public void setInitMaxConn(int initMaxConn) {
        this.initMaxConn = initMaxConn;
    }

    public void setMaxPoolConn(int maxPoolConn) {
        this.maxPoolConn = maxPoolConn;
    }

    public void setMinPoolConn(int minPoolConn) {
        this.minPoolConn = minPoolConn;
    }

    public void setValidSql(String validSql) {
        this.validSql = validSql;
    }

    public void setWaitTimeOut(int waitTimeOut) {
        this.waitTimeOut = waitTimeOut;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public boolean getTestWhileIdle() {
        return testWhileIdle;
    }

    public boolean getTestOnBorrow() {
        return testOnBorrow;
    }

    public boolean getPoolPreparedStatements() {
        return poolPreparedStatements;
    }
}
