package br.com.unifyEventos.UnifyEventos.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HomeController {
    @GetMapping("/")
    fun eventList(model: Model):String{
        model.addAttribute("nome", "Alex")
        return "home"
    }
}