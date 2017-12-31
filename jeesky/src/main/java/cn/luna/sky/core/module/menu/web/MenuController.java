package cn.luna.sky.core.module.menu.web;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.luna.sky.core.module.menu.entity.Menu;
import cn.luna.sky.core.module.menu.entity.MenuTreeGridVO;
import cn.luna.sky.core.module.menu.service.MenuService;
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations ={
		"file:src/main/webapp/WEB-INF/config-test/spring/*.bean.xml",
		"classpath*:cn/luna/sky/**/*.bean.xml",
		"classpath*:cn/sy/lines/**/*.bean.xml",
})
@Controller
public class MenuController{
	
	@Autowired
	MenuService service;
	
	@RequestMapping(value="/sys/menu/menu_list.do",produces = "application/json")  
	public @ResponseBody List<Menu> list() {
		List<Menu> list = service.list();
		return list;
	}
	@RequestMapping(value="/sys/menu/menu_list_treegrid.do",produces = "application/json")  
	public @ResponseBody List<MenuTreeGridVO> listTreeGrid() {
		List<MenuTreeGridVO> list = service.listTreeGrid();
		return list;
	}
	
	
}
