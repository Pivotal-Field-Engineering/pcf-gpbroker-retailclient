package io.pivotal.fe.retaildata.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class KillController {

	@RequestMapping("/killApp")
	public @ResponseBody
	String kill() {
		System.exit(-1);
		return "Killed";
	}
}
