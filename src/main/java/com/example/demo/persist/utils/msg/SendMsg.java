package com.example.demo.persist.utils.msg;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * 发送验证码
 */
public class SendMsg {
    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    //开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = "LTAI2HBEVPyPverR";
    static final String accessKeySecret = "WLu4WViLLb8ccKiTR8Y8aWau7hK6f5";

    //短信模板审核通过平台会给你一个code
    public static final String TEMPLATE_CODE_NOTIFY = "SMS_133155643";
    public static final String[] TEMPLATE_CODES = {
            TEMPLATE_CODE_NOTIFY
    };

    /**发送短信
     * @param templateCode
     * @param phones
     * @return
     * @throws ClientException
     */
    public static SendSmsResponse sendSms(String templateCode, String phones, String math, String key) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
//        JSONObject json = JSONObject.fromObject(math);
        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);
        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phones);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("魔法师");
        //必填:
        request.setTemplateCode(templateCode);
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},欢迎来到..."
        //key是短信模板中的变量名 value就是变量值 eg：key=>name value=>小明
        request.setTemplateParam("{ \"code\":\""+math+"\"}");

        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者,可以自定义
//        request.setOutId("123321");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

        return sendSmsResponse;
    }
}