package cn.luna.sky.core.module.lines.web;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.luna.sky.core.module.lines.entity.TrainLines;
import cn.luna.sky.core.module.lines.service.LinesService;
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations ={
		"file:src/main/webapp/WEB-INF/config-test/spring/*.bean.xml",
		"classpath*:cn/luna/sky/**/*.bean.xml",
		"classpath*:cn/sy/lines/**/*.bean.xml",
})
@Controller
public class LinesController{
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
	
	@Autowired
	LinesService service;
	@RequestMapping("sy/lines/lines.do")
	public String forwardPage(Model model){
		return "/module/lines/lines.jsp";
	}
	@Test
	public void listData() {
		try {
			List<TrainLines> listData = listData("1","1");
			System.out.println();
//			System.out.println(service+"service===================="+listData.size());
			service.testTrans();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping(value="/sy/lines/lines_list.do",produces = "application/json")  
	public @ResponseBody List<TrainLines> listData(String trainStartStation,String trainEndStation) {
		System.out.println("service===================="+service);
		try {
			service.testTrans();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<TrainLines> list = service.listByOrder(trainStartStation,trainEndStation);
		return list;
	}
	@RequestMapping(value="/sy/lines/lines_sort.do",produces = "application/json")  
	public @ResponseBody Map<String,String> sortData() {
		Random random = new Random();
		int[] arr = new int[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
		}
		Map<String,String> map = new HashMap<String,String>();
		return map;
	}
	@RequestMapping(value="/sy/lines/lines_char.do",produces = "application/json")  
	public @ResponseBody Map<String,String> charData(String inputdata) {
		if(inputdata == null){
			inputdata = "";
		}
		char[] chars = inputdata.toCharArray();
		int count_abc=0, count_num=0;  
		for(int i = 0;i<chars.length;i++){
			if((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <=122)){  
                count_abc++;  
            }else if(chars[i] >= 48 && chars[i] <= 57){  
                count_num++;  
            }else{  
            }
		}
		Map<String,String> map = new HashMap<String,String>();
		map.put("data", "鏁板瓧:"+count_num+",瀛楁瘝"+count_abc);
		return map;
	}
	@RequestMapping(value="/sy/lines/lines_net.do",produces = "application/json")  
	public @ResponseBody Map<String,String> netData(String inputdata) {
		if(inputdata == null){
			inputdata = "";
		}
		String[] split = inputdata.split("\\.");
		String s = "";
		for(int i = 0;i<split.length;i++){
			s+=split[split.length-1-i];
			if(i != split.length-1){
				s+=".";
			}
		}
		Map<String,String> map = new HashMap<String,String>();
		map.put("data", s);
		return map;
	}
	@RequestMapping(value="/sy/lines/lines_date.do",produces = "application/json")  
	public @ResponseBody Map<String,String> dateData(String inputdata) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar instance = Calendar.getInstance();
		if(inputdata == null || inputdata.trim().length() == 0){
			Date time = instance.getTime();
			inputdata = sf.format(time);
		}
		try {
			instance.setTime(sf.parse(inputdata));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		instance.add(Calendar.DAY_OF_MONTH, -1);
		Date date = instance.getTime();
		String s = sf.format(date);
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("data", s);
		return map;
	}
	
}
