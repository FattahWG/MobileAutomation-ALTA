package com.example;

import com.example.app.pages.CalculatorPage;
import com.example.app.pages.ListPage;
import com.example.app.pages.LoginPage;
import com.example.app.pages.NavigationMenu;

public class BaseTest {

  public LoginPage loginPage = new LoginPage();
  public CalculatorPage calculatorPage = new CalculatorPage();
  public NavigationMenu navigationMenu = new NavigationMenu();
  public ListPage listPage = new ListPage();

}
