package com.cws.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * PushConfigure
 *
 * @author cws
 * @date 2022/8/22 21:25
 */
@Component
@ConfigurationProperties("wechat")
public class PushConfigure {

    /**
     * 微信公众平台的appID
     */
    private static String appId;
    /**
     * 微信公众平台的appSecret
     */
    private static String secret;
    /**
     * 天气查询的城市ID
     */
    private static String district_id;
    /**
     * 应用AK
     */
    private static String ak;
    /**
     * 纪念日
     */
    private static String loveDate;
    /**
     * 生日
     */
    private static String birthday;
    /**
     * 关注公众号的用户ID
     */
    private static String userId;
    /**
     * 模板ID
     */
    private static String templateId;
    private static String template2Id;

    /**
     * 天行数据apiKey
     */
    private static String rainbowKey;

    private static String user2Id;
    private static String user3Id;
    private static List<String> user4Id;

    public static String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        PushConfigure.appId = appId;
    }

    public static String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        PushConfigure.secret = secret;
    }

    public static String getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(String district_id) {
        PushConfigure.district_id = district_id;
    }

    public static String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        PushConfigure.ak = ak;
    }

    public static String getLoveDate() {
        return loveDate;
    }

    public void setLoveDate(String loveDate) {
        PushConfigure.loveDate = loveDate;
    }

    public static String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        PushConfigure.birthday = birthday;
    }

    public static String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        PushConfigure.userId = userId;
    }

    public static String getUser2Id() {
        return user2Id;
    }

    public void setUser2Id(String user2Id) {
        PushConfigure.userId = user2Id;
    }

    public static String getUser3Id() {
        return user3Id;
    }

    public void setUser3Id(String user3Id) {
        PushConfigure.userId = user3Id;
    }

    public static String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        PushConfigure.templateId = templateId;
    }

    public static String getTemplate2Id() {
        return template2Id;
    }

    public void setTemplate2Id(String template2Id) {
        PushConfigure.template2Id = template2Id;
    }

    public static String getRainbowKey() {
        return rainbowKey;
    }

    public void setRainbowKey(String rainbowKey) {
        PushConfigure.rainbowKey = rainbowKey;
    }
}
