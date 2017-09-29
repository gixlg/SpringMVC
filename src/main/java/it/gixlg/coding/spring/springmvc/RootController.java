package it.gixlg.coding.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gixlg on 29/09/2017.
 */
@Controller
public class RootController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getIndex() {
        return "<h1>Hello Spring MVC<h1>";
    }

}
