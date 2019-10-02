package jp.co.systena.tigerscave.rpgbattle.application.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController{

  @Autowired
  HttpSession session;

  @RequestMapping(value="/NewGame", method = RequestMethod.GET)
  public ModelAndView index(ModelAndView mav) {
    mav.setViewName("NewGame");
    return mav;
  }

  @RequestMapping(value = "/Charactor", method = RequestMethod.POST)
  private ModelAndView order(ModelAndView mav,
      BindingResult bindingResult, HttpServletRequest request) {
      return mav;
  }



}