package main.ru.meow.bugtracker.service;

import main.ru.meow.bugtracker.entities.Issues;
import main.ru.meow.bugtracker.repository.IssuesRepository;
import main.ru.meow.bugtracker.repository.ProjectsRepository;
import main.ru.meow.bugtracker.repository.UsersRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProjectsRepository projects = new ProjectsRepository();
        IssuesRepository issues = new IssuesRepository();
        UsersRepository users = new UsersRepository();
        System.out.print("Greetings, select option by typing the number:\n" +
                "1. Add Project \n" +
                "2. Add User \n" +
                "3. Add Issue \n" +
                "4. View Projects \n" +
                "5. View Users \n" +
                "6. View Issues \n");
        String option;
        int optionInt;
        do {
            option = sc.nextLine();
            optionInt = Integer.parseInt(option);
            if (optionInt == 1) {
                System.out.print("Enter project name:");
                option = sc.nextLine();
                projects.createProject(option);
                System.out.print("Project added.");
                System.out.println("Select new option to continue:");

            } else if (optionInt == 2) {
                System.out.print("Enter user name:");
                option = sc.nextLine();
                users.createUser(option);
                System.out.print("User added.");
                System.out.println("Select new option to continue:");

            } else if (optionInt == 3) {
                System.out.println("Enter issue name and userId:");
                System.out.println("issue name:");
                option = sc.nextLine();
                users.viewAllUsers();
                System.out.println("user id:");
                String option2 = sc.nextLine();
                issues.reportIssue(option, option2);
                System.out.print("Issue reported.");
                System.out.println("Select new option to continue:");

            } else if (optionInt == 4) {
                System.out.println("List of all projects:");
                projects.viewAllProjects();
                System.out.println("Select new option to continue:");

            } else if (optionInt == 5) {
                System.out.println("List of all users:");
                users.viewAllUsers();
                System.out.println("Select new option to continue:");

            } else if (optionInt == 6) {
                System.out.println("List of all issues:");
                issues.viewAllIssues();
                System.out.println("Select new option to continue:");
            } else {
                System.out.println("Sorry, invalid input. Please try again");
            }
        } while (optionInt != 0);






        /*File path
                = new File("D:\\Java\\Progs\\ConsoleBugTracker\\src\\main.ru.meow.bugtracker.entities.Issues");


        PrintWriter pw = new PrintWriter(path);
        pw.write(
                "Geeks for Geeks \nWelcome to computer science portal \nHello Geek!!!!");

        pw.flush();
        pw.close();

         */

        }
    }


