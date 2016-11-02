package springdemo2;

import javax.servlet.http.*;
import org.springframework.*;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
public  class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView modelandview = new ModelAndView("Hellopage");
		modelandview.addObject("welcomemessage", "hi Welcome to Spring FrameWork");
		return modelandview;
		
	}

}
