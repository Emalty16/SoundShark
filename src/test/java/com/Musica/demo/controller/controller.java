/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Musica.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author code-
 */
@Controller
public class controller {
   public String goHome(Model model){
   
       return "inicio";
   }
}
