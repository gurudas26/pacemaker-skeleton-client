package controllers;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

public class Main {

  public static void main(String[] args) throws Exception {
    PacemakerConsoleService main = new PacemakerConsoleService();
    Shell shell = ShellFactory
        .createConsoleShell("pm", "Welcome to pacemaker-console 2.0?help for instructions", main);
    shell.commandLoop();  }
}