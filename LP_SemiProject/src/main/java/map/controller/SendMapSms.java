package map.controller;

import java.util.HashMap;

import org.json.simple.JSONObject;

import common.controller.AbstractController;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.nurigo.java_sdk.api.Message;






public class SendMapSms extends AbstractController {

 @Override
 public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	 if("POST".equalsIgnoreCase(request.getMethod())) {
	        String mobile = request.getParameter("mobile");
	        String smsContent = request.getParameter("smsContent");
	        String imageName = request.getParameter("imageName");

	        // 1. 이미지 경로 생성 및 검증
	        String rootPath = request.getServletContext().getRealPath("/");
	        String imagePath = rootPath + "images" + java.io.File.separator + imageName;
	        java.io.File file = new java.io.File(imagePath);

	        

	        // 2. CoolSMS 설정
	        String api_key = "ss";
	        String api_secret = "ss";
	        Message coolsms = new Message(api_key, api_secret);
	        
	        HashMap<String, String> params = new HashMap<String, String>();
	        params.put("to", mobile);
	        params.put("from", "");
	        params.put("type", "MMS"); 
	        params.put("text", smsContent);
	        
	        params.put("subject", "[VINYST] 약도 안내");
	       
	        if(file.exists()) {
	            params.put("image", imagePath); 
	        } else {
	            // 파일이 없으면 MMS가 실패하므로 타입을 LMS로 낮추거나 경고를 띄워야 함
	            params.put("type", "LMS"); 
	            System.out.println("경고: 이미지가 없어 LMS로 전환 발송 시도");
	        }

	        boolean isSuccess = false;
	        try {
	          
	            JSONObject result = (JSONObject) coolsms.send(params); 
	           

	          
	            Object successCount = result.get("success_count");
	            if (successCount != null && Integer.parseInt(successCount.toString()) > 0) {
	                isSuccess = true;
	            } else {
	                System.out.println("전송 실패 원인: " + result.get("message"));
	            }
	        } catch (Exception e) {
	            System.out.println("전송 중 예외 발생!");
	            e.printStackTrace();
	        }

	       
	        String jsonResponse = "{\"result\":" + (isSuccess ? 1 : 0) + "}";
	        request.setAttribute("json", jsonResponse);
	        
	        super.setRedirect(false);
	        super.setViewPage("/WEB-INF/jsonview.jsp");
	}
}
    
}