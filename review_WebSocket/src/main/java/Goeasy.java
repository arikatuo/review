import io.goeasy.GoEasy;
import io.goeasy.publish.GoEasyError;
import io.goeasy.publish.PublishListener;

/**
 * Created by sumimasah on 2017/11/6.
 */
public class Goeasy {
    public static void main(String[] args) {
        GoEasy goEasy = new GoEasy("https://rest-hangzhou.goeasy.io", "BC-6c615bfda9cd484bbd4e9bb8900a0638");

        goEasy.publish("chat", "Hello world!");

//        GoEasy goEasy = new GoEasy("BC-6c615bfda9cd484bbd4e9bb8900a0638");
//        goEasy.publish("系统通知", "系统将于今天中午十二点进行维护，届时系统不可用。", new PublishListener() {
//            @Override
//            public void onFailed(GoEasyError error) {
//                System.out.println("推送失败了，Error code:" + error.getCode() + "; error content:" + error.getContent());
//            }
//            @Override
//            public void onSuccess() {
//                System.out.println("推送成功");
//            }
//        });
    }

}
