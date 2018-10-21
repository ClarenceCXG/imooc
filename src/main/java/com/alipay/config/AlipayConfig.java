package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = " 2018100661577576";

    // 商户私钥，您的PKCS8格式RSA2私钥-不确定是不是这个
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCM+2a4BnokYJHmt7e5ycttuIqeHhRcIi1pRc3wbIqFjfflrt41gQZ/EYbX1C+aESnORFpchyn5UrPVXkLLomlrvalX7RAYLdlcmSKCIi4EMRIVXEvRZig017X9TNV3AC6HVKHl0c8fiXLSk9hyMq4vXo5QOy14UFbCD9GKsjk86Xt3on9q0xbqGKvpdMhYbC48CLoLlILs7hPuIzrHCaVXXTuWTHGisdyUSqTYY2CcbT3m8AoQrOAqrMD2fPRBfHUBbEAjbAA+zZ2Q+d4nA4yKb6Qq5xmRDEySjSZCdKb9Pz8RrrH0GbGOcTFAVBy75jYbyLFQ+aZAffr6PQtphFnPAgMBAAECggEBAIBeoadK7oiVDgTAoCAhaIQdlspmpS9HR4Yls2EJ1A/Ltz+CPH8HXvzw3pFDeZyVqDVS89xwjn2hGnJcBAIbflZGOh3/k7oQdWzlWxCXQsM6Uzbz9W1T0aRcDi/4eB6FIdjD7S6wHiKfKtgnGtzQ3N3xATB40exNatIFSU06/vdAXa3zPksURKDHYmfwgagTCcoAOUiev+0b2j+/yNtY6nmSJcB0e2oc/cvQ/yz93USBZTF8i8ZdJiSOuggcJBPUyzb5pxtd2CeIdX0XEAbcU+RdBQfFJg2iWZUzHNtL6ZVBuXy4c25m9n7JGmHjqTTHO5pZZJ1kfNvn9kHJN+RF2fECgYEA1JPEPIIEJ+jSiAXL3Axf/3HeuUO3DL1MkgSDsgBkVZ+8b5rRHujyYPrlvyQ5NexrEE7Gwvs8G3VQFYlg9yQrpohpt0ZXn/lDZGD7XLnhL0RjFZDcPWyh/bW0A/zXaPVgjr+Hqt3pvS9lMdAB3ODwVLsjaitbn4/hA/VDhnZwelsCgYEAqce7B/JUZWDJM9M+FCGbsQ39EHhG/iLQOmIcfXZ1YD+vscszizjVHP5BsrRf76oaR81mpQfClap0ASuvvBQfbtmiMtYtXxuBDjz5J8zrVoBG+wO88jcQ/Ey8gJkgz+S6t+mJkVlS4TRqMSwnRIvyIRpEwgaPzKuq5edMg7u88J0CgYEAlBw4l+gGuT/QoBFZzoGYyUQvaGmzul6SYRJgJ796KOZYxnHZzm2Doups9NZqPhXxKrWYavXdFUyRdc/4DXnYJ/nXnmiWWNG1kNS5jgu8x9AgMUBzEyEDZOAbAsRB2dFNa2grQHPJjZTeLuy8v4bCLGcO78Qx3GTE5JsYZzFSgQ0CgYAT2g3NdRFXNUTxcV7N3cwlnLwdY+LxLkLowLYSGXrKAUha4qapPcD1felSqvKYxGwEP0kkPM8Mzvx3cpM+y5+NR5dGmHJ/r2icsJZ1h+lwmNkz2pEKRVQQHCziYIVMqbMHdCAoxagCOy27iC0jP7XVFww5H6lKxjvaW/w/XwFNpQKBgGehumDTbcek/+ARdGcxYzwTs3Jyn5BIOmeNWeaex0ZZ6MmXvKSOoJvAkG1Xx9Pzui2D0UA6yegnv8qYz/95hK+GedHuTA5Y2+JiIWjxAmoEMbXJuF6cGONHZD5nvF9s79cXEkaWqTt4AbGS3tZLopoTx8+bBV81HUkACRm8mi9W";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsiQRXasQKUmxfuOygAncvyNJX5EWS1IWTpyB4DdMH6D5Di4aDSacP1PeLRNtIbZTBQUsjOSFyF2tK8q8douZWtJ1XV7qQ9Ctku3KIfur7wNwytFrOV1ftN6tvC32crtDhjJLYTZeVFPdX8FKhZwUBnsoyB8px5gnUJ/mvLuMvc4WRhjK9f/5G4llo1YDlLHhGA5iMhaCKiH/cxPJnGMeTngEo8fG+xqkPA0+rX/QeVFJATHILYYu4S65mg0XjzNXTxqEBUTc4Llw70CTaD4diqNvIBvrEV5PE7oVosQLgN+bKJMlR7iKvIMwM4M7iX/R/TvBX+aQB/f3GCA2JzycDwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/aliPay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/aliPay/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

